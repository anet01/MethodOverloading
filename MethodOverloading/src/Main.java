/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Berkay
 */
public class Main {
    public static void skorhesapla(String oyuncu,int skor)
    {
        System.out.println(oyuncu+" isimli oyuncunun "+skor+" puanı var.");
    }
    
     public static void skorhesapla(int skor)
    {
        System.out.println("İsimsiz oyuncunun "+skor+" puanı var.");
    }
     
      public static void skorhesapla(String oyuncu)
    {
        System.out.println(oyuncu+" isimli oyuncunun hiç puanı yok.");
    }
    
    public static void main(String[] args) {
        
        skorhesapla("Mehmet",1000);
        skorhesapla("Ali");
        skorhesapla(1200);
        
       
    }
    
}
