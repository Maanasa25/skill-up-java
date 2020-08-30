package pack_2;
import java.util.*;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("c.addition");
		System.out.println("d.subtraction");
		System.out.println("e.multiplication");
		System.out.println("f.division");
		System.out.println("enter your choice:");
		int ch=obj.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("addition="+(a+b));
			break;
		case 2:
			System.out.println("subtraction="+(a-b));
			break;
		case 3:
			System.out.println("multiplication="+(a*b));
			break;
		case 4:
			System.out.println("division="+(a/b));
			break;
		}
		
		

	}

}
