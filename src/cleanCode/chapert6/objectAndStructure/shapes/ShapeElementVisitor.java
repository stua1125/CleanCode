/**
 * 
 */
package cleanCode.chapert6.objectAndStructure.shapes;

/**
 * @author one
 *
 */
public interface ShapeElementVisitor {
	void visit(Shapes shapes);
	void visit(Square squre);
}
