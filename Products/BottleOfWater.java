package Products;

/** Ver. HW1 - наследник класса Product*/

public class BottleOfWater extends  Product {
    /** объем бутилированной воды*/
    private int volume;
    /**
     * конструктор бытилированной воды 3 параметра
     * @param name наименование продукта
     * @param price цена продукта
     * @param volume объем бутилированной воды
     */
    public BottleOfWater(String name, Double price, int volume) {
        super(name, price);
        try {
            if (volume > 0 && volume <= 1500) this.volume=volume;
        }
        catch (IllegalStateException e){

        }
    }
    /** Возврат объема product.BottleOfWater */
    public int getVolume() {
        return volume;
    }
    /** Установка объема для product.BottleOfWater отсечением значений <= 0 и > 1500*/
    public void setVolume(int volume) {
        if (volume <= 0 && volume > 1500) {
            throw new IllegalStateException(String.format("Объем указан некорректно!", volume));
        }
        this.volume = volume;
    }

    /** Переопределение вывода по собственному формату */
    @Override
    public String toString()
    {
        return  "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +
                ", volume=" + volume +
                '}';
    }
}