public class Store {
    private String storeName;
    private Product[] products;
    private int[] soldCount;
    private int productCount = 0;
    Store(String storeName, int capacity){
        this.storeName = storeName;
        this.products = new Product[capacity];
        this.soldCount = new int[capacity];

        for(int i = 0;i<capacity;i++){
            this.soldCount[i] = 0;
        }
        this.productCount = 0;
    }
    public void addProduct(Product product){
        if(products.length > productCount&& product!=null){
            for(int i = 0; i<productCount;i++){
                if(products[i] ==product){
                    System.out.println("Didnt work");
                    return;

                }
            }
            products[productCount] = product;

            productCount++;

        }
        else{
            System.out.println("Didnt work");

        }

    }
    public int findProductIndex(int id){
        int returner = -1;
        int tmpI = 0;
        while(products.length!= tmpI){
            if(products[tmpI].getId() ==id){
                returner = tmpI;
            }
            tmpI++;
        }
        return returner;
    }

    public Boolean sellProduct(int id, int quantity){
        int prod = findProductIndex(id);
        if(prod !=-1&&products[prod].sell(quantity) ){
            soldCount[prod] +=quantity;
            return true;
        }
        return false;
    }
    public void printAvailableProducts(){
        for(int i = 0; i<productCount;i++){
            if(products[i].getStock() == 0){
                continue;
            }
            System.out.println(products[i].getInfo());
        }

    }

    public void printSalesReport(){
        for(int i = 0; i<productCount;i++) {
            System.out.println(products[i].getName() + " have sold this number of pieces: " +soldCount[i]);


        }
    }
    public void getTotalUnitsSold(){
        int sum = 0;
        for(int i = 0; i<productCount;i++) {
            sum+=soldCount[i];
        }
    }



}
