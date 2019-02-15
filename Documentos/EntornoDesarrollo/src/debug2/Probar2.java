package debug2;

public class Probar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona pers[];
		pers = new Persona[10];
		pers[1] = new Persona();
		pers[1].setDni("11111111B");
		pers[1].setNombre("Juan");
		pers[1].setEdad(20);
		pers[2] = new Persona();
		pers[2].setDni("11111111B");
		pers[2].setNombre("Juan");
		pers[2].setEdad(20);
		pers[3] = new Persona("1234567A","Pepe",21);
		pers[4] = new Persona("2222222B","Ana",19);
		pers[5] = new Persona("3333333C","Bea",22);
		for(int i = 0; i < 9;) {
			if(pers[++i] != null) {
				System.out.println(pers[i].toString());
			}
			else {
				if(pers[i] != null) {//Prueba a quitar este if y else, que aparentemente es innecesario, y deja solo el println("Vacío"). Luego arréglalo 
					System.out.println(pers[i].toString());
				}
				else {
					System.out.println("Vacío");
				}
			}
		}
		if(pers[1].mismaPersona(pers[1])) {
			System.out.println("Son lo mismo p1 y p1");
		}
		else {
			System.out.println("No son lo mismo p1 y p1");
		}
		if(pers[2].mismaPersona(pers[1])) {
			System.out.println("Son lo mismo p1 y p2"); //¿Por qué no son lo mismo? Mostrar una expresión (watch) en el punto donde no se evalúa como se espera
		}
		else {
			System.out.println("No son lo mismo p1 y p2");
		}
		
		
		Matriz3 m1 = new Matriz3();
		Matriz3 m2 = new Matriz3(2,0,1,3,0,0,5,1,1);
		Matriz3 m3 = new Matriz3(1,0,1,1,2,1,1,1,0);
		Matriz3 mbuena = new Matriz3(3,1,2,3,0,3,7,3,6);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		Matriz3 m4 = m2.multiplica(m3); //Mostrar al profesor y explicar con una expresión (watch) donde se comete el fallo
		System.out.println("Multiplicamos la segunda por la tercera. Resulta:");
		System.out.println(m4);
		System.out.println("El resultado correcto sería:");
		System.out.println(mbuena);
	}

}
