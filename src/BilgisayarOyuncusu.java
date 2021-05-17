import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BilgisayarOyuncusu extends Oyuncu {

  
   public List<Pokemon> kartListesi =new ArrayList<>();

    
    public BilgisayarOyuncusu(){
    super();
    }

      
    public BilgisayarOyuncusu(List<Pokemon> kartListesi,int oyuncuID, String oyuncuAdi, int Skor) {
        
        super(oyuncuID, oyuncuAdi, Skor);
        this.kartListesi = kartListesi;
    }
        
     @Override
    public void kartSec() {
   
       int bilgisayarkartsayisi=this.kartListesi.size();
       int kartsayisi=this.kartlar.size();
       //System.out.println(bilgisayarkartsayisi);
      // System.out.println(kartsayisi);
       
        int sayac = 0; // kaç tane kart seçeceğini bu değişkenle sayılıyor
        int sayi; // destedeki kart sayısına göre rasgele sayı üretmek için kullanılan değişken
        Random r = new Random();

         while(kartsayisi>0 && sayac < (3-bilgisayarkartsayisi)) // destedeki kart sayısı bitmemişken ve bilgisayar oyuncusunun elindeki kart sayısı 3'ten azken
     { 
        sayi = r.nextInt(kartlar.size()); //1'le destedeki kart sayısı arasında rastgele sayı üretiliyor
        this.kartListesi.add(kartlar.get(sayi)); //desteden seçilen kart bilgisayar kartlistesine ekleniyor.
        kartlar.remove(sayi); // destedeki kart listesinden seçilen kart siliniyor.
        sayac++;  
 
     } 
       // bilgisayar oyuncusunun kartları******************************
         /*this.kartListesi.forEach(Pokemon ->{
          System.out.println(" İsim:" + Pokemon.getPokemonAdi() + " Hasar Puanı:" + Pokemon.getHasarPuani());      
        });*/
         
    }

  
    
    
    
}
