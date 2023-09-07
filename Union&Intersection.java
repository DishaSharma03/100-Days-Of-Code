import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(arr[i]);
        }
        for(int i=0;i<m;i++){
            s.add(arr2[i]);
        }
        System.out.print("Union of arrays is ");
        System.out.print(s.toString()+" ");
        
        HashSet<Integer> s2=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i]==arr2[j]){
                    s2.add(arr[i]);
                }
            }
        }
        System.out.print("\n Intersection of arrays is ");
        System.out.print(s2.toString()+" ");
    }
}
