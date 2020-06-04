import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int div = n/5;
       if(n%5==0){
        System.out.println(div);
       }
       else
        System.out.println(div+1);

    }
}
