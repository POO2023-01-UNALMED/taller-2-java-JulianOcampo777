package test;

public class Motor {
	int numeroCilindros;
	int registro;
	String tipo;
	
	

	public void cambiarRegistro(int registro) {
		this.registro = registro;
		
	}
	
	public void asignarTipo (String tipo) {
		if (tipo == "electrico" || tipo == "gasolina") {
			this.tipo=tipo;
	}
		
	}
	
}
