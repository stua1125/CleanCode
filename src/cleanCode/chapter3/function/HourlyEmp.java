package cleanCode.chapter3.function;

import java.math.BigDecimal;

public class HourlyEmp extends Employee {

	@Override
	public boolean isPayDay() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean calculatePay() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public HourlyEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HourlyEmp(EmployeeRecode r) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getMoney() {
		// TODO Auto-generated method stub
		return super.getMoney();
	}

	@Override
	public void setMoney(BigDecimal money) {
		// TODO Auto-generated method stub
		super.setMoney(money);
	}
	
	
	
}
