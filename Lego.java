public class Lego{

private double price;
private int amount;

// Price of Lego sets

  public Lego(){
    price = 75;
    amount = 3;
  }

  public Lego(double price, int amount){
    this.price = price;
    this.amount = amount;
  }


  public double getPrice(){
    return price;
  }

  public int getAmount(){
    return amount;
  }

  public void setPrice(double newPrice){
    price = newPrice;
  }

  public void setAmount(int newAmount){
    amount = newAmount;
  }

  public String toString(){
return "Price: " + price + "\nAmount: " + amount;
  }



  
}