/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlCurso;
import Controlador.ValidadorCurso;
import Modelo.Curso;
import Modelo.CursoException;
import Modelo.Estudiante;
import Modelo.Matricula;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author luisza
 */
public class ManipulaCurso extends javax.swing.JFrame {

    /**
     * Creates new form ManipulaCurso
     */
    public ManipulaCurso() {
        initComponents();
    }
    
    public void agrega_acciones(ControlCurso cc){
        this.botonera.agregarEvento(cc);
        this.btnmatricular.addActionListener(cc);
        this.btndesmatricular.addActionListener(cc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonera = new Vista.GuiBotones();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        creditos = new javax.swing.JTextField();
        sigla = new javax.swing.JTextField();
        mensajesError = new javax.swing.JLabel();
        estudiantes = new javax.swing.JComboBox<>();
        btnmatricular = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listamatricula = new javax.swing.JList<>();
        btndesmatricular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("Sigla");

        jLabel2.setText("Nombre");

        jLabel3.setText("Créditos");

        estudiantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnmatricular.setText("matricular");

        jScrollPane1.setViewportView(listamatricula);

        btndesmatricular.setText("Desmatricular");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btndesmatricular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btndesmatricular)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setText("Estudiantes Matriculados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonera, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(mensajesError, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(364, 364, 364)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(31, 31, 31)
                                        .addComponent(creditos, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sigla, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(nombre))))
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(estudiantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addComponent(btnmatricular)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(sigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmatricular))
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(creditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(mensajesError, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonera, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GuiBotones botonera;
    private javax.swing.JButton btndesmatricular;
    private javax.swing.JButton btnmatricular;
    private javax.swing.JTextField creditos;
    private javax.swing.JComboBox<String> estudiantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listamatricula;
    private javax.swing.JLabel mensajesError;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField sigla;
    // End of variables declaration//GEN-END:variables

    public int getCodigoPorFuente(Object source) {
        int dev = -1;
        if(this.btnmatricular.equals(source)){
            dev = ControlCurso.MATRICULAR;
        }else if(this.btndesmatricular.equals(source)){
            dev = ControlCurso.DESMATRICULAR;
        }else{
         dev = this.botonera.getCodigoPorFuenteCurso(source);
        }
        
     return dev;
    }
    
    public Curso get_curso_si_datos_completos() throws CursoException{
        if(this.sigla.getText().equals("") ||
           this.nombre.getText().equals("") ||
           this.creditos.getText().equals("")){
            throw new CursoException("Falta algún dato");
        }
        
        if(!ValidadorCurso.validaCredito(this.creditos.getText())){
             throw new CursoException("Crédito debe ser un valor numérico");
        }

        Curso curso = new Curso(
            this.sigla.getText(),
            this.nombre.getText(),
            Integer.parseInt(this.creditos.getText()) );
              
       return curso;
    }
    
    public String get_sigla() throws CursoException{
        String sigla = this.sigla.getText();
        if(sigla.equals("")){
            throw new CursoException("Sigla inválida");
        }
        return sigla;
    }
    
    public void set_curso(Curso curso){
      this.sigla.setText(curso.getSigla());
      this.nombre.setText(curso.getNombre());
      this.creditos.setText(
              ""+curso.getNumero_creditos());  
    }

    public void limpiaInterfaz() {
      this.sigla.setText("");
      this.nombre.setText("");
      this.creditos.setText("");
      // FIXME: limpiar lista de estudiantes matriculados
    }

    public void setMensaje(String message) {
        this.mensajesError.setText(message);
    
    }
    
    public void set_estudiantes(ArrayList<Estudiante> est_list){
        this.estudiantes.removeAllItems();
        for(Estudiante est: est_list){
           this.estudiantes.addItem(est.getCarnet());
        }
    }
    
    public String get_carnet_seleccionado() throws CursoException{
        int pos = this.estudiantes.getSelectedIndex();
        if(pos==-1){
            throw new CursoException("Estudiante no seleccionado");
        }
        return this.estudiantes.getModel().getElementAt(pos);
    }
    
    public void set_estudiantes_matriculados(ArrayList<Estudiante> estudiante){
        DefaultListModel listModel = new DefaultListModel();
        
        for(Estudiante est: estudiante){
            listModel.addElement(est.getCarnet());
        }
        this.listamatricula.setModel(listModel);
        
    }
    
    public String get_carnet_matriculado() throws CursoException{
        int pos = this.listamatricula.getSelectedIndex();
        if(pos==-1){
            throw new CursoException("Matricula no seleccionada");
        }
        
        return listamatricula.getModel().getElementAt(pos);
    }


}
