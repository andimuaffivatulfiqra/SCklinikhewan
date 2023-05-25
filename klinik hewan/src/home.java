
import connect.konek;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;






public class home extends javax.swing.JFrame {

  private DefaultTableModel model;
public void kosong(){
    DefaultTableModel model= (DefaultTableModel) tabel1.getModel();
    
    while (model.getRowCount()>0){
        model.removeRow(0);
    }
}

public void tampiltabel(){
    DefaultTableModel model = new DefaultTableModel();
    
    model.addColumn("namapemilikhewan");
    model.addColumn("nohp");
    model.addColumn("namahewan");
    model.addColumn("jenishewan");
    model.addColumn("hasildiagnosa");
    model.addColumn("resepobat");
    
    try {
        String sql = "select * from data";
        Connection conn = konek.koneksi();
        Statement stm = conn.createStatement();
        ResultSet res = stm.executeQuery(sql);
        
        while(res.next()){
            model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            
            tabel1.setModel(model);
        }
    } catch (Exception e) {
        System.out.println("ERROR");
    }
    
}



public void clear(){
    namapemilikhewan.setText("");
      nohp.setText("");
       namahewan.setText("");
        hasildiagnosa.setText("");
         resepobat.setText("");
}


public void tampildata(){

    try {
        Connection conn = konek.koneksi();
         String sql = "SELECT * FROM data";
          PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs = pst.executeQuery(sql);
        while(rs.next()){
            model.addColumn(new Object[]{
                rs.getString(1),
                 rs.getString(2),
                  rs.getString(3),
                   rs.getString(4),
                    rs.getString(5),
                     rs.getString(6)});
        }
            
            tabel1.setModel(model);
        
        
        
    } catch (Exception e) {
    }
}

public void loadData(){
    DefaultTableModel model = (DefaultTableModel) tabel1.getModel();
    model.addRow(new Object[]{
        namapemilikhewan.getText(),
        nohp.getText(),
        namahewan.getText(),
        jenishewan.getSelectedItem(),
        hasildiagnosa.getText(),
        resepobat.getText(),
        
    });
    }
    public home() {
        initComponents();
        tampiltabel();
        tampildata();
            DefaultTableModel model = new DefaultTableModel();
        model.addColumn("PEMILIK HEWAN");
         model.addColumn("No. HP");
          model.addColumn("NAMA HEWAN");
           model.addColumn("JENIS HEWAN");
            model.addColumn("HASIL DIAGNOSIS");
             model.addColumn("RESEP OBAT");
    }
    
    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namapemilikhewan = new javax.swing.JTextField();
        nohp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        namahewan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hasildiagnosa = new javax.swing.JTextField();
        resepobat = new javax.swing.JTextField();
        jenishewan = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel1 = new javax.swing.JTable();
        cari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        HAPUS = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        SIMPAN = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INPUT DATA KLINIK HEWAN\n");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("NAMA PEMILIK HEWAN");

