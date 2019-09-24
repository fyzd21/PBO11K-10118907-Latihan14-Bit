/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan14.bit;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan bit
 * 
 */
public class PBO11K10118907Latihan14Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;
        
        c = a & b;
        System.out.println("a  b = "+c);
        
        c = a | b;
        System.out.println("a | b = "+c);
        
        c = a ^ b;
        System.out.println("a ^ b = "+c);
        
        c = ~a;
        System.out.println("~a = "+c);
        
        c = a << 2;
        System.out.println("a << 2 = "+c);
        
        c = a >> 2;
        System.out.println("a >> 2 = "+c);
    }
    
}
