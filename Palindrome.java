import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String reverseString="";
        for(int i=s.length()-1;i>=0;i--){
            reverseString +=s.charAt(i);
        }
        if(s.equals(reverseString)){
            System.out.println("Yess");
        }
        else{
            System.out.println("No");
        }
    }
}
