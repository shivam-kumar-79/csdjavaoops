import java.util.Scanner;
class Employee{
    // Employee({
    //     // it is constructior by dfault here but not show actuallhy 
    //   //  this is a key word referce to the current object 
    // })
    //constructor use to initialize object
    int nEmp=101;
    String sName;
    String Econ;
    long nSal;

    void nCalcIncomeTax(long nSal){
        System.out.println("Return Income tax");
    }

    public static void main(String args[]){
        Employee e1=new Employee();
        //e1.nEmp =1234;
        e1.sName="Shivam";
        e1.Econ="Delhi";
        e1.nCalcIncomeTax(1234);
        
        
        Employee e2=new Employee();
        e2.nEmp = 123;
        e2.sName ="Vivek patel";
        e2.Econ="Uttar pradesh";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter city of employee 2");

        e2.Econ=sc.nextLine();


        e1.nCalcIncomeTax(3456);
        Employee e3=new Employee();
        e3.nEmp =799;
        e3.sName="Vishal";
        e3.Econ="Mumbai";


        System.out.println("e1 Employee id is "+e1.nEmp);
        System.out.println("e1 Employee name is : "+e1.sName);
        System.out.println("e1 Employee city is : "+e1.Econ);
       

        System.out.println("e2 Employee id is "+e2.nEmp);
        System.out.println("e2 Employee name is : "+e2.sName);
        System.out.println("e2 Employee city is : "+e2.Econ);

        sc.close();

    }
}
