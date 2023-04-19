import Products.BottleOfWater;
import Products.HotDrink;
import Products.Product;
import VendingMachines.VendingMachine;

/** Ver. HW1*/
public class App {
    public static void main(String[] args) throws Exception {
        /** Инициализация экземпляра класса и ввод данных с конструктором из 2 параметров */
        Product item1 = new Product("Шоколад", 88.2);
        /** Ввод данных с конструктором из 1 параметра */
        item1.setPrice(98.0);
        /** Инициализация экземпляра класса на 300 product(ов) */
        VendingMachine itemMachine = new VendingMachine(300);
        /** Заполнение экземпляра класса значениями product(ов) */
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Чипсы", 60.3));
        itemMachine.addProduct(new Product("Масло", 160.3));
        itemMachine.addProduct(new Product("Лук", 58.0));
        itemMachine.addProduct(new Product("Снек", 36.2));
        itemMachine.addProduct(new BottleOfWater("Славяновская",70.6,500));
        itemMachine.addProduct(new BottleOfWater("Минводы",40.6,1000));
        itemMachine.addProduct(new HotDrink("Капучино", 150.3, 50, 500));
        itemMachine.addProduct(new HotDrink("Эспрессо", 180.3, 10, 250));

        for(Product prod: itemMachine.getProdAll())
        {
            System.out.println(prod.toString());
        }
    }
}
