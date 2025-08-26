//import java.util.*;
//import java.lang.*;
//creation of class
class student {
//    public static void main(String []args){

//Ayttributes == properties == state == variable
    String Name;
    int roll_no;
    String Branch = "CS";
    char Section = 'D';
    int aMArks[] = new int[10];

    //Methods =functions in c == procedure
    void checkResult(){
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        //call step always from main and atleat 1 class hona jaroori h 
        //creating an object  in java
        student st1 =new student(); 
        student st2=new student();
        student st3 =new student(); 
         // to create object name st that allocate memory
        //allocate size of object in memory  ,name is similar to name of class
        st1.Name="Shivam ";
        st1.roll_no=20;
        st2.Name="Satvik";
        st2.roll_no=13;
        st3.roll_no =1234;
        System.out.println("student name is : "+st1.Name);
        System.out.println("student 1 roll_no is : "+st1.roll_no);
        System.out.println("student 2 name is : "+st2.Name);
        System.out.println("student 3 roll_no is : "+st3.roll_no);
    }

}