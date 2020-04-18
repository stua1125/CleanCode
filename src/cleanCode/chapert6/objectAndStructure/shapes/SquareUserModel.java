/**
 * p.121 ���Լ��� �߰��ϰ� �ʹٸ� ���� Ŭ������ ���� ���ľ��Ѵ�.
 * VISOTOR����̷� ������ �ذ��Ѵ�.
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
