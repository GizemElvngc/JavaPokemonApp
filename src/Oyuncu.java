//Abstract Sınıf
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Oyuncu {
    
    private int oyuncuID;
    private String oyuncuAdi;
    private int skor;
    public List<Pokemon> kartlar =new ArrayList<>();
    
   
    
    public Oyuncu(){
     
      oyuncuAdi = "belirtilmedi" ;
      oyuncuID = 0;    
      skor = 0;
       kartlar.add(new Pikachu("pikachu","elektrik",0)) ;
       kartlar.add(new Bulbasaur("bulbasaur","cim",1));
       kartlar.add(new Charmander("charmander","ates",2));
       kartlar.add(new Squirtle("squirtle","su",3));
       kartlar.add(new Zubat("zubat","hava",4));
       kartlar.add(new Psyduck("psyduck","su",5));
       kartlar.add(new Snorlax("snorlax","normal",6));
       kartlar.add(new Butterfree("butterfree","hava",7));
       kartlar.add(new Jigglypuff("jigglypuff","ses",8));
       kartlar.add(new Meowth("meowth","normal",9));
      
    }
    
    public Oyuncu(int oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }

   
    
   public void kartListesi(){
        
       
        
        
    }
        
     
 
   
  
    public int skorGoster(){
        return this.skor;
        
    }
        
    
        
           
  
    public  void kartSec(){
        
        System.out.println("Kart seciniz");
    
    }
    public int getOyuncuID() {
        return oyuncuID;
    }

   
    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

 
    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

 
    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

   
    public int getSkor() {
        return skor;
    }

   
    public void setSkor(int skor) {
        this.skor = skor;
    }
    
    
    
}
