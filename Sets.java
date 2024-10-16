public class Sets extends Lego{

// Theme of Lego Sets
  
  private String StarWars;
  private String Marvel;

  public Sets(){
    super();
    StarWars = "16";
    Marvel = "8";
  }


  public Sets(double price, int amount, String StarWars, String Marvel){
    super(price, amount);
    this.StarWars = StarWars;
    this.Marvel = Marvel;
  }


public String getStarWars(){
  return StarWars;
}

  public String getMarvel(){
    return Marvel;
  }


  public void setStarWars(String newStarWars){
    StarWars = newStarWars;
  }

  public void setMarvel(String newMarvel){
    Marvel = newMarvel;
  }

public String toString(){
  return "StarWars: " + starwars + "\nMarvel: " + marvel + "\n" + super.toString();
}
  
}