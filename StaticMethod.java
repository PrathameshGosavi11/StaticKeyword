class MobilePhone
{
    int price;
    String brand;
    static String name;//declaration here

    public MobilePhone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }
  
   
    public static void show( MobilePhone mobile )
    {
        System.out.println("Static method will called"+mobile.brand);
    }
    public  void display()
    {
        System.out.println("mobile price is:"+price+ "--"+ "mobile brand is:"+brand +"--"+"mobile name is:"+name);
    }

    
}
public class StaticMethod {
    
    public static void main(String[] args) 
    {
        System.out.println(MobilePhone.name);
        MobilePhone mobile=new MobilePhone(12000, "vivo");
        // MobilePhone mobile1=new MobilePhone(22000, "apple");
        // MobilePhone mobile2=new MobilePhone(42000, "samsung");

        // mobile.display();// 
        // mobile1.display();
       // mobile2.display();
        MobilePhone.show(mobile); //  access static method.
        

    }
}
