
import javax.swing.ImageIcon;


public class Meowth extends Pokemon{
    
    private int hasarPuani = 40;
 
  
    
    public Meowth() {
    
        hasarPuani = 40;
    }

    public Meowth(String pokemonAdi, String pokemonTip, int pokemonID) {
        super(pokemonAdi, pokemonTip, pokemonID);
    }

  


    @Override
    public void hasarPuaniGoster() {
        System.out.println(getHasarPuani());
    }

  
    
    public int getHasarPuani() {
        return hasarPuani;
    }


    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }



 

    @Override
    public boolean kullanildiMi1(int a) {
       if(a == 1){
              System.out.println("Kullanilmistir");
       return true;
      }
       return false;
        
    }
    
}
