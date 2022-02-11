package player;

public class Smallest {

	public static void main(String[] args) {
		int x=1;
		int y=7;
		int z=3;
		if(x>y && x>z ) {
			System.out.println(x+" big");
		}else if(y>z ) {
			System.out.println(y+"  big");
		}else {
			System.out.println(z+" big");
		}
	}

}
