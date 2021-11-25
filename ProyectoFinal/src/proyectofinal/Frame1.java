/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
        


public class Frame1 extends javax.swing.JFrame {
    
    int pedirPregunta;
    int pregCorrectas;
    int numeroRandom;
    int dinero;
    String nombre;
    int pregUsadas[] = new int[16];
    int contPreguntas=0;
    int error=0;
    Preguntas millonario[] = new Preguntas[4];
    boolean pregCreadas=false;
    
    
    private void contructor()
    {
        pedirPregunta=0;
        pregCorrectas=0;
        numeroRandom=0;
        dinero=0;
        nombre="";
        int pregUsadas[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    }        

    
    
    
    public Frame1() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jButton1.setText("Iniciar juego");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });

        jTextField3.setText("jTextField3");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });

        jTextField4.setText("jTextField4");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField5.setText("jTextField5");
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        jTextField6.setText("jTextField6");

        jTextField7.setText("jTextField7");

        jTextField8.setText("jTextField8");
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });

        jButton2.setText("Crear Preguntas");
        jButton2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButton2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jTextField4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(jTextField5))
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(71, 71, 71))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(162, 162, 162)))
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField8)
                    .addComponent(jTextField7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
            
    
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        jTextField1.setText("Quien quiere ser millonario?");
        jTextField2.setText("                    ");
        jTextField3.setText("                    ");
        jTextField4.setText("                    ");
        jTextField5.setText("                    ");
        jTextField6.setText("Dinero ganado:"+dinero);
        jTextField7.setText("Numero de pregunta:"+pedirPregunta);
        jTextField8.setText("Haga click aqui para ingresar el nombre del "
                + "concursante");
        jButton1.setText("Iniciar juego");
        
    }//GEN-LAST:event_formWindowActivated

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        do {
            numeroRandom = (int)(Math.random()*4+1);
            error=0;
            for (int i=0;i<pregUsadas.length;i++){
                if (numeroRandom==pregUsadas[i]){
                    error+=1;
                }
            }
                    
                
        }while (error>=1);
            
           
        
        pedirPregunta=numeroRandom;
        contPreguntas+=1;
        pregUsadas[contPreguntas]=numeroRandom;
        
       
        
        switch(pregCorrectas)
        {
            case 1: dinero=100000;
                    break;
            case 2: dinero=250000;
                    break;
            case 3: dinero=500000;
                    break;
            case 4: dinero=750000;
                    break;
            case 5: dinero=1000000;
                    break;
            case 6: dinero=2000000;
                    break;
            case 7: dinero=2500000;
                    break;
            case 8: dinero=3000000;
                    break;
            case 9: dinero=5000000;
                    break;        
            case 10: dinero=7500000;
                    break;
            case 11: dinero=10000000;
                    break;        
            case 12: dinero=12000000;
                    break;
            case 13: dinero=15000000;
                    break;
            case 14: dinero=20000000;
                    break;
            case 15: dinero=25000000;
                    break;        
            default: dinero=0;
                    break;
        }
        
        
        jTextField1.setBackground(Color.WHITE);
        jTextField2.setBackground(Color.WHITE);
        jTextField3.setBackground(Color.WHITE);
        jTextField4.setBackground(Color.WHITE);
        jTextField5.setBackground(Color.WHITE);
                
        
        
        
        if(pregCreadas==true){
            jTextField1.setText(millonario[pedirPregunta-1].gettextoPreg());
            jTextField2.setText("A. "+millonario[pedirPregunta-1].getrespA());
            jTextField3.setText("B. "+millonario[pedirPregunta-1].getrespB());
            jTextField4.setText("C. "+millonario[pedirPregunta-1].getrespC());
            jTextField5.setText("D. "+millonario[pedirPregunta-1].getrespD());
            jButton1.setText("Siguiente pregunta");
            jTextField6.setText("Dinero ganado:"+dinero);
            jTextField7.setText("Numero de pregunta:"+pedirPregunta);
            jTextField8.setText("Concursante: "+nombre);
        }
        if(pregCreadas==false){
            JOptionPane.showMessageDialog(null,"Aun no existen preguntas, "
                    + "por favor cree las preguntas antes de iniciar el "
                    + "juego.");
        }
        
     
        
     
            
        
    
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        if("A".equals(millonario[pedirPregunta-1].getrespCorrecta())){
            pregCorrectas+=1;
            jTextField1.setText("Respuesta correcta!!!");
            jTextField2.setBackground(Color.GREEN);
            jTextField3.setBackground(Color.WHITE);
            jTextField3.setText("             ");
            jTextField4.setBackground(Color.WHITE);
            jTextField4.setText("             ");
            jTextField5.setBackground(Color.WHITE);
            jTextField5.setText("             ");
        }
        else{
            jTextField1.setText("Respuesta incorrecta");
            jTextField2.setBackground(Color.RED);
            jTextField3.setBackground(Color.WHITE);
            jTextField3.setText("             ");
            jTextField4.setBackground(Color.WHITE);
            jTextField4.setText("             ");
            jTextField5.setBackground(Color.WHITE);
            jTextField5.setText("             ");
        }
        
        
            
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        
        if("B".equals(millonario[pedirPregunta-1].getrespCorrecta())){
            pregCorrectas+=1;
            jTextField1.setText("Respuesta correcta!!!");
            jTextField2.setBackground(Color.WHITE);
            jTextField2.setText("             ");
            jTextField3.setBackground(Color.GREEN);
            jTextField4.setBackground(Color.WHITE);
            jTextField4.setText("             ");
            jTextField5.setBackground(Color.WHITE);
            jTextField5.setText("             ");
        }
        else{
            jTextField1.setText("Respuesta incorrecta");
            jTextField2.setBackground(Color.WHITE);
            jTextField2.setText("             ");
            jTextField3.setBackground(Color.RED);
            jTextField4.setBackground(Color.WHITE);
            jTextField4.setText("             ");
            jTextField5.setBackground(Color.WHITE);
            jTextField5.setText("             ");
        }
            
      
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        if("C".equals(millonario[pedirPregunta-1].getrespCorrecta())){
            pregCorrectas+=1;
            jTextField1.setText("Respuesta correcta!!!");
            jTextField2.setBackground(Color.WHITE);
            jTextField2.setText("             ");
            jTextField3.setBackground(Color.WHITE);
            jTextField3.setText("             ");
            jTextField4.setBackground(Color.GREEN);
            jTextField5.setBackground(Color.WHITE);
            jTextField5.setText("             ");
        }
        else{
            jTextField1.setText("Respuesta incorrecta");
            jTextField2.setBackground(Color.WHITE);
            jTextField2.setText("             ");
            jTextField3.setBackground(Color.WHITE);
            jTextField3.setText("             ");
            jTextField4.setBackground(Color.RED);
            jTextField5.setBackground(Color.WHITE);
            jTextField5.setText("             ");
        } 
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        if("D".equals(millonario[pedirPregunta-1].getrespCorrecta())){
            pregCorrectas+=1;
            jTextField1.setText("Respuesta correcta!!!");
            jTextField2.setBackground(Color.WHITE);
            jTextField2.setText("             ");
            jTextField3.setBackground(Color.WHITE);
            jTextField3.setText("             ");
            jTextField4.setBackground(Color.WHITE);
            jTextField4.setText("             ");
            jTextField5.setBackground(Color.GREEN);
            
        }
        else{
            jTextField1.setText("Respuesta incorrecta");
            jTextField2.setBackground(Color.WHITE);
            jTextField2.setText("             ");
            jTextField3.setBackground(Color.WHITE);
            jTextField3.setText("             ");
            jTextField4.setBackground(Color.WHITE);
            jTextField4.setText("             ");
            jTextField5.setBackground(Color.RED);
            
        }
       
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        nombre=JOptionPane.showInputDialog("Digite el nombre del concursante:");
        jTextField8.setText("Concursante: "+nombre);
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jButton2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2AncestorAdded

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
        
        for (int i=0;i<millonario.length;i++){
                    millonario[i] = new Preguntas(i);
                    millonario[i].settextoPreg(JOptionPane.showInputDialog(""
                            + "Ingrese"
                            + " el texto de la pregunta "+(i+1)+":"));
                    millonario[i].setrespA(JOptionPane.showInputDialog(""
                            + "Ingrese"
                            + " la respuesta A para la pregunta "+(i+1)+":"));
                    millonario[i].setrespB(JOptionPane.showInputDialog(""
                            + "Ingrese"
                            + " la respuesta B para la pregunta "+(i+1)+":"));
                    millonario[i].setrespC(JOptionPane.showInputDialog(""
                            + "Ingrese"
                            + " la respuesta C para la pregunta "+(i+1)+":"));
                    millonario[i].setrespD(JOptionPane.showInputDialog(""
                            + "Ingrese"
                            + " la respuesta D para la pregunta "+(i+1)+":"));
                    millonario[i].setrespCorrecta(JOptionPane.showInputDialog(""
                            + "Ingrese"
                            + " el caracter correspondiente a la respuesta "
                            + "correcta"
                            + " para la pregunta "+(i+1)+" (en mayuscula):"));
                }
                JOptionPane.showMessageDialog(null,"Preguntas guardadas"
                        + " exitosamente.");
                pregCreadas=true;
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
