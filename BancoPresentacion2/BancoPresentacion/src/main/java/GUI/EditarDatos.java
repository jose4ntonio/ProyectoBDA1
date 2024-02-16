/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author Dell
 */
public class EditarDatos extends javax.swing.JPanel {

    /**
     * Creates new form EditarDatos
     */
    public EditarDatos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textBienvenido = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textNombre = new javax.swing.JLabel();
        textApellidoP = new javax.swing.JLabel();
        jtextoEditarApellido = new javax.swing.JTextField();
        jtextoEditarNombre = new javax.swing.JTextField();
        jbtnConfirmarEditar = new javax.swing.JButton();
        textNombre1 = new javax.swing.JLabel();
        jtextoEditarFechaNacimiento = new javax.swing.JTextField();
        textApellidoP1 = new javax.swing.JLabel();
        jtextoEditarCalle = new javax.swing.JTextField();
        textNombre2 = new javax.swing.JLabel();
        jtextoEditarNumero = new javax.swing.JTextField();
        textApellidoP2 = new javax.swing.JLabel();
        jtextoEditarCP = new javax.swing.JTextField();
        textApellidoP3 = new javax.swing.JLabel();
        jtextoEditarContraseña = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        textBienvenido.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        textBienvenido.setText("Editar Datos");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        textNombre.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textNombre.setText("Nombre(s):");

        textApellidoP.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textApellidoP.setText("Apellidos:");

        jtextoEditarApellido.setBackground(new java.awt.Color(204, 204, 204));
        jtextoEditarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextoEditarApellidoActionPerformed(evt);
            }
        });

        jtextoEditarNombre.setBackground(new java.awt.Color(204, 204, 204));
        jtextoEditarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextoEditarNombreActionPerformed(evt);
            }
        });

        jbtnConfirmarEditar.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jbtnConfirmarEditar.setText("Confirmar");
        jbtnConfirmarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmarEditarActionPerformed(evt);
            }
        });

        textNombre1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textNombre1.setText("Fecha de Nacimiento:");

        jtextoEditarFechaNacimiento.setBackground(new java.awt.Color(204, 204, 204));
        jtextoEditarFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextoEditarFechaNacimientoActionPerformed(evt);
            }
        });

        textApellidoP1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textApellidoP1.setText("Calle:");

        jtextoEditarCalle.setBackground(new java.awt.Color(204, 204, 204));
        jtextoEditarCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextoEditarCalleActionPerformed(evt);
            }
        });

        textNombre2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textNombre2.setText("Número:");

        jtextoEditarNumero.setBackground(new java.awt.Color(204, 204, 204));
        jtextoEditarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextoEditarNumeroActionPerformed(evt);
            }
        });

        textApellidoP2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textApellidoP2.setText("Código Postal:");

        jtextoEditarCP.setBackground(new java.awt.Color(204, 204, 204));
        jtextoEditarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextoEditarCPActionPerformed(evt);
            }
        });

        textApellidoP3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textApellidoP3.setText("Cambiar Contraseña:");

        jtextoEditarContraseña.setBackground(new java.awt.Color(204, 204, 204));
        jtextoEditarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextoEditarContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(textNombre)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(textApellidoP)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(textNombre1)
                        .addGap(89, 89, 89))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(textApellidoP1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jbtnConfirmarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 85, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtextoEditarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextoEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextoEditarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextoEditarFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextoEditarCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextoEditarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextoEditarCP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textNombre2)
                                .addGap(80, 80, 80))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textApellidoP2)
                                .addGap(62, 62, 62)))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(textApellidoP3)
                        .addGap(105, 105, 105))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(textNombre)
                .addGap(8, 8, 8)
                .addComponent(jtextoEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textApellidoP)
                .addGap(2, 2, 2)
                .addComponent(jtextoEditarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtextoEditarFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textApellidoP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtextoEditarCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtextoEditarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textApellidoP2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtextoEditarCP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textApellidoP3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtextoEditarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnConfirmarEditar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textBienvenido)
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtextoEditarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextoEditarApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextoEditarApellidoActionPerformed

    private void jtextoEditarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextoEditarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextoEditarNombreActionPerformed

    private void jbtnConfirmarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmarEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnConfirmarEditarActionPerformed

    private void jtextoEditarFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextoEditarFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextoEditarFechaNacimientoActionPerformed

    private void jtextoEditarCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextoEditarCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextoEditarCalleActionPerformed

    private void jtextoEditarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextoEditarNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextoEditarNumeroActionPerformed

    private void jtextoEditarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextoEditarCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextoEditarCPActionPerformed

    private void jtextoEditarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextoEditarContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextoEditarContraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnConfirmarEditar;
    private javax.swing.JTextField jtextoEditarApellido;
    private javax.swing.JTextField jtextoEditarCP;
    private javax.swing.JTextField jtextoEditarCalle;
    private javax.swing.JTextField jtextoEditarContraseña;
    private javax.swing.JTextField jtextoEditarFechaNacimiento;
    private javax.swing.JTextField jtextoEditarNombre;
    private javax.swing.JTextField jtextoEditarNumero;
    private javax.swing.JLabel textApellidoP;
    private javax.swing.JLabel textApellidoP1;
    private javax.swing.JLabel textApellidoP2;
    private javax.swing.JLabel textApellidoP3;
    private javax.swing.JLabel textBienvenido;
    private javax.swing.JLabel textNombre;
    private javax.swing.JLabel textNombre1;
    private javax.swing.JLabel textNombre2;
    // End of variables declaration//GEN-END:variables
}
