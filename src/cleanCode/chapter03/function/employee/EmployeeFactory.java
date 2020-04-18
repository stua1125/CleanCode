package cleanCode.chapter03.function.employee;

public interface EmployeeFactory {
	public Employee makeEmployee(EmployeeRecode r) throws InvalidEmployeeType;
}

