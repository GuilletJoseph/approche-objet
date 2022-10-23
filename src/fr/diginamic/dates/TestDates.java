package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MM/dd");
		Date date1 = new Date();
		System.out.println(formateur.format(date1));

		
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date2 = formateur2.parse("19/05/2016 23:59:30");
		System.out.println("formateur 2  : " + formateur2.format(date2));
		
		SimpleDateFormat formateur3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		System.out.println("formateur 3  : " +formateur3.format(date2));
		System.out.println("formateur 3  : " +formateur3.format(date1));
		
		
		
		
	}

}
