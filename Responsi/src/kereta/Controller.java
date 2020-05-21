package kereta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class Controller {
    Model model;
    View view;

//    private Object[][] tiket = new Object [model.getBanyakDataTiket()][4];
//    private Object[][] kereta = new Object[model.getBanyakDataKereta()][3];

    public Controller(Model model,View view) {
        this.model = model;
        this.view = view;
        int banyak = 0;
        String listKereta[] = model.readKeretaBox();
        readDataKereta();
        readTiketKereta();
        
        view.namaKereta = model.readKeretaBox();
        view.tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                view.getContentPane().removeAll();
                view.refresh();
                new MVC();
            }
        });
        
        view.tombolDaftarKereta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                view.getContentPane().removeAll();
                view.refresh();
                showRequest(view.daftarKereta());
            }
        });
        view.tombolDaftarTiket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                view.namaKereta = model.readKeretaBox();
                view.getContentPane().removeAll();
                view.refresh();
                showRequest(view.daftarTiket());
            }
        });
        
//        Bagian Kereta

        view.tabelKereta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                String data[][] = model.readKereta();
                int row = view.tabelKereta.getSelectedRow();
//                int col = view.tabelKereta.getSelectedColumn();
                view.textIdKereta.setEditable(false);
                view.baris = row;
                view.textIdKereta.setText(data[row][0]);                
                view.textNamaKereta.setText(data[row][1]);
                view.textKelasKereta.setText(data[row][2]);
            }
        });

        view.tombolTambahKereta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String idKereta = view.getIdKereta();
                String namaKereta = view.getNamaKereta();
                String kelasKereta = view.getKelasKereta();
                model.insertKereta(idKereta,namaKereta,kelasKereta);
                readDataKereta();
            }
        });
        
        view.tombolEditKereta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Baris = "+view.getBaris());
                if(view.getBaris()<0){
                    JOptionPane.showMessageDialog(null, "Pilih Data yang mau diedit!");
                }
                else{
                    String data[] = new String[4];
                    String idKereta = view.getIdKereta();
                    String namaKereta = view.getNamaKereta();
                    String kelasKereta = view.getKelasKereta();
                    model.editKereta(view.baris,idKereta,namaKereta,kelasKereta);
                    readDataKereta();
                }
            }
        });
        
        view.tombolHapusKereta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Baris = "+view.getBaris());
                if(view.getBaris()<0){
                    JOptionPane.showMessageDialog(null, "Pilih Data yang mau dihapus!");
                }
                else{
                    String data = view.getIdKereta();
                    model.deleteKereta(data);
                    readDataKereta();
                }
            }
        });
        
        view.tombolBatalKereta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                clearTextFieldKereta();
            }
        });
        
//        Bagian Tiket

        view.tombolTambahTiket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = view.getNama();
                String jenisKelamin = view.getKelamin();
                String stasiunTujuan = view.getStasiun();
                String namaKereta = view.getKereta();
                model.insertTiket(nama, jenisKelamin, stasiunTujuan, namaKereta);
                readTiketKereta();
            }
        });

        view.tombolBatalTiket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                clearTextFieldTiket();
            }
        });
    }
    
    //Bagian Kereta
    
    public void readDataKereta(){
        try {
            String data[][] = new String[model.getBanyakDataKereta()][3];
            data = model.readKereta();
            view.tabelKereta.setModel((new JTable(data,view.kolomKereta)).getModel());
        } catch (IllegalArgumentException i) {
            System.err.println(i); 
        }
    }
    
    //Bagian Tiket
    
    public void readTiketKereta(){
        try {
            String data[][] = new String[model.getBanyakDataTiket()][4];
            data = model.readTiket();
            view.tabelTiket.setModel((new JTable(data,view.kolomTiket)).getModel());
        } catch (IllegalArgumentException i) {
            System.err.println(i); 
        }
    }
    
    public void showRequest (JFrame frame) {
        frame.setVisible(true);
    }
    
    public void clearTextFieldTiket(){
        view.textNama.setText("");
    }
    
    public void clearTextFieldKereta(){
        view.baris = -1;
        view.textIdKereta.setEditable(true);
        view.textIdKereta.setText("");
        view.textNamaKereta.setText("");
        view.textKelasKereta.setText("");
    }
}
