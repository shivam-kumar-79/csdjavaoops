import java.util.*;
public class GN{
    public static void main(String args[]){
        System.out.println("Program to Find Greatest among 3 Numbers.");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b & a>=c){
            System.out.println(a+" is greatest Among 3 NUmbers ");
        }
        else if(b>=c &b>=a){
            System.out.println(b+" is greatest Among 3 NUmbers ");
        }
        else{
             System.out.println(c+" is greatest Among 3 NUmbers ");
        }
        sc.close();
    }
}