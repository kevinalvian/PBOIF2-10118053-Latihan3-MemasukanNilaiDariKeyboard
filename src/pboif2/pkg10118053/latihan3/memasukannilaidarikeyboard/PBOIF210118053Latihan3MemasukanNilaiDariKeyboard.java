/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118053.latihan3.memasukannilaidarikeyboard;
import java.util.Scanner

/**
 *
 * @author 
 * NAMA : Kevin Alvian
 * KELAS : IF2
 * NIM : 10118053
 */
public class PBOIF210118053Latihan3MemasukanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);

    }
    
}
