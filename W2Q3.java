
import java.util.*;
public class W2Q3 {
public static void main (String[]args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the line");
String line=in.next();
if(line.endsWith("pdf")||line.endsWith("docs")||line.endsWith("zip"))
{
    System.out.println("Accepted");
}
else{
    System.out.println("REjected");
}

}    
}
