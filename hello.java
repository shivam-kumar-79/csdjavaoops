public class hello{
    public static void main(String[] args) {
    System.out.println("Hii ");
    for(int i=0;i<args.length;i++){
        System.out.println(args[i]);
    }
}
}
class Aa{
    public static void main(String [] args){
        System.out.println("Aa Data");
        hello.main(new String[]{"Hello","Shivam ","Chaudhary"});
    }
}