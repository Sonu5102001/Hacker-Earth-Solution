import java.util.*;
class TestClass {
    public static void main(String args[] ) {
    Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();

        String[] a= s.split(" ");
        for(int i=0; i<s.length(); i++) {
        
        }
        System.out.println("");
        for(int i=a.length-1; i>=0; i--){
            System.out.print(a[i]+ " ");
        }


    }
}
