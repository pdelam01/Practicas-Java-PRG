package es.unileon.prg.tema6;

public class EcuacionSegundoGrado {
	private int _a;
	private int _b;
	private int _c;

	public EcuacionSegundoGrado(int a, int b, int c){
		_a=a;
		_b=b;
		_c=c;
	}

	public int geta(){
		return _a;
	}
	public int getb(){
		return _b;
	}
	public int getc(){
		return _c;
	}

	public double discriminante(){
		return Math.pow(_b,2)-(4*_a*_c);
	}

	public int soluciones(){
		double discriminante=discriminante();
		int soluciones;

		if(discriminante<0){
			soluciones=0;
		}else{
			soluciones=2;
		}
		return soluciones;
	}


	public String toString(){
		StringBuffer fin = new StringBuffer();
		double solucion1=0;
		double solucion2=0;
		double discriminante=discriminante();
		fin.append("Los coeficientes son: a="+_a+" b="+_b+" c="+_c);

		fin.append("\nSoluciones reales: "+soluciones());
		solucion1=((-1*_b)+Math.sqrt(discriminante))/(2*_a);
		fin.append("\nLa primera solucion es: "+solucion1);
		solucion2=((-1*_b)-Math.sqrt(discriminante))/(2*_a);
		fin.append("\nLa segunda solucion es: "+solucion2);

		return fin.toString();
	}
}