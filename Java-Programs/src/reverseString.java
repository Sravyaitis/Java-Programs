import java.text.SimpleDateFormat;
import java.util.Date;

public class reverseString {
	
	public static void main(String[] args) {
	
	String s ="Sravya";
	String reverseStr = "";
	
	for(int i=s.length()-1;i>=0;i--) {
		reverseStr+=s.charAt(i);
	}
	System.out.println(reverseStr);
	}
}
//		String s = "Sravya";
//		
//		String reverseString = "";
//		
//		for(int i=s.length()-1;i>=0;i--) {
//			reverseString=reverseString+s.charAt(i);
//		}
//		System.out.println(reverseString);
//		
//		
//		Date d = new Date();
//		System.out.println(d.toString());
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
//		System.out.println(sdf.format(d));

