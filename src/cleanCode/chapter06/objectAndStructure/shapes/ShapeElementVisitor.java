/**
 * 
 */
package cleanCode.chapter06.objectAndStructure.shapes;

/**
 * @author one
 *
 */
public interface ShapeElementVisitor {
	void visit(Shapes shapes);
	void visit(Square squre);
}
