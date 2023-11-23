package vista;

import controlador.DeptoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Departamento;

public class MostrarDepto extends javax.swing.JFrame {

    public MostrarDepto() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtIDCasa = new javax.swing.JTextField();
        btnBuscarDepto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrarDepto = new javax.swing.JTable();
        btnEliminarC = new javax.swing.JButton();
        btnModificarC = new javax.swing.JButton();
        btnVolverC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPromedioRentaD1 = new javax.swing.JButton();
        btnPromedioGastoComunD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("ID Departamento:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 120, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 110, 10));

        txtIDCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDCasaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 129, -1));

        btnBuscarDepto.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnBuscarDepto.setText("Buscar");
        btnBuscarDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDeptoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarDepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        tblMostrarDepto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Depto", "Mt2", "Comuna", "Habitaciones", "Valor renta", "Gasto común", "Terraza"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMostrarDepto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 510, 240));

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

        btnPromedioRentaD1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnPromedioRentaD1.setForeground(new java.awt.Color(0, 102, 204));
        btnPromedioRentaD1.setText(" Promedio Valor Renta");
        btnPromedioRentaD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioRentaD1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPromedioRentaD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 190, -1));

        btnPromedioGastoComunD.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnPromedioGastoComunD.setForeground(new java.awt.Color(0, 102, 204));
        btnPromedioGastoComunD.setText("Promedio Gasto Común");
        btnPromedioGastoComunD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioGastoComunDActionPerformed(evt);
            }
        });
        jPanel1.add(btnPromedioGastoComunD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

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

    private void btnBuscarDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDeptoActionPerformed
        DeptoDAO deDAO = new DeptoDAO();
        ArrayList<Departamento>deptos=deDAO.obtenerTodoDepto();
        DefaultTableModel dtm=(DefaultTableModel)tblMostrarDepto.getModel();
        limpiarTabla();
        if(deptos.size()==0)
            JOptionPane.showMessageDialog(this, "No hay departamentos ingresados");
        else{
            Departamento dep=deDAO.buscarDepto(txtIDCasa.getText());
            
            if(dep == null){
                String [][] datos = new String [deptos.size()][7];
                for (int i = 0; i < deptos.size(); i++) {
                    datos[i][0]=deptos.get(i).getId_vivienda();
                    datos[i][1]=String.valueOf(deptos.get(i).getMetros_cuadrados());
                    datos[i][2]=deptos.get(i).getComuna();
                    datos[i][3]=String.valueOf(deptos.get(i).getHabitaciones());
                    datos[i][4]=String.valueOf(deptos.get(i).getValor_renta());
                    datos[i][5]=String.valueOf(deptos.get(i).getGasto_comun());
                    datos[i][6]=deptos.get(i).getTerraza();
                    dtm.addRow(datos[i]);
                }
                tblMostrarDepto.setModel(dtm);
            }
            else{
                String [] datos = new String [7];
                datos[0]=dep.getId_vivienda();
                datos[1]=String.valueOf(dep.getMetros_cuadrados());
                datos[2]=dep.getComuna();
                datos[3]=String.valueOf(dep.getHabitaciones());
                datos[4]=String.valueOf(dep.getValor_renta());
                datos[5]=String.valueOf(dep.getGasto_comun());
                datos[6]=dep.getTerraza();
                dtm.addRow(datos);
                tblMostrarDepto.setModel(dtm);
            }
        }
    }//GEN-LAST:event_btnBuscarDeptoActionPerformed

    private void btnEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)tblMostrarDepto.getModel();
       int fila=tblMostrarDepto.getSelectedRow();
       if(fila==-1)
           JOptionPane.showMessageDialog(this, "Debe seleccionar el registro a eliminar");
       else{
           String id_vivienda=String.valueOf(tblMostrarDepto.getValueAt(fila, 0));
           DeptoDAO deDAO=new DeptoDAO();
           deDAO.eliminarDepto(id_vivienda);
           JOptionPane.showMessageDialog(this, "Departamento eliminado");
           dtm.removeRow(fila);
       }
    }//GEN-LAST:event_btnEliminarCActionPerformed

    private void btnModificarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)tblMostrarDepto.getModel();
       int fila=tblMostrarDepto.getSelectedRow();
       if(fila==-1)
           JOptionPane.showMessageDialog(this, "Debe seleccionar el registro a modificar");
       else{
           String id_vivienda=String.valueOf(tblMostrarDepto.getValueAt(fila, 0));
           double mt2=Double.parseDouble(String.valueOf(tblMostrarDepto.getValueAt(fila, 1)));
           String comuna=String.valueOf(tblMostrarDepto.getValueAt(fila, 2));
           int habitacion=Integer.parseInt(String.valueOf(tblMostrarDepto.getValueAt(fila, 3)));
           int valorRenta=Integer.parseInt(String.valueOf(tblMostrarDepto.getValueAt(fila, 4)));
           int gasto_comun=Integer.parseInt(String.valueOf(tblMostrarDepto.getValueAt(fila, 5)));
           String terraza=String.valueOf(tblMostrarDepto.getValueAt(fila, 6));
           Departamento dep=new Departamento(id_vivienda, mt2, comuna, habitacion, valorRenta, gasto_comun, terraza);
           
           if(habitacion < 1 || habitacion > 4){
               JOptionPane.showMessageDialog(this, "La cantidad de habitaciones debe estar entre 1 y 4");
               return;
           }
           
           if(!terraza.equalsIgnoreCase("Si") && !terraza.equalsIgnoreCase("No") ){
               JOptionPane.showMessageDialog(this, "Solo puede ingresar Sí o No en el campo Terraza");
               return;
           }
           
           DeptoDAO deDAO=new DeptoDAO();
           deDAO.modificarDepto(dep);
           JOptionPane.showMessageDialog(this, "Registro modificado");
       }
    }//GEN-LAST:event_btnModificarCActionPerformed

    private void btnVolverCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverCActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverCActionPerformed

    private void btnPromedioRentaD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioRentaD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPromedioRentaD1ActionPerformed

    private void btnPromedioGastoComunDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioGastoComunDActionPerformed
        DeptoDAO deDAO = new DeptoDAO();
        int promedioGC = deDAO.avgGastoComun();
        JOptionPane.showMessageDialog(this, "El promedio de Gasto Común de los departamentos es: $"+promedioGC);
    }//GEN-LAST:event_btnPromedioGastoComunDActionPerformed

    
    public void limpiarTabla()
    {
        DefaultTableModel dtm=(DefaultTableModel)tblMostrarDepto.getModel();
        for (int i = tblMostrarDepto.getRowCount()-1; i >=0; i--) {
            dtm.removeRow(dtm.getRowCount()-1);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarDepto;
    private javax.swing.JButton btnEliminarC;
    private javax.swing.JButton btnModificarC;
    private javax.swing.JButton btnPromedioGastoComunD;
    private javax.swing.JButton btnPromedioRentaD1;
    private javax.swing.JButton btnVolverC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblMostrarDepto;
    private javax.swing.JTextField txtIDCasa;
    // End of variables declaration//GEN-END:variables
}
