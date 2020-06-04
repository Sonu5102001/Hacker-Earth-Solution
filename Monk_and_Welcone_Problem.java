import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int[] Arr1 = new int[N];
    int[] Arr2 = new int[N];
    
    for(int i=0; i<N; i++){
        Arr1[i] = s.nextInt();
    }
    for(int j=0; j<N; j++){
            Arr2[j] = s.nextInt();
            System.out.print(Arr1[j]+Arr2[j]+ " ");
              }

    }
}
