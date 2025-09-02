public class Exception1 {
    public static void main(String args[]){
        System.out.println("Hello shivam");
        System.out.println("Hello shivam");
        System.out.println("Hello shivam");
        try{
            System.out.println(200/0);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }

        System.out.println("Hello shivam");
        System.out.println("Hello shivam");
    }
}
