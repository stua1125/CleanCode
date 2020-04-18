/**
 * 
 */
package cleanCode.chapter06.objectAndStructure.shapes;

/**
 * @author one
 * ShapeUserModelÀÇ visitor Pattern Àû¿ë  
 */
public class VisitorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes shapes = new Shapes();
		shapes.accept(new ShapesElementDoVisitor());
	}

}
