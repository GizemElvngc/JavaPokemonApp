import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InsanOyuncusu extends Oyuncu{

        
    public List<Pokemon> kartListesi =new ArrayList<>();

    public InsanOyuncusu(){
    super();
    }
    
    public InsanOyuncusu(List<Pokemon> kartListesi, int oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);
        this.kartListesi = kartListesi;
    }

      @Override
    public void kartSec() {
       int insankartsayisi=this.kartListesi.size();
       int kartsayisi=this.kartlar.size();
        int sayac = 0;
         int sayi;
         Random r = new Random();

         while(kartsayisi>0 && sayac < 3-insankartsayisi) 
     { 
        sayi = r.nextInt(kartlar.size());
       // System.out.println(sayi);*/
        this.kartListesi.add(kartlar.get(sayi));
        kartlar.remove(sayi);
        sayac++;  
 
     } 
        
        // kartlar ekranda listeleniyor.
         this.kartListesi.forEach(Pokemon ->{ 
             System.out.println((kartListesi.indexOf(Pokemon)+1) + " - " + Pokemon.getPokemonAdi() + " Hasar Puanı:" + Pokemon.getHasarPuani());      
        }); 
         
    }

}
