public class CountAndSum {
    public static void main(String[] args) {

        int count=0;
        int sum=0;
        for (int i=0;i<=100;i++){
            if(i%2!=0){
                sum=sum+i;
                count=count+1;
            }
        }
        System.out.println("Sum of 1-100 odd numebrs is "+sum);
        System.out.println("Total Odd Numbers are "+count);
    }
}

