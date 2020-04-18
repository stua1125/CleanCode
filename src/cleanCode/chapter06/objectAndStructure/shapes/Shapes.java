/**
 * 
 */
package cleanCode.chapter06.objectAndStructure.shapes;

import javax.swing.text.html.parser.Element;

/**
 * @author one
 *
 */
public class Shapes implements ShapeElement {
	ShapeElement[] elements;
	public Shapes() {
	
	// TODO Auto-generated constructor stub
		this.elements = new ShapeElement[] {
			new Square("�򼮿�"), new Square("������"),
			new Square("��ȯ��")
		};
	};
	
	public ShapeElement[] getElements() {
		return elements.clone();
	}

	@Override
	public void accept(ShapeElementVisitor visitor) {
		// TODO Auto-generated method stub
		
		/*
		 * method dynamicBinding process
		 * memory area runtime heap stack
		 */
		visitor.visit(this);
		for(ShapeElement e : this.getElements()) {
			e.accept(visitor);
		}
		  
	}

}
