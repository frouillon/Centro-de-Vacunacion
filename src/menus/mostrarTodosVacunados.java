package menus;

import clases.PacienteVacunado;
import clases.Vacuna;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class mostrarTodosVacunados extends javax.swing.JFrame {

    /**
     * Creates new form mostrarTodasVacunas
     */
    public mostrarTodosVacunados() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtTodosVacunados = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarVacunados = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblCantidadVacunas = new javax.swing.JLabel();
        btnMostrarVacunas1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mostrando todas las vacunas");

        txtTodosVacunados.setEditable(false);
        txtTodosVacunados.setColumns(20);
        txtTodosVacunados.setRows(5);
        jScrollPane1.setViewportView(txtTodosVacunados);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Todos los pacientes vacunados");

        btnMostrarVacunados.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnMostrarVacunados.setText("Mostrar todos los pacientes vacunados");
        btnMostrarVacunados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVacunadosActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad de vacunas:");

        lblCantidadVacunas.setText("\"\"");

        btnMostrarVacunas1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnMostrarVacunas1.setText("Volver");
        btnMostrarVacunas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVacunas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnMostrarVacunas1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCantidadVacunas))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnMostrarVacunados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarVacunados)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCantidadVacunas))
                .addGap(18, 18, 18)
                .addComponent(btnMostrarVacunas1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarVacunadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVacunadosActionPerformed
        // TODO add your handling code here:
        File archivo=new File("archivo\\archivoPaciente.txt");
        ArrayList lista=new ArrayList<>();
        txtTodosVacunados.setText(null);
        int cantidadVacunados = 0;
        try {
            Scanner scanner=new Scanner(archivo);
            while(scanner.hasNextLine()){
                String linea=scanner.nextLine();
                Scanner delimitar=new Scanner(linea);
                delimitar.useDelimiter("\\s*/");
                PacienteVacunado vacunado=new PacienteVacunado();
                vacunado.setNombre(delimitar.next());
                vacunado.setApellido(delimitar.next());
                vacunado.setTelefono(delimitar.next());
                vacunado.setTipoDoc(delimitar.next());
                vacunado.setCodDoc(delimitar.next());
                vacunado.setKitVacunaSuministrada(delimitar.next());
                vacunado.setLoteVacunaSuministrada(delimitar.next());
                vacunado.setMarcaVacunaSuministrada(delimitar.next());
                vacunado.setEfectoAdversoLoteVacunaSuministrada(delimitar.next());
                lista.add(vacunado);
                cantidadVacunados++;
            }
            scanner.close();
            String texto="";
            PacienteVacunado muestrarVacunado=new PacienteVacunado();
            Vacuna vacu=new Vacuna();
            for(Object obj:lista){
                muestrarVacunado=(PacienteVacunado)obj;
                texto=texto+"Nombre: "+muestrarVacunado.getNombre()+"\n"+"Apellido: "+muestrarVacunado.getApellido()+
                        "\n"+"Telefono: "+muestrarVacunado.getTelefono()+"\n"+"Tipo de documento: "+muestrarVacunado.getTipoDoc()+
                        "\n"+"Codigo del documento: "+muestrarVacunado.getCodDoc()+"\n"+"Domicillio: "+muestrarVacunado.getDomicilio()+
                        "\n"+"Fue vacunado por la vacuna: "+"\n"+"Kit: "+muestrarVacunado.getKitVacunaSuministrada()+
                        "\n"+"Lote: "+muestrarVacunado.getLoteVacunaSuministrada()+
                        "\n"+"Marca: "+muestrarVacunado.getMarcaVacunaSuministrada()+
                        "\n"+"Efecto adverso: "+muestrarVacunado.getEfectoAdversoVacunaSuministrada()+
                        "\n"+"--------------------------------------------------"+"\n";
            }
            txtTodosVacunados.setText(texto);
            lblCantidadVacunas.setText(""+cantidadVacunados);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido leer el archivo");
        }
    }//GEN-LAST:event_btnMostrarVacunadosActionPerformed

    private void btnMostrarVacunas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVacunas1ActionPerformed
        // TODO add your handling code here:
        menuPacientesVacunados menPacVac=new menuPacientesVacunados();
        menPacVac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarVacunas1ActionPerformed

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
            java.util.logging.Logger.getLogger(mostrarTodosVacunados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mostrarTodosVacunados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mostrarTodosVacunados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mostrarTodosVacunados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mostrarTodosVacunados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarVacunados;
    private javax.swing.JButton btnMostrarVacunas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidadVacunas;
    private javax.swing.JTextArea txtTodosVacunados;
    // End of variables declaration//GEN-END:variables
}
