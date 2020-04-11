/**
 * 
 */
package cleanCode.chapert6.objectAndStructure;

/**
 * @author one
 *
 */
public class Square implements ShapeElement {
	private String name;
		
	public Square(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void accept(ShapeElementVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
