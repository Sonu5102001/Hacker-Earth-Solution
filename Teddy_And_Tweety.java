import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int P = s.nextInt();
        if(P%3==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
