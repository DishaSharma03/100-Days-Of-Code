import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] rotatedArray=new int[n];
        for(int i=0;i<n;i++){
            int newIndex=(i+1)%n;
            rotatedArray[newIndex]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(rotatedArray[i]+" ");
        }
    }
}
