package strings;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the string");
       String s=scan.next();
       StringBuffer sb=new StringBuffer(s);//immutable to mutable
       sb.reverse();
       System.out.println(sb);
       //String s1=new String(sb);
       //System.out.println(s.toLowerCase());
	}

}
