/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ii_sisop;

import java.awt.Color;
import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crist
 */ 
public class ver extends javax.swing.JFrame {
    
int Contador;//Contador del total de procesos que se van ingresando
    int NProceso;//Carga el número de procesos ejecutándose
    int Rafaga=0;//Carga la ráfaga en ejecución
    int Quantum=0;//Carga el quantum en ejecución
    int ResiduoRafaga=0;//Carga el residuo en ejecución
    int TiempoProceso=0;//Carga el tiempo que se dura procesando
    int ValorBarra;//Carga el progreso de la Barra
    int CantidadProcesos;//Número de procesos terminados


    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTFinal = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPBEstado = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jBIniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLNumeroProceso = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jLPorcentajeProceso = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTIngreso = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFCapturaQuantum = new javax.swing.JTextField();
        jLCantidadProcesos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLCantidadTiempo = new javax.swing.JTextField();
        jTFCapturaRafaga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Proceso", "Rafaga", "Quantum", "Tiempo Final"
            }
        ));
        jScrollPane4.setViewportView(jTFinal);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("        LISTA DE PROCESOS");

        jPBEstado.setBackground(java.awt.SystemColor.textHighlight);
        jPBEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPBEstado.setForeground(new java.awt.Color(0, 51, 255));
        jPBEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));

        jLabel7.setText("Proceso");

        jBIniciar.setText("Iniciar");
        jBIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIniciarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("        HISTORICO PROCESOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Quantum");

        jLNumeroProceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLNumeroProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLNumeroProcesoActionPerformed(evt);
            }
        });

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jLPorcentajeProceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLPorcentajeProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLPorcentajeProcesoActionPerformed(evt);
            }
        });

        jTIngreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Proceso", "Rafaga", "Quantum", "ResiduoRafaga", "Estado"
            }
        ));
        jScrollPane3.setViewportView(jTIngreso);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CANTIDAD PROCESO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("TIEMPO PROCESO");

        jTFCapturaQuantum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTFCapturaQuantum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCapturaQuantumActionPerformed(evt);
            }
        });

        jLCantidadProcesos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCantidadProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLCantidadProcesosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Rafaga");

        jLCantidadTiempo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCantidadTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLCantidadTiempoActionPerformed(evt);
            }
        });

        jTFCapturaRafaga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTFCapturaRafaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCapturaRafagaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCapturaQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFCapturaRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLNumeroProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLPorcentajeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLCantidadProcesos)
                                            .addComponent(jLCantidadTiempo)))))))
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBAgregar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCapturaRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBIniciar)
                    .addComponent(jTFCapturaQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLPorcentajeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLNumeroProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCantidadProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCantidadTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIniciarActionPerformed
        // TODO add your handling code here:
        new Thread(new Hilo()).start(); //Crea un nuevo hilo
        Iniciar();
    }//GEN-LAST:event_jBIniciarActionPerformed

    private void jLNumeroProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLNumeroProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLNumeroProcesoActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        // TODO add your handling code here:
        if((Integer.parseInt(jTFCapturaRafaga.getText()))<=100){
            Ingresar();
            jTFCapturaQuantum.setEditable(false); 
        }else{
            JOptionPane.showMessageDialog(null, "Las Rafagas no pueden ser mayores de 100");
            jTFCapturaRafaga.setText(null);
            jTFCapturaRafaga.grabFocus();
        }

    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jLPorcentajeProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLPorcentajeProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLPorcentajeProcesoActionPerformed

    private void jTFCapturaQuantumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCapturaQuantumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCapturaQuantumActionPerformed

    private void jLCantidadProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLCantidadProcesosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCantidadProcesosActionPerformed

    private void jLCantidadTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLCantidadTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCantidadTiempoActionPerformed

    private void jTFCapturaRafagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCapturaRafagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCapturaRafagaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ver().setVisible(true);
            }
        });
    }


    private class Hilo implements Runnable{ //Objeto de tipo Hilo con extension ejectubale
    @Override
    public void run(){
        int estado=1; //Estado de while que indica si se puede seguir o no
        int i=0; // contador de while
        
        while(estado!=0){
            while(i<Contador){ //Recorrer las filas
                Cargar(i);
                if(ResiduoRafaga!=0 && ResiduoRafaga>Quantum){ //Ejecutando Procesos
                    for(int c=1; c<=Quantum; c++){
                        jTIngreso.setValueAt("Procesando",i,4);
                        ResiduoRafaga--;
                        Barra(Rafaga,ResiduoRafaga);
                        Pintar();
                        jTIngreso.setValueAt(String.valueOf(ResiduoRafaga),i,3);
                        TiempoProceso++;
                        Dormir();
                    }
                    jTIngreso.setValueAt("Espera",i,4);
                    if(ResiduoRafaga==0){
                        jTIngreso.setValueAt("Terminado",i,4);
                        Pintar();
                        Informe(i);
                        Borrar(i);
                        jPBEstado.setValue(0);
                    }
            }else{
                if(ResiduoRafaga>0 && Quantum!=0){
                    while(ResiduoRafaga>0){
                        jTIngreso.setValueAt("Procesando",i,4);
                        ResiduoRafaga--;
                        Barra(Rafaga,ResiduoRafaga);
                        Pintar();
                        jTIngreso.setValueAt(String.valueOf(ResiduoRafaga),i,3);
                        TiempoProceso++;
                        Dormir();
                    }
                    jTIngreso.setValueAt("Espera",i,4);
                    if(ResiduoRafaga==0 && Quantum!=0){
                        jTIngreso.setValueAt("Terminado",i,4);
                        Pintar();
                        Informe(i);
                        Borrar(i);
                        jPBEstado.setValue(0);
                     }
                    }else{
                        if(ResiduoRafaga==0 && Quantum!=0){
                            jTIngreso.setValueAt("Terminado",i,4);
                            Pintar();
                            Informe(i);
                            Borrar(i);
                            jPBEstado.setValue(0);
                        }
                    }
                }
                jLNumeroProceso.setText(String.valueOf("")); //Borrar contenido
                jLPorcentajeProceso.setText(String.valueOf(""));
                i++;
            }
            i=0;
            jLNumeroProceso.setText(String.valueOf("")); //Borrar contenido
            jLPorcentajeProceso.setText(String.valueOf(""));
            
        }
            
    }
}

