package es.unileon.prg.date;

/**
 * Representa la clase principal del programa
 */
public class Date {

	private int day;
	private int month;
	private int year;

	/**
	 * Creacion metodo Date, asignando dia, mes y anyo los valores 1/1/0917
	 */
	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 2017;
	}
	
	/**
	 * Creacion metodo Date (Date fecha) 
	 */
	public Date (Date fecha) {
		this.day=fecha.getDay();
		this.month=fecha.getMonth();
		this.year=fecha.getYear();
	}
	/**
	 * Metodo que creamos para que. si bien es mes no es el correcto o el año es menor que cero, lance una excepcion
	 * Si todo es correcto, asignamos las variables this.day=day, this.month=month, this,year=year
	 */
	public Date(int day, int month, int year) throws DateException {
		if (month < 1 || month > 12) {
			throw new DateException("\nMes " + month + " no valido" + " Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}

		if (isDayOfMonthRight(day, month)) {
			this.day = day;
			this.month = month;
			this.year = year;
		} else {
			throw new DateException("La fecha introducida no es correcta");
		}
		if(year<0) {
			throw new DateException("La fecha introducida no es correcta");
		}else {
			this.year=year;
		}
	}

	/**
	 * Creamos el método que nos dirá si un día no es correcto dependiendo del mes en
	 * el que esté. Si no es correcto para el programa y dice que no es válido
	 */
	public void setDay(int day) throws DateException {
		if (day < 1) {
			throw new DateException("El valor introducido " + day + " no es válido para los días de un mes");
		} else if (isDayOfMonthRight(day, this.month)) {
			// el this es la variable de la clase
			this.day = day;
		} else {
			throw new DateException("El valor introducido " + day + " no es válido para los días de un mes");
		}
	}

	/**
	 * Creamos el método que nos dirá que un mes distinto del 1-12 no es válido y no
	 * hará nada más
	 */
	public void setMonth(int month) throws DateException {
		if (isDayOfMonthRight(this.day, month)) {
			this.month = month;
		} else {
			throw new DateException("El valor introducido " + month + " no es válido para los meses");
		}
	}
	
	/**
	 * Metodo creamos objeto year
	 */
	public void setYear(int year) throws DateException {
		if (year < 1)
			throw new DateException("El año no puede ser negativo");
		else
			this.year = year;
	}
	/**
	 * Metodo devuelve el dia de la fecha
	 */
	public int getDay() {
		return this.day;
	}
	/**
	 * Metodo devuelve el mes de la fecha
	 */
	public int getMonth() {
		return this.month;
	}
	/**
	 * Metodo devuelve el año de la fecha
	 */
	public int getYear() {
		return this.year;
	}
	/**
	 * Metodo nos permite saber si la fecha introducida es correcta a partir de dia y el mes introducidos
	 */
	public boolean isDayOfMonthRight(int day, int month) {
		boolean result = false;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day >= 1 && day <= 31) {
				result = true;
			}
			break;
		case 2:
			if (day >= 1 && day <= 28) {
				result = true;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day >= 1 && day <= 30) {
				result = true;
			}
			break;
		}
		return result;
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	/**
	 * Metodo comprueba si a partir de dos fechas, estas tienen el mismo dia (if)
	 */
	public boolean isSameDay(Date anotherDate) {
		if (this.day == anotherDate.getDay())
			return true;
		return false;
	}
	
	/**
	 * Metodo comprueba si a partir de dos fechas, estas tienen el mismo mes (if)
	 */
	public boolean isSameMonth(Date anotherDate) {
		if (this.month == anotherDate.getMonth())
			return true;
		return false;
	}
	
	/**
	 * Metodo comprueba si a partir de dos fechas, estas tienen el mismo anyo (if)
	 */
	public boolean isSameYear(Date anotherDate) {
		if (this.year == anotherDate.getYear())
			return true;
		return false;
	}
	
	/**
	 * Metodo comprueba si las dos fechas son iguales (if)
	 */
	public boolean isSame(Date anotherDate) {
		if ((this.day == anotherDate.getDay()) && (this.month == anotherDate.getMonth())
				&& (this.year == anotherDate.getYear())) // esto podria ser if(isSameDay(anotherDate))
			return true;
		return false;
	}

	// 
	// Casos distintos a if, utilizando simplemente un return
	// return(this.day==anotherDate.getDay)--> esto daria true o false
	//
	
	/**
	 * Metodo comprueba si a partir de dos fechas, estas tienen el mismo dia (return)
	 */
	public boolean isSameDay1(Date anotherDate) {
		return (this.day == anotherDate.getDay());
	}

	/**
	 * Metodo comprueba si a partir de dos fechas, estas tienen el mismo mes (return)
	 */
	public boolean isSameMonth1(Date anotherDate) {
		return (this.month == anotherDate.getMonth());
	}

	/**
	 * Metodo comprueba si a partir de dos fechas, estas tienen el mismo anyo (return)
	 */
	public boolean isSameYear1(Date anotherDate) {
		return (this.year == anotherDate.getYear());
	}
	
	/**
	 * Metodo comprueba si dos fechas son iguales (return)
	 */
	public boolean isSame1(Date anotherDate) {
		return ((isSameDay1(anotherDate)) && (isSameMonth1(anotherDate)) && (isSameYear1(anotherDate)));
	}

	/**
	 *  Nombre del mes
	 */
	public String getMonthName(){
		String name = "";
		switch (this.month) {
		case 1:
			name = "January";
			break;
		case 2:
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
			name = "December";
			break;

		}
		return name;
	}

	/**
	 *  Season en el que está el mes
	 *  Hacemos un switch, que nos recorra los meses y printee a qué estación
	 *  pertenece, teniendo en cuenta los dias a partir del cual se cambia de estacion
	 *  
	 */
	   
	public String getSeasonName() {
		String season = "";
		switch (this.month) {
		case 1:
		case 12:
		case 2: {
			season = "Winter";
			break;
		}
		case 3:
		case 4:
		case 5: {
			season = "Spring";
			break;
		}
		case 6:
		case 7:
		case 8: {
			season = "Summer";
			break;
		}
		case 9:
		case 10:
		case 11: {
			season = "Autumn";
			break;
		}
		}
		return season;
	}

	/**
	 *  Meses quedan hasta final de anyo
	 */
	public String getMonthsLeft() {
		String left = "";
		switch (this.month) {
		case 1:
			left = "February March April May June July August September October November December ";
			break;
		case 10:
			left = "November December ";
			break;
		}
		return left;
	}
	
	/**
	 * Metodo imprime por pantalla el resultado del metodo getDaysLeftOfMonth
	 */
	public String toString1() {
		return this.day + "/" + this.month + "/" + this.year + " ";
	}
	

	/**
	 *  Dias quedan final del mes introducido
	 *  Agrupamos los casos segun el mismo numero de dias que tienen. 'Finals'
     *  calcula el total de dias de los 3 grupos distintos de meses - el día
     *  introducido
     *  
	 */ 
	public String getDaysLeftOfMonth() throws DateException {
		String end = "";
		switch (this.month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: 
			{
				for(int i=this.day+1;i<=31;i++) {
					Date fecha =new Date(i,this.month,this.year);
					end=end+fecha.toString1();
				}
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11: 
			{
				for(int j=this.day+1;j<=30;j++) {
					Date fecha =new Date(j,this.month,this.year);
					end=end+fecha.toString1();
				}
				break;
			}
			case 2: 
			{
				for(int k=this.day+1;k<=31;k++) {
				Date fecha =new Date(k,this.month,this.year);
				end=end+fecha.toString1();
				}
				break;
			}
		}
		return end;
	}

	/**
	 * Meses con el mismo numero dias que el introducido
	 * Agrupamos todos dentro de los casos en los que tienen 31, 30 y 28 (sin
	 * bisiesto) días
	 */
	public String getMonthsSameDays() {
		String same = "";
		switch (this.month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			same = "January March May July August October December ";
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			same = "April June September November ";
			break;
		}
		case 2: {
			same = "February ";
			break;
		}
		}
		return same;
	}

	/**
	 * Contar los días han pasado desde el primer dia del anio
	 * Vamos returneando la suma del dia introducido y los que han ya pasado
	 */
	public int daysPast() {
		int name =0;
		switch (this.month) {
		case 1:
			name= this.day-1;
			break;
		case 2:
			name= (this.day+31)-1;
			break;
		case 3:
			name= (this.day+31+28)-1;
			break;
		case 4:
			name= (this.day+31*2+28)-1;
			break;
		case 5:
			name= (this.day + 31 * 2 + 28 + 30)-1;
			break;
		case 6:
			name= (this.day + 31 * 3 + 28 + 30)-1;
			break;
		case 7:
			name= (this.day + 31 * 4 + 30 * 2 + 28)-1;
			break;
		case 8:
			name= (this.day + 31 * 5 + 28 + 30 * 2)-1;
			break;
		case 9:
			name= this.day + 31 * 5 + 30 * 3 + 28-1;
			break;
		case 10:
			name= this.day + 31 * 6 + 30 * 3 + 28-1;
			break;
		case 11:
			name= this.day + 31 * 6 + 30 * 4 + 28-1;
			break;
		case 12:
			name= this.day + 31 * 6 + 30 * 4 + 28-1;
			break;
		}

		return name;
	}

	/**
	 * Genera fechas al azar, cuenta los intentos hasta conseguirlo
	 */
	public int numRandomTriesEqualDate() {
		int year = this.year;
		int dia = 0;
		int mes;
		int count = 0; 
		 // Iniciamos el try-catch para crear la nueva fecha. Si no existiese el
		 // DateException no seria necesario
		try { 	
			 // Tenemos que crear el objeto puesto que es necesario crear en el while una
			 //	condicion de entrada
			 //	Se hace esto para que no coincida la primera fecha (el this.day-1)
			Date fech = new Date(this.day+1, this.month, this.year);
			while ((!this.isSameDay(fech)) || (!this.isSameMonth(fech))) {
				mes = (int) (Math.random() * 12) + 1;
				count++;
				switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: {
					dia = (int) (Math.random() * 31) + 1;
					break;
				}
				case 4:
				case 6:
				case 9:
				case 11: {
					dia = (int) (Math.random() * 30) + 1;
					break;
				}
				case 2: {
					dia = (int) (Math.random() * 28) + 1;
					break;
				}
				} 
				 //Esta es la fecha aleatoria generada
				fech = new Date(dia, mes, year);
			}
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
		return count;
	}

	/**
	 * Mismo ejercicio que el anterior con Do-While
	 */
	public int randomDateDo() {
		int year = this.year;
		int dia = 0;
		int mes;
		int count = 0;
		Date fech;
		try {
			do {
				// La fecha va dentro del bucle para que me compare todos los dias generados al
				// azar
				fech = new Date(this.day - 1, this.month, this.year);
				mes = (int) (Math.random() * 12) + 1;
				count++;
				switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: {
					dia = (int) (Math.random() * 31) + 1;
					break;
				}
				case 4:
				case 6:
				case 9:
				case 11: {
					dia = (int) (Math.random() * 30) + 1;
					break;
				}
				case 2: {
					dia = (int) (Math.random() * 28) + 1;
					break;
				}
				}

				fech = new Date(dia, mes, year);
			} while ((!this.isSameDay(fech)) || (!this.isSameMonth(fech)));
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
		return count;
	}

	 /**
	  * Dia de la semana
	  * int dia por que nos pide un int
	  */
	public String dayOfWeek(int dia) {
		int dias = daysPast();
		int week = (dias % 7);
		// Dependiendo del resto de dividir dias (que procede del resultado que hacemos
		// en el método daysSince), entre 7, tomará un valor del 0-6, correspondiendose
		// con el Domingo-Sábado
		// Debido a que es void, en la clase MainDate no haremos
		// 'System.out.println();', simplemente today.dayOfWeek (el s.o.p ya lo hacemos
		// en este metodo directamente)
		switch (week) {
		case 0:
			return "Monday";
		case 1:
			return "Tuesday";
		case 2:
			return "Wednesday";
		case 3:
			return "Thursday";
		case 4:
			return "Friday";
		case 5:
			return "Saturday";
		case 6:
			return "Sunday";
		}
		// return null por que estamos en un String
		return null;
	}
	/**
	 * Metodo creamos objeto tomorrow
	 */
	public Date tomorrow() {
		switch (this.month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10: {
			if (this.day == 31) {
				this.day = 1;
				this.month++;
				return this;
			} else {
				this.day++;
				return this;
			}
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			if (this.day == 30) {
				this.day = 1;
				this.month++;
				return this;
			} else {
				this.day++;
				return this;
			}
		}
		case 2: {
			if (this.day == 28) {
				this.day = 1;
				this.month++;
				return this;
			} else {
				this.day++;
				return this;
			}
		}
		case 12: {
			if (this.day == 31) {
				this.day = 1;
				this.month = 1;
				this.year++;
				return this;
			} else {
				this.day++;
				return this;
			}
		}
		}
		return null;
	}
	
	/**
	 * Metodo agrupa meses por los dias que estos tienen
	 */
	public int daysOfMonth() {
		switch (this.month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			return 31;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			return 30;
		}
		case 2:
			return 28;
		}
		return 0;
	}

}
