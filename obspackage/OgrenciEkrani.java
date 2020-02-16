package obspackage;


import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;


/**
 *
 * @author ibrahimsengun
 */
public class OgrenciEkrani extends javax.swing.JFrame {

    private String ONo;
    SQLBaglanti sql = new SQLBaglanti();
    Ogrenci ogrenci = null;
    
    public OgrenciEkrani(String ONo) {
        this.ONo = ONo;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_ogrenciad = new javax.swing.JLabel();
        btn_Geri = new javax.swing.JButton();
        btn_DersSecme = new javax.swing.JButton();
        btn_NotGoruntule = new javax.swing.JButton();
        pane_DersSecme = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_AcilanDersler = new javax.swing.JComboBox<>();
        btn_AcilanDersSec = new javax.swing.JButton();
        pane_NotGoruntule = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_NotGoruntule = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_ogrenciad.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lbl_ogrenciad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Profile.png"))); // NOI18N

        btn_Geri.setBackground(new java.awt.Color(255, 255, 255));
        btn_Geri.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btn_Geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); // NOI18N
        btn_Geri.setText("Geri");
        btn_Geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GeriActionPerformed(evt);
            }
        });

        btn_DersSecme.setBackground(new java.awt.Color(255, 255, 255));
        btn_DersSecme.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btn_DersSecme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        btn_DersSecme.setText("Ders Seçme");
        btn_DersSecme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DersSecmeActionPerformed(evt);
            }
        });

        btn_NotGoruntule.setBackground(new java.awt.Color(255, 255, 255));
        btn_NotGoruntule.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btn_NotGoruntule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Line Chart.png"))); // NOI18N
        btn_NotGoruntule.setText("<html>Not<br>Görüntüleme</html>");
        btn_NotGoruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NotGoruntuleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel1.setText("Ders Seçme");

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel2.setText("Açılan Dersler:");

        cb_AcilanDersler.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        btn_AcilanDersSec.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btn_AcilanDersSec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Modify.png"))); // NOI18N
        btn_AcilanDersSec.setText("Seç");
        btn_AcilanDersSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AcilanDersSecActionPerformed(evt);
            }
        });

        pane_DersSecme.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_DersSecme.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_DersSecme.setLayer(cb_AcilanDersler, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_DersSecme.setLayer(btn_AcilanDersSec, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pane_DersSecmeLayout = new javax.swing.GroupLayout(pane_DersSecme);
        pane_DersSecme.setLayout(pane_DersSecmeLayout);
        pane_DersSecmeLayout.setHorizontalGroup(
            pane_DersSecmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_DersSecmeLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(pane_DersSecmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_DersSecmeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(300, 300, 300))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_DersSecmeLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cb_AcilanDersler, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
            .addGroup(pane_DersSecmeLayout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(btn_AcilanDersSec)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pane_DersSecmeLayout.setVerticalGroup(
            pane_DersSecmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_DersSecmeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pane_DersSecmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_AcilanDersler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_AcilanDersSec)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel3.setText("Not Görüntüleme");

        tbl_NotGoruntule.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbl_NotGoruntule.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        tbl_NotGoruntule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_NotGoruntule);

        pane_NotGoruntule.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_NotGoruntule.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pane_NotGoruntuleLayout = new javax.swing.GroupLayout(pane_NotGoruntule);
        pane_NotGoruntule.setLayout(pane_NotGoruntuleLayout);
        pane_NotGoruntuleLayout.setHorizontalGroup(
            pane_NotGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_NotGoruntuleLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_NotGoruntuleLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        pane_NotGoruntuleLayout.setVerticalGroup(
            pane_NotGoruntuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_NotGoruntuleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_ogrenciad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 698, Short.MAX_VALUE)
                .addComponent(btn_Geri)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_NotGoruntule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_DersSecme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(170, Short.MAX_VALUE)
                    .addComponent(pane_DersSecme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(170, Short.MAX_VALUE)
                    .addComponent(pane_NotGoruntule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_DersSecme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_NotGoruntule, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Geri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_ogrenciad)
                        .addGap(13, 13, 13)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pane_DersSecme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(79, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pane_NotGoruntule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );

        pane_DersSecme.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GeriActionPerformed
        GirisEkrani girisEkrani = new GirisEkrani();
        setVisible(false);
        girisEkrani.setVisible(true);
    }//GEN-LAST:event_btn_GeriActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        sql.Baglan();
        try {
            lbl_ogrenciad.setText(sql.getAd(ONo, "ogrenci"));
            ogrenci = sql.GetOgrenci(ONo);
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        pane_DersSecme.setVisible(false);
        pane_NotGoruntule.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btn_DersSecmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DersSecmeActionPerformed
        pane_NotGoruntule.setVisible(false);
        
        if(pane_DersSecme.isVisible()) {
            pane_DersSecme.setVisible(false);
        }
        else{
            pane_DersSecme.setVisible(true);
            try {
                cb_AcilanDersler.setModel(new javax.swing.DefaultComboBoxModel<>(sql.OgrAlmadıgıDersler(String.valueOf(ogrenci.getBNo()), ONo)));
            } catch (SQLException ex) {
                Logger.getLogger(OgrenciEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_btn_DersSecmeActionPerformed

    private void btn_AcilanDersSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AcilanDersSecActionPerformed
        String DNo = getCBNo(cb_AcilanDersler);
        try {
            sql.OgrDersSec(DNo, ONo);
            JOptionPane.showMessageDialog(rootPane, "Ders seçme işlemi başarıyla tamamlanmıştır.");
            
            cb_AcilanDersler.setModel(new javax.swing.DefaultComboBoxModel<>(sql.OgrAlmadıgıDersler(String.valueOf(ogrenci.getBNo()), ONo)));
            cb_AcilanDersler.setSelectedIndex(0);
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_AcilanDersSecActionPerformed

    private void btn_NotGoruntuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NotGoruntuleActionPerformed
        pane_DersSecme.setVisible(false);
        
        if(pane_NotGoruntule.isVisible()) {
            pane_NotGoruntule.setVisible(false);
        }
        else{
            pane_NotGoruntule.setVisible(true);
            
            String[] head = new String[6];
            head[0] = "Ders No";
            head[1] = "Ders Kod";
            head[2] = "Ders Ad";
            head[3] = "Vize";
            head[4] = "Final";
            head[5] = "Harf";
            
            try {
                tbl_NotGoruntule.setModel(new javax.swing.table.DefaultTableModel(
                        sql.getTekOgrNotMatris(ONo),
                        head
                ));
                resizeColumnWidth(tbl_NotGoruntule);
            } catch (SQLException ex) {
                Logger.getLogger(OgrenciEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_NotGoruntuleActionPerformed

    public void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width +1 , width);
            }
            if(width > 300)
                width=300;
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
    
    public String getCBNo(JComboBox combobox) {
        String s = combobox.getSelectedItem().toString().trim().substring(0, combobox.getSelectedItem().toString().trim().indexOf("-")).trim();
        return s;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AcilanDersSec;
    private javax.swing.JButton btn_DersSecme;
    private javax.swing.JButton btn_Geri;
    private javax.swing.JButton btn_NotGoruntule;
    private javax.swing.JComboBox<String> cb_AcilanDersler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ogrenciad;
    private javax.swing.JLayeredPane pane_DersSecme;
    private javax.swing.JLayeredPane pane_NotGoruntule;
    private javax.swing.JTable tbl_NotGoruntule;
    // End of variables declaration//GEN-END:variables
}
