public class Product {
    private int id;
    private static int nextId = 1000;
    private String name;
    private double price;
    private int stock;
    Product(String name, double price, int stock) {
        if(name == null){
            this.name = "UNKNOWN";
        }
        else{
            this.name = name;
        }
        if(price<=1){
            this.price = 1;
        }
        else{
            this.price = price;

        }
        if(stock <=0){
            this.stock = 0;
        }
        else{
            this.stock = stock;
        }
        this.id = nextId;
        nextId++;
    }
    int getStock(){
        return this.stock;
    }

    double getPrice(){
        return this.price;
    }
    String getName(){
        return this.name;
    }
    int getId(){
        return this.id;
    }
    public void setName(String name){
        int spaceCount = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        if(name !=null&&spaceCount!=name.length()){
            this.name = name;

        }
    }
    public void setPrice(int price){
        if(price>0){
            this.price=price;
        }
    }
    public void setStock(int stock){
        if(stock>=0){
            this.stock = stock;
        }

    }
    public Boolean sell(int quantity){
        if(stock >=quantity&&quantity>0){
            this.stock-=quantity;
            return true;
        }
        return false;

    }
    public String getInfo(){
        return "The product is: " + this.name +", his id is: " + this.id +  ", he costs " + this.price + ", and we have this sum in the stock: " + this.stock;
    }
    public static int getNextId(){
        return nextId;
    }


}
