class Mobile
{
    private String brand;
    private int price;
    private  static String name="smartPhone"; // common for all object so static

    public Mobile() {
    }
    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
        
    }
    
    public void display() {
        System.out.println( "Mobile [brand=" + brand + ", price=" + price + ", name=" + name + "]");
    }

    
    
}

public class StaticTest {
    public static void main(String[] args) {
        
        Mobile mobile=new Mobile("apple", 150000);
        Mobile mobile1=new Mobile("vivo", 22000); // here common for all object.
        mobile.display();
        mobile1.display();

    }
}
