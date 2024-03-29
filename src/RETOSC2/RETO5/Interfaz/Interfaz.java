package RETOSC2.RETO5.Interfaz;

import RETOSC2.RETO5.ConexionSQL.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;

public class Interfaz extends javax.swing.JFrame {
    
    Connection con = ConexionSQL.conexion();
    
    public Interfaz() {
        initComponents();      
        this.setLocationRelativeTo(null);
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        registrar_btn = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        actualizar_btn = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cliente_tbl = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Nacionalidad");

        jLabel4.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Correo");

        txtNombre.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N

        txtNacionalidad.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N

        registrar_btn.setBackground(new java.awt.Color(0, 204, 0));
        registrar_btn.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        registrar_btn.setForeground(new java.awt.Color(0, 0, 0));
        registrar_btn.setText("Registrar");
        registrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_btnActionPerformed(evt);
            }
        });

        eliminar_btn.setBackground(new java.awt.Color(204, 0, 0));
        eliminar_btn.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        eliminar_btn.setForeground(new java.awt.Color(0, 0, 0));
        eliminar_btn.setText("Eliminar");
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });

        actualizar_btn.setBackground(new java.awt.Color(255, 204, 0));
        actualizar_btn.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        actualizar_btn.setForeground(new java.awt.Color(0, 0, 0));
        actualizar_btn.setText("Actualizar");
        actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_btnActionPerformed(evt);
            }
        });

        txtCorreo.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(registrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(actualizar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(eliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(eliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cliente_tbl.setBackground(new java.awt.Color(255, 255, 255));
        cliente_tbl.setForeground(new java.awt.Color(0, 0, 0));
        cliente_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        cliente_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cliente_tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cliente_tbl);

        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Open Sans Semibold", 0, 25)); // NOI18N
        jLabel6.setText("Clientes CRUD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_btnActionPerformed
        insertarDatos();
        mostrarDatos();
        limpiarCampos();
    }//GEN-LAST:event_registrar_btnActionPerformed

    private void actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_btnActionPerformed
        actualizarDatos();
        mostrarDatos();
        limpiarCampos();
    }//GEN-LAST:event_actualizar_btnActionPerformed

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        eliminarDatos();
        mostrarDatos();
    }//GEN-LAST:event_eliminar_btnActionPerformed

    private void cliente_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliente_tblMouseClicked
        int fila = cliente_tbl.rowAtPoint(evt.getPoint());
        
        txtNombre.setText(cliente_tbl.getValueAt(fila, 1).toString());
        txtApellido.setText(cliente_tbl.getValueAt(fila, 2).toString());
        txtNacionalidad.setText(cliente_tbl.getValueAt(fila, 3).toString());
        txtCorreo.setText(cliente_tbl.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_cliente_tblMouseClicked

    public void mostrarDatos() {
        String[] titulos = {"ID", "Nombre", "Apellido", "Nacionalidad", "Correo"};
        String[] registros = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM reto5.cliente";
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            while(rs.next()) {
                registros[0] = rs.getString("cli_id");
                registros[1] = rs.getString("cli_nombre");
                registros[2] = rs.getString("cli_apellido");
                registros[3] = rs.getString("cli_nacionalidad");
                registros[4] = rs.getString("cli_Correo");
                
                modelo.addRow(registros);
            }
            cliente_tbl.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }
    
    public void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtNacionalidad.setText("");
        txtCorreo.setText("");
    }
    
    public void insertarDatos() {
        try {
            String SQL = "INSERT INTO cliente(cli_nombre, cli_apellido, cli_nacionalidad, cli_correo) VALUES(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(SQL);
            
            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtApellido.getText());
            pst.setString(3, txtNacionalidad.getText());
            pst.setString(4, txtCorreo.getText());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Cliente Registrado Correctamente");               
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }
    
    public void actualizarDatos() {
        try {
            String SQL = "UPDATE cliente SET cli_nombre = ?, cli_apellido = ?, cli_nacionalidad = ?, cli_correo = ? WHERE cli_id = ?";
            int fila = cliente_tbl.getSelectedRow();
        
            String datoSelecionado = (String)cliente_tbl.getValueAt(fila, 0);
            
            PreparedStatement pst = con.prepareStatement(SQL);
            
            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtApellido.getText());
            pst.setString(3, txtNacionalidad.getText());
            pst.setString(4, txtCorreo.getText());
            
            pst.setString(5, datoSelecionado);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Registro Editado Correctamente");             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }
    
    public void eliminarDatos() {
        int fila = cliente_tbl.getSelectedRow();
        
        try {
            String SQL = "DELETE FROM cliente WHERE cli_id = "+cliente_tbl.getValueAt(fila, 0);          
            Statement st = con.createStatement();       
            int n = st.executeUpdate(SQL);           
            if(n >= 0) {
                JOptionPane.showMessageDialog(null,"Registro Eliminado Correctamente"); 
            }        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_btn;
    public javax.swing.JTable cliente_tbl;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registrar_btn;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtNacionalidad;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
