package week1.day2assignments;

public class FindTypes {

	public static void main(String[] args) {
		String test="$$Welcome to 2nd class of automation$$";
		int letter=0,space=0,num=0,splchar=0;
		char ch[]=test.toCharArray();
		int length=ch.length;
		for(int i=0;i<length;i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			if(Character.isWhitespace(ch[i])) {
				space++;
				
			}
			if(Character.isDigit(ch[i])) {
				num++;
			}
			if(!Character.isLetter(ch[i]) && !Character.isWhitespace(ch[i]) && !Character.isDigit(ch[i])) {
				splchar++;
			}
		}
		System.out.println("letter:"+letter);
		System.out.println("space:"+space);
		System.out.println("num:"+num);
		System.out.println("splchar:"+splchar);
	

		
		

	}

}
