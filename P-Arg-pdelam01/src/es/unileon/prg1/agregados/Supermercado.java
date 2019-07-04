package es.unileon.prg1.agregados;
/**
 * Clase que representa un supermercado caracterizado por un
 * nombre y que incluye un almacén de productos.
 *
 * @author PRG
 * @version 1.0
 */
class Supermercado{

	/**
	 * Nombre del supermercado
	 */ 
	private String nombre;
	/**
	 * Almacen de productos
	 */
	private Almacen almacen;
	

	/**
	 * Constructor del supermercado a partir del nombre del mismo.
	 */
	Supermercado(String nombre){
		this.nombre = nombre;
		this.almacen = new Almacen();
	}

	/**
	 * Método que sirve para intentar aniadir un nuevo producto
	 * al almacen. Esto sera posible siempre y cuando el producto
	 * no se encuentre ya en el almacen, y el almacen siga
	 * disponiendo de sitio para su almacenaje.
	 *
	 * @param producto producto que se desea aniadir al almacen
	 * @return verdadero si ha sido posible aniadir el producto
	 * y falso en caso contrario
	 */
	boolean anyadir(Producto producto){
		boolean resultado= true;
		if(producto!=null) {
			if(!almacen.anyadir(producto)) {
				resultado=false;
			}else {
				resultado=true;
			}
		}
		return resultado;
	}
	

	/**
	 * Trata de localizar un producto en el almacen a partir de
	 * su nombre.
	 *
	 * @param producto nombre del producto que se desea localizar
	 * @return el producto, en caso de encontrarlo, o null en caso
	 * contrario.
	 */
	Producto buscar(String producto){
		int contador=0;
		Producto producto1=null;
		
		if(almacen.productos[contador]!=null) {
			while((almacen.buscar(almacen.productos[contador].obtenerNombre())!=null)) {
				if(almacen.productos[contador].obtenerNombre().equals(producto)) {
					producto1= almacen.productos[contador];
				}
				contador++;
			}
		}
		return producto1;
	}
	
		

	/**
	 * 
	 *
	 */
	public String toString(){
		StringBuffer exit = new StringBuffer();
		exit.append(" "+this.nombre);
		for(int i=0; i<10;i++) {
			exit.append(" "+almacen.productos[i]);
		}
	return exit.toString();
	}

}
