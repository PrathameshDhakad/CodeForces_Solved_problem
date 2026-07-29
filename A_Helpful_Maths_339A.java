import java.util.*;
public class A_Helpful_Maths_339A{
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ch = s.split("\\+");
        Arrays.sort(ch);
        System.out.println(String.join("+",ch));
    }
    
}
