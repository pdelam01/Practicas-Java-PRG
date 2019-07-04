package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("\nMes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		}else{
			this.month = month;
		}

		if (isDayOfMonthRight(day,month)) {
			this.day=day;
			this.month=month;
			this.year=year;
		}else{
			throw new DateException("La fecha introducida no es correcta");
		}
	}

	//Creamos el método que ns dirá si un día no es correcto dependiendo del mes en el que esté. Si no es correcto para el programa y divce que no es válido
	public void setDay(int day) throws DateException{
		if(isDayOfMonthRight(this.day, month)){
			//el this es la variable de la clase
			this.day=day;
		}else{
			throw new DateException("El valor introducido "+day+" no es válido para los días de un mes");
		}
	}

	//Creamos el método que nos dirá que un mes distinto del 1-12 no es válido y no hará nada más
	public void setMonth (int month) throws DateException{
		if(isDayOfMonthRight(day, this.month)){
			this.month=month;
		}else{
			throw new DateException("El valor introducido "+month+" no es válido para los meses");
		}
	}


	public int getDay(){
		return this.day;
	}

	public int getMonth(){
		return this.month;
	}

	public int getYear(){
		return this.year;
	}

	private boolean isDayOfMonthRight(int day, int month){
		boolean result = false;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			{
				if(day>=1 && day<=31){
					result = true;
				}
				break;
			}
			case 2: 
			{
				if(day>=1 && day<=28){
					result= true;
				}
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11:
			{
				if(day>=1 && day<=30){
					result = true;
				}
				break;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}


	//Cambiamos a isSameDay
	public boolean isSameDay (Date anotherDate){
		if(this.day==anotherDate.getDay()) 
			return true;
		return false;
	}

	public boolean isSameMonth (Date anotherDate){
		if(this.month == anotherDate.getMonth())
			return true;
		return false;
	}

	public boolean isSameYear (Date anotherDate){
		if(this.year == anotherDate.getYear())
			return true;
		return false;
	}

	public boolean isSame (Date anotherDate){
		if((this.day == anotherDate.getDay()) && (this.month == anotherDate.getMonth()) && (this.year == anotherDate.getYear())) //esto podria ser if(isSameDay(anotherDate))
			return true;
		return false;
	}

	//Casos distintos a if, utilizando simplemente un return
	//return(this.day==anotherDate.getDay)--> esto te daria true o false
	public boolean isSameDay1 (Date anotherDate){
		return(this.day==anotherDate.getDay());
	}

	public boolean isSameMonth1 (Date anotherDate){
		return(this.month==anotherDate.getMonth());
	}

	public boolean isSameYear1 (Date anotherDate){
		return(this.year==anotherDate.getYear());
	}

	public boolean isSame1 (Date anotherDate){
		return((isSameDay1(anotherDate)) && (isSameMonth1(anotherDate)) && (isSameYear1(anotherDate)));
	}


	//Nombre del mes
	public String nameMonth(){
		String name="";
		switch (this.month){
			case 1: name="Enero";
				break;
			case 2: name="Febrero";
				break;
			case 3: name= "Marzo";
				break;
			case 4: name= "Abril";
				break;
			case 5: name= "Mayo";
				break;
			case 6: name= "Junio";
				break;
			case 7: name= "Julio";
				break;
			case 8: name= "Agosto";
				break;
			case 9: name= "Septiembre";
				break;
			case 10: name= "Octubre";
				break;
			case 11: name= "Noviembre";
				break;
			case 12: name= "Diciembre";
				break;

		}
		return name;
	}


	//Season en el que está el mes
	//Hacemos un switch, que nos recorra los meses y printee a qué estación pertenece, teniendo en cuenta los dias a partir del cual se cambia de estcion
	public String seasonMonth (){
		String season="";
		switch(this.month){
			case 1: 
			case 2: 
			{
				season="Invierno";
				break;
			}
			case 3:
				if(this.day<21){
					season="Invierno";
				}else{	
					season="Primavera";
				}
				break;
			case 4:
			case 5:
			{
				season="Primavera";
				break;
			}
			case 6: 
				if(this.day<21){
					season="Primavera";
				}else{
					season="Verano";
				}
				break;
			case 7:
			case 8:
			{
				season="Verano";
				break;
			}
			case 9: 
				if(this.day<23){
					season="Verano";
				}else{
					season="Otoño";
				}
				break;
			case 10:
			case 11:
			{
				season="Otoño";
				break;
			}
			case 12: 
				if(this.day<22){
					season="Otoño";
				}else{
					season="Invierno";
				}
				break;
		}
		return season;
	}

	//Meses quedan hasta final de anyo
	public String monthLeft (){
		String left="";
		switch(this.month){
			case 1: left="Quedan 11 meses para el fin de año";
				break;
			case 2: left="Quedan 10 meses para el fin de año";
				break;
			case 3: left="Quedan 9 meses para el fin de año";
				break;
			case 4: left="Quedan 8 meses para el fin de año";
				break;
			case 5: left="Quedan 7 meses para el fin de año";
				break;
			case 6: left="Quedan 6 meses para el fin de año";
				break;
			case 7: left="Quedan 5 meses para el fin de año";
				break;
			case 8: left="Quedan 4 meses para el fin de año";
				break;
			case 9: left="Quedan 3 meses para el fin de año";
				break;
			case 10: left="Quedan 2 meses para el fin de año";
				break;
			case 11: left="Quedan 1 meses para el fin de año";
				break;
			case 12: left="Último mes del año!";
				break;
		}
		return left;
	}

	//Pasar a String el Date introducido
	public String dateString (){
		String cambio="";
		switch(this.month){
			case 1: cambio="Día "+this.day+" de Enero del año "+this.year;
				break;
			case 2: cambio="Día "+this.day+" de Febrero del año "+this.year;
				break;
			case 3: cambio="Día "+this.day+" de Marzo del año "+this.year;
				break;
			case 4: cambio="Día "+this.day+" de Abril del año "+this.year;
				break;
			case 5: cambio="Día "+this.day+" de Mayo del año "+this.year;
				break;
			case 6: cambio="Día "+this.day+" de Junio del año "+this.year;
				break;
			case 7: cambio="Día "+this.day+" de Julio del año "+this.year;
				break;
			case 8: cambio="Día "+this.day+" de Agosto del año "+this.year;
				break;
			case 9: cambio="Día "+this.day+" de Septiembre del año "+this.year;
				break;
			case 10: cambio="Día "+this.day+" de Octubre del año "+this.year;
				break;
			case 11: cambio="Día "+this.day+" de Noviembre del año "+this.year;
				break;
			case 12: cambio="Día "+this.day+" de Diciembre del año "+this.year;
				break;
		}
		return cambio;
	}

	//Dias quedan final del mes introducido
	//Agrupamos los casos segun el mismo numero de dias que tienen. 'Finals' calcula el total de dias de los 3 grupos distintos de meses - el día introducido
	public String daysEndMonth(){
		String end="";
		int totalDays=0, finals=0;
		switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			{
				totalDays=31;
				finals=totalDays-this.day;
				end="Quedan "+finals+" días para el final de mes";
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11:
			{
				totalDays=30;
				finals=totalDays-this.day;
				end="Quedan "+finals+" días para el fin de mes";
				break;
			}
			case 2:
			{
				if ((this.year % 400 == 0) || ((this.year % 100 != 0) && (this.year % 4 == 0))){
    				totalDays=29;
    				finals=totalDays-this.day;
					end="El año es bisiesto y quedan "+finals+" días para el fin de mes";
					break;
    			}else{
    				totalDays=28;
    				finals=totalDays-this.day;
					end="Quedan "+finals+" días para el fin de mes";
					break;
				}
			}
		}
		return end;
	}


	//Meses con el mismo numero dias que el introducido
	//Agrupamos todos dentro de los casos en los que tienen 31, 30 y 28 (sin bisiesto) días
	public String sameDaysMonth(){
		String same="";	
		switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			{
				same ="El mes introducido está dentro de los meses de 31 días: Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre";
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11:
			{
				same="El mes introducido pertenece al grupo de los meses con 30 días: Abril, Junio, Septiembre y Noviembre";
				break;
			}
			case 2:
			{
				same="El mes Febrero es el único de su grupo";
				break;
			}
		}
		return same;
	}


	//Contar los días han pasado desde el primer dia del anio
	//Vamos returneando la suma del dia introducido y los que han ya pasado
	public int daysSince(){
		int cuenta;
		switch(this.month){
			case 1: return this.day;
			
			case 2:return this.day+31;
				
				
			case 3:return this.day+31+28;
				
			
			case 4:return this.day+31*2+28;
				
				
			case 5:return this.day+31*2+28+30;
				
				
			case 6:return this.day+31*3+28+30;
				
				
			case 7:return this.day+31*4+30*2+28;
				
			
			case 8:return this.day+31*5+28+30*2;
				
				
			case 9:return this.day+31*5+30*3+28;
				
				
			case 10:return this.day+31*6+30*3+28;
				
				
			case 11:return this.day+31*6+30*4+28;
				
			
			case 12:return this.day+31*6+30*4+28;
				
			
		}
		
		return 0;
	}


	//Genera fechas al azar, cuenta los intentos hasta conseguirlo
	public int randomDate(){
		int year=this.year;
		int dia=0;
		int mes;
		int count=0;
		//Iniciamos el try-catch para crear la nueva fecha. Si no existiese el DateException no seria necesario
		try{
			//Tenemos que crear el objeto puesto que es necesario crear en el while una condicion de entrada
			//Se hace esto para que no coincida la primera fecha (el this.day-1)
			Date fech=new Date(this.day-1,this.month,this.year);
			while((!this.isSameDay(fech)) || (!this.isSameMonth(fech))){
				mes=(int)(Math.random()*12)+1;
				count ++;
				switch(mes){
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
					{
						dia=(int)(Math.random()*31)+1;
						break;
					}
					case 4:
					case 6:
					case 9:
					case 11:
					{
						dia=(int)(Math.random()*30)+1;
						break;
					}
					case 2:
					{
						dia=(int)(Math.random()*28)+1;
						break;
					}
				}
				//Esta es la fecha aleatoria generada
				fech=new Date (dia,mes,year);	
			}
		}
			catch (DateException e){
				System.out.println(e.getMessage());
			}
		return count;
	}

	//Mismo ejercicio que el anterior con Do-While
	public int randomDateDo(){
		int year=this.year;
		int dia=0;
		int mes;
		int count=0;
		Date fech;
		try{
			do{
				//La fecha va dentro del bucle para que me compare todos los dias generados al azar
				fech=new Date(this.day-1,this.month,this.year);
				mes=(int)(Math.random()*12)+1;
				count ++;
				switch(mes){
						case 1:
						case 3:
						case 5:
						case 7:
						case 8:
						case 10:
						case 12:
						{
							dia=(int)(Math.random()*31)+1;
							break;
						}
						case 4:
						case 6:
						case 9:
						case 11:
						{
							dia=(int)(Math.random()*30)+1;
							break;
						}
						case 2:
						{
							dia=(int)(Math.random()*28)+1;
							break;
						}
				}
					
				fech=new Date (dia,mes,year);	
			}
			while((!this.isSameDay(fech)) || (!this.isSameMonth(fech)));
		}
		catch (DateException e){
			System.out.println(e.getMessage());
		}
		return count;
	}


	//Dia de la semana
	public void dayOfWeek(){
		int dias = daysSince();
		int week = dias%7;
		//Dependiendo del resto de dividir dias (que procede del resultado que hacemos en el método daysSince), entre 7, tomará un valor del 0-6, correspondiendose con el Domingo-Sábado
		//Debido a que es void, en la clase MainDate no haremos 'System.out.println();', simplemente today.dayOfWeek (el s.o.p ya lo hacemos en este metodo directamente)
		switch(week){
			case 1: System.out.println("\nDomingo");
				break;
			case 2: System.out.println("\nLunes");
				break;
			case 3: System.out.println("\nMartes");
				break;
			case 4: System.out.println("\nMiercoles");
				break;
			case 5: System.out.println("\nJueves");
				break;
			case 6: System.out.println("\nViernes");
				break;
			case 7: System.out.println("\nSábado");
				break;
		}
	}
	


}



