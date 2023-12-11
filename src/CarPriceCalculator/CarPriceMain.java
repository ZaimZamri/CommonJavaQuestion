package CarPriceCalculator;

import java.util.Scanner;

/**
 * 
 * @author ZaimZamri
 */
public class CarPriceMain {
	
	public static void logic() {
		SalaryBean bean = new SalaryBean();
		Scanner scanner = new Scanner(System.in);
		boolean isValid = Boolean.FALSE;
	    System.out.println("Enter Your Monthly Salary: ");

	    while(!isValid) {
	    	if(scanner.hasNextDouble()) {
	    		double salary = scanner.nextDouble();
	    	    bean.setSalary(salary);
	    	    isValid = Boolean.TRUE;
	    	}else {
	    		System.out.println("Invalid input. Please enter correct salary:");
                scanner.next();
	    	}
	    }
	    bean.setYearlySalary(bean.getSalary()*CommonConstant.TWELVE_MONTH);
	    String formattedValue = String.format(CommonConstant.DOUBLE_TWO_DECIMAL, bean.getYearlySalary());
	    System.out.println("Your Recommended car price: RM "+formattedValue);
	    System.out.println("*Formula for this calculation: Monthly salary * 12 months");
	    scanner.close();
	}
}
