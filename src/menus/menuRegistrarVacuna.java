package menus;

import clases.Vacuna;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class menuRegistrarVacuna extends javax.swing.JFrame {

    /**
     * Creates new form menuRegistrarVacuna
     */
    public menuRegistrarVacuna() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtKit = new javax.swing.JTextField();
        txtLote = new javax.swing.JTextField();
        cboMarca = new javax.swing.JComboBox<>();
        cboEfectoAdverso = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrando vacuna");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Regsitrando vacuna, porfavor rellene los espacios");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Kit:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Lote:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Marca:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Efecto adverso:");

        btnSalir.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnSalir.setText("Volver");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtKit.setText("<Digeite el kit de la vacuna>");
        txtKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKitActionPerformed(evt);
            }
        });

        txtLote.setText("<Digeite el lote de la vacuna>");
        txtLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoteActionPerformed(evt);
            }
        });

        cboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione una opcion>", "Pfizer", "Moderna", "Sinopharm", "AztraZeneca" }));
        cboMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMarcaActionPerformed(evt);
            }
        });

        cboEfectoAdverso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione una opcion>", "si", "no" }));
        cboEfectoAdverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEfectoAdversoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(138, 138, 138)
                        .addComponent(txtKit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(127, 127, 127)
                        .addComponent(txtLote))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(113, 113, 113)
                        .addComponent(cboMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(49, 49, 49)
                        .addComponent(cboEfectoAdverso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboEfectoAdverso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnSalir))
                        .addGap(30, 30, 30))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        menuVacuna menVac = new menuVacuna();
        menVac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        Vacuna vacuna = new Vacuna();
        vacuna.setKit(txtKit.getText());
        vacuna.setLote(txtLote.getText());
        vacuna.setMarca((String) cboMarca.getSelectedItem());
        vacuna.setEfectoAdverso((String) cboEfectoAdverso.getSelectedItem());
        File archivo = new File("archivo\\archivoVacuna.txt");
        if (!archivo.exists()) {
            try {
                PrintWriter salida = new PrintWriter(archivo);
                salida.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace(System.out);
            }
        }
        try {
            if (archivo.exists()) {
                FileReader lectura = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(lectura);
                int registrado = 0;
                String linea;
                if ("<Digeite el kit de la vacuna>".equals(vacuna.kit)) {
                    JOptionPane.showMessageDialog(null, "Alguno de los espacion no ha sido llenado, profavor llenelos todos ");
                    registrado++;
                }
                if (registrado == 0) {
                    while ((linea = lector.readLine()) != null) {
                        String conteo[] = linea.split("/");
                        Vacuna lectorVacuna = new Vacuna(conteo[0], conteo[1], conteo[2], conteo[3]);
                        if (vacuna.kit == null ? lectorVacuna.kit == null : vacuna.kit.equals(lectorVacuna.kit)) {
                            registrado++;
                            JOptionPane.showMessageDialog(null, "Esta vacuna ya ha sido registrada");
                        }

                        if (registrado == 0) {
                            if ("<Digeite el lote de la vacuna>".equals(vacuna.lote)) {
                                JOptionPane.showMessageDialog(null, "Alguno de los espacion no ha sido llenado, profavor llenelos todos ");
                                registrado++;
                            }
                        }
                        if (registrado == 0) {
                            if (vacuna.marca == null ? lectorVacuna.marca == null : vacuna.marca.equals("<Seleccione una opcion>")) {
                                JOptionPane.showMessageDialog(null, "Alguno de los espacion no ha sido llenado, profavor llenelos todos ");
                                registrado++;
                            }
                        }
                        if (registrado == 0) {
                            if (vacuna.efectoAdverso == null ? lectorVacuna.efectoAdverso == null : vacuna.marca.equals("<Seleccione una opcion>")) {
                                JOptionPane.showMessageDialog(null, "Alguno de los espacion no ha sido llenado, profavor llenelos todos ");
                                registrado++;
                            }
                        }
                    }
                }
                if (registrado == 0) {
                    try {
                        FileWriter escritor;
                        BufferedWriter escriba;
                        if (archivo.exists()) {
                            escritor = new FileWriter(archivo, true);
                            escriba = new BufferedWriter(escritor);
                            escriba.write("\n");
                            escriba.write(vacuna.kit + "/" + vacuna.lote + "/" + vacuna.marca + "/" + vacuna.efectoAdverso);
                            escriba.close();
                            escritor.close();
                        }
                        JOptionPane.showMessageDialog(null, "La vacuna se ha registrado correctamente");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "No se ha podido regisrar correctamente");
                    }
                }
            }
    }//GEN-LAST:event_btnRegistrarActionPerformed
    catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado al archivo");
        }
    }
    private void txtKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKitActionPerformed

    private void cboMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMarcaActionPerformed

    private void cboEfectoAdversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEfectoAdversoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEfectoAdversoActionPerformed

    private void txtLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoteActionPerformed

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
            java.util.logging.Logger.getLogger(menuRegistrarVacuna.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuRegistrarVacuna.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuRegistrarVacuna.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuRegistrarVacuna.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuRegistrarVacuna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboEfectoAdverso;
    private javax.swing.JComboBox<String> cboMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtKit;
    private javax.swing.JTextField txtLote;
    // End of variables declaration//GEN-END:variables
}
