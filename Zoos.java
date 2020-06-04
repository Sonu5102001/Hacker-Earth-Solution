import java.util.*;
class TestClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int Z = 0 , O = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='z')
                Z++;
              
          else
                O++;
        }
    
        if(Z*2==O)
            System.out.println("Yes");
            else
            System.out.println("No");
        

    }
}
