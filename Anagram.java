package week1.day2assignments;

import java.util.Arrays;

public class Anagram {
	

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if(text1.length()==text2.length()) {
			char t1[]=text1.toCharArray();
			char t2[]=text2.toCharArray();
			Arrays.sort(t1);
			Arrays.sort(t2);
			if(Arrays.equals(t1, t2)) {
				System.out.println("The given string is a anagram");
			}
			else {
				System.out.println("The given string is not a anagram");
			}
		}
		else {
			System.out.println("The given string is not a anagram");
		}
				
			}
			
			

	}


