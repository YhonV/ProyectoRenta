package vista;

import controlador.CasaDAO;
import controlador.DeptoDAO;
import javax.swing.JOptionPane;
import modelo.Casa;
import modelo.Departamento;

public class PrincipalScreen extends javax.swing.JFrame {

    public PrincipalScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuIngresarCasa = new javax.swing.JMenuItem();
        mnuEliminarCasa = new javax.swing.JMenuItem();
        mnuContribucion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuIngresarDepartamento = new javax.swing.JMenuItem();
        mnuEliminarDepto = new javax.swing.JMenuItem();
        mnuComisión = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuInfoCasas = new javax.swing.JMenuItem();
        mnuInfoDepto = new javax.swing.JMenuItem();
        mnuGarantía = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/city.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 406));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favicon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 6, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel4.setText("Arriende su propiedad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 170, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel5.setText("con nosostros");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 130, 30));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Casas");

        mnuIngresarCasa.setBackground(new java.awt.Color(255, 255, 255));
        mnuIngresarCasa.setText("Ingresar");
        mnuIngresarCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIngresarCasaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuIngresarCasa);

        mnuEliminarCasa.setBackground(new java.awt.Color(255, 255, 255));
        mnuEliminarCasa.setText("Eliminar");
        mnuEliminarCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEliminarCasaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuEliminarCasa);

        mnuContribucion.setBackground(new java.awt.Color(255, 255, 255));
        mnuContribucion.setText("Contribución");
        mnuContribucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuContribucionActionPerformed(evt);
            }
        });
        jMenu1.add(mnuContribucion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Departamento");

        mnuIngresarDepartamento.setText("Ingresar");
        mnuIngresarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIngresarDepartamentoActionPerformed(evt);
            }
        });
        jMenu2.add(mnuIngresarDepartamento);

        mnuEliminarDepto.setText("Eliminar");
        mnuEliminarDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEliminarDeptoActionPerformed(evt);
            }
        });
        jMenu2.add(mnuEliminarDepto);

        mnuComisión.setText("Comisión");
        mnuComisión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuComisiónActionPerformed(evt);
            }
        });
        jMenu2.add(mnuComisión);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Mostrar");

        mnuInfoCasas.setText("Información casas");
        mnuInfoCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInfoCasasActionPerformed(evt);
            }
        });
        jMenu3.add(mnuInfoCasas);

        mnuInfoDepto.setText("Información departamento");
        mnuInfoDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInfoDeptoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuInfoDepto);

        mnuGarantía.setText("Garantía");
        mnuGarantía.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGarantíaActionPerformed(evt);
            }
        });
        jMenu3.add(mnuGarantía);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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

    private void mnuIngresarCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIngresarCasaActionPerformed
        IngresarCasa ingC =new IngresarCasa();
        ingC.setVisible(true);
        ingC.setTitle("Ingresar Casa");
        ingC.setLocationRelativeTo(null);
        ingC.setResizable(false);
        ingC.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_mnuIngresarCasaActionPerformed

    private void mnuIngresarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIngresarDepartamentoActionPerformed
        IngresarDepto ingD = new IngresarDepto();
        ingD.setVisible(true);
        ingD.setTitle("Ingresar Departamento");
        ingD.setLocationRelativeTo(null);
        ingD.setResizable(false);
        ingD.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_mnuIngresarDepartamentoActionPerformed

    private void mnuEliminarCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEliminarCasaActionPerformed
        String id_vivienda = JOptionPane.showInputDialog("Ingrese el ID de la casa a eliminar");
        if (id_vivienda != null) {
            CasaDAO caDAO = new CasaDAO();
            if (caDAO.eliminarCasa(id_vivienda)) {
                JOptionPane.showMessageDialog(this, "Casa Eliminada");
            } else {
                JOptionPane.showMessageDialog(this, "Vivienda No existe");
            }
        }
    }//GEN-LAST:event_mnuEliminarCasaActionPerformed

    private void mnuContribucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuContribucionActionPerformed
        String id_vivienda= null;
        id_vivienda= JOptionPane.showInputDialog("Ingrese ID de Casa: ");
        
        CasaDAO caDAO = new CasaDAO();
        Casa ca = caDAO.buscarCasa(id_vivienda);
        
        if(id_vivienda != null){
            if(ca != null){
                JOptionPane.showMessageDialog(this, "Valor de la contribución anual: $"+ca.contribucion());
            }
        if(ca == null){
            JOptionPane.showMessageDialog(this, "Casa no existe");
            }
        }
    }//GEN-LAST:event_mnuContribucionActionPerformed

    private void mnuEliminarDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEliminarDeptoActionPerformed
        String id_vivienda = JOptionPane.showInputDialog("Ingrese el ID del departamento a eliminar");
        if (id_vivienda != null){
            DeptoDAO deDAO=new DeptoDAO();
            if(deDAO.eliminarDepto(id_vivienda)){
                JOptionPane.showMessageDialog(this, "Departamento Eliminado");
            } else {
                JOptionPane.showMessageDialog(this, "Vivienda No existe");
            }
        }
    }//GEN-LAST:event_mnuEliminarDeptoActionPerformed

    private void mnuComisiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuComisiónActionPerformed
        String id_vivienda= null;
        id_vivienda= JOptionPane.showInputDialog("Ingrese ID de Departamento: ");
        
        DeptoDAO deDAO = new DeptoDAO();
        Departamento dep = deDAO.buscarDepto(id_vivienda);
        
        if(id_vivienda != null){
            if(dep != null){
                JOptionPane.showMessageDialog(this, "Valor de la comisión para la empresa: $"+dep.comision());
            }
        if(dep == null){
            JOptionPane.showMessageDialog(this, "Departamento no existe");
            }
        }
    }//GEN-LAST:event_mnuComisiónActionPerformed

    private void mnuInfoCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInfoCasasActionPerformed
        MostrarCasa mosCasa =new MostrarCasa();
        mosCasa.setVisible(true);
        mosCasa.setTitle("Información Casas");
        mosCasa.setLocationRelativeTo(null);
        mosCasa.setResizable(false);
        mosCasa.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_mnuInfoCasasActionPerformed

    private void mnuInfoDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInfoDeptoActionPerformed
        MostrarDepto mosDepto =new MostrarDepto();
        mosDepto.setVisible(true);
        mosDepto.setTitle("Información Departamentos"); 
        mosDepto.setLocationRelativeTo(null);
        mosDepto.setResizable(false);
        mosDepto.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_mnuInfoDeptoActionPerformed

    private void mnuGarantíaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGarantíaActionPerformed
        String id_vivienda= null;
        id_vivienda= JOptionPane.showInputDialog("Ingrese ID de vivienda: ");
        
        DeptoDAO deDAO = new DeptoDAO();
        Departamento dep = deDAO.buscarDepto(id_vivienda);

        CasaDAO caDAO = new CasaDAO();
        Casa ca = caDAO.buscarCasa(id_vivienda);
        if(id_vivienda!=null){
            if (dep != null) {
                    JOptionPane.showMessageDialog(this, "Valor Garantía a pagar por el departamento: $" + dep.garantia());
            } 
            if(ca != null){
                JOptionPane.showMessageDialog(this, "Valor Garantía a pagar por la casa: $" + ca.garantia());
            }
            if(dep==null && ca==null){
                JOptionPane.showMessageDialog(this, "Vivienda no existe");
            }
        }
    }//GEN-LAST:event_mnuGarantíaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnuComisión;
    private javax.swing.JMenuItem mnuContribucion;
    private javax.swing.JMenuItem mnuEliminarCasa;
    private javax.swing.JMenuItem mnuEliminarDepto;
    private javax.swing.JMenuItem mnuGarantía;
    private javax.swing.JMenuItem mnuInfoCasas;
    private javax.swing.JMenuItem mnuInfoDepto;
    private javax.swing.JMenuItem mnuIngresarCasa;
    private javax.swing.JMenuItem mnuIngresarDepartamento;
    // End of variables declaration//GEN-END:variables
}
