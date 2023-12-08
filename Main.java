
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test 1 :");
		Rectangle rect= new Rectangle(12.5,4.0);
		System.out.println(rect);
		System.out.println();
		
		System.out.println("Test 2: ");
		RectangleColore rect1 = new RectangleColore(12.5,4.0,"Rouge");
		System.out.println(rect1);
		System.out.println();
		
		System.out.println("Test 3: ");
		Rectangle rect2=new RectangleColore(25.0/2,8.0/2,new String ("rouge"));
		System.out.println(rect2);
		System.out.println();
		
		System.out.println(rect1.equals(rect2));
		System.out.println(rect2.equals(rect1));
		System.out.println(rect1.equals(null));
		System.out.println(rect.equals(rect1));
		System.out.println(rect1.equals(rect));
	}	

}
