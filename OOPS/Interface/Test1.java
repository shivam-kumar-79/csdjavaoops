package Interface;
interface Intern1{
    int x = 112;//x=112
    void method1(); //public static final : static means it belongs to the interface no need to make mem obj
                    //hmare inerface ke andr koi variable h toh by default public static final variable
                    //hota h final means uski value change nahi ho sakti
                    //public abstract
    //abstract method ko abstract ki sari child classes implement krengi that is their job 

}
interface intern2{
    int x=115;
    void method2();
}

public class Test1 implements Intern1,intern2{
    public static void main(String[] args){
    System.out.println("Main Entry point");
    System.out.println(intern2.x);
    int x=113;  //This x is local value that create bcz interface variable is final Constant if declare so it create normal veriable
    System.out.println(x);
    
    }
    
    public void method1(){
        System.out.println("This is my method1 implementation");
    }

    public void method2(){
        System.out.println("This is my method2 implementation");
    }
}