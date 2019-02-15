package debug2;

public class Persona {
	
	private String dni;
	private String nombre;
	private int edad;
	
	public Persona() {
		super();
		dni = "";
		nombre = "";
		edad = 0;
	}
	
	public Persona(String d, String n, int e) {
		super();
		dni = d;
		nombre = n;
		edad = e;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean mismaPersona(Persona p) {
		return this == p;
	}
	
	public void sumaAño() {
		this.edad++;
	}

	@Override
	public String toString() {
		return "DNI:" + dni + ", nombre: " + nombre + ", edad: " + edad	;
	}

}
