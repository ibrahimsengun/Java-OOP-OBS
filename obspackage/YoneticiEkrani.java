package obspackage;


import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author ibrahimsengun
 */
public class YoneticiEkrani extends javax.swing.JFrame {

    SQLBaglanti sql = new SQLBaglanti();
    private String YNo;
    
    public YoneticiEkrani(String YNo) {
        this.YNo = YNo;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_OgrIslemEkle = new javax.swing.JButton();
        btn_OgrIslemSil = new javax.swing.JButton();
        btn_OgrIslemDuzenle = new javax.swing.JButton();
        btn_Geri = new javax.swing.JButton();
        lbl_yoneticiad = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_AkaIslemEkle = new javax.swing.JButton();
        btn_AkaIslemSil = new javax.swing.JButton();
        btn_AkaIslemDuzenle = new javax.swing.JButton();
        pane_OgrenciEkle = new javax.swing.JLayeredPane();
        lbl_islem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_OSoyad = new javax.swing.JTextField();
        tf_DTarih1 = new javax.swing.JTextField();
        tf_OAd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_OSifre = new javax.swing.JPasswordField();
        tf_ONo = new javax.swing.JTextField();
        cb_Cinsiyet = new javax.swing.JComboBox<>();
        cb_Fakulte = new javax.swing.JComboBox<>();
        cb_OgrenciBolum = new javax.swing.JComboBox<>();
        btn_NOlustur = new javax.swing.JButton();
        btn_KayitEkle = new javax.swing.JButton();
        pane_OgrenciSil = new javax.swing.JLayeredPane();
        lbl_IslemSil = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_OgrenciSil = new javax.swing.JButton();
        cb_OgrenciListele = new javax.swing.JComboBox<>();
        pane_OgrenciDuzenle = new javax.swing.JLayeredPane();
        jLabel12 = new javax.swing.JLabel();
        btn_DuzenleSec = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_DuzenleAd = new javax.swing.JTextField();
        tf_DuzenleSoyad = new javax.swing.JTextField();
        tf_DuzenleGNO = new javax.swing.JTextField();
        tf_DuzenleSifre = new javax.swing.JPasswordField();
        btn_DuzenleGuncelle = new javax.swing.JButton();
        cb_ODuzenleOlistele = new javax.swing.JComboBox<>();
        pane_AkademisyenEkle = new javax.swing.JLayeredPane();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tf_AkaEkleAd = new javax.swing.JTextField();
        tf_AkaEkleSoyad = new javax.swing.JTextField();
        tf_AkaEkleUnvan = new javax.swing.JTextField();
        tf_AkaEkleSifre = new javax.swing.JPasswordField();
        cb_AkaBolum = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        btn_NOlustur1 = new javax.swing.JButton();
        tf_AkaEkleNo = new javax.swing.JTextField();
        btn_AkaKayitEkle = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        cb_AkaFakulte = new javax.swing.JComboBox<>();
        pane_AkademisyenSil = new javax.swing.JLayeredPane();
        lbl_IslemSil1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btn_AkaSil = new javax.swing.JButton();
        cb_AkaSil = new javax.swing.JComboBox<>();
        pane_AkademisyenDuzenle = new javax.swing.JLayeredPane();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cb_AkaDuzenle = new javax.swing.JComboBox<>();
        btn_AkaDuzenleListele = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        tf_AkaDuzenleAd = new javax.swing.JTextField();
        tf_AkaDuzenleSoyad = new javax.swing.JTextField();
        tf_AkaDuzenleUnvan = new javax.swing.JTextField();
        tf_AkaDuzenleSifre = new javax.swing.JTextField();
        btn_AkaDuzenleGuncelle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel1.setText("Öğrenci İşlemleri");

        btn_OgrIslemEkle.setBackground(new java.awt.Color(255, 255, 255));
        btn_OgrIslemEkle.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        btn_OgrIslemEkle.setText("Ekle");
        btn_OgrIslemEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OgrIslemEkleActionPerformed(evt);
            }
        });

        btn_OgrIslemSil.setBackground(new java.awt.Color(255, 255, 255));
        btn_OgrIslemSil.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        btn_OgrIslemSil.setText("Sil");
        btn_OgrIslemSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OgrIslemSilActionPerformed(evt);
            }
        });

        btn_OgrIslemDuzenle.setBackground(new java.awt.Color(255, 255, 255));
        btn_OgrIslemDuzenle.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        btn_OgrIslemDuzenle.setText("Düzenle");
        btn_OgrIslemDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OgrIslemDuzenleActionPerformed(evt);
            }
        });

        btn_Geri.setBackground(new java.awt.Color(255, 255, 255));
        btn_Geri.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btn_Geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); // NOI18N
        btn_Geri.setText("Geri");
        btn_Geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GeriActionPerformed(evt);
            }
        });

        lbl_yoneticiad.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        lbl_yoneticiad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Profile.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel16.setText("Akademisyen İşlemleri");

        btn_AkaIslemEkle.setBackground(new java.awt.Color(255, 255, 255));
        btn_AkaIslemEkle.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        btn_AkaIslemEkle.setText("Ekle");
        btn_AkaIslemEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AkaIslemEkleActionPerformed(evt);
            }
        });

        btn_AkaIslemSil.setBackground(new java.awt.Color(255, 255, 255));
        btn_AkaIslemSil.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        btn_AkaIslemSil.setText("Sil");
        btn_AkaIslemSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AkaIslemSilActionPerformed(evt);
            }
        });

        btn_AkaIslemDuzenle.setBackground(new java.awt.Color(255, 255, 255));
        btn_AkaIslemDuzenle.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        btn_AkaIslemDuzenle.setText("Düzenle");
        btn_AkaIslemDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AkaIslemDuzenleActionPerformed(evt);
            }
        });

        pane_OgrenciEkle.setBackground(new java.awt.Color(255, 255, 255));

        lbl_islem.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lbl_islem.setText("Öğrenci Ekle");

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel2.setText("Ad:");

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel3.setText("Soyad:");

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel4.setText("Fakülte:");

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel5.setText("Bölüm:");

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel6.setText("Doğum Tarihi:");

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel7.setText("Cinsiyet:");

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel8.setText("Şifre:");

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel9.setText("Okul Numarası:");

        tf_OSoyad.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        tf_OSoyad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tf_DTarih1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        tf_DTarih1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tf_OAd.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        tf_OAd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel10.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        jLabel10.setText("(YYYY-AA-GG)");

        tf_OSifre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        tf_ONo.setEditable(false);
        tf_ONo.setBackground(new java.awt.Color(204, 204, 204));
        tf_ONo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        tf_ONo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        cb_Cinsiyet.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cb_Cinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kız" }));

        cb_Fakulte.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        cb_OgrenciBolum.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        btn_NOlustur.setBackground(new java.awt.Color(255, 255, 255));
        btn_NOlustur.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        btn_NOlustur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save.png"))); // NOI18N
        btn_NOlustur.setText(" Numara Oluştur");
        btn_NOlustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NOlusturActionPerformed(evt);
            }
        });

        btn_KayitEkle.setBackground(new java.awt.Color(255, 255, 255));
        btn_KayitEkle.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        btn_KayitEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add_1.png"))); // NOI18N
        btn_KayitEkle.setText(" Kayıt Ekle");
        btn_KayitEkle.setEnabled(false);
        btn_KayitEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KayitEkleActionPerformed(evt);
            }
        });

        pane_OgrenciEkle.setLayer(lbl_islem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(tf_OSoyad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(tf_DTarih1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(tf_OAd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(tf_OSifre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(tf_ONo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(cb_Cinsiyet, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(cb_Fakulte, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(cb_OgrenciBolum, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(btn_NOlustur, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciEkle.setLayer(btn_KayitEkle, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pane_OgrenciEkleLayout = new javax.swing.GroupLayout(pane_OgrenciEkle);
        pane_OgrenciEkle.setLayout(pane_OgrenciEkleLayout);
        pane_OgrenciEkleLayout.setHorizontalGroup(
            pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_OgrenciEkleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_OgrenciEkleLayout.createSequentialGroup()
                        .addGroup(pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pane_OgrenciEkleLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(104, 104, 104)
                                .addComponent(cb_OgrenciBolum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_KayitEkle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pane_OgrenciEkleLayout.createSequentialGroup()
                                    .addGroup(pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9))
                                    .addGap(40, 40, 40)
                                    .addGroup(pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_NOlustur, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                        .addComponent(tf_OSifre)
                                        .addComponent(cb_Fakulte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_OSoyad)
                                        .addComponent(tf_DTarih1)
                                        .addComponent(cb_Cinsiyet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_ONo)))))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel10)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_OgrenciEkleLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pane_OgrenciEkleLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_islem)
                                .addGap(268, 268, 268))
                            .addGroup(pane_OgrenciEkleLayout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(tf_OAd, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 99, Short.MAX_VALUE))))
                    .addGroup(pane_OgrenciEkleLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24))))
        );
        pane_OgrenciEkleLayout.setVerticalGroup(
            pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_OgrenciEkleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_islem)
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_OAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_OSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_DTarih1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_Cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_Fakulte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_OgrenciBolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_OSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_NOlustur)
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ONo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(btn_KayitEkle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_IslemSil.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lbl_IslemSil.setText("Öğrenci Sil");

        jLabel11.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel11.setText("Öğrenci:");

        btn_OgrenciSil.setBackground(new java.awt.Color(255, 255, 255));
        btn_OgrenciSil.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btn_OgrenciSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash16.png"))); // NOI18N
        btn_OgrenciSil.setText("Sil");
        btn_OgrenciSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OgrenciSilActionPerformed(evt);
            }
        });

        cb_OgrenciListele.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        pane_OgrenciSil.setLayer(lbl_IslemSil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciSil.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciSil.setLayer(btn_OgrenciSil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciSil.setLayer(cb_OgrenciListele, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pane_OgrenciSilLayout = new javax.swing.GroupLayout(pane_OgrenciSil);
        pane_OgrenciSil.setLayout(pane_OgrenciSilLayout);
        pane_OgrenciSilLayout.setHorizontalGroup(
            pane_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_OgrenciSilLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(26, 26, 26)
                .addGroup(pane_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_IslemSil)
                    .addComponent(btn_OgrenciSil, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_OgrenciListele, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pane_OgrenciSilLayout.setVerticalGroup(
            pane_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_OgrenciSilLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lbl_IslemSil)
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cb_OgrenciListele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_OgrenciSil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel12.setText("Öğrenci Düzenle");

        btn_DuzenleSec.setBackground(new java.awt.Color(255, 255, 255));
        btn_DuzenleSec.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btn_DuzenleSec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search_1.png"))); // NOI18N
        btn_DuzenleSec.setText("Seç");
        btn_DuzenleSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DuzenleSecActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel13.setText("Okul Numarası: ");

        jLabel14.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel14.setText("Ad:");

        jLabel15.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel15.setText("Soyad:");

        jLabel17.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel17.setText("GNO:");

        jLabel18.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel18.setText("Şifre:");

        tf_DuzenleAd.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        tf_DuzenleAd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_DuzenleAdKeyPressed(evt);
            }
        });

        tf_DuzenleSoyad.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        tf_DuzenleSoyad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_DuzenleSoyadKeyPressed(evt);
            }
        });

        tf_DuzenleGNO.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        tf_DuzenleGNO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_DuzenleGNOKeyPressed(evt);
            }
        });

        tf_DuzenleSifre.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        btn_DuzenleGuncelle.setBackground(new java.awt.Color(255, 255, 255));
        btn_DuzenleGuncelle.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btn_DuzenleGuncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Modify.png"))); // NOI18N
        btn_DuzenleGuncelle.setText("Güncelle");
        btn_DuzenleGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DuzenleGuncelleActionPerformed(evt);
            }
        });

        cb_ODuzenleOlistele.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        pane_OgrenciDuzenle.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciDuzenle.setLayer(btn_DuzenleSec, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciDuzenle.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciDuzenle.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciDuzenle.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciDuzenle.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciDuzenle.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciDuzenle.setLayer(tf_DuzenleAd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciDuzenle.setLayer(tf_DuzenleSoyad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciDuzenle.setLayer(tf_DuzenleGNO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciDuzenle.setLayer(tf_DuzenleSifre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciDuzenle.setLayer(btn_DuzenleGuncelle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_OgrenciDuzenle.setLayer(cb_ODuzenleOlistele, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pane_OgrenciDuzenleLayout = new javax.swing.GroupLayout(pane_OgrenciDuzenle);
        pane_OgrenciDuzenle.setLayout(pane_OgrenciDuzenleLayout);
        pane_OgrenciDuzenleLayout.setHorizontalGroup(
            pane_OgrenciDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_OgrenciDuzenleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(189, 189, 189))
            .addGroup(pane_OgrenciDuzenleLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pane_OgrenciDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_DuzenleGuncelle)
                    .addComponent(tf_DuzenleGNO, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(tf_DuzenleSoyad, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(tf_DuzenleAd, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(btn_DuzenleSec)
                    .addComponent(tf_DuzenleSifre)
                    .addComponent(cb_ODuzenleOlistele, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        pane_OgrenciDuzenleLayout.setVerticalGroup(
            pane_OgrenciDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_OgrenciDuzenleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(34, 34, 34)
                .addGroup(pane_OgrenciDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cb_ODuzenleOlistele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_DuzenleSec)
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_DuzenleAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_DuzenleSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_DuzenleGNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_OgrenciDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_DuzenleSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_DuzenleGuncelle)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel19.setText("Akademisyen Ekle");

        jLabel20.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel20.setText("Ad:");

        jLabel21.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel21.setText("Soyad:");

        jLabel22.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel22.setText("Unvan:");

        jLabel23.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel23.setText("Fakülte:");

        jLabel24.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel24.setText("Şifre:");

        tf_AkaEkleAd.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        tf_AkaEkleSoyad.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        tf_AkaEkleUnvan.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        tf_AkaEkleSifre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        cb_AkaBolum.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel25.setText("Aka. Numarası:");

        btn_NOlustur1.setBackground(new java.awt.Color(255, 255, 255));
        btn_NOlustur1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        btn_NOlustur1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save.png"))); // NOI18N
        btn_NOlustur1.setText(" Numara Oluştur");
        btn_NOlustur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NOlustur1ActionPerformed(evt);
            }
        });

        tf_AkaEkleNo.setEditable(false);
        tf_AkaEkleNo.setBackground(new java.awt.Color(255, 255, 255));
        tf_AkaEkleNo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        btn_AkaKayitEkle.setBackground(new java.awt.Color(255, 255, 255));
        btn_AkaKayitEkle.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        btn_AkaKayitEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add_1.png"))); // NOI18N
        btn_AkaKayitEkle.setText(" Kayıt Ekle");
        btn_AkaKayitEkle.setEnabled(false);
        btn_AkaKayitEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AkaKayitEkleActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel26.setText("Bölüm:");

        cb_AkaFakulte.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        pane_AkademisyenEkle.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(tf_AkaEkleAd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(tf_AkaEkleSoyad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(tf_AkaEkleUnvan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(tf_AkaEkleSifre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(cb_AkaBolum, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(btn_NOlustur1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(tf_AkaEkleNo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(btn_AkaKayitEkle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenEkle.setLayer(cb_AkaFakulte, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pane_AkademisyenEkleLayout = new javax.swing.GroupLayout(pane_AkademisyenEkle);
        pane_AkademisyenEkle.setLayout(pane_AkademisyenEkleLayout);
        pane_AkademisyenEkleLayout.setHorizontalGroup(
            pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_AkademisyenEkleLayout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(180, 180, 180))
            .addGroup(pane_AkademisyenEkleLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pane_AkademisyenEkleLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_AkaEkleNo))
                            .addGroup(pane_AkademisyenEkleLayout.createSequentialGroup()
                                .addGroup(pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel26))
                                .addGap(75, 75, 75)
                                .addGroup(pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_AkaFakulte, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_AkaEkleSifre)
                                        .addComponent(btn_NOlustur1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tf_AkaEkleUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_AkaEkleSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_AkaEkleAd, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_AkaBolum, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(btn_AkaKayitEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pane_AkademisyenEkleLayout.setVerticalGroup(
            pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_AkademisyenEkleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tf_AkaEkleAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tf_AkaEkleSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tf_AkaEkleUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cb_AkaFakulte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_AkaBolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tf_AkaEkleSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_NOlustur1)
                .addGap(18, 18, 18)
                .addGroup(pane_AkademisyenEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tf_AkaEkleNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_AkaKayitEkle)
                .addGap(38, 38, 38))
        );

        lbl_IslemSil1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lbl_IslemSil1.setText("Akademisyen Sil");

        jLabel27.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel27.setText("Akademisyen Seç:");

        btn_AkaSil.setBackground(new java.awt.Color(255, 255, 255));
        btn_AkaSil.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btn_AkaSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash16.png"))); // NOI18N
        btn_AkaSil.setText("Sil");
        btn_AkaSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AkaSilActionPerformed(evt);
            }
        });

        cb_AkaSil.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        pane_AkademisyenSil.setLayer(lbl_IslemSil1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenSil.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenSil.setLayer(btn_AkaSil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenSil.setLayer(cb_AkaSil, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pane_AkademisyenSilLayout = new javax.swing.GroupLayout(pane_AkademisyenSil);
        pane_AkademisyenSil.setLayout(pane_AkademisyenSilLayout);
        pane_AkademisyenSilLayout.setHorizontalGroup(
            pane_AkademisyenSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_AkademisyenSilLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(pane_AkademisyenSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_AkademisyenSilLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(cb_AkaSil, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pane_AkademisyenSilLayout.createSequentialGroup()
                        .addGroup(pane_AkademisyenSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pane_AkademisyenSilLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(lbl_IslemSil1))
                            .addGroup(pane_AkademisyenSilLayout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(btn_AkaSil, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(152, 152, 152)))
                .addGap(64, 64, 64))
        );
        pane_AkademisyenSilLayout.setVerticalGroup(
            pane_AkademisyenSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_AkademisyenSilLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lbl_IslemSil1)
                .addGap(33, 33, 33)
                .addGroup(pane_AkademisyenSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(cb_AkaSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_AkaSil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jLabel28.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel28.setText("Akademisyen Düzenle");

        jLabel29.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel29.setText("Akademisyen:");

        cb_AkaDuzenle.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        btn_AkaDuzenleListele.setBackground(new java.awt.Color(255, 255, 255));
        btn_AkaDuzenleListele.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btn_AkaDuzenleListele.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search_1.png"))); // NOI18N
        btn_AkaDuzenleListele.setText("Listele");
        btn_AkaDuzenleListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AkaDuzenleListeleActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel30.setText("Adı:");

        jLabel31.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel31.setText("Soyadı:");

        jLabel32.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel32.setText("Unvan:");

        jLabel33.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel33.setText("Şifre:");

        tf_AkaDuzenleAd.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        tf_AkaDuzenleSoyad.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        tf_AkaDuzenleUnvan.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        tf_AkaDuzenleSifre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        btn_AkaDuzenleGuncelle.setBackground(new java.awt.Color(255, 255, 255));
        btn_AkaDuzenleGuncelle.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btn_AkaDuzenleGuncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Modify.png"))); // NOI18N
        btn_AkaDuzenleGuncelle.setText("Güncelle");
        btn_AkaDuzenleGuncelle.setEnabled(false);
        btn_AkaDuzenleGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AkaDuzenleGuncelleActionPerformed(evt);
            }
        });

        pane_AkademisyenDuzenle.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenDuzenle.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenDuzenle.setLayer(cb_AkaDuzenle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenDuzenle.setLayer(btn_AkaDuzenleListele, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenDuzenle.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenDuzenle.setLayer(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenDuzenle.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenDuzenle.setLayer(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenDuzenle.setLayer(tf_AkaDuzenleAd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenDuzenle.setLayer(tf_AkaDuzenleSoyad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenDuzenle.setLayer(tf_AkaDuzenleUnvan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenDuzenle.setLayer(tf_AkaDuzenleSifre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_AkademisyenDuzenle.setLayer(btn_AkaDuzenleGuncelle, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pane_AkademisyenDuzenleLayout = new javax.swing.GroupLayout(pane_AkademisyenDuzenle);
        pane_AkademisyenDuzenle.setLayout(pane_AkademisyenDuzenleLayout);
        pane_AkademisyenDuzenleLayout.setHorizontalGroup(
            pane_AkademisyenDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_AkademisyenDuzenleLayout.createSequentialGroup()
                .addGroup(pane_AkademisyenDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_AkademisyenDuzenleLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel28))
                    .addGroup(pane_AkademisyenDuzenleLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(pane_AkademisyenDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel29))
                        .addGap(26, 26, 26)
                        .addGroup(pane_AkademisyenDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_AkaDuzenle, 0, 260, Short.MAX_VALUE)
                            .addComponent(tf_AkaDuzenleAd)
                            .addComponent(tf_AkaDuzenleSoyad)
                            .addComponent(tf_AkaDuzenleUnvan)
                            .addComponent(tf_AkaDuzenleSifre))))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_AkademisyenDuzenleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pane_AkademisyenDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_AkademisyenDuzenleLayout.createSequentialGroup()
                        .addComponent(btn_AkaDuzenleGuncelle)
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_AkademisyenDuzenleLayout.createSequentialGroup()
                        .addComponent(btn_AkaDuzenleListele, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        pane_AkademisyenDuzenleLayout.setVerticalGroup(
            pane_AkademisyenDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_AkademisyenDuzenleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(38, 38, 38)
                .addGroup(pane_AkademisyenDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(cb_AkaDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_AkaDuzenleListele)
                .addGap(18, 18, 18)
                .addGroup(pane_AkademisyenDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tf_AkaDuzenleAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_AkademisyenDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(tf_AkaDuzenleSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_AkademisyenDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf_AkaDuzenleUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_AkademisyenDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(tf_AkaDuzenleSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_AkaDuzenleGuncelle)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_OgrIslemEkle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_OgrIslemSil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_OgrIslemDuzenle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_AkaIslemEkle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_AkaIslemSil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_AkaIslemDuzenle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel16))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbl_yoneticiad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(pane_OgrenciEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btn_Geri)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(320, Short.MAX_VALUE)
                    .addComponent(pane_OgrenciSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(230, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(329, Short.MAX_VALUE)
                    .addComponent(pane_OgrenciDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(235, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(335, Short.MAX_VALUE)
                    .addComponent(pane_AkademisyenEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(238, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(345, Short.MAX_VALUE)
                    .addComponent(pane_AkademisyenSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(376, Short.MAX_VALUE)
                    .addComponent(pane_AkademisyenDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(132, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pane_OgrenciEkle)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_OgrIslemEkle)
                            .addComponent(btn_OgrIslemSil)
                            .addComponent(btn_OgrIslemDuzenle))
                        .addGap(92, 92, 92)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_AkaIslemEkle)
                            .addComponent(btn_AkaIslemSil)
                            .addComponent(btn_AkaIslemDuzenle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Geri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_yoneticiad)
                                .addGap(24, 24, 24)))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pane_OgrenciSil)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pane_OgrenciDuzenle)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pane_AkademisyenEkle)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pane_AkademisyenSil)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pane_AkademisyenDuzenle)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_OgrIslemEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OgrIslemEkleActionPerformed
        pane_OgrenciSil.setVisible(false);
        pane_OgrenciDuzenle.setVisible(false);
        pane_AkademisyenEkle.setVisible(false);
        pane_AkademisyenSil.setVisible(false);
        pane_AkademisyenDuzenle.setVisible(false);
        
        SQLBaglanti sql = new SQLBaglanti();
        if(sql.getConnection() == null) {
            sql.Baglan();
        }
        if(!pane_OgrenciEkle.isVisible())
        {
            pane_OgrenciEkle.setVisible(true);
            try {
                cb_Fakulte.setModel(new javax.swing.DefaultComboBoxModel<>(sql.Fakulteler()));
                cb_OgrenciBolum.setModel(new javax.swing.DefaultComboBoxModel<>(sql.Bolumler(cb_Fakulte.getSelectedItem().toString().substring(0, 1))));

                cb_Fakulte.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            cb_OgrenciBolum.setModel(new javax.swing.DefaultComboBoxModel<>(sql.Bolumler(cb_Fakulte.getSelectedItem().toString().substring(0, 1))));
                        } catch (SQLException ex) {
                            Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
            } catch (SQLException ex) {
                Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            pane_OgrenciEkle.setVisible(false);
        }
    }//GEN-LAST:event_btn_OgrIslemEkleActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pane_OgrenciEkle.setVisible(false);
        pane_OgrenciSil.setVisible(false);
        pane_OgrenciDuzenle.setVisible(false);
        pane_AkademisyenEkle.setVisible(false);
        pane_AkademisyenSil.setVisible(false);
        pane_AkademisyenDuzenle.setVisible(false);
        
        sql.Baglan();
        try {
            lbl_yoneticiad.setText(sql.getAd(YNo, "yonetici"));
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn_GeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GeriActionPerformed
        GirisEkrani girisEkrani = new GirisEkrani();
        setVisible(false);
        girisEkrani.setVisible(true);
    }//GEN-LAST:event_btn_GeriActionPerformed

    private void btn_NOlusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NOlusturActionPerformed
        //String yil = tf_DTarih1.getText().toString().substring(0, 2);
        if(tf_OAd.getText().equals("") && tf_OSoyad.getText().equals("") && tf_OSifre.getText().equals("") && tf_DTarih1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Boş alanları doldurunuz.");
        }
        else{
            String tmp = cb_Fakulte.getSelectedItem().toString().trim(), tmp2 = cb_OgrenciBolum.getSelectedItem().toString().trim();
        String fakNo = "", bolNo = "";
        
        if(tmp.substring(0, tmp.indexOf("-")).length() == 3){
            fakNo = tmp.substring(0, tmp.indexOf("-"));
        }
        else if(tmp.substring(0, tmp.indexOf("-")).length() == 2) {
            fakNo = "0" + tmp.substring(0, tmp.indexOf("-"));
        }
        if(tmp2.substring(0, tmp2.indexOf("-")).length() == 3){
            bolNo = tmp2.substring(0, tmp2.indexOf("-"));
        }
        else if(tmp2.substring(0, tmp2.indexOf("-")).length() == 2) {
            bolNo = "0" + tmp2.substring(0, tmp2.indexOf("-"));
        }
        
        String mevcut = "";
        try {
            System.out.println("length: "  + sql.SinifMevcut(bolNo).length());
            mevcut = sql.SinifMevcut(bolNo);


        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("mevcut: " + mevcut);
        /*if(yil.length() < 2) {
            JOptionPane op = new JOptionPane("Gerekli Bilgileri giriniz.");
            op.show();
        }*/
        String okulNo = mevcut.trim();
        okulNo = okulNo.trim();
        tf_ONo.setText(okulNo);
        //System.out.println("Yil : " + yil + "\n" + "fakNo: " + fakNo + "\n" + "bolNo: " + bolNo);
        

        System.out.println(okulNo);
        btn_KayitEkle.setEnabled(true);
        }
        
    }//GEN-LAST:event_btn_NOlusturActionPerformed

    private void btn_KayitEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KayitEkleActionPerformed
        if(!tf_ONo.getText().equals(""))
        {
            String No, ad, soyad, DTarih, Sifre, BNo = null, tmp = cb_OgrenciBolum.getSelectedItem().toString().trim() ;
            char cinsiyet;
            
            No = tf_ONo.getText().toString();
            ad = tf_OAd.getText().toString();
            soyad = tf_OSoyad.getText().toString();
            DTarih = tf_DTarih1.getText().toString();
            Sifre = tf_OSifre.getText().toString();
            cinsiyet = cb_Cinsiyet.getSelectedItem().toString().charAt(0);
            
            if(tmp.substring(0, tmp.indexOf("-")).length() == 3){
                BNo = tmp.substring(0, tmp.indexOf("-"));
            }
            else if(tmp.substring(0, tmp.indexOf("-")).length() == 2) {
                BNo = "0" + tmp.substring(0, tmp.indexOf("-"));
            }
            System.out.println("BNo: "+BNo);
            try {
                System.out.println("try içine girdi");
                sql.OgrenciEkle(No, ad, soyad, DTarih, cinsiyet, BNo, Sifre);
                
                JOptionPane.showMessageDialog(rootPane, "Öğrenci başarıyla eklenmiştir.");
                
                tf_OAd.setText("");
                tf_OSoyad.setText("");
                tf_ONo.setText("");
                tf_OSifre.setText("");
                tf_DTarih1.setText("");
                cb_Cinsiyet.setSelectedIndex(0);
                cb_Fakulte.setSelectedIndex(0);
                cb_OgrenciBolum.setSelectedIndex(0);
                
            } catch (SQLException ex) {
                Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
            /*pane_OgrenciEkle.invalidate();
            pane_OgrenciEkle.validate();
            pane_OgrenciEkle.repaint();*/
        }
    }//GEN-LAST:event_btn_KayitEkleActionPerformed

    private void btn_OgrIslemSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OgrIslemSilActionPerformed
        pane_AkademisyenEkle.setVisible(false);
        pane_OgrenciEkle.setVisible(false);
        pane_OgrenciDuzenle.setVisible(false);
        pane_AkademisyenSil.setVisible(false);
        pane_AkademisyenDuzenle.setVisible(false);
        
        if(pane_OgrenciSil.isVisible()){
            pane_OgrenciSil.setVisible(false);
        }
        else{
            pane_OgrenciSil.setVisible(true);
            try {
                cb_OgrenciListele.setModel(new javax.swing.DefaultComboBoxModel<>(sql.OgrenciListe()));
            } catch (SQLException ex) {
                Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btn_OgrIslemSilActionPerformed

    private void btn_OgrenciSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OgrenciSilActionPerformed
        String ONo = cb_OgrenciListele.getSelectedItem().toString().trim().substring(0, cb_OgrenciListele.getSelectedItem().toString().trim().indexOf("-")).trim();
        try {
            sql.OgrenciSil(ONo);
            JOptionPane.showMessageDialog(rootPane, "Öğrenci başarıyla silindi.");
            cb_OgrenciListele.setModel(new javax.swing.DefaultComboBoxModel<>(sql.OgrenciListe()));
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_OgrenciSilActionPerformed

    private void btn_DuzenleSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DuzenleSecActionPerformed
        String ONo = getCBNo(cb_ODuzenleOlistele);
        try {
            Ogrenci o = sql.GetOgrenci(ONo);
            tf_DuzenleAd.setText(o.getAd());
            tf_DuzenleSoyad.setText(o.getSoyad());
            tf_DuzenleGNO.setText(String.valueOf(o.getGNO()));
            tf_DuzenleSifre.setText(o.getSifre());
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_DuzenleSecActionPerformed

    private void tf_DuzenleAdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_DuzenleAdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_DuzenleAdKeyPressed

    private void tf_DuzenleSoyadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_DuzenleSoyadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_DuzenleSoyadKeyPressed

    private void tf_DuzenleGNOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_DuzenleGNOKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_DuzenleGNOKeyPressed

    private void btn_DuzenleGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DuzenleGuncelleActionPerformed
        try {
            sql.OgrenciGuncelle(getCBNo(cb_ODuzenleOlistele), tf_DuzenleAd.getText().trim(), tf_DuzenleSoyad.getText().trim(), Float.parseFloat(tf_DuzenleGNO.getText().trim()), tf_DuzenleSifre.getText().trim());
            JOptionPane.showMessageDialog(rootPane, "Öğrenci başarıyla güncellendi.");
 
            cb_ODuzenleOlistele.setModel(new javax.swing.DefaultComboBoxModel<>(sql.OgrenciListe()));
            cb_ODuzenleOlistele.setSelectedIndex(0);
            tf_DuzenleAd.setText("");
            tf_DuzenleGNO.setText("");
            tf_DuzenleSifre.setText("");
            tf_DuzenleSoyad.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_DuzenleGuncelleActionPerformed

    private void btn_OgrIslemDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OgrIslemDuzenleActionPerformed
        pane_OgrenciEkle.setVisible(false);
        pane_OgrenciSil.setVisible(false);
        pane_AkademisyenEkle.setVisible(false);
        pane_AkademisyenSil.setVisible(false);
        pane_AkademisyenDuzenle.setVisible(false);
        
        if(pane_OgrenciDuzenle.isVisible())
            pane_OgrenciDuzenle.setVisible(false);
        else{
            pane_OgrenciDuzenle.setVisible(true);
            try {
                cb_ODuzenleOlistele.setModel(new javax.swing.DefaultComboBoxModel<>(sql.OgrenciListe()));
            } catch (SQLException ex) {
                Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }//GEN-LAST:event_btn_OgrIslemDuzenleActionPerformed

    private void btn_AkaIslemEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AkaIslemEkleActionPerformed
        pane_OgrenciSil.setVisible(false);
        pane_OgrenciDuzenle.setVisible(false);
        pane_OgrenciEkle.setVisible(false);
        pane_AkademisyenSil.setVisible(false);
        pane_AkademisyenDuzenle.setVisible(false);
        
        SQLBaglanti sql = new SQLBaglanti();
        if(sql.getConnection() == null) {
            sql.Baglan();
        }
        if(!pane_AkademisyenEkle.isVisible())
        {
            pane_AkademisyenEkle.setVisible(true);
            try {
                cb_AkaFakulte.setModel(new javax.swing.DefaultComboBoxModel<>(sql.Fakulteler()));
                cb_AkaBolum.setModel(new javax.swing.DefaultComboBoxModel<>(sql.Bolumler(cb_AkaFakulte.getSelectedItem().toString().substring(0, 1))));

                cb_AkaFakulte.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            cb_AkaBolum.setModel(new javax.swing.DefaultComboBoxModel<>(sql.Bolumler(cb_AkaFakulte.getSelectedItem().toString().substring(0, 1))));
                        } catch (SQLException ex) {
                            Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
            } catch (SQLException ex) {
                Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            pane_AkademisyenEkle.setVisible(false);
        }
    }//GEN-LAST:event_btn_AkaIslemEkleActionPerformed

    private void btn_AkaIslemSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AkaIslemSilActionPerformed
        pane_OgrenciSil.setVisible(false);
        pane_OgrenciDuzenle.setVisible(false);
        pane_OgrenciEkle.setVisible(false);
        pane_AkademisyenEkle.setVisible(false);
        pane_AkademisyenDuzenle.setVisible(false);
        
        if(!pane_AkademisyenSil.isVisible())
        {
            pane_AkademisyenSil.setVisible(true);
            try {
                cb_AkaSil.setModel(new javax.swing.DefaultComboBoxModel<>(sql.AkademisyenListe()));
            } catch (SQLException ex) {
                Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            pane_AkademisyenSil.setVisible(false);
        }
        
    }//GEN-LAST:event_btn_AkaIslemSilActionPerformed

    private void btn_AkaIslemDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AkaIslemDuzenleActionPerformed
        pane_OgrenciSil.setVisible(false);
        pane_OgrenciDuzenle.setVisible(false);
        pane_OgrenciEkle.setVisible(false);
        pane_AkademisyenEkle.setVisible(false);
        pane_AkademisyenSil.setVisible(false);
        
        if(!pane_AkademisyenDuzenle.isVisible())
        {
            pane_AkademisyenDuzenle.setVisible(true);
            try {
                cb_AkaDuzenle.setModel(new javax.swing.DefaultComboBoxModel<>(sql.AkademisyenListe()));
            } catch (SQLException ex) {
                Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            pane_AkademisyenDuzenle.setVisible(false);
        }
    }//GEN-LAST:event_btn_AkaIslemDuzenleActionPerformed

    private void btn_NOlustur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NOlustur1ActionPerformed
        if(tf_AkaEkleAd.getText().equals("") && tf_AkaEkleSifre.getText().equals("") && tf_AkaEkleSoyad.getText().equals("") && tf_AkaEkleNo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Lütfen boş alanları doldurunuz.");
        }
        else{
            try {
                int tmp = 100 + Integer.parseInt(sql.AkademisyenSayisi());
                String AkaNo = String.valueOf(tmp);
                tf_AkaEkleNo.setText(AkaNo);
                btn_AkaKayitEkle.setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btn_NOlustur1ActionPerformed

    private void btn_AkaKayitEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AkaKayitEkleActionPerformed
        try {
            sql.AkademisyenEkle(tf_AkaEkleNo.getText().trim(), tf_AkaEkleAd.getText(), tf_AkaEkleSoyad.getText(),
                    tf_AkaEkleUnvan.getText(), cb_AkaFakulte.getSelectedItem().toString().trim().substring(0, cb_AkaFakulte.getSelectedItem().toString().trim().indexOf("-")),
                    cb_AkaBolum.getSelectedItem().toString().trim().substring(0, cb_AkaBolum.getSelectedItem().toString().trim().indexOf("-")), tf_AkaEkleSifre.getText());
            
            JOptionPane.showMessageDialog(rootPane, "Kullanıcı başarıyla eklenmiştir.");
            /*pane_AkademisyenEkle.removeAll();
            pane_AkademisyenEkle.revalidate();
            pane_AkademisyenEkle.repaint();*/
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_AkaKayitEkleActionPerformed

    private void btn_AkaSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AkaSilActionPerformed
        String akaNo = cb_AkaSil.getSelectedItem().toString().trim().substring(0, cb_AkaSil.getSelectedItem().toString().trim().indexOf("-")).trim();
        try {
            sql.AkademisyenSil(akaNo);
            JOptionPane.showMessageDialog(rootPane, "Akademisyen başarıyla silindi.");
            
            cb_AkaSil.setModel(new javax.swing.DefaultComboBoxModel<>(sql.AkademisyenListe()));
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_AkaSilActionPerformed

    private void btn_AkaDuzenleListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AkaDuzenleListeleActionPerformed
        String AkaNo = cb_AkaDuzenle.getSelectedItem().toString().trim().substring(0, cb_AkaDuzenle.getSelectedItem().toString().trim().indexOf("-")).trim();
        
        try {
            Akademisyen akademisyen = sql.GetAkademisyen(AkaNo);
            tf_AkaDuzenleAd.setText(akademisyen.getAd());
            tf_AkaDuzenleSoyad.setText(akademisyen.getSoyad());
            tf_AkaDuzenleUnvan.setText(akademisyen.getUnvan());
            tf_AkaDuzenleSifre.setText(akademisyen.getSifre());
            
            btn_AkaDuzenleGuncelle.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_AkaDuzenleListeleActionPerformed

    private void btn_AkaDuzenleGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AkaDuzenleGuncelleActionPerformed
        String AkaNo = cb_AkaDuzenle.getSelectedItem().toString().trim().substring(0, cb_AkaDuzenle.getSelectedItem().toString().trim().indexOf("-")).trim();
        
        try {
            sql.AkademisyenGuncelle(AkaNo,
                    tf_AkaDuzenleAd.getText(),
                    tf_AkaDuzenleSoyad.getText(),
                    tf_AkaDuzenleUnvan.getText(),
                    tf_AkaDuzenleSifre.getText());
            
            JOptionPane.showMessageDialog(rootPane, "Akademisyen başarıyla güncellendi.");
            
            tf_AkaDuzenleAd.setText("");
            tf_AkaDuzenleSoyad.setText("");
            tf_AkaDuzenleUnvan.setText("");
            tf_AkaDuzenleSifre.setText("");
            
            cb_AkaDuzenle.setModel(new javax.swing.DefaultComboBoxModel<>(sql.AkademisyenListe()));
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_AkaDuzenleGuncelleActionPerformed

    public String getCBNo(JComboBox combobox) {
        String s = combobox.getSelectedItem().toString().trim().substring(0, combobox.getSelectedItem().toString().trim().indexOf("-")).trim();
        return s;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AkaDuzenleGuncelle;
    private javax.swing.JButton btn_AkaDuzenleListele;
    private javax.swing.JButton btn_AkaIslemDuzenle;
    private javax.swing.JButton btn_AkaIslemEkle;
    private javax.swing.JButton btn_AkaIslemSil;
    private javax.swing.JButton btn_AkaKayitEkle;
    private javax.swing.JButton btn_AkaSil;
    private javax.swing.JButton btn_DuzenleGuncelle;
    private javax.swing.JButton btn_DuzenleSec;
    private javax.swing.JButton btn_Geri;
    private javax.swing.JButton btn_KayitEkle;
    private javax.swing.JButton btn_NOlustur;
    private javax.swing.JButton btn_NOlustur1;
    private javax.swing.JButton btn_OgrIslemDuzenle;
    private javax.swing.JButton btn_OgrIslemEkle;
    private javax.swing.JButton btn_OgrIslemSil;
    private javax.swing.JButton btn_OgrenciSil;
    private javax.swing.JComboBox<String> cb_AkaBolum;
    private javax.swing.JComboBox<String> cb_AkaDuzenle;
    private javax.swing.JComboBox<String> cb_AkaFakulte;
    private javax.swing.JComboBox<String> cb_AkaSil;
    private javax.swing.JComboBox<String> cb_Cinsiyet;
    private javax.swing.JComboBox<String> cb_Fakulte;
    private javax.swing.JComboBox<String> cb_ODuzenleOlistele;
    private javax.swing.JComboBox<String> cb_OgrenciBolum;
    private javax.swing.JComboBox<String> cb_OgrenciListele;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_IslemSil;
    private javax.swing.JLabel lbl_IslemSil1;
    private javax.swing.JLabel lbl_islem;
    private javax.swing.JLabel lbl_yoneticiad;
    private javax.swing.JLayeredPane pane_AkademisyenDuzenle;
    private javax.swing.JLayeredPane pane_AkademisyenEkle;
    private javax.swing.JLayeredPane pane_AkademisyenSil;
    private javax.swing.JLayeredPane pane_OgrenciDuzenle;
    private javax.swing.JLayeredPane pane_OgrenciEkle;
    private javax.swing.JLayeredPane pane_OgrenciSil;
    private javax.swing.JTextField tf_AkaDuzenleAd;
    private javax.swing.JTextField tf_AkaDuzenleSifre;
    private javax.swing.JTextField tf_AkaDuzenleSoyad;
    private javax.swing.JTextField tf_AkaDuzenleUnvan;
    private javax.swing.JTextField tf_AkaEkleAd;
    private javax.swing.JTextField tf_AkaEkleNo;
    private javax.swing.JPasswordField tf_AkaEkleSifre;
    private javax.swing.JTextField tf_AkaEkleSoyad;
    private javax.swing.JTextField tf_AkaEkleUnvan;
    private javax.swing.JTextField tf_DTarih1;
    private javax.swing.JTextField tf_DuzenleAd;
    private javax.swing.JTextField tf_DuzenleGNO;
    private javax.swing.JPasswordField tf_DuzenleSifre;
    private javax.swing.JTextField tf_DuzenleSoyad;
    private javax.swing.JTextField tf_OAd;
    private javax.swing.JTextField tf_ONo;
    private javax.swing.JPasswordField tf_OSifre;
    private javax.swing.JTextField tf_OSoyad;
    // End of variables declaration//GEN-END:variables
}
