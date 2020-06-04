import java.util.*;
class TestClass {
    public static void main(String args[] ) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] Arr = new int[N];

        for(int i=0; i<N; i++){
            Arr[i] = s.nextInt(); 
        } 

        for(int i=0; i<N; i++){
            System.out.print(Arr[i]+" ");
        }

    }
}
