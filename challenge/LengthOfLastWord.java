package challenge;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "   fly me   to   the moon  ";
       s= s.trim();
       String[] splitString = s.split(" ");
       int len = splitString.length;
       System.out.println(splitString[len-1].toCharArray().length);
	}

}
