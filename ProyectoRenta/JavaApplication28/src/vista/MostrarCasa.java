package vista;

import controlador.CasaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Casa;

public class MostrarCasa extends javax.swing.JFrame {

    public MostrarCasa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtIDCasa = new javax.swing.JTextField();
        btnBuscarCasa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrarCasa = new javax.swing.JTable();
        btnPromedioRentaC = new javax.swing.JButton();
        btnCant2Pisos = new javax.swing.JButton();
        btnEliminarC = new javax.swing.JButton();
        btnModificarC = new javax.swing.JButton();
        btnVolverC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("ID Casa:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 51, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 50, 10));

        txtIDCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDCasaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 129, -1));

        btnBuscarCasa.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnBuscarCasa.setText("Buscar");
        btnBuscarCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCasaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 38, -1, -1));

        tblMostrarCasa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Casa", "Mt2", "Comuna", "Habitaciones", "Valor renta", "Años Antigue.", "Cant. Pisos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMostrarCasa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 510, 240));

        btnPromedioRentaC.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnPromedioRentaC.setForeground(new java.awt.Color(0, 102, 204));
        btnPromedioRentaC.setText("Promedio Valor Renta ");
        btnPromedioRentaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioRentaCActionPerformed(evt);
            }
        });
        jPanel1.add(btnPromedioRentaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 190, -1));

        btnCant2Pisos.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnCant2Pisos.setForeground(new java.awt.Color(0, 102, 204));
        btnCant2Pisos.setText("Cantidad Casas de 2 Pisos");
        btnCant2Pisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCant2PisosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCant2Pisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 190, -1));

        btnEliminarC.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEliminarC.setForeground(new java.awt.Color(0, 102, 204));
        btnEliminarC.setText("Eliminar");
        btnEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        btnModificarC.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnModificarC.setForeground(new java.awt.Color(0, 102, 204));
        btnModificarC.setText("Modificar");
        btnModificarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        btnVolverC.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnVolverC.setForeground(new java.awt.Color(0, 102, 204));
        btnVolverC.setText("Volver");
        btnVolverC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverCActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolverC, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 150, 120));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favicon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 0, -1, 30));

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

    private void txtIDCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDCasaActionPerformed

    private void btnBuscarCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCasaActionPerformed
        CasaDAO caDAO = new CasaDAO();
        ArrayList<Casa>casas=caDAO.obtenerTodoCasa();
        DefaultTableModel dtm=(DefaultTableModel)tblMostrarCasa.getModel();
        limpiarTabla();
        if(casas.size()==0)
            JOptionPane.showMessageDialog(this, "No hay casas ingresadas");
        else{
            Casa ca=caDAO.buscarCasa(txtIDCasa.getText());
            
            if(ca == null){
                String [][] datos = new String [casas.size()][7];
                for (int i = 0; i < casas.size(); i++) {
                    datos[i][0]=casas.get(i).getId_vivienda();
                    datos[i][1]=String.valueOf(casas.get(i).getMetros_cuadrados());
                    datos[i][2]=casas.get(i).getComuna();
                    datos[i][3]=String.valueOf(casas.get(i).getHabitaciones());
                    datos[i][4]=String.valueOf(casas.get(i).getValor_renta());
                    datos[i][5]=String.valueOf(casas.get(i).getAnio_antiguedad());
                    datos[i][6]=String.valueOf(casas.get(i).getCant_pisos());
                    dtm.addRow(datos[i]);
                }
                tblMostrarCasa.setModel(dtm);
            }
            else{
                String [] datos = new String [7];
                datos[0]=ca.getId_vivienda();
                datos[1]=String.valueOf(ca.getMetros_cuadrados());
                datos[2]=ca.getComuna();
                datos[3]=String.valueOf(ca.getHabitaciones());
                datos[4]=String.valueOf(ca.getValor_renta());
                datos[5]=String.valueOf(ca.getAnio_antiguedad());
                datos[6]=String.valueOf(ca.getCant_pisos());
                dtm.addRow(datos);
                tblMostrarCasa.setModel(dtm);
            }
        }
    }//GEN-LAST:event_btnBuscarCasaActionPerformed

    private void btnPromedioRentaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioRentaCActionPerformed
        CasaDAO caDAO = new CasaDAO();
        int promedio = caDAO.avgRenta();
        JOptionPane.showMessageDialog(this, "El promedio de Renta de las casas es: $"+promedio);
    }//GEN-LAST:event_btnPromedioRentaCActionPerformed

    private void btnCant2PisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCant2PisosActionPerformed
        CasaDAO caDAO = new CasaDAO();
        int contador = caDAO.cantCasas2p();
        JOptionPane.showMessageDialog(this, "La cantidad de casas con 2 pisos es: "+contador);
    }//GEN-LAST:event_btnCant2PisosActionPerformed

    private void btnEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)tblMostrarCasa.getModel();
        int fila=tblMostrarCasa.getSelectedRow();
        if(fila==-1)
        JOptionPane.showMessageDialog(this, "Debe seleccionar el registro a eliminar");
        else{
            String id_vivienda=String.valueOf(tblMostrarCasa.getValueAt(fila, 0));
            CasaDAO caDAO=new CasaDAO();
            caDAO.eliminarCasa(id_vivienda);
            JOptionPane.showMessageDialog(this, "Casa eliminada");
            dtm.removeRow(fila);
        }
    }//GEN-LAST:event_btnEliminarCActionPerformed

    private void btnModificarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)tblMostrarCasa.getModel();
        int fila=tblMostrarCasa.getSelectedRow();
        if(fila==-1)
        JOptionPane.showMessageDialog(this, "Debe seleccionar el registro a modificar");
        else{
            String id_vivienda=String.valueOf(tblMostrarCasa.getValueAt(fila, 0));
            double mt2=Double.parseDouble(String.valueOf(tblMostrarCasa.getValueAt(fila, 1)));
            String comuna=String.valueOf(tblMostrarCasa.getValueAt(fila, 2));
            int habitacion=Integer.parseInt(String.valueOf(tblMostrarCasa.getValueAt(fila, 3)));
            int valorRenta=Integer.parseInt(String.valueOf(tblMostrarCasa.getValueAt(fila, 4)));
            int anios=Integer.parseInt(String.valueOf(tblMostrarCasa.getValueAt(fila, 5)));
            int cantPisos=Integer.parseInt(String.valueOf(tblMostrarCasa.getValueAt(fila, 6)));

            if(habitacion < 1 || habitacion > 6){
                JOptionPane.showMessageDialog(this, "La cantidad de habitaciones debe estar entre 1 y 6");
                return;
            }

            if (cantPisos < 1 || cantPisos > 3) {
                JOptionPane.showMessageDialog(this, "La cantidad de pisos debe estar entre 1 y 3");
                return;
            }

            Casa ca=new Casa(id_vivienda, mt2, comuna, habitacion, valorRenta, anios, cantPisos);
            CasaDAO caDAO=new CasaDAO();
            caDAO.modificarCasa(ca);
            JOptionPane.showMessageDialog(this, "Registro modificado");
        }
    }//GEN-LAST:event_btnModificarCActionPerformed

    private void btnVolverCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverCActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverCActionPerformed

    public void limpiarTabla()
    {
        DefaultTableModel dtm=(DefaultTableModel)tblMostrarCasa.getModel();
        for (int i = tblMostrarCasa.getRowCount()-1; i >=0; i--) {
            dtm.removeRow(dtm.getRowCount()-1);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCasa;
    private javax.swing.JButton btnCant2Pisos;
    private javax.swing.JButton btnEliminarC;
    private javax.swing.JButton btnModificarC;
    private javax.swing.JButton btnPromedioRentaC;
    private javax.swing.JButton btnVolverC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblMostrarCasa;
    private javax.swing.JTextField txtIDCasa;
    // End of variables declaration//GEN-END:variables
}
