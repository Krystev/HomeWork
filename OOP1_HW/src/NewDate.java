
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewDate extends java.util.Date {

	DateFormat dateFormat = new SimpleDateFormat("dd/MM");
	Date date = new Date();
	String stringDate = dateFormat.format(date);

	int day;
	int month;
	int year;

	

	public NewDate() {
		super();

	}

	public NewDate(int newYear, int newMonth, int newDay) {
		super(newYear, newMonth, newDay);

		this.day = newDay;
		this.month = newMonth;
		this.year = newYear;

	}
	
	public boolean isHoliday() {
		
		String insertDate = day + "/" + month;
		System.out.println(insertDate);
		if (stringDate.equals("01/01") || stringDate.equals("02/01")
				|| stringDate.equals("03/03") || stringDate.equals("01/05")
				|| stringDate.equals("06/05") || stringDate.equals("24/05")
				|| stringDate.equals("06/09") || stringDate.equals("22/09")
				|| stringDate.equals("01/11") || stringDate.equals("24/12")
				|| stringDate.equals("25/12") || stringDate.equals("26/12")) {

			return true;

		} else if (insertDate.equals("1/1") || insertDate.equals("2/1")
				|| insertDate.equals("3/3") || insertDate.equals("1/5")
				|| insertDate.equals("6/5") || insertDate.equals("24/5")
				|| insertDate.equals("6/9") || insertDate.equals("22/9")
				|| insertDate.equals("1/11") || insertDate.equals("24/12")
				|| insertDate.equals("25/12") || insertDate.equals("26/12")) {
			return true;
		}
		return false;
	}

}
