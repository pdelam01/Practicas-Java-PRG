package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {

		Date today;

		try {
			today = new Date(22, 2, 2017);
			System.out.println(today.isDayOfMonthRight(1,1));
			System.out.println(today.toString());
			System.out.println("\n"+today.getMonth());
			System.out.println("\n"+today.getSeasonName());
			System.out.println("\n"+today.getMonthsLeft());
			System.out.println("\n"+today.daysOfMonth());
			System.out.println("\n"+today.getMonthsSameDays());
			System.out.println("\nEl número de días que han pasado desde el inicio de año: "+today.daysPast());
			System.out.println("\n[WHILE] El número de intentos ha sido de: "+today.numRandomTriesEqualDate());
			System.out.println("\n[DO-WHILE] El número de intentos ha sido de: "+today.randomDateDo());
			System.out.println("\n Dia de la semana: "+today.dayOfWeek(1));
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
	}
}