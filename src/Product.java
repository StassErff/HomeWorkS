import java.util.Objects;

public class Product {

    public Product(int id, String name, int prise, String category) {
        this.id = id;
        this.name = name;
        this.prise = prise;
        this.category = category;
    }

    public int id;
    public String name;
    public int prise;
    public String category;

    @Override
    public String toString() {
        return "Товар [артикул = " + this.id + ", навание = " + this.name + ", цена = " + this.prise + ", категория = " + this.category + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return id == product.id && Objects.equals(category, product.category);
    }
}
