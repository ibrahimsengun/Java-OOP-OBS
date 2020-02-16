package obspackage;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SQLBaglanti {

    private Connection conn = null;
    private String No;
    
    public String getNo() {
        return No;
    }
    
    public Connection getConnection() {
        return conn;
    }
    
    public Connection Baglan() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/obsdatabase?useUnicode=true&characterEncoding=UTF-8", "root", "");
            System.out.println("Veritabanı bağlantısı tamamlandı.");
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            //JOptionPane.showMessageDialog(null, "HATA :" + ex, "MESAJ", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
            System.out.println("Veritabanı bağlntısı başarısız.");     
            return null;
        }
    }
    
    public String[] AkademisyenListe() throws SQLException {
        String[] aka = null;
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select count(*) from akademisyen");
            
            if(rs.next()) {
                aka = new String[rs.getInt(1)];
            }
            st = conn.createStatement();
            rs = st.executeQuery("select ANo, Unvan, AAd, ASoyad from akademisyen");
            
            int i = 0;
            while(rs.next()) {
                aka[i] = rs.getString("ANo") + " - " + rs.getString("Unvan") + " " +rs.getString("AAd") + " " + rs.getString("ASoyad");
                i++;
            }
        }
        return aka;
    }
    
    public String[] OgrenciListe() throws SQLException {
        String[] ogr = null;
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select count(*) from ogrenci");
            
            if(rs.next()) {
                ogr = new String[rs.getInt(1)];
            }
            st = conn.createStatement();
            rs = st.executeQuery("select ONo, OAd, OSoyad from ogrenci");
            
            int i = 0;
            while(rs.next()) {
                ogr[i] = rs.getString("ONo") + " - " + rs.getString("OAd") + " " + rs.getString("OSoyad");
                i++;
            }
        }
        return ogr;
    }
    
    public String[] OgrenciListeBolumeGore(String BNo) throws SQLException {
        String[] ogr = null;
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select count(*) from ogrenci where BNoO = " + BNo);
            
            if(rs.next()) {
                ogr = new String[rs.getInt(1)];
            }
            st = conn.createStatement();
            rs = st.executeQuery("select ONo, OAd, OSoyad from ogrenci where BNoO = " + BNo);
            
            int i = 0;
            while(rs.next()) {
                ogr[i] = rs.getString("ONo") + " - " + rs.getString("OAd") + " " + rs.getString("OSoyad");
                i++;
            }
        }
        return ogr;
    }
    
    public String[] OgrDersNotListele(String ONo) throws SQLException {
        String[] dersler = null;
        
        if(conn != null){
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select count(*) from ogrenci, ogrnot where ogrnot.ONoN = ogrenci.ONo and ogrenci.ONo = " + ONo);
            
            if(rs.next()) 
                dersler = new String[rs.getInt(1)];

            st = conn.createStatement();
            rs = st.executeQuery("select d.DNo, d.DAd, d.DKod " +
                "from ogrenci o, ders d, ogrnot n " +
                "where o.BNoO = d.BNoD and d.DNo = n.DNoN and n.ONoN = o.ONo and o.ONo = " + ONo);
            
            int i = 0;
            while(rs.next()){
                dersler[i] = String.valueOf(rs.getInt(1)) + " - " + rs.getString(2) + " (" + rs.getString(3) +")";
                i++;
            }
        }
        
        return dersler;
    }
    
    public void OgrenciNotGir(String ONo, String vize, String finalN, String harf) throws SQLException {
        if(conn != null) {
            PreparedStatement st = conn.prepareStatement("update ogrnot set vize = ?, final = ?, harf = ? where ONoN = " + ONo +" LIMIT 1");
            
            st.setInt(1, Integer.parseInt(vize));
            st.setInt(2, Integer.parseInt(finalN));
            st.setString(3, harf);
            
            st.executeUpdate();
        }
    }
    
    public String[] getNotlar(String ONo, String DNo) throws SQLException {
        String[] notlar = new String[3];
        
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select Vize, Final, Harf " +
                "from ogrenci o, ders d, ogrnot n " +
                "where o.BNoO = d.BNoD and d.DNo = n.DNoN and n.ONoN = o.ONo and o.ONo = " + ONo + " and DNo = " + DNo);
            
            while(rs.next()){
                notlar[0] = String.valueOf(rs.getBigDecimal(1));
                notlar[1] = String.valueOf(rs.getBigDecimal(2));
                notlar[2] = rs.getString(3);
            }
            
        }
        
        return notlar;
    }
    
    public void OgrenciSil(String ONo) throws SQLException {
        if(conn != null) {
            PreparedStatement st = conn.prepareStatement("delete from ogrenci where ONo = " + ONo);
            st.executeUpdate();
        }
    }
    
    public void AkademisyenSil(String ANo) throws SQLException {
        if(conn != null) {
            PreparedStatement st = conn.prepareStatement("delete from akademisyen where ANo = " + ANo);
            st.executeUpdate();
        }
    }
    
    /*public Ogrenci GetOgrenci(String ONo) throws SQLException {
        Ogrenci ogrenci = null;
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select OAd, OSoyad, GNO, BNoO, OSifre from ogrenci where ONo = " + ONo);
            
            if(rs.next()) {
                ogrenci = new Ogrenci(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getString(5));
                return ogrenci;
            }
        }
        return ogrenci;
    }*/
    
    public Ogrenci GetOgrenci(String ONo) throws SQLException {
        Ogrenci ogrenci = null;
        if(conn != null) {
            CallableStatement st = conn.prepareCall("{CALL sp_getOgrenci(?)}");
            st.setInt(1, Integer.parseInt(ONo));
            ResultSet rs = st.executeQuery();
            
            if(rs.next()) {
                ogrenci = new Ogrenci(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getString(5));
                return ogrenci;
            }
        }
        return ogrenci;
    }
    
    public void OgrDersSec(String DNo, String BNo) throws SQLException {
        if(conn != null){
            PreparedStatement st = null;
            
            String s = "insert into ogrnot(DNoN, ONoN) values (?, ?)";
            st = conn.prepareStatement(s);
            
            st.setInt(1, Integer.parseInt(DNo));
            st.setInt(2, Integer.parseInt(BNo));
            
            st.execute();
        }
    }
    
    public Akademisyen GetAkademisyen(String ANo) throws SQLException {
        Akademisyen akademisyen = null;
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select BNoA, AAd, ASoyad, Unvan, ASifre from akademisyen where ANo = " + ANo);
            
            if(rs.next()) {
                akademisyen = new Akademisyen(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                return akademisyen;
            }
        }
        return akademisyen;
    }
    
    public void OgrenciGuncelle(String ONo, String Ad, String Soyad, float GNO, String Sifre) throws SQLException {
        if(conn != null) {
            PreparedStatement st = conn.prepareStatement("update ogrenci set OAd = ?, OSoyad = ?, GNO = ?, OSifre = ? where ONo = " + ONo);
            st.setString(1, Ad);
            st.setString(2, Soyad);
            st.setFloat(3, GNO);
            st.setString(4, Sifre);
            
            st.executeUpdate();
        }
    }
    
    public void AkademisyenGuncelle(String ANo, String Ad, String Soyad, String Unvan, String Sifre) throws SQLException {
        if(conn != null) {
            PreparedStatement st = conn.prepareStatement("update akademisyen set AAd = ?, ASoyad = ?, Unvan = ?, ASifre = ? where ANo = " + ANo);
            st.setString(1, Ad);
            st.setString(2, Soyad);
            st.setString(3, Unvan);
            st.setString(4, Sifre);
            
            st.executeUpdate();
        }
    }
    
    public boolean OgrenciAra(String ONo) throws SQLException {
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from ogrenci where ONo = " + ONo);
            
            if(rs.next())
                return true;
        }
        return false;
    }
    
    public void AkademisyenEkle(String No, String Ad, String Soyad, String Unvan, String FNo, String BNo, String Sifre) throws SQLException{
        if(conn != null) {
            PreparedStatement st = null;
            
            String s = "insert into akademisyen (ANo, AAd, ASoyad, Unvan, FNoA, BNoA, ASifre) values(?,?,?,?,?,?,?)";
            st = conn.prepareStatement(s);
            st.setInt(1, Integer.parseInt(No.trim()));
            st.setString(2, Ad);
            st.setString(3, Soyad);
            st.setString(4, Unvan);
            st.setInt(5, Integer.parseInt(FNo.trim()));
            st.setInt(6, Integer.parseInt(BNo.trim()));
            st.setString(7, Sifre);
            
            st.execute();
        }
    }
    
    
    
    public void OgrenciEkle(String No, String ad, String soyad, String DTarih, char Cinsiyet, String BNo, String Sifre) throws SQLException {
        if(conn != null) {
            PreparedStatement st = null;
            
            String s = "insert into ogrenci (ONo, OAd, OSoyad, DTarih, Cinsiyet, GNO, BNoO, OSifre) values(?,?,?,?,?,?,?,?)";
            st = conn.prepareStatement(s);
            st.setInt(1, Integer.parseInt(No.trim()));
            st.setString(2, ad);
            st.setString(3, soyad);
            st.setString(4, DTarih);
            st.setString(5, Character.toString(Cinsiyet));
            st.setFloat(6, 1);
            st.setInt(7, Integer.parseInt(BNo.trim()));
            st.setString(8, Sifre);
            
            st.execute();
        }
    }
    
    public String AkademisyenSayisi() throws SQLException {
        String sayi = "";
        
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select count(*) from akademisyen");
            
            if(rs.next()) {
                sayi = String.valueOf(rs.getInt(1));
            }
        }
        return sayi;
    }
    
    public String SinifMevcut(String BNo) throws SQLException {
        String sinifMevcut = "";
        
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select max(ONo) from ogrenci where BNoO = " + BNo);
            
            if(rs.next()) {
                sinifMevcut = String.valueOf(rs.getInt(1) + 1);
            }
        }
        return sinifMevcut;
    }
    
    public String[] OgrAlmadıgıDersler(String BNo, String ONo) throws SQLException{
        String[] dersler = null;
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select count(DISTINCT DNo) from ders, ogrenci where BNoD = BNoO and BNoD = "+ BNo 
                    +" and DNo not in (select DNoN from ogrnot where ONoN = " + ONo +")");
            
            if(rs.next())
                dersler = new String[rs.getInt(1)];
            
            st = conn.createStatement();
            rs = st.executeQuery("select DISTINCT DNo, DAd, DKod from ders, ogrenci where BNoD = BNoO and BNoD = "+ BNo 
                    +" and DNo not in (select DNoN from ogrnot where ONoN = " + ONo +")");
            
            int i = 0;
            while(rs.next()){
                dersler[i] = String.valueOf(rs.getInt(1)) + " - " + rs.getString(2) + " (" + rs.getString(3) +")";
                i++;
            }
        }
        
        return dersler;
    }
    
    public void DersEkle(String no, String ad, String kod, String kredi, String BNoD) throws SQLException {
        if(conn != null) {
            PreparedStatement st = null;
            
            String s = "insert into ders (DNo, DAd, DKod, Kredi, BNoD) values(?,?,?,?,?)";
            st = conn.prepareStatement(s);
            st.setInt(1, Integer.parseInt(no));
            st.setString(2, ad);
            st.setString(3, kod);
            st.setInt(4, Integer.parseInt(kredi));
            st.setInt(5, Integer.parseInt(BNoD));
            
            st.execute();
        }
    }
    
    public String DersSayisi() throws SQLException {
        String sayi = "";
        
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select count(*) from ders");
            
            if(rs.next()) {
                sayi = String.valueOf(rs.getInt(1) + 1);
            }
        }
        return sayi;
    }
    
    public String[] Fakulteler() throws SQLException{
        String[] fakulteler = null;
        
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select count(*) from fakulte");
            
            if(rs.next()) {
                fakulteler = new String[rs.getInt(1)];
            }
            st = conn.createStatement();
            rs = st.executeQuery("select FNo, FAd from fakulte");
            
            int i = 0;
            while(rs.next()) {
                fakulteler[i] = rs.getString("FNo") + " - " + rs.getString("FAd");
                i++;
            }
        }
        
        return fakulteler;
    }
    
    public String[] Bolumler(String FNo) throws SQLException{
        String[] bolumler = null;
        
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select count(*) from bolum where FNoB = " + FNo);
            
            if(rs.next()) {
                bolumler = new String[rs.getInt(1)];
            }
            st = conn.createStatement();
            rs = st.executeQuery("select BNo, BAd from bolum where FNoB = " + FNo);
            
            int i = 0;
            while(rs.next()) {
                bolumler[i] = rs.getString("BNo") + " - " + rs.getString("BAd");
                i++;
            }
        }
        
        return bolumler;
    }
    
    public String getAd(String No, String tableName) throws SQLException {
        String ad = "";
        String kod = "";
        if(tableName.toLowerCase().equals("ogrenci"))
            kod = "O";
        else if(tableName.toLowerCase().equals("akademisyen"))
            kod = "A";
        else if(tableName.toLowerCase().equals("yonetici"))
            kod = "Y";
            
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select " + kod +"Ad, " + kod + "Soyad from " + tableName + " where " + kod+ "No" +" = '" + No + "'");
            
            if(rs.next()) {
                ad = " " +rs.getString(kod + "Ad") + " " +rs.getString(kod + "Soyad");
            }
        }
        return ad;
    }
    
    public boolean LoginOgrenci(String username, String password) throws SQLException {
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Ogrenci where ONo = '" + username + "'");
            
            if(rs.next()){
                //System.out.println("Öğrenci Bulundu");
                if(rs.getString("OSifre").equals(password)){
                    //System.out.println("Giriş Başarılı");
                    No = username;
                    return true;
                }
                else{
                    //System.out.println("Giriş Başarısız");
                }
            }
            else{
                //System.out.println("Öğrenci Bulunamadı");
            }
        }
        return false;
    }
    
    public boolean LoginYonetici(String username, String password) throws SQLException {
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Yonetici where YNo = '" + username + "'");
            
            if(rs.next()){
                //System.out.println("Yönetici Bulundu");
                if(rs.getString("YSifre").equals(password)){
                    //System.out.println("Giriş Başarılı");
                    No = username;
                    return true;
                }
                else{
                    //System.out.println("Giriş Başarısız");
                }
            }
            else{
                //System.out.println("Yönetici Bulunamadı");
            }
        }
        return false;
    }
    
    public boolean LoginAkademisyen(String username, String password) throws SQLException {
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Akademisyen where ANo = '" + username + "'");
            
            if(rs.next()){
                //System.out.println("Akademisyen Bulundu");
                if(rs.getString("ASifre").equals(password)){
                    //System.out.println("Giriş Başarılı");
                    No = username;
                    return true;
                }
                else{
                    //System.out.println("Giriş Başarısız");
                    return false;
                }
            }
            else{
                //System.out.println("Akademisyen Bulunamadı");
                return false;
            }
        }
        return false;
    }

    public String[][] getTumOgrNotMatris(String BNo, String DNo) throws SQLException {
        String[][] ogrenciler = null;
        
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select count(*) from ogrenci, ders, ogrnot where ONo = ogrnot.ONoN and\n" +
                "ders.DNo = ogrnot.DNoN AND ogrenci.BNoO = ders.BNoD and ders.DNo = " + DNo);
            
            if(rs.next())
                ogrenciler = new String[rs.getInt(1)][5];
            
            st = conn.createStatement();
            rs = st.executeQuery("select ONo, OAd, OSoyad, Vize, Final, Harf from ogrenci, ders, ogrnot where ONo = ogrnot.ONoN and\n" +
                "ders.DNo = ogrnot.DNoN AND ogrenci.BNoO = ders.BNoD and ders.DNo = " + DNo);
            
            int i = 0;
            while(rs.next()){
                ogrenciler[i][0] = String.valueOf(rs.getInt(1));
                ogrenciler[i][1] = rs.getString(2) + " " + rs.getString(3);
                ogrenciler[i][2] = String.valueOf(rs.getBigDecimal(4));
                ogrenciler[i][3] = String.valueOf(rs.getBigDecimal(5));
                ogrenciler[i][4] = rs.getString(6);
                
                i++;
            }
        }
        
        return ogrenciler;
    }
    
    public String[][] getTekOgrNotMatris(String ONo) throws SQLException {
        String[][] notlar = null;
        
        if(conn != null){
            String s = "select DNo, DAd, DKod, Vize, Final, Harf from ders d, ogrnot n, ogrenci o where d.BNoD = o.BNoO and o.ONo = n.ONoN and d.DNo = n.DNoN and ONo = " + ONo;
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select count(*) from ders d, ogrnot n, ogrenci o where d.BNoD = o.BNoO and o.ONo = n.ONoN and d.DNo = n.DNoN and ONo = " + ONo);
            
            if(rs.next())
                notlar = new String[rs.getInt(1)][6];
            
            st = conn.createStatement();
            rs = st.executeQuery("select DNo, DAd, DKod, Vize, Final, Harf from ders d, ogrnot n, ogrenci o where d.BNoD = o.BNoO and o.ONo = n.ONoN and d.DNo = n.DNoN and ONo = " + ONo);
            
            int i = 0;
            while(rs.next()){
                notlar[i][0] = String.valueOf(rs.getInt(1));
                notlar[i][1] = rs.getString(2);
                notlar[i][2] = rs.getString(3);
                notlar[i][3] = String.valueOf(rs.getInt(4));
                notlar[i][4] = String.valueOf(rs.getInt(5));
                notlar[i][5] = rs.getString(6);
                
                i++;
            }
        }
        
        return notlar;
    }
    
    public String[] DersListesi(String BNo) throws SQLException {
        String[] dersler = null;
        
        if(conn != null) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select count(*) from ders where BNoD = " + BNo);
            
            if(rs.next()) {
                dersler = new String[rs.getInt(1)];
            }
            
            st = conn.createStatement();
            rs = st.executeQuery("select DNo, DAd, DKod from ders where BNoD = " + BNo);
            
            int i = 0;
            while(rs.next()) {
                dersler[i] = String.valueOf(rs.getInt(1)) + " - " + rs.getString(2) + " (" + rs.getString(3) + ")";
                i++;
            }
        }
        return dersler;
    }
}