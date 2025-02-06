class Student
{
    static int count=0;

    Student()
    {
        count++;
        System.out.println("object are :"+count);
    }
}


public class ObjectCount {
    
    public static void main(String[] args) {
        
        Student student=new Student(); //default constrotr
        Student student2=new Student();
        Student  student3=new Student();

    }
}
