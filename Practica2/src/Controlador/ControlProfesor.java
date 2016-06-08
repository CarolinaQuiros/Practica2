/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DBProfesor;
import Modelo.Profesor;
import Modelo.ProfesorException;
import Vista.GuiBuscarProfesor;
import Vista.VentanaProfesor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Carolina
 */
public class ControlProfesor implements ActionListener{

    public final static int CARNET = 1;

    public final static int NOMBRE = 2;

    public final static int CORREO = 3;

    public final static int AGREGAR = 4;

    public final static int BUSCAR = 5;

    public final static int EDITAR = 6;

    public final static int ELIMINAR = 7;

    private VentanaProfesor vp;
    private Profesor profesor;
    private DBProfesor db;
    private GuiBuscarProfesor guiBuscarProfesor;

    public ControlProfesor(VentanaProfesor vp, DBProfesor db) {
        this.vp = vp;
        this.db = db;
        this.guiBuscarProfesor = new GuiBuscarProfesor();
    }

  

    @Override
    public void actionPerformed(ActionEvent ae) {
        int codigo = this.vp.getCodigoPorFuente(ae.getSource());
           
        try{
                procesar_accion(codigo);
            }catch(ProfesorException e){
                    if(e.isLimpiarInterfaz()){
                        this.vp.limpiar();
                    }
                }
            }

    public void procesar_accion(int codigo) throws ProfesorException{
        Profesor profesor;
        switch (codigo) {
            case AGREGAR:
                if (vp.verificar()) {
                    throw new ProfesorException(
                            "Procure llenar los datos requeridos",
                            false);
                }

                profesor = new Profesor(vp.getTexNombre(), vp.getTexCedula(), vp.getTexCorreo());
                vp.limpiar();
                JOptionPane.showMessageDialog(null, db.agregarProfesor(profesor));

                break;

            case ELIMINAR:
                if (vp.verificar()) {
                    throw new ProfesorException(
                            "Procure llenar los datos requeridos",
                            false);
                }

                JOptionPane.showMessageDialog(null, db.eliminar(vp.getTexCedula()));
                vp.limpiar();

                break;

            case BUSCAR:
                if (vp.verificar()) {
                    throw new ProfesorException(
                            "Ingrese el carnet para buscar el estudiante",
                            true);
                }

                profesor = db.buscarProfesor(vp.getTexCedula());
                if (profesor == null) {
                    throw new ProfesorException(
                            "No se encontró el estudiante",
                            true);
                }

                guiBuscarProfesor.setInformacion(profesor.getCedula()+ " " + profesor.getNombre() + " " + profesor.getCorreo() + " ");
                guiBuscarProfesor.show();
                break;

            case EDITAR:

                if (vp.verificar()) {
                    throw new ProfesorException(
                            "Ingrese el carnet del estudiante que desea modificar",
                            true);
                }

                profesor = db.buscarProfesor(vp.getTexCedula());

                if (profesor == null) {
                    throw new ProfesorException(
                            "No se encontró el estudiante",
                            true);
                }

                vp.getTexCedula();
                profesor.setNombre(vp.getTexNombre());
                profesor.setCorreo(vp.getTexCorreo());
                db.modificar(profesor);
                JOptionPane.showMessageDialog(null, "Profesor actualizado corectamente");

                break;
        }
    }
   
}//fin de la clase 
