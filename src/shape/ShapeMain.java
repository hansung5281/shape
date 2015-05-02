package shape;

public class ShapeMain {
	public static void main(String[] args) {
<<<<<<< HEAD
		
		Shape circle = new Circle(1,true);
		Shape rect = new Rect(2,2,true);
		Shape triangle = new Triangle(3,3,true);
				
=======
//		Point point1 = new Point(2, 5);
//		point1.show(true);
//		
//		Point point2 = new Point(10, 20);
//		point2.show(false);
//		
//		Point point3 = new Point(5, 5);
//		point3.show(true);
		
//		ColorPoint point4 = new ColorPoint(10,50);
//		point4.setColor("red");
//		point4.show();
		
		
		
//		//인터페이스 테스트
//		Drawable drawable = new Point(10,20);
//		drawable.draw();
		
		//instance of test
		Circle c = new Circle();
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Drawable);
		//System.out.println(c instanceof Rect);
		
		Shape s = c;
		System.out.println(s instanceof Rect);
		System.out.println(c instanceof Visible);
>>>>>>> 975259a4dc5f7f4d6a1a81010da572a7c75a6f83
	}
}
