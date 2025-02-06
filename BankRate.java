class Bank{

    int customerID;
    String name;
    static String bankName="SBI";
    static final double interstRate=7.8;

    public Bank(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }
     public void display()
     {
        System.out.println("custome id is:"+customerID);
        System.out.println("customer name is:"+name);
        System.out.println("bank name is:"+bankName);
        System.out.println("ban rate is:"+interstRate);
     }
    
}
public class BankRate {
    
    public static void main(String[] args) {
        
        Bank bank=new Bank(1, "Prathamesh");
        bank.display();
        Bank.interstRate=8.9; //final so not changed.
        Bank bank2=new Bank(2,"akash");
        bank2.display();
    }
}
