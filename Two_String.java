import java.util.*;
import java.lang.Boolean;
class TestClass {
    public static void main(String args[] ) {
         Scanner s = new Scanner(System.in);
          int t = s.nextInt();

        while(t!=0){
          String s1 = s.next();
          String s2 = s.next();
       
          char[] a = s1.toCharArray();
          char[] b = s2.toCharArray();

          Arrays.sort(a);
          Arrays.sort(b);

          Boolean result = Arrays.equals(a,b);
       
          if(result==true){
            System.out.println("YES");
          }  
          else{
            System.out.println("NO");
            }
          t--;
      }
    }
  }