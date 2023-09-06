import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int k=sc.nextInt();
       Arrays.sort(arr);
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println("Kth smallest element is "+arr[k-1]);
       System.out.println("Kth largest element is "+arr[n-k]);
       
    }
}
