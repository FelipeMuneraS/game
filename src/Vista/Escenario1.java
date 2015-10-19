
package Vista;

import Modelo.Prueba1;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Escenario1 extends javax.swing.JFrame {
    Prueba1 prueba ;
    boolean[] controlador = new boolean[10];
    int puntaje = 0;
    int indicador = 0;
    
    public Escenario1() {
        initComponents();
        setLocationRelativeTo(null);
        actualizaInformacion();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pregunta = new javax.swing.JButton();
        opcion2 = new javax.swing.JButton();
        opcion3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        opcion1 = new javax.swing.JButton();
        puntos = new javax.swing.JLabel();
        igual = new javax.swing.JLabel();
        cifra1 = new javax.swing.JLabel();
        cifra2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pregunta.setPreferredSize(new java.awt.Dimension(844, 101));
        pregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preguntaActionPerformed(evt);
            }
        });

        opcion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Prueba1/R2.jpg"))); // NOI18N
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });

        opcion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Prueba1/R3.jpg"))); // NOI18N
        opcion3.setPreferredSize(null);
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Purisa", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Descripcion");

        opcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Prueba1/R1.jpg"))); // NOI18N
        opcion1.setPreferredSize(null);
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });

        puntos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/N1.png"))); // NOI18N

        igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Igual.png"))); // NOI18N

        cifra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/0.png"))); // NOI18N

        cifra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/0.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(puntos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(igual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cifra1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cifra2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(132, 132, 132))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cifra1)
                            .addComponent(cifra2)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(igual)
                        .addComponent(puntos))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void actualizarPuntaje(){
        int d, u;
        u = puntaje%10;
        d = (puntaje-u)/10;
        cifra1.setIcon(new ImageIcon(getClass().getResource("../Recursos/"+d+".png")));
        cifra2.setIcon(new ImageIcon(getClass().getResource("../Recursos/"+u+".png")));        
    }
    
    public void actualizaInformacion(){
        prueba = new Prueba1();
        int i = Integer.parseInt(String.valueOf((prueba.getPregunta().charAt(21))));
        System.out.println(i);
        while(controlador[i]==true){ 
            prueba = new Prueba1();
            i = Integer.parseInt(String.valueOf((prueba.getPregunta().charAt(21))));        
        }
        ImageIcon icono = new ImageIcon(getClass().getResource(prueba.getPregunta()));
        icono =  new ImageIcon(icono.getImage().getScaledInstance(pregunta.getWidth(), pregunta.getHeight(), java.awt.Image.SCALE_DEFAULT));
        pregunta.setIcon(icono);
        pregunta.setBorderPainted(false);
        pregunta.setContentAreaFilled(false);
        pregunta.setFocusable(false);
        pregunta.setRolloverEnabled(true);
        String[] opciones = prueba.getOpciones();
        icono = new ImageIcon(getClass().getResource(opciones[0]));
        icono =  new ImageIcon(icono.getImage().getScaledInstance(opcion1.getWidth(), opcion1.getHeight(), java.awt.Image.SCALE_DEFAULT));
        jLabel1.setText(prueba.getDescripcion());
        controlador[i]= true;        
    }
    
    private void preguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preguntaActionPerformed
        // TODO add your handling code here:
//        this.dispose();
//        Escenario1 escenario1 = new Escenario1();
//        escenario1.setVisible(true);
    }//GEN-LAST:event_preguntaActionPerformed

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
        // TODO add your handling code here:
        if(prueba.getOpcionCorrecta()==1){
            JOptionPane.showMessageDialog(null,   "Opcion Correcta");
            actualizaInformacion(); 
            if(indicador==0){
                puntaje += 6;       
                actualizarPuntaje();
            }else if (indicador==1){
                puntaje+= 4;
                indicador = 0;
                actualizarPuntaje();
            }
        }else{
            JOptionPane.showMessageDialog(null,   "Opcion incorrecta");
            if(indicador==0){
                indicador = 1;
            }else if (indicador==1){
                indicador = 0;
                actualizaInformacion();
            }
        }
        
    }//GEN-LAST:event_opcion1ActionPerformed

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
        // TODO add your handling code here:
        if(prueba.getOpcionCorrecta()==2){
            JOptionPane.showMessageDialog(null,   "Opcion Correcta");
            actualizaInformacion();
            if(indicador==0){
                puntaje += 6;       
                actualizarPuntaje();
            }else if (indicador==1){
                puntaje+= 4;
                indicador = 0;
                actualizarPuntaje();
            }
        }else{
            JOptionPane.showMessageDialog(null,   "Opcion incorrecta");
            if(indicador==0){
                indicador = 1;
            }else if (indicador==1){
                indicador = 0;
                actualizaInformacion();
            }
        }
    }//GEN-LAST:event_opcion2ActionPerformed

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
        // TODO add your handling code here:
        if(prueba.getOpcionCorrecta()==3){
            JOptionPane.showMessageDialog(null,   "Opcion Correcta");
            actualizaInformacion();
            if(indicador==0){
                puntaje += 6;       
                actualizarPuntaje();
            }else if (indicador==1){
                puntaje+= 4;
                indicador = 0;
                actualizarPuntaje();
            }
        }else{
            JOptionPane.showMessageDialog(null,   "Opcion incorrecta");
            if(indicador==0){
                indicador = 1;
            }else if (indicador==1){
                indicador = 0;
                actualizaInformacion();
            }
        }
    }//GEN-LAST:event_opcion3ActionPerformed

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
            java.util.logging.Logger.getLogger(Escenario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escenario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escenario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escenario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escenario1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cifra1;
    private javax.swing.JLabel cifra2;
    private javax.swing.JLabel igual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton opcion1;
    private javax.swing.JButton opcion2;
    private javax.swing.JButton opcion3;
    private javax.swing.JButton pregunta;
    private javax.swing.JLabel puntos;
    // End of variables declaration//GEN-END:variables
}