        namapemilikhewan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namapemilikhewanActionPerformed(evt);
            }
        });

        nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nohpActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("No. HP");

        namahewan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namahewanActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("NAMA HEWAN");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("JENIS HEWAN");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("HASIL DIAGNOSIS");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("RESEP OBAT");

        hasildiagnosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasildiagnosaActionPerformed(evt);
            }
        });

        resepobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resepobatActionPerformed(evt);
            }
        });

        jenishewan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KUCING", "ANJING", " " }));
        jenishewan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenishewanActionPerformed(evt);
            }
        });

        tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PEMILIK HEWAN", "NO. HP", "NAMA HEWAN", "JENIS HEWAN", "HASIL DIAGNOSIS", "RESEP OBAT"
            }
        ));
        jScrollPane2.setViewportView(tabel1);

        btncari.setText("CARI");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        HAPUS.setText("HAPUS");
        HAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HAPUSActionPerformed(evt);
            }
        });

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        SIMPAN.setText("SIMPAN");
        SIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIMPANActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btncari)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SIMPAN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edit)
                                .addGap(192, 192, 192)
                                .addComponent(HAPUS)))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nohp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namapemilikhewan, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namahewan, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jenishewan, 0, 280, Short.MAX_VALUE)
                                    .addComponent(hasildiagnosa)
                                    .addComponent(resepobat))))
                        .addContainerGap(183, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namapemilikhewan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namahewan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jenishewan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hasildiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(resepobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HAPUS)
                    .addComponent(edit)
                    .addComponent(SIMPAN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncari))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namapemilikhewanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namapemilikhewanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namapemilikhewanActionPerformed

    private void nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nohpActionPerformed

    private void namahewanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namahewanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namahewanActionPerformed

    private void hasildiagnosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasildiagnosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasildiagnosaActionPerformed

    private void resepobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resepobatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resepobatActionPerformed

    private void SIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIMPANActionPerformed
        try {
            Connection conn = konek.koneksi();
            int baris = tabel1.getRowCount();
            String sql = "INSERT INTO data VALUES ('"
                    + namapemilikhewan.getText()+"','"
                    + nohp.getText()+"','"
                    + namahewan.getText()+"','"
                    + jenishewan.getSelectedItem()+"','"
                    + hasildiagnosa.getText()+"','"
                    + resepobat.getText()+"')";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            pst.close();
            JOptionPane.showMessageDialog(null, "berhasil disimpan");
            loadData();
            clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal disimpan");
        }
    }//GEN-LAST:event_SIMPANActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        try {
    Connection conn = konek.koneksi();
    String sql = "Select * from data where namahewan='"+cari.getText()+"' or nohp='"+cari.getText()+"'";
    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
    ResultSet rs = pst.executeQuery(sql);
    if (rs.next()){
        namapemilikhewan.setText(rs.getString(1));
        nohp.setText(rs.getString(2));
        namahewan.setText(rs.getString(3));
        jenishewan.setSelectedItem(rs.getString(4));
        hasildiagnosa.setText(rs.getString(5));
        resepobat.setText(rs.getString(6));
        JOptionPane.showMessageDialog(null,"Data tbdata : "
        + cari.getText() + " ditemukan, Apakah Anda Ingin Mengedit atau Menghapus?");
    }
} catch (Exception e){
            System.out.println("Data tidak ditemukan");
}
cari.requestFocus();
    }//GEN-LAST:event_btncariActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        try{
            Connection conn = konek.koneksi();
            String n = namapemilikhewan.getText();
            String nam = nohp.getText();
            String j = (String) jenishewan.getSelectedItem();
            String al = namahewan.getText();
            String em = hasildiagnosa.getText();
            String no = resepobat.getText();
            String sql = "update data set namapmilikhewan= '"+n+"', nohp= '"+nam+"',namahewan = '"+al+"',jenishewan= '"+j+"',hasildiagnosa= '"+em+"',resepobat = '"+no+"' WHERE nohp='"
                    +nam
                            + "'";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Proses Edit data berhasil");
            loadData();
            clear();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"error : "+e.getMessage());
        }
    }//GEN-LAST:event_editActionPerformed

    private void HAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HAPUSActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabel1.getModel();
        int row = tabel1.getSelectedRow();
        model.removeRow(row);
        
        try {
            String sql = "delete from data  where nohp = '"+nohp.getText()+"'";
            Connection conn = konek.koneksi();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "hapus data berhasil");
        } catch ( Exception e) {
        }
        tampildata();
        clear();
    }//GEN-LAST:event_HAPUSActionPerformed

    private void jenishewanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenishewanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenishewanActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HAPUS;
    private javax.swing.JButton SIMPAN;
    private javax.swing.JButton btncari;
    private javax.swing.JTextField cari;
    private javax.swing.JButton edit;
    private javax.swing.JTextField hasildiagnosa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jenishewan;
    private javax.swing.JTextField namahewan;
    private javax.swing.JTextField namapemilikhewan;
    private javax.swing.JTextField nohp;
    private javax.swing.JTextField resepobat;
    private javax.swing.JTable tabel1;
    // End of variables declaration//GEN-END:variables
}

