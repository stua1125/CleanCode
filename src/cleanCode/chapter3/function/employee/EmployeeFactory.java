package cleanCode.chapter3.function.employee;

public interface EmployeeFactory {
	public Employee makeEmployee(EmployeeRecode r) throws InvalidEmployeeType;
}