public void Dormir(){
    try{
        Thread.sleep(700); //Dormir sistema
    }catch(InterruptedException ex){
        Logger.getLogger(ver.class.getName()).log(Level.SEVERE,null,ex);
    }

}

public void Cargar(int i){ //Carga los valores de la Tabla
    NProceso=(int)jTIngreso.getValueAt(i,0);
    Rafaga=parseInt((String)(jTIngreso.getValueAt(i,1)));
    Quantum=parseInt((String)(jTIngreso.getValueAt(i,2)));
    ResiduoRafaga=parseInt((String)(jTIngreso.getValueAt(i,3)));
    if(NProceso>0){
        jLNumeroProceso.setText(String.valueOf(NProceso));
    }
}

public void Ingresar(){ //Ingresar proceso a la tabla
    DefaultTableModel modelo=(DefaultTableModel) jTIngreso.getModel();

    Contador ++;
    Object[] miTabla = new Object[5];
    miTabla[0]= Contador;
    miTabla[1]= jTFCapturaRafaga.getText();
    miTabla[2]= jTFCapturaQuantum.getText();
    miTabla[3]= jTFCapturaRafaga.getText();
    miTabla[4]= "Listo";
    modelo.addRow(miTabla);
    jTIngreso.setModel(modelo);
    jTFCapturaRafaga.setText(null);
    jTFCapturaRafaga.grabFocus();
}

public void Informe(int c){
    DefaultTableModel modelo2 = (DefaultTableModel) jTFinal.getModel();

    Object[] miTabla= new Object[5];
    miTabla[0]= c+1;
    miTabla[1]= Rafaga;
    miTabla[2]= Quantum;
    miTabla[3]= TiempoProceso+" Segundos";
    miTabla[4]= "Terminado";
    modelo2.addRow(miTabla);
    jTFinal.setModel(modelo2);

    CantidadProcesos++;
    jLCantidadProcesos.setText(String.valueOf(CantidadProcesos+" Terminados"));
    jLCantidadTiempo.setText(String.valueOf(TiempoProceso+" Segundos"));
}

public void Borrar(int c){ //Elimina los registros de la tabla procesos
    jTIngreso.setValueAt(0,c,0);
    jTIngreso.setValueAt("0",c,1);
    jTIngreso.setValueAt("0",c,2);
    jTIngreso.setValueAt("0",c,3);
    jTIngreso.setValueAt("******",c,4);
}

   public void Barra(int rafaga, int residuo){ //Calcula porcentaje de la barra y su progreso
        int Rafaga=rafaga;
        int valor=100/rafaga;
        int porcentaje=100-(valor*residuo);
        ValorBarra=porcentaje;
        jLPorcentajeProceso.setText(String.valueOf(ValorBarra+"%"));
}

    public void Pintar(){
        jPBEstado.setValue(ValorBarra);
        jPBEstado.repaint();
    }

    public void Iniciar(){ //Inicia la secuencia de procesos
        jLabel2.setVisible(false);
        jLabel1.setVisible(false);
        jTFCapturaRafaga.setVisible(false);
        jTFCapturaQuantum.setVisible(false);
        jBAgregar.setVisible(false);
        jBIniciar.setVisible(false);
}
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBIniciar;
    private javax.swing.JTextField jLCantidadProcesos;
    private javax.swing.JTextField jLCantidadTiempo;
    private javax.swing.JTextField jLNumeroProceso;
    private javax.swing.JTextField jLPorcentajeProceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jPBEstado;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTFCapturaQuantum;
    private javax.swing.JTextField jTFCapturaRafaga;
    private javax.swing.JTable jTFinal;
    private javax.swing.JTable jTIngreso;
    // End of variables declaration//GEN-END:variables
}
