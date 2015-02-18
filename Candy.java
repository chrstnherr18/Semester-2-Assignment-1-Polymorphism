public class Candy extends DessertItem{

   double weight;
   double price;
   
   public Candy(String name,double weight, double price){
      weight = this.weight;
      price = this.price;
   
   }
   
   public int getCost(){
      int cost = (int) (weight * price);
      return cost;
   }
   
   
}