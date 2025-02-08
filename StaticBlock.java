class block{
   static String name="jay";
    static
    {
        System.out.println("static block get initilized");
    }
}
public class StaticBlock {
    
    public static void main(String[] args) {
        
        System.out.println(block.name);
    }
}
