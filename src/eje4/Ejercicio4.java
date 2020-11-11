package eje4;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import librerias.ArchivoText;
import modelos.Doctore;


public class Ejercicio4 extends javax.swing.JFrame {

    String[] cabecera = {"ID","FECHA","NOMBRE","SEXO","TIPO"};
    String[][] body={};
    DefaultTableModel dtmC = new DefaultTableModel(body,cabecera);
    DefaultTableModel dtmI = new DefaultTableModel(body,cabecera);
    DefaultTableModel dtmL = new DefaultTableModel(body,cabecera);
    List<DefaultTableModel> dtmS = new ArrayList<>();
    String url = "src/data/datos.csv";
    
    
    public Ejercicio4() {
        initComponents();
        this.setTitle("Ejercicio 4");
        this.setLayout(null);
        setLocationRelativeTo(null);
        this.setResizable(false);
        dtmS.add(dtmI);
        dtmS.add(dtmC);
        dtmS.add(dtmL);
        tblInduccion.setModel(dtmS.get(0));
        tblCesaria.setModel(dtmS.get(1));
        tblLegrado.setModel(dtmS.get(2));
    }

    public void limpiar(DefaultTableModel dtm){
        for(int j=dtm.getRowCount()-1;j>=0;j--){
            dtm.removeRow(j);
        }   
    }
    public void llenar(){
        ArchivoText at = new ArchivoText();
        List<Doctore> doctores_al = at.leer(url);
        int[] contS = {0,0,0};
        
        for(Doctore d : doctores_al){
            int tabla=2;
            if(d.getTipo().equals("CESAREA")) tabla=0; 
            else if(d.getTipo().equals("INDUCCION")) tabla=1;
            
            dtmS.get(tabla).addRow(cabecera);
            dtmS.get(tabla).setValueAt(d.getId(), contS[tabla], 0);
            dtmS.get(tabla).setValueAt(d.getFecha(), contS[tabla], 1);
            dtmS.get(tabla).setValueAt(d.getNombre(), contS[tabla], 2);
            dtmS.get(tabla).setValueAt(d.getSexo(), contS[tabla], 3);
            dtmS.get(tabla).setValueAt(d.getTipo(), contS[tabla], 4);
            contS[tabla]++;
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        lblInduccion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInduccion = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCesaria = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLegrado = new javax.swing.JTable();
        lblCesaria = new javax.swing.JLabel();
        lblLegrado = new javax.swing.JLabel();
        cmdMostrar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblInduccion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblInduccion.setText("INDUCCIÓN");

        tblInduccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblInduccion);

        tblCesaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblCesaria);

        tblLegrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblLegrado);

        lblCesaria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCesaria.setText("CESARIAS");

        lblLegrado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLegrado.setText("LEGRADO");

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });

        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblInduccion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblCesaria))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(lblLegrado)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(cmdMostrar)
                .addGap(57, 57, 57)
                .addComponent(cmdSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblInduccion)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(lblCesaria)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblLegrado)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdMostrar)
                    .addComponent(cmdSalir))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {
        for(DefaultTableModel d : dtmS)limpiar(d);
        llenar();
    }
    
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
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblCesaria;
    private javax.swing.JLabel lblInduccion;
    private javax.swing.JLabel lblLegrado;
    private javax.swing.JTable tblCesaria;
    private javax.swing.JTable tblInduccion;
    private javax.swing.JTable tblLegrado;
    // End of variables declaration//GEN-END:variables
}
