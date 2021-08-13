package week1.day2assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test="changeme";
		char ch[]=test.toCharArray();
		int length=ch.length;
		for(int i=0;i<length;i=i+2) {
			ch[i]=Character.toUpperCase(ch[i]);
			
		}
		System.out.println(new String(ch));
		

	}

}
