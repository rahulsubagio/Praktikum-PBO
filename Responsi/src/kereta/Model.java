package kereta;

import java.sql.*;
import javax.swing.*;

public class Model {
    static final String jdbcDriver = "com.mysql.jdbc.Driver";
    static final String DBurl = "jdbc:mysql://localhost/responsi_pbo";
    static final String DBusername = "root";
    static final String DBpassword = "";
    Connection koneksi;
    Statement statement;
    ResultSet resultSet;
    
    public Model() {
        try {
            Class.forName(jdbcDriver);
            koneksi = DriverManager.getConnection(DBurl, DBusername, DBpassword);
            System.out.println("Koneksi Berhasil");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public String getIDKeretaFromNama(String nama){
        String data = null;
        try {
            String query = "SELECT * FROM kereta where namaKereta = '"+nama+"'";
            resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                data = resultSet.getString("idKereta");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }
    
    public int getBanyakDataKereta(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from kereta";
            ResultSet setResult = statement.executeQuery(query);
            while(setResult.next()){
                jmlData++;
            }
            return jmlData;
        } catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public int getBanyakDataTiket(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from tiket";
            ResultSet setResult = statement.executeQuery(query);
            while(setResult.next()){
                jmlData++;
            }
            return jmlData;
        } catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    //Bagian Kereta
    public String[][] readKereta(){
        String data[][] = new String[getBanyakDataKereta()][3];
        try {
            String query = "SELECT * from kereta";
            resultSet = statement.executeQuery(query);
            int p=0;
            while(resultSet.next()){
                data[p][0] = resultSet.getString("idKereta");
                data[p][1] = resultSet.getString("namaKereta");
                data[p][2] = resultSet.getString("kelasKereta");
                p++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        }
        return data;
    }
    
    public void insertKereta(String idKereta, String namaKereta, String kelasKereta){
        try {
            System.out.println(idKereta+namaKereta+kelasKereta);
            String query = "INSERT INTO kereta VALUES ('"+idKereta+"','"+namaKereta+"','"+kelasKereta+"')";
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public String[] readKeretaBox(){
        String data[] = new String[getBanyakDataKereta()];
        int i=0;
        try{
            String query = "Select namaKereta from kereta";
            ResultSet setResult = statement.executeQuery(query);
            while(setResult.next()){
                data[i] = setResult.getString("namaKereta");
                i++;
            }
            
        } catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        }
        return data;
    }
    
    public void editKereta(int baris,String idKereta,String namaKereta,String kelasKereta){
        try {
            String query = "UPDATE kereta SET namaKereta ='"+namaKereta+"', kelasKereta = '"+kelasKereta+"' where idKereta = '"+idKereta+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dirubah");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Gagal Diedit!", "Hasil", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteKereta(String idKereta){
        try {
            String query = "DELETE from kereta where idKereta = '"+idKereta+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus!", "Hasil", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Bagian Tiket
    
    public String[][] readTiket(){
        String data[][] = new String[getBanyakDataTiket()][4];
        try {
            String query = "SELECT * from tiket";
            resultSet = statement.executeQuery(query);
            int p=0;
            while(resultSet.next()){
                data[p][0] = resultSet.getString("nama");
                data[p][1] = resultSet.getString("jenisKelamin");
                data[p][2] = resultSet.getString("stasiunTujuan");
                data[p][3] = resultSet.getString("idKereta");
                p++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        }
        return data;
    }
    
    public void insertTiket(String nama, String jenisKelamin, String stasiunTujuan, String namaKereta){
        try {
            System.out.println(nama+jenisKelamin+stasiunTujuan+namaKereta);
            String idKereta = getIDKeretaFromNama(namaKereta);
            System.out.println(idKereta);
            String query = "INSERT INTO tiket VALUES ('"+nama+"','"+jenisKelamin+"','"+stasiunTujuan+"','"+idKereta+"')";
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        }
    }
}
