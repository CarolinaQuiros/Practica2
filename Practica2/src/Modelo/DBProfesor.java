/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Carolina
 */
public class DBProfesor {
    
    private ArrayList<Profesor> arregloProfesor;
    
    public DBProfesor(){
        this.arregloProfesor = new ArrayList<Profesor>();
    }
    
    public void setArregloProfesor(ArrayList<Profesor> arregloProfesor) {
        this.arregloProfesor = arregloProfesor;
    }
    public String agregarProfesor(Profesor profesor){
        System.out.println("entre");
        if (verificarProfesor(profesor.getCedula())){
            
            arregloProfesor.add(profesor);
        
        }
            /*throw new ProfesorException(
                    "Ya existe un profesor con este +umero de cédula",
                    false);*/
        return "Se agrego con exito";
        
    }
    public boolean verificarProfesor(String cedula) {

        boolean dev = false;
        if (!arregloProfesor.isEmpty()) {

            for (int i = 0; i < arregloProfesor.size(); i++) {
                if (arregloProfesor.get(i).getCedula().equalsIgnoreCase(cedula)) {

                    dev = true;

                    break;

                }
            }

        }
        return dev;
    }
    public Profesor buscarProfesor(String cedula) {

       Profesor dev = null;
        if (arregloProfesor.size() != 0) {

            for (Profesor profe:arregloProfesor) {
                if (profe.getCedula().equalsIgnoreCase(cedula)) {

                    dev =profe;
                    break;

                }
            }

        }
            return dev;
        }
    public String eliminar(String cedula){
        Profesor profe = buscarProfesor(cedula);
        
        if(profe == null){
           return "No se encontró este profesor";
        }else{
            arregloProfesor.remove(profe);
        }
        return "Eliminado correctamente";
    }
    
    public void modificar(Profesor profesor){
        for(Profesor profe: arregloProfesor){
            if(profe.getCedula().equalsIgnoreCase(profesor.getCedula())){
                profe.setNombre(profesor.getNombre());
                profe.setCorreo(profesor.getCorreo());
                profe.setHorasDisponibles(profesor.getHorasDisponibles());
                break;
                
            }
            
        }
    }
}//FIN DE LA CLASE

    