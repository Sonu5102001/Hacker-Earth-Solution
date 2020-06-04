import java.util.*;
class TestClass {
    public static void main(String args[] ) {
        Scanner scan = new Scanner(System.in);
         String s = scan.nextLine();
        String b = "";

        int a = s.length();
        
        for(int i=a-1; i>=0; i--){
          
            b = b + s.charAt(i);
        }

        if(s.equalsIgnoreCase(b))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    }
}
