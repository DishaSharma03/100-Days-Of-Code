import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean bool=false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr2[i]==arr[j]){
                    bool=true;
                }
                else{
                    break;
                }
            }
        }
        if(bool==true){
            System.out.println("arr2 is subarray of arr");
        }
        else{
            System.out.println("arr2 is not a subarray of arr");
        }
    }
}
