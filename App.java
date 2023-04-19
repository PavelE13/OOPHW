import Products.BottleOfWater;
import Products.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product("Шоколад", 88.2);
        item1.setPrice(98.0);

        VendingMachine itemMachine = new VendingMachine(300);
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Чипсы", 60.3));
        itemMachine.addProduct(new Product("Масло", 160.3));
        itemMachine.addProduct(new Product("Лук", 58.0));
        itemMachine.addProduct(new Product("Снек", 22.6));
        itemMachine.addProduct(new BottleOfWater("Славяновская",70.6,500));
        itemMachine.addProduct(new BottleOfWater("Минводы",40.6,1000));

        for(Product prod: itemMachine.getProdAll())
        {
            System.out.println(prod.toString());
        }
    }
}
