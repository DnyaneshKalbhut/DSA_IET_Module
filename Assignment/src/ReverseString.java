
public class ReverseString {
	public static void main(String[] args) {
		String str = "This is practice" ; 
		String revstr="";
		for(int i = 0 ; i < str.length();i++) {
			revstr = str.charAt(i)+revstr;
		}
		
		System.out.println("Reverse string is ");
		System.out.println(revstr);
	}
}
