package week1.day2assignments;

public class Calculator {
	public void add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println("sum of the given numbers are:" + d);
	}
		public void sub(int x,int y) {
			int z=x-y;
			System.out.println("sub value are:" + z );
			
		}
		public void mul(int f,int g) {
			int e=f*g;
			System.out.println("mul value are:" + e);
		}
		public void div(float r,float s) {
			float p=r/s;
			System.out.println("division value are:" + p);
		}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Calculator obj=new Calculator();
	obj.add(5, 15, 25);
	obj.sub(50, 30);
	obj.mul(3, 2);
	obj.div(6.8f, 3.4f);
		
		

	}

}
