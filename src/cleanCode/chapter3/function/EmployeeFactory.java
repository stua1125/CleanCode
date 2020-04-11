package cleanCode.chapter3.function;

public interface EmployeeFactory {
	public Employee makeEmployee(EmployeeRecode r) throws InvalidEmployeeType;
}

