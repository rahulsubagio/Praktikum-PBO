package kereta;
import java.awt.Dimension;
import javax.swing.table.*;
import javax.swing.*;
import java.awt.*;

public class View extends JFrame{
    JFrame currentFrame;
    Dimension dimensiMain;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    JPanel panel1 = new JPanel();
    JButton tombolKembali = new JButton("Kembali");
    JLabel titleLabel = new JLabel("Jasa Beli Tiket Kereta");
    JButton tombolDaftarKereta = new JButton("Daftar Kereta");
    JButton tombolDaftarTiket = new JButton("Daftar Tiket");
    
    public View() {
        dimensiMain = new Dimension(850,650);
        tableModel = new DefaultTableModel(kolomKereta,0);
        tabelKereta = new JTable(tableModel);
        tableModel = new DefaultTableModel(kolomTiket,0);
        tabelTiket = new JTable(tableModel);
        mainView();
    }
    
    public JFrame mainView(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(panel1);
        panel1.setSize(dimensiMain);
        panel1.setLayout(null);
        panel1.setBorder(BorderFactory.createLineBorder(Color.yellow));
        panel1.add(titleLabel); titleLabel.setBounds(350,50,300,300); titleLabel.setFont(new Font("Times New Roman",Font.BOLD,30));
        panel1.add(tombolDaftarKereta); tombolDaftarKereta.setBounds(250,300,200,200);
        panel1.add(tombolDaftarTiket); tombolDaftarTiket.setBounds(500,300,200,200);
        return currentFrame;
    }
    
        //Bagian Daftar Tiket
    JPanel panelTiket = new JPanel();
    JLabel labelNama = new JLabel("Nama : ");
    JLabel labelJK = new JLabel("Jenis Kelamin : ");
    JLabel labelStasiun = new JLabel("Stasiun Tujuan : ");
    JLabel labelKereta = new JLabel("Kereta : ");
    JTextField textNama = new JTextField();
    String kelamin[] = {"Laki-laki","Perempuan"};
    JComboBox<String> jenisKelamin = new JComboBox<>(kelamin);
    String tujuan[] = {"Tugu Jogja","Lempuyungan","Maguwo"};
    JComboBox<String> tujuanStasiun = new JComboBox<>(tujuan);
    String namaKereta[];
    JComboBox<String> listKereta;
    JTable tabeltiket;
    JButton tombolTambahTiket = new JButton("Tambah");
    JButton tombolBatalTiket = new JButton("Batal");

    
    public JFrame daftarTiket(){
        listKereta = new JComboBox<>(namaKereta);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(panelTiket);
        panelTiket.setLayout(null);
        panelTiket.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelTiket.setSize(dimensiMain);
//        panelKereta.setBackground(Color.blue);
        panelTiket.add(tombolKembali); tombolKembali.setBounds(10,10,100,20);
        panelTiket.add(labelNama); labelNama.setBounds(60,50,50,20);
        panelTiket.add(labelJK);labelJK.setBounds(60,70,120,20);
        panelTiket.add(labelStasiun);labelStasiun.setBounds(60,90,120,20);
        panelTiket.add(labelKereta);labelKereta.setBounds(60,110,120,20);
        panelTiket.add(textNama); textNama.setBounds(180,50,140,20);
        panelTiket.add(jenisKelamin); jenisKelamin.setBounds(180,70,140,20);
        panelTiket.add(tujuanStasiun); tujuanStasiun.setBounds(180,90,140,20);
        panelTiket.add(listKereta); listKereta.setBounds(180,110,140,20);
        panelTiket.add(tombolTambahTiket);tombolTambahTiket.setBounds(350,50,100,20);
        panelTiket.add(tombolBatalTiket);tombolBatalTiket.setBounds(350,70,100,20);
        scrollPane = new JScrollPane(tabelTiket);
        panelTiket.add(scrollPane);
        scrollPane.setBounds(40,200,400,400);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        return currentFrame;
    }
        //Bagian Daftar Kereta
    JPanel panelKereta = new JPanel();
    String[] kolomTiket = {"Nama","Jenis Kelamin","Stasiun","Kereta"};
    JTable tabelTiket;
    JLabel labelIdKereta = new JLabel("ID Kereta : ");
    JLabel labelNamaKereta = new JLabel("Nama Kereta : ");
    JLabel labelKelasKereta = new JLabel("Kelas : ");
    JTextField textIdKereta = new JTextField();
    JTextField textNamaKereta = new JTextField();
    JTextField textKelasKereta = new JTextField();
    JButton tombolTambahKereta = new JButton("Tambah");
    JButton tombolEditKereta = new JButton("Edit");
    JButton tombolHapusKereta = new JButton("Hapus");
    JButton tombolBatalKereta = new JButton("Batal");
    int baris=-1;
    
    String[] kolomKereta = {"ID Kereta","Nama Kereta","Kelas"};
    JTable tabelKereta;
    
    public JFrame daftarKereta(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(panelKereta);
        panelKereta.setLayout(null);
        panelKereta.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelKereta.setSize(dimensiMain);
        panelKereta.add(tombolKembali); tombolKembali.setBounds(10,10,100,20);
        panelKereta.add(tombolKembali); tombolKembali.setBounds(10,10,100,20);
        panelKereta.add(labelIdKereta); labelIdKereta.setBounds(60,50,100,20);
        panelKereta.add(labelNamaKereta);labelNamaKereta.setBounds(60,70,120,20);
        panelKereta.add(labelKelasKereta);labelKelasKereta.setBounds(60,90,120,20);
        panelKereta.add(textIdKereta); textIdKereta.setBounds(180,50,140,20);
        panelKereta.add(textNamaKereta); textNamaKereta.setBounds(180,70,140,20);
        panelKereta.add(textKelasKereta); textKelasKereta.setBounds(180,90,140,20);
        panelKereta.add(tombolTambahKereta);tombolTambahKereta.setBounds(350,50,100,20);
        panelKereta.add(tombolEditKereta);tombolEditKereta.setBounds(350,70,100,20);
        panelKereta.add(tombolHapusKereta);tombolHapusKereta.setBounds(350,90,100,20);
        panelKereta.add(tombolBatalKereta);tombolBatalKereta.setBounds(350,110,100,20);
        scrollPane = new JScrollPane(tabelKereta);
        panelKereta.add(scrollPane);
        scrollPane.setBounds(40,200,400,400);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        return currentFrame;
    }
    
    public void refresh(){
        dispose();
    }
    
    public int getBaris(){
        return baris;
    }
    
    public String getNama(){
        return textNama.getText();
    }
    
    public String getKelamin(){
        return jenisKelamin.getSelectedItem().toString();
    }
    
    public String getStasiun(){
        return tujuanStasiun.getSelectedItem().toString();
    }
    
    public String getKereta(){
        return listKereta.getSelectedItem().toString();
    }
    
    public String getIdKereta(){
        return textIdKereta.getText();
    }
    
    public String getNamaKereta(){
        return textNamaKereta.getText();
    }
    
    public String getKelasKereta(){
        return textKelasKereta.getText();
    }
    
}
