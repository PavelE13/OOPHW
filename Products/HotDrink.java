package Products;

/** Ver. HW1 - наследник класса Product*/
public class HotDrink extends Product {
    /** температура горячего напитка*/
    private int temperature;
    /** объем горячего напитка*/
    private int volume;
    /**
     * конструктор горячего напитка 4 параметра
     * @param name наименование продукта
     * @param price цена продукта
     * @param temperature температура горячего напитка
     * @param volume объем горячего напитка
     */
    public HotDrink(String name, Double price, int temperature, int volume) {
        super(name, price);
        try {
            if (temperature > 5 && temperature <= 60) this.temperature=temperature;
            if (volume > 0 && volume <= 500) this.volume=volume;
        }
        catch (IllegalStateException e){

        }
    }
    /** Возврат объема product.HotDrink */
    public int getVolume() {
        return volume;
    }
    /** Установка объема для product.HotDrink c отсечением значений <= 0 и > 500*/
    public void setVolume(int myvolume) {
        if (myvolume <= 0 && myvolume > 500) {
            throw new IllegalStateException(String.format("Объем указан некорректно!", myvolume));
        }
        this.volume = myvolume;
    }
    /** Возврат темературы  product.HotDrink */
    public int getTemperature() {
        return temperature;
    }
    /** Установка темературы для product.HotDrink c отсечением значений <= 5 и > 60 */
    public void setTemperature(int mytemperature) {
        if (mytemperature <= 5 && mytemperature > 60) {
            throw new IllegalStateException(String.format("Температура указан некорректно!", mytemperature));
        }
        this.temperature = mytemperature;
    }

    /** Переопределение вывода по собственному формату */
    @Override
    public String toString()
    {
        return  "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +
                ", volume=" + volume + ", " +
                "temperature=" + temperature +
                '}';
    }
}
