package Products;

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
/*        if(name="") {
            throw  new IllegalStateException(String.format("У продукта отсутствует наименование!",name));
        }
        else {
            this(name);
        }*/
        this(name);
        this.price = price;
    }
    /*public Product(String name, Double price) {
        if(name="") {
            throw  new IllegalStateException(String.format("У продукта отсутствует наименование!",name));
        }
        else {
        this(name);
        }
        this.price = price;
    }*/
    public  void setPrice(Double value)
    {
        if (value <=0) {
            throw new IllegalStateException(String.format("Цена указана некорректно!", value));
        }
        this.price = value;
    }
    public String getName(){
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "Product{" +
                "name='" + name + '\'' +
                ", cost=" + price +
                '}';
    }
    /*    public Product(String name){
        this ("unknown", 0.00);
    }*/
    /**
     * конструктор продукта 1 параметр
     * @param name наименование продукта
     */
    public Product(String name)
    {
        this.name = name;
    }
}
