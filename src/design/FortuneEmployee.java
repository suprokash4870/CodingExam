package design;

public class FortuneEmployee{

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo employeeInfo = new EmployeeInfo();

				employeeInfo.employeeId();             //Override Interface method from Employee class
				employeeInfo.employeeName();           //Override Interface method from Employee class
				employeeInfo.assignDepartment();       //Override Interface method from Employee class
				employeeInfo.calculateSalary();         //Override Interface method from Employee class
				employeeInfo.benefitLayout();           //Override Interface method from Employee class
				employeeInfo.ssn();                     //Override Interface method from Employee class
				employeeInfo.joiningDate();             //Override Interface method from Employee class

				System.out.println("***********");

				employeeInfo.CalculatePensionBenefit(); //Override Abstract method from NewEmployee class
				employeeInfo.DateOfBirth();             //Override from NewEmployee class
				employeeInfo.leaveAllowance();          //Inherited from NewEmployee class
		 		employeeInfo.travellingAllowanve();     //Inherited from NewEmployee class

				System.out.println("***********");

				Employee emp = new EmployeeInfo();      //Polymorphism from Employee class
				emp.employeeId();						//(here child class object is referred by
				emp.employeeName();                      //parent class reference variable)
				emp.assignDepartment();
				emp.benefitLayout();
				emp.calculateSalary();

	}


}
