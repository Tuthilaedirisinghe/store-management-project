public class Age extends Lego{

// Age of Lego set based on theme
  
  String Under8;
  String Over8;

  public Under8(){
super();
    Under8 = "Marvel";
    Over8 = "StarWars";
  }

public Age(double price, int amount, String under8, String over8){
  super(price, amount);
  this.under8 = under8;
  this.over8 = over8;
}


 public String getUnder8(){
    return Under8;
  }

  public String getOver8(){
    return Over8;
  }

  public void setUnder8(String newUnder8){
    Under8 = newUnder8;
  }

  public void setOver8(String newOver8){
    Over8 = newOver8;
  }

public String toString(){
  return "Under8: " + Under8 + "\nOver8: " + Over8 + "\n" + super.toString();
}

}