class Employee
{
    int empId;
    String name;
    static String companyName="TCS";

    public Employee(int empId, String name )
    {
        this.empId=empId;
        this.name=name;
      
    }

    public void display()
    {
        System.out.println("Employee Id is:"+empId);
        System.out.println("employyee name is:"+name);
        System.out.println("company name is:"+companyName);
    }
}

class StaticVariable
{
    public static void main(String[] args) {
        
        Employee employee=new Employee(1, "prathamesh");
        employee.display();
        Employee employee2=new Employee(2, "Akash");
        employee2.display();
    }
}