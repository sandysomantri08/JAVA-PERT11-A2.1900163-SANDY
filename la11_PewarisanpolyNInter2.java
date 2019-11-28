/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9_2;

/**
 *
 * @author sandy
 */
public class la11_PewarisanpolyNInter2 {
    protected String name;
    protected String address;
    /**
    * Default constructor
    */
    public la11_PewarisanpolyNInter2(){
        System.out.println("Inside Person:Constructor");
        name = "";
        address = "";
    }
    /**
    * Constructor dengan dua parameter
    */
    public la11_PewarisanpolyNInter2( String name, String address) {
        this.name = name;
        this.address = address;
    }
    /**
    * Method accessor
    */
    public String getName() {
        System.out.println("Person Name : " +name);
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String add) {
        this.address = add;
    }
}
    public class Student extends la11_PewarisanpolyNInter2{
        public Student()
        {
        //super( "SomeName", "SomeAddress");
        //super();
        //super.name = "name";
            System.out.println("Inside Student:Constructor");
        }
        @Override

        public String getName() {
            System.out.println("Student Name : " +name);
            return name;
        }
        public static void main( String[] args) {
            Student anna = new Student();
        }
    }

    public class Employee extends la11_PewarisanpolyNInter2{
        @Override
        public String getName() {
            System.out.println("Employee Name:" +name);
            return name;
        }
        public static void main(String[] args)
        {
            la11_PewarisanpolyNInter2 ref;
            Student studentObject = new Student();
            Employee employeeObject = new Employee();
            ref = studentObject; //Person menunjuk kepada object Student
            String temp = ref.getName(); //getName dari Student class dipanggil
            System.out.println(temp);
            ref = employeeObject; //Person menunjuk kepada object Employee
            temp = ref.getName(); //getName dari Employee class dipanggil
            System.out.println(temp);
        }
    }
