import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < k) {
                arr[i] = arr[i] + k;
            } else {
                arr[i] = arr[i] - k;
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[n-1]-arr[0]);
    }
}
