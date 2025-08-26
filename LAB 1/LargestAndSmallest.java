public class LargestAndSmallest {
    public static void main(String[] args) {
        int arr[]={112,544,34,124,-604,-719,361,450,390}; //I Include -ve also 
        int sm=10000; 
        int l=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l)
            l=arr[i];
            if(arr[i]<sm)
            sm=arr[i];

        }
        System.out.println("Smallest is :"+sm);
        System.out.println("Largest is :"+l);
    }
}
