package cleanCode.chapter3.function;

import java.math.BigDecimal;

public abstract class Employee {
	public abstract boolean isPayDay();
	public abstract boolean calculatePay();
	private BigDecimal money;
	
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	
}
