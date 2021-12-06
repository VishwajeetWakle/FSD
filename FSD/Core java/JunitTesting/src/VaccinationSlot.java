
public class VaccinationSlot {
	/*
	 * 60-110	- 1st Slot
	 * 45-60	- 2nd Slot
	 * 18-45	- 3rd slot
	 * 1-18		- 4th slot
	 * For invalid age throw any Runtime Exception
	 */
	public String getVaccinationSlot(int age) {
		String result = "";
		if (age>=1 && age<=110) {
			if(age>=60 && age<=110) {
				result = "1st Slot";
			} else if (age>=45 && age<60) {
				result = "2nd Slot";
			} else if (age>=18 && age<45) {
				result = "3rd Slot";
			} else if (age>=1 && age<18) {
				result = "4th Slot";
			}
		}else {
			throw new IllegalArgumentException("Invalid Age");
		}
		return result;
	}
	
	
}
