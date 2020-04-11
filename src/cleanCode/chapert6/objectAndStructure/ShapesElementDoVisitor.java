package cleanCode.chapert6.objectAndStructure;

public class ShapesElementDoVisitor implements ShapeElementVisitor {

	@Override
	public void visit(Shapes shapes) {
		// TODO Auto-generated method stub
		System.out.println("my Shapes init");
	}
	
	@Override
	public void visit(Square shapes) {
		// TODO Auto-generated method stub
		System.out.println(shapes.getName() + "네모네모 움직영!");
	}

	
}
