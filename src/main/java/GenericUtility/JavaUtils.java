package GenericUtility;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class JavaUtils 
{
	/**
	 * This method is used to get Random int value.
	 * @return
	 */
public int getRandomno()
{
	Random ran = new Random();
	int random = ran.nextInt(1000);
	return random;
}
public String systemdate()
{
    LocalDate date = LocalDate.now();
    DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String systemdate = d.format(date);
	return systemdate;
}
public String sysDate()
{
	Date date = new Date();
	
	SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
	String systemDataInFormat = sim.format(date);
	return systemDataInFormat;
}
public String futureDateInTermsofMonths(long futureMon)
{
	LocalDate date = LocalDate.now();
	LocalDate future = date.plusMonths(futureMon);
	
	DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String futureMonth = d.format(future);
	return futureMonth;
}
}
	
	
	
	


