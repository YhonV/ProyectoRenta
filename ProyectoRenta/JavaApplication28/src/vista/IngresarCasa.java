package vista;

import controlador.CasaDAO;
import javax.swing.JOptionPane;
import modelo.Casa;

public class IngresarCasa extends javax.swing.JFrame {


    public IngresarCasa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgCantC = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtAniosAntC = new javax.swing.JTextField();
        txtIDCasa = new javax.swing.JTextField();
        txtMt2C = new javax.swing.JTextField();
        txtComunaC = new javax.swing.JTextField();
        cbxCantHabitC = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtValorRentaC = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rdbCant1 = new javax.swing.JRadioButton();
        rdbCant2 = new javax.swing.JRadioButton();
        rdbCant3 = new javax.swing.JRadioButton();
        btnVolver = new javax.swing.JButton();
        btnGuardarC1 = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("ID Casa:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 70, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 60, 10));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Metros Cuadrados:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 10));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Comuna:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Cant. Habitaciones:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Valor Renta:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 100, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 90, 20));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Años Antiguedad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 130, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 130, 20));
        jPanel1.add(txtAniosAntC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 110, -1));

        txtIDCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDCasaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 110, -1));
        jPanel1.add(txtMt2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 110, -1));
        jPanel1.add(txtComunaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 110, -1));

        cbxCantHabitC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opción", "1", "2", "3", "4", "5", "6" }));
        jPanel1.add(cbxCantHabitC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 150, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casa.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 150, 310));
        jPanel1.add(txtValorRentaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 110, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad de pisos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 13))); // NOI18N

        btgCantC.add(rdbCant1);
        rdbCant1.setText("1");

        btgCantC.add(rdbCant2);
        rdbCant2.setText("2");

        btgCantC.add(rdbCant3);
        rdbCant3.setText("3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbCant1)
                .addGap(18, 18, 18)
                .addComponent(rdbCant2)
                .addGap(18, 18, 18)
                .addComponent(rdbCant3)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbCant1)
                    .addComponent(rdbCant2)
                    .addComponent(rdbCant3))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 180, 80));

        btnVolver.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(51, 51, 51));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        btnGuardarC1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnGuardarC1.setForeground(new java.awt.Color(51, 51, 51));
        btnGuardarC1.setText("Guardar");
        btnGuardarC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarC1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        btnLimpiar1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnLimpiar1.setForeground(new java.awt.Color(51, 51, 51));
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 120, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favicon.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    public int cantPiso(){
        if(rdbCant1.isSelected())
            return 1;
        if(rdbCant2.isSelected())
            return 2;
        if(rdbCant3.isSelected())
            return 3;
        return 0;
    }
    
    private void txtIDCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDCasaActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
       txtIDCasa.setText(null);
       txtMt2C.setText(null);
       txtComunaC.setText(null);
       cbxCantHabitC.setSelectedIndex(-1);
       txtValorRentaC.setText(null);
       txtAniosAntC.setText(null);
       btgCantC.clearSelection();
       txtIDCasa.requestFocus();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnGuardarC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarC1ActionPerformed
        String id_vivienda,comuna;
        double mt2c;
        int cantHabitC,valorRentaC,anio_antig,cant_piso;
        
        cant_piso = cantPiso();
        
        if(cant_piso == 0){
            JOptionPane.showMessageDialog(this, "Debe seleccinar cantidad de pisos");
            return;
        }
        
        if(cbxCantHabitC.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Debe seleccionar la cantidad de habitaciones");
            return;
        }
        
        id_vivienda = txtIDCasa.getText();
        mt2c = Double.parseDouble(txtMt2C.getText());
        comuna = txtComunaC.getText();
        cantHabitC = Integer.parseInt(cbxCantHabitC.getSelectedItem().toString());
        valorRentaC = Integer.parseInt(txtValorRentaC.getText());
        anio_antig = Integer.parseInt(txtAniosAntC.getText());
        cant_piso = cantPiso();
        
        Casa ca = new Casa(id_vivienda, mt2c, comuna, cantHabitC, valorRentaC, anio_antig, cant_piso);
        CasaDAO caDAO = new CasaDAO();
        
        if(caDAO.buscarCasa(id_vivienda) == null){
            caDAO.ingresarCasa(ca);
            JOptionPane.showMessageDialog(this, "Casa ingresada con exito");
        }else{
            JOptionPane.showMessageDialog(this, "Casa ya existe");
        }
    }//GEN-LAST:event_btnGuardarC1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgCantC;
    private javax.swing.JButton btnGuardarC1;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxCantHabitC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JRadioButton rdbCant1;
    private javax.swing.JRadioButton rdbCant2;
    private javax.swing.JRadioButton rdbCant3;
    private javax.swing.JTextField txtAniosAntC;
    private javax.swing.JTextField txtComunaC;
    private javax.swing.JTextField txtIDCasa;
    private javax.swing.JTextField txtMt2C;
    private javax.swing.JTextField txtValorRentaC;
    // End of variables declaration//GEN-END:variables
}
