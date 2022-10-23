package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		cal.set(2016, 6, 19, 23, 59, 30);
		Date date = cal.getTime();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println(formateur.format(date));
		
	Calendar cal2 = Calendar.getInstance();
	Date date2 = cal2.getTime();
	SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
	System.out.println(formateur2.format(date2));
	SimpleDateFormat formateurFrance = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.FRANCE);
	System.out.println(formateurFrance.format(date2));
	SimpleDateFormat formateurChinese = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.CHINESE);
	System.out.println(formateurChinese.format(date2));
	SimpleDateFormat formateurAllem = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.GERMAN);
	System.out.println(formateurAllem.format(date2));	
	
	System.out.println("en Russe existe plus!");
		
	}

}
