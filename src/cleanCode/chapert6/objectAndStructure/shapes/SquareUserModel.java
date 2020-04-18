/**
 * p.121 새함수를 추가하고 싶다면 도형 클래스를 전부 고쳐야한다.
 * VISOTOR기법이로 문제를 해결한다.
 */
package cleanCode.chapert6.objectAndStructure.shapes;

import java.awt.Point;

public class SquareUserModel implements ShapeUserModel {

	private Point topLeft;
	private double side;
	
	public SquareUserModel() {
		// TODO Auto-generated constructor stub
	}
	
	public SquareUserModel(Point topLeft, double side) {
		super();
		this.topLeft = topLeft;
		this.side = side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side * side;
	}

}
