import javax.swing.plaf.synth.SynthOptionPaneUI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store s1 = new Store("Spar", 3);
        Product bottle = new Product("Bottle", 30,0);
        Product pen = new Product("Pen", 4,2);
        Product notebook = new Product("Notebook", 12.5,3);
        s1.addProduct(notebook);
        s1.addProduct(pen);
        s1.addProduct(bottle);
        Product tmp = new Product("tmp",1,1);
        s1.addProduct(tmp);


        System.out.println(s1.sellProduct(notebook.getId(),2));
        System.out.println(s1.sellProduct(pen.getId(), 3));
        System.out.println(s1.sellProduct(pen.getId(), 2));

        notebook.setPrice(-5);
        System.out.println(notebook.getInfo());
        s1.printAvailableProducts();

        s1.printSalesReport();
        int tmpI = 0;
        for(int i = 1000;i<=Product.getNextId();i++){
            System.out.println(i);
        }
    }
}