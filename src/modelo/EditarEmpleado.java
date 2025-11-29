
package modelo;
import clases.Empleado;

public class EditarEmpleado extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EditarEmpleado.class.getName());
    private Empleado empleadoEditado; 
    public EditarEmpleado() {
    initComponents();
    setLocationRelativeTo(null);
    }

public EditarEmpleado(Empleado empleado) {
    this(); // llama al constructor sin parámetros
    this.empleadoEditado = empleado;
    
    if (empleado != null) {
        txtDniEmpleado.setText(empleado.getDni());
        txtNombresEmpleado.setText(empleado.getNombres());
        txtApellidosEmpleado.setText(empleado.getApellidos());
        // En tu diseño, el usuario de login es el DNI:
        txtUsuarioEmpleado.setText(empleado.getDni());
        txtPasswordEmpleado.setText(empleado.getPassword());

        // Rol viene como "ADMINISTRADOR" o "RECEPCIONISTA"
        if ("ADMINISTRADOR".equalsIgnoreCase(empleado.getRol())) {
            cmbRolEmpleado.setSelectedItem("Administrador");
        } else if ("RECEPCIONISTA".equalsIgnoreCase(empleado.getRol())) {
            cmbRolEmpleado.setSelectedItem("Recepcionista");
        }

        // Si en Empleado luego agregas un campo activo, aquí podrías setear lblEstadoEmpleado
        // lblEstadoEmpleado.setText(empleado.isActivo() ? "ACTIVO" : "INACTIVO");
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbRolEmpleado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        txtNombresEmpleado = new javax.swing.JTextField();
        txtApellidosEmpleado = new javax.swing.JTextField();
        txtUsuarioEmpleado = new javax.swing.JTextField();
        txtPasswordEmpleado = new javax.swing.JTextField();
        txtDniEmpleado = new javax.swing.JTextField();
        lblEstado1 = new javax.swing.JLabel();
        btnGuardarEmpleado = new javax.swing.JButton();
        btnCancelarEmpleado = new javax.swing.JButton();
        lblEstadoEmpleado = new javax.swing.JLabel();
        btnLimpiarEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setText("EDITAR EMPLEADO");

        jLabel2.setText("DNI:");

        jLabel3.setText("NOMBRES:");

        jLabel4.setText("APELLIDOS:");

        jLabel5.setText("USUARIO:");

        jLabel6.setText("CONTRASEÑA:");

        jLabel7.setText("ROL:");

        cmbRolEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Recepcionista" }));

        jLabel8.setText("ESTADO:");

        btnGuardarEmpleado.setText("GUARDAR CAMBIOS");
        btnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadoActionPerformed(evt);
            }
        });

        btnCancelarEmpleado.setText("CANCELAR");
        btnCancelarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEmpleadoActionPerformed(evt);
            }
        });

        btnLimpiarEmpleado.setText("LIMPIAR");
        btnLimpiarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnLimpiarEmpleado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(146, 146, 146)
                .addComponent(lblEstado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombresEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDniEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtPasswordEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addComponent(lblEstado))
                    .addComponent(lblEstadoEmpleado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbRolEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarEmpleado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarEmpleado)
                        .addGap(42, 42, 42)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombresEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEstado)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbRolEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado1)
                    .addComponent(lblEstadoEmpleado))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarEmpleado)
                    .addComponent(btnGuardarEmpleado)
                    .addComponent(btnCancelarEmpleado))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoActionPerformed
    String dni = txtDniEmpleado.getText().trim();
    String nombres = txtNombresEmpleado.getText().trim();
    String apellidos = txtApellidosEmpleado.getText().trim();
    String clave = txtPasswordEmpleado.getText().trim();
    String rolCombo = cmbRolEmpleado.getSelectedItem().toString();

    if (dni.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || clave.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Complete todos los campos obligatorios.",
                "Aviso",
                javax.swing.JOptionPane.WARNING_MESSAGE
        );
        return;
    }

    if (empleadoEditado == null) {
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "No hay empleado cargado para editar.",
                "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE
        );
        return;
    }

    empleadoEditado.setDni(dni);
    empleadoEditado.setNombres(nombres);
    empleadoEditado.setApellidos(apellidos);
    empleadoEditado.setPassword(clave);

    if ("Administrador".equalsIgnoreCase(rolCombo)) {
        empleadoEditado.setRol("ADMINISTRADOR");
    } else if ("Recepcionista".equalsIgnoreCase(rolCombo)) {
        empleadoEditado.setRol("RECEPCIONISTA");
    }

    javax.swing.JOptionPane.showMessageDialog(
            this,
            "Cambios guardados en el empleado.",
            "Éxito",
            javax.swing.JOptionPane.INFORMATION_MESSAGE
    );

    this.dispose(); 
    }//GEN-LAST:event_btnGuardarEmpleadoActionPerformed

    private void btnLimpiarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEmpleadoActionPerformed
    txtDniEmpleado.setText("");
    txtNombresEmpleado.setText("");
    txtApellidosEmpleado.setText("");
    txtUsuarioEmpleado.setText("");
    txtPasswordEmpleado.setText("");
    cmbRolEmpleado.setSelectedIndex(0);
    lblEstadoEmpleado.setText("");
    }//GEN-LAST:event_btnLimpiarEmpleadoActionPerformed

    private void btnCancelarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEmpleadoActionPerformed
    this.dispose();
    }//GEN-LAST:event_btnCancelarEmpleadoActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new EditarEmpleado().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarEmpleado;
    private javax.swing.JButton btnGuardarEmpleado;
    private javax.swing.JButton btnLimpiarEmpleado;
    private javax.swing.JComboBox<String> cmbRolEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstado1;
    private javax.swing.JLabel lblEstadoEmpleado;
    private javax.swing.JTextField txtApellidosEmpleado;
    private javax.swing.JTextField txtDniEmpleado;
    private javax.swing.JTextField txtNombresEmpleado;
    private javax.swing.JTextField txtPasswordEmpleado;
    private javax.swing.JTextField txtUsuarioEmpleado;
    // End of variables declaration//GEN-END:variables
}
