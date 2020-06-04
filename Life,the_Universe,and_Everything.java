import java.util.*;
import static java.lang.System.exit;
class TestClass {
    public static void main(String args[] ) {
        Scanner s = new Scanner(System.in);
         int[] Arr = new int[1000000];

        for(int i=1; i<=100000; i++) {
            Arr[i] = s.nextInt();
            if(Arr[i]==42){
                exit(0);
            }

            else{
                System.out.println(+Arr[i]);
            }

        }


    }
}
