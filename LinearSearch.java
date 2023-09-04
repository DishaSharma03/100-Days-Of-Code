import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bool=true;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==t){
                bool=true;
                break;
            }
        }
        if(bool==true){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
