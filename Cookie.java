public class Cookie extends DessertItem{

   double number;
   double pricePerDozen;
   
   public Cookie(String name,double number, double pricePerDozen){
      number = this.number;
      pricePerDozen = this.pricePerDozen;
   
   }
   
   public int getCost(){
      int cost = (int) (number * (pricePerDozen/12));
      return cost;
   }
   
   
}