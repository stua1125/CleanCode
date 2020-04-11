/**
 * 
 */
package cleanCode.chapert6.objectAndStructure;

/**
 * @author one
 * ShapeElements have to provide area().
 */
public interface ShapeElement {
	void accept(ShapeElementVisitor visitor);
}
