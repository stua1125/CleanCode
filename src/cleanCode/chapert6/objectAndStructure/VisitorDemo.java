/**
 * 
 */
package cleanCode.chapert6.objectAndStructure;

/**
 * @author one
 * ShapeUserModel�� visitor Pattern ����  
 */
public class VisitorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes shapes = new Shapes();
		shapes.accept(new ShapesElementDoVisitor());
	}

}
