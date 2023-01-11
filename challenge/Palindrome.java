package challenge;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		s=s.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		String rev="";
		char[] charArray = s.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			rev = rev+ charArray[i];
				}
		//System.out.println(s);
		//System.out.println(rev);
		if(s.equals(rev)) 
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		

	}

}
