/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import Modelo.Curso;
import Modelo.Estudiante;
import Modelo.Matricula;
import Modelo.Profesor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.xpath.XPathExpressionException;
import utilidades.Plantilla;


/**
 *
 * @author Carolina
 */


public class OtroSalvadorXML implements SalvadorArchivos{

   private Plantilla plantilla;
    
    @Override
    public void guardarEstudiante(ArrayList<Estudiante> estudiantes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardarCurso(HashMap<String, Curso> cursos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardarMatriculas(ArrayList<Matricula> matriculas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardarProfesor(ArrayList<Profesor> profesor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Estudiante> obtenerEstudiante() {   
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
       try {
           estudiantes = plantilla.getEstudiante();
       } catch (XPathExpressionException ex) {
           Logger.getLogger(OtroSalvadorXML.class.getName()).log(Level.SEVERE, null, ex);
       }
       return estudiantes;
    }

    @Override
    public HashMap<String, Curso> obtenerCurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Matricula> obtenerMatriculas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Profesor> obtenerProfesor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
