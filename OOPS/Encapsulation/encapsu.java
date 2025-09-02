import java.lang.*;
class Employee{
    private double salary; //prevent from direct access now i can excess only in same class

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // String name;//we can excess with methods

}
public class encapsu{
    public static void main(String args[]) throws Exception {
        System.out.println("Hello");//encapsu means binding of data and action{METHODS} together in 1 plus
        //TO bypass by makini making same class
              Employee emp=new Employee();
//        Field fsalary =Employee.class.getDeclaredField("Salary");
//        fsalary.setAccessible(true);
//        System.out.println(fsalary.get(emp));
        //reflection..
        emp.setSalary(50000);
        System.out.println(emp.getSalary());

    }
}