public class Product {
    public String name;
    public double price = 0 ;
    public int quantity = 0;

    public void addStock(int amount){
        if (amount>0)
            quantity+=amount;
        System.out.print("Added"+amount+"items to stock");
    }
    public void sell(int amount){
        if (amount<=quantity && amount>0){
            quantity-=amount;
            System.out.print("Sold"+amount+"items");
        }else System.out.println("Not enough items in stock.......");
    }
    public void changePrice(double newPrice){
        if(newPrice>=0)
            price=newPrice;
        System.out.print("change price to"+newPrice+"baht");
    }
    public double stockValue(){
        return price * quantity;
    }
    public void showinfo(){
        System.out.println("Name : "+name);
        System.out.println("Price : "+ price + " baht/items");
        System.out.println("Stock : " + quantity + " items");
        System.out.println("Stock Value : "+ stockValue()+" baht");
        System.out.println("---------------------------");
    }
}
