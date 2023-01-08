package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7,count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("non-prime");
		}
		else
		{
			System.out.println("prime");
		}
	}

}
