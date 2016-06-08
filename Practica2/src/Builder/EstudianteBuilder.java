/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Modelo.Estudiante;
import org.w3c.dom.Element;

/**
 *
 * @author Carolina
 */
public class EstudianteBuilder implements InterfazBuilder {

    @Override
    public Estudiante construteEstuduante(Object obj) {
        Element eElement = (Element) obj;
        Estudiante estudiante = new Estudiante(
                eElement.getElementsByTagName("carnet").item(0).getTextContent(),
                eElement.getElementsByTagName("nombre").item(0).getTextContent(),
                eElement.getElementsByTagName("correo").item(0).getTextContent()
        );//aqui se cierra el constructor
        return estudiante;
    }
    
}
