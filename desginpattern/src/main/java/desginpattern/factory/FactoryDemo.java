package desginpattern.factory;

public class FactoryDemo {

	public static void main(String[] args) {
 Shape circle=ShapeFactory.getShape(ShapeType.CIRCLE);
 if(circle!=null) {
	 circle.draw();
 }else {
	 System.out.println("This shape cannot be drawn");
 }
	}

}
