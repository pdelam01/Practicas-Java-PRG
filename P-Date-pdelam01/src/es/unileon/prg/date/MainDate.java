package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {

		Date today;

		try {
			today = new Date(3, 9, 2017);
			System.out.println(today.toString());
			System.out.println("\n"+today.nameMonth());
			System.out.println("\n"+today.seasonMonth());
			System.out.println("\n"+today.monthLeft());
			System.out.println("\n"+today.dateString());
			System.out.println("\n"+today.daysEndMonth());
			System.out.println("\n"+today.sameDaysMonth());
			System.out.println("\nEl número de días que han pasado desde el inicio de año: "+today.daysSince());
			System.out.println("\n[WHILE] El número de intentos ha sido de: "+today.randomDate());
			System.out.println("\n[DO-WHILE] El número de intentos ha sido de: "+today.randomDateDo());
			today.dayOfWeek();
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
	}
}