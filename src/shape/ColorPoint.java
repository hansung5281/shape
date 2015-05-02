package shape;

public class ColorPoint extends Point{
	String color;
<<<<<<< HEAD
	
=======
>>>>>>> 975259a4dc5f7f4d6a1a81010da572a7c75a6f83
	public ColorPoint(int x, int y) {
		super(x,y);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
<<<<<<< HEAD
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("좌표[x= " + x +",y= "+y+",color="+color+"]에 점을 지웠습니다.");
	}
	
	@Override
	public void visible(boolean visible) {
		super.visible(visible);
		if(visible==true){
			draw();
		}else{
			System.out.println("좌표[x= " + x +",y= "+y+",color="+color+"]에 점을 지웠습니다.");
		}
	}
	
	
=======
	public void show() {
		System.out.println("좌표[x= " + x +",y= "+y+",color="+color+"]에 점을 지웠습니다.");
	}	
>>>>>>> 975259a4dc5f7f4d6a1a81010da572a7c75a6f83
}
