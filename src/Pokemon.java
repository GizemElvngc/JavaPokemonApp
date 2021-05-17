
import javax.swing.ImageIcon;

public class Pokemon {
    
    private String pokemonAdi;
    private String pokemonTip;
    private int    pokemonID;
    private int    hasarPuani;
  
    
    public Pokemon(){
        
      pokemonAdi ="belirtilmedi" ;
      pokemonTip ="belirtilmedi" ;
      pokemonID = 0;  
    }

    public Pokemon(String pokemonAdi, String pokemonTip, int pokemonID) {
        this.pokemonAdi = pokemonAdi;
        this.pokemonTip = pokemonTip;
        this.pokemonID = pokemonID;
       
       
    }



    
    public String getPokemonAdi() {
        return pokemonAdi;
    }

    public void setPokemonAdi(String pokemonAdi) {
        this.pokemonAdi = pokemonAdi;
    }

    public String getPokemonTip() {
        return pokemonTip;
    }

    public void setPokemonTip(String pokemonTip) {
        this.pokemonTip = pokemonTip;
    }

    
    public int getPokemonID() {
        return pokemonID;
    }

   
    public void setPokemonID(int pokemonID) {
        if(pokemonID < 0){
        this.pokemonID = 0;
        }
        else{
        this.pokemonID = pokemonID;
        }
    }

   
  

    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    
 
      public void hasarPuaniGoster(){
          
          System.out.println("hasarPuani ");
      }
    
      public boolean kullanildiMi1(int a){
       if(a == 1){
              System.out.println("Kullanilmistir");
       return true;
      }
       return false;
      }
  
   
 
      
}
    

