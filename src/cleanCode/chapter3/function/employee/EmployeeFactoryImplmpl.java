package cleanCode.chapter3.function.employee;

public class EmployeeFactoryImplmpl implements EmployeeFactory{

	@Override
	public Employee makeEmployee(EmployeeRecode r) throws InvalidEmployeeType {
		// TODO Auto-generated method stub
		switch (r.type) {
			case "HOURLY":
				return new HourlyEmp(r);
			default:
				throw new InvalidEmployeeType(r.type);
		}
	}
	

}
