import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n+1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n+1;i++){
            for(int j=i+1;j<n+1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
}
