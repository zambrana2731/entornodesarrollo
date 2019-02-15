package debug2;

public class Matriz3 {
	
	private int celdas[][];
	
	public Matriz3() {
		super();
		celdas = new int[3][3];
		rellenaCero();
	}
	
	public Matriz3(int a, int b, int c, int d, int e, int f, int g, int h, int i) {
		super();
		celdas = new int[3][3];
		celdas[0][0] = a;
		celdas[0][1] = b;
		celdas[0][2] = c;
		celdas[1][0] = d;
		celdas[1][1] = e;
		celdas[1][2] = f;
		celdas[2][0] = g;
		celdas[2][1] = h;
		celdas[2][2] = i;
		
	}
	
	private void rellenaCero() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				celdas[i][j] = 0;
			}
		}
	}
	
	public Matriz3 multiplica(Matriz3 m1) {
		Matriz3 mr = new Matriz3();
		
		for(int j = 2; j >= 0 ; j--) {
			for(int i = 2; i >= 0; i--) {
				for(int k = 2; k >= 0; k--) {
					mr.celdas[j][i] = this.celdas[j][k] * m1.celdas[i][k];
				}
			}
		}
		return mr;
	}
	
	@Override
	public String toString() {
		String ret = new String();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				ret += "[" + celdas[i][j] + "]";
			}
			ret += "\n";
		}
		return ret;
	}

}
