
/**
11.The Product class describes food products using two attributes: the product name and whether the product is vegetarian.
Define the class, its attributes, and getter and setter methods for all attributes. Then create a product, set attributes'
values and display product information. 
 */
public class Products
{
public static void main(String args[]) {
    Product product1 = new Product();
    product1.setProductName("Carrot");
    product1.setIsVegetarian(true);
    System.out.println(product1.toString());
}
}
