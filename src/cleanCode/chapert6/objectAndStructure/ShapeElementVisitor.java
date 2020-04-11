/**
 * 
 */
package cleanCode.chapert6.objectAndStructure;

/**
 * @author one
 *
 */
public interface ShapeElementVisitor {
	void visit(Shapes shapes);
	void visit(Square squre);
}
