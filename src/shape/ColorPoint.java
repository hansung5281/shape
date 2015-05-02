package shape;

public class ColorPoint extends Point{
	String color;
	
	public ColorPoint(int x, int y) {
		super(x,y);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
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
	
	
}
