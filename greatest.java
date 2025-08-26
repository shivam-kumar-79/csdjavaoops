import java.util.*;
public class greatest {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.print(a+" is Greatest");
        }
        if(b>a&&b>c){
            System.out.print(b+" is Greatest");
        }
        else{
            System.out.println(c+" is Greatest");
        }





        sc.close();
    }
    
}
