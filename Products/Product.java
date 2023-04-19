package Products;

/** Ver. HW1*/
public class Product {
    /** наименование продукта */
    private String name;
    /** цена продукта*/
    private Double price;

    /**
     * конструктор продукта 2 параметра
     * @param name наименование продукта
     * @param price цена продукта
     */
    public Product(String name, Double price) {
        this(name);
        try {
            if (price > 0) this.price = price;
        } catch (IllegalStateException e) {

        }
    }
    /**
     * конструктор продукта 1 параметр
     * @param name наименование продукта
     */
    public Product(String name)
        {
            this.name = name;
        }
    /** Установка цены для product c отсечением отрицательных значений и 0 */
    public  void setPrice(Double value)
    {
        if (value <=0) {
            throw new IllegalStateException(String.format("Цена указана некорректно!", value));
        }
        else this.price = value;
    }
    /** Возврат имени product */
    public String getName(){
        return name;
    }
    /** Возврат цены product */
    public Double getPrice() {
        return price;
    }
    /** Переопределение вывода по собственному формату */
    @Override
    public String toString() {
        return  "Product{" +
                "name='" + name + '\'' +
                ", cost=" + price +
                '}';
    }
}
