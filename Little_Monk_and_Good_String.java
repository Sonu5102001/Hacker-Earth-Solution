import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s = new Scanner(System.in);
        String ss = s.nextLine();
        int len = ss.length();
        int count =0 , max = 0;
        for(int i=0; i<len; i++){
            char ch = ss.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }else{
                count  = 0;
            }
            if(count >=max){
                max=count;
            }
        }
        System.out.println(max);

    }
}
