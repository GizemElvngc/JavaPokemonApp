
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {

   
    
    public static void main(String[] args){
        
        Anasayfa menü = new Anasayfa();
        menü.setVisible(true);
        
      
       System.out.println("      Oyun Başladı..");
       String islemler = "1 - Bilgisayar * Oyuncu "
                      + "\n2 - Bilgisayar * Bilgisayar\n ------------------------------------------------";
        
       System.out.println(islemler);
        
       Scanner scanner = new Scanner(System.in);
       
         int secim = scanner.nextInt();
         
       if (secim == 1)
       {
        System.out.println("Oyuncu Bilgisayar karsilasmasi: "
                            + "\n -----------------------------------------------------------");
           
        BilgisayarOyuncusu Bilgisayar1 = new BilgisayarOyuncusu();
        Bilgisayar1.setOyuncuAdi("Bilgisayar 1");
        Bilgisayar1.setOyuncuID(0);
        Bilgisayar1.setSkor(0);
    
        InsanOyuncusu Oyuncu1 = new InsanOyuncusu(); 
        Oyuncu1.setOyuncuAdi("Oyuncu 1");
        Oyuncu1.setOyuncuID(0);
        Oyuncu1.setSkor(0);
      
         
         int elsayisi=0;
         
         Bilgisayar1.kartSec(); // bilgisayar kart seçti
         Oyuncu1.kartlar =  Bilgisayar1.kartlar; // ilk başta 10 karttan 3'ünü bilgisayar seçti. Destede kalan 7 kartı oyuncunun seçeceği kartlara atayarak aynı kartı seçmesini engelliyoruz.
         Oyuncu1.kartSec(); // oyuncu ilk başta 7 karttan 3'ünü seçiyor
         
         
         
         while (elsayisi<5) // oyun toplamda 5 el oynanır başlangıçta oyuncularda 3'er kart var destede 4 kart var.
         {
             
                 System.out.println("\n -----------------------------------------------------------"
                            + "\nSkorboard: " + (elsayisi+1) + ". el oynanıyor"
                            + "Bilgisayar : " + Bilgisayar1.skorGoster() + " - Oyuncu:" + Oyuncu1.skorGoster()
                            + "\n -----------------------------------------------------------");
         elsayisi++;
         

              
         
      
         System.out.println("      Kartlardan birini seciniz!");
         scanner = new Scanner(System.in);
       
         int hamle = scanner.nextInt();
         int rastgelesayi;
         
             if (hamle == 1) // oyuncu 1. kartı seçmişse
             {
                Random r = new Random(); 
                if (Bilgisayar1.kartListesi.size()!=1) 
                 {
                   rastgelesayi = r.nextInt(Bilgisayar1.kartListesi.size()-1); // bilgisayar rastgele bir kart seçiyor.
                 }
               else
               {
                   rastgelesayi=0; // bilgisayarın elinde 1 kart kalmışsa zaten o kartı seçmek zorunda
               }
            
                            
                       //bilgisayarın ve oyuncunun seçtiği kartlar aşağıda gösteriliyor.    
          System.out.println(" Bilgisayar 1:" + Bilgisayar1.kartListesi.get(rastgelesayi).getPokemonAdi() + " Hasar Puanı:" + Bilgisayar1.kartListesi.get(rastgelesayi).getHasarPuani());      
          System.out.println(" Oyuncu 1:" + Oyuncu1.kartListesi.get(0).getPokemonAdi() + " Hasar Puanı:" + Oyuncu1.kartListesi.get(0).getHasarPuani());      
          
          
          if (Bilgisayar1.kartListesi.get(rastgelesayi).getHasarPuani()>Oyuncu1.kartListesi.get(0).getHasarPuani())
           {
               Bilgisayar1.setSkor(Bilgisayar1.getSkor()+5);
           }
           else if (Bilgisayar1.kartListesi.get(rastgelesayi).getHasarPuani()<Oyuncu1.kartListesi.get(0).getHasarPuani())
           {
               Oyuncu1.setSkor(Oyuncu1.getSkor()+5);
           }
 
          Oyuncu1.kartListesi.remove(0);    // oynanana kartlar listelerden çıkarılıyor.
          Bilgisayar1.kartListesi.remove(rastgelesayi);
           
         
          

             }
       
       else if (hamle == 2)
       {
          
                       
                Random r = new Random();
                rastgelesayi = r.nextInt(Bilgisayar1.kartListesi.size()-1);
   
                
                           
          System.out.println(" Bilgisayar İsim:" + Bilgisayar1.kartListesi.get(rastgelesayi).getPokemonAdi() + " Hasar Puanı:" + Bilgisayar1.kartListesi.get(rastgelesayi).getHasarPuani());      
          System.out.println(" Oyuncu İsim:" + Oyuncu1.kartListesi.get(1).getPokemonAdi() + " Hasar Puanı:" + Oyuncu1.kartListesi.get(1).getHasarPuani());      
                     if (Bilgisayar1.kartListesi.get(rastgelesayi).getHasarPuani()>Oyuncu1.kartListesi.get(1).getHasarPuani())
           {
               Bilgisayar1.setSkor(Bilgisayar1.getSkor()+5);
           }
           else if (Bilgisayar1.kartListesi.get(rastgelesayi).getHasarPuani()<Oyuncu1.kartListesi.get(1).getHasarPuani())
           {
               Oyuncu1.setSkor(Oyuncu1.getSkor()+5);
           }
          Oyuncu1.kartListesi.remove(1);
          Bilgisayar1.kartListesi.remove(rastgelesayi);
          
      
       }
       else if (hamle == 3)
       {
          

                Random r = new Random();
                rastgelesayi = r.nextInt(Bilgisayar1.kartListesi.size()-1);
            

                
                           
          System.out.println(" Bilgisayar İsim:" + Bilgisayar1.kartListesi.get(rastgelesayi).getPokemonAdi() + " Hasar Puanı:" + Bilgisayar1.kartListesi.get(rastgelesayi).getHasarPuani());      
          System.out.println(" Oyuncu İsim:" + Oyuncu1.kartListesi.get(2).getPokemonAdi() + " Hasar Puanı:" + Oyuncu1.kartListesi.get(2).getHasarPuani());      
          
           if (Bilgisayar1.kartListesi.get(rastgelesayi).getHasarPuani()>Oyuncu1.kartListesi.get(2).getHasarPuani())
           {
               Bilgisayar1.setSkor(Bilgisayar1.getSkor()+5);
           }
           else if (Bilgisayar1.kartListesi.get(rastgelesayi).getHasarPuani()<Oyuncu1.kartListesi.get(2).getHasarPuani())
           {
               Oyuncu1.setSkor(Oyuncu1.getSkor()+5);
           }
          Oyuncu1.kartListesi.remove(2);
          Bilgisayar1.kartListesi.remove(rastgelesayi);
          
      
       }
          if (elsayisi<6)
          {
          Bilgisayar1.kartSec();
          Oyuncu1.kartlar =  Bilgisayar1.kartlar;
          Oyuncu1.kartSec();
          } 
       }
              
      System.out.println("\n //////////////////////////Sonuç/////////////////////////////////////"
                            + "\n "
                            + "Bilgisayar : " + Bilgisayar1.skorGoster() + " - Oyuncu:" + Oyuncu1.skorGoster()
                            + "\n -----------------------------------------------------------");
          
          
          
          
          
       } 
                 if (secim == 2){
                     
                      System.out.println("Bilgisayar Bilgisayar karsilasmasi: "
                            + "\n -----------------------------------------------------------");
                     
                     
                     
                      BilgisayarOyuncusu Bilgisayar1 = new BilgisayarOyuncusu();
                      Bilgisayar1.setOyuncuAdi("Bilgisayar 1");
                      Bilgisayar1.setOyuncuID(0);
                      Bilgisayar1.setSkor(0);
                     
                     
                      BilgisayarOyuncusu Bilgisayar2 = new BilgisayarOyuncusu();
                      Bilgisayar2.setOyuncuAdi("Bilgisayar 2");
                      Bilgisayar2.setOyuncuID(0);
                      Bilgisayar2.setSkor(0);
                     
                      
                     int tursayisi = 0;
                     
                     Bilgisayar1.kartSec();
                     Bilgisayar2.kartlar =  Bilgisayar1.kartlar;
                     Bilgisayar2.kartSec();
                     
                     while(tursayisi <5){
                         
                         
                           System.out.println("\n -----------------------------------------------------------"
                            + "\nSkorboard: " + (tursayisi+1) + ". el oynanıyor"
                            + "Bilgisayar1 : " + Bilgisayar1.skorGoster() + " - Bilgisayar2 :" + Bilgisayar2.skorGoster()
                            + "\n -----------------------------------------------------------");
                         tursayisi++;
                         
                      int rsayi;
                      Random r2 = new Random(); 
                      
                if (Bilgisayar1.kartListesi.size()!=1) 
                 {
                   rsayi = r2.nextInt(Bilgisayar1.kartListesi.size()-1); // bilgisayar rastgele bir kart seçiyor.
                 }
               else
               {
                   rsayi=0; // bilgisayarın elinde 1 kart kalmışsa zaten o kartı seçmek zorunda
               }
                      
                        
                    
                         
          System.out.println(" Bilgisayar 1:" + Bilgisayar1.kartListesi.get(rsayi).getPokemonAdi() + " Hasar Puanı:" + Bilgisayar1.kartListesi.get(rsayi).getHasarPuani());      
          System.out.println(" Bilgisayar 2:" + Bilgisayar2.kartListesi.get(0).getPokemonAdi() + " Hasar Puanı:" + Bilgisayar2.kartListesi.get(0).getHasarPuani()); 
          
           if (Bilgisayar1.kartListesi.get(rsayi).getHasarPuani()>Bilgisayar2.kartListesi.get(0).getHasarPuani())
           {
               Bilgisayar1.setSkor(Bilgisayar1.getSkor()+5);
           }
           else if (Bilgisayar1.kartListesi.get(rsayi).getHasarPuani()<Bilgisayar2.kartListesi.get(0).getHasarPuani())
           {
               Bilgisayar2.setSkor(Bilgisayar2.getSkor()+5);
           }
 
          Bilgisayar2.kartListesi.remove(0);    // oynanana kartlar listelerden çıkarılıyor.
          Bilgisayar1.kartListesi.remove(rsayi);
           
                      
           if (tursayisi<6)
          {
          Bilgisayar1.kartSec();
          Bilgisayar2.kartlar =  Bilgisayar1.kartlar;
          Bilgisayar2.kartSec();
          } 
                     }
      
                     
                       System.out.println("\n //////////////////////////Sonuç/////////////////////////////////////"
                            + "\n "
                            + "Bilgisayar : " + Bilgisayar1.skorGoster() + " - Bilgisayar:" + Bilgisayar2.skorGoster()
                            + "\n -----------------------------------------------------------");
          
                     
                 }
       
       
       }
}  
          
          
          
          
