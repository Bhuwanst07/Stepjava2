
import java.util.*;
public class W2Q4 {
    public static void main(String[]args)
    {
 Scanner in=new Scanner(System.in);
 System.out.println("Enter the phone number ");
 String phone=in.next();
 int l=phone.length();
 if(l!=10)
 {
    System.out.println("INVALID phone number");

 }
else{

  String lastfour=phone.substring(6);
  StringBuilder result=new StringBuilder();
  result.append("XXXXXX");
  result.append("-");
  result.append(lastfour);
  System.out.println(result);

}


    }
}
