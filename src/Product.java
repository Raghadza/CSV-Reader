public class Product {
    private String category;
    private String name;
    private Double price;
    private Double sale_price;
    private String subcategory;
// constructor 
    public Product(String category, String name, Double price, Double sale_price, String subcategory) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.sale_price = sale_price;
        this.subcategory = subcategory;
    }
    // getters 
public String getCategory() {return category;}
public String getName() {return name;}
public Double getPrice() {return price;}
public Double getSalePrice() {return sale_price;}
public String getSubcategory() {return subcategory;}

public String toString() {
   return "Product [category=" + category + ", name=" + name
           + ", price=" + price + "SR"+", sale_price=" + sale_price + "SR"
           +", subcategory=" + subcategory + "]"; }
}
