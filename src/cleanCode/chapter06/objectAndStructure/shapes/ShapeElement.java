/**
 * 
 */
package cleanCode.chapter06.objectAndStructure.shapes;

/**
 * @author one
 * ShapeElements have to provide area().
 */
public interface ShapeElement {
	void accept(ShapeElementVisitor visitor);
}
