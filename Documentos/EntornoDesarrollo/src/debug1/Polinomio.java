package debug1;
import java.util.ArrayList;

public class Polinomio {
	
	private ArrayList<Integer> polinomio;
	
	public Polinomio() {
		super();
		polinomio = new ArrayList<Integer>();
		Integer i = Integer.valueOf(0);
		polinomio.add(i);
	}
	
	public Polinomio(int x) {
		super();
		polinomio = new ArrayList<Integer>();
		Integer i = Integer.valueOf(x);
		polinomio.add(i);
	}
	
	public Polinomio(int a, int x) {
		super();
		polinomio = new ArrayList<Integer>();
		polinomio.add(Integer.valueOf(a));
		Integer i = Integer.valueOf(x);
		polinomio.add(i);
	}
	
	public void addVariable(int x, int p) {
		if(x != 0) {
			Integer i = Integer.valueOf(x);
			int s = polinomio.size();
			while(s != p) {
				polinomio.add(0);
				s++;
			}
			polinomio.add(p, i);
		}
	}
	
	public int grado() {
		return this.polinomio.size();
	}
	
	public static Polinomio suma(Polinomio a, Polinomio b) {
		Polinomio r = new Polinomio();
		int min = Math.min(a.grado(), b.grado());
		int i = 0;
		while (i < min) {
			if( i == 0) {
				r.polinomio.set(0,Integer.valueOf(a.polinomio.get(i)+b.polinomio.get(i)));
			}
			else {
				r.polinomio.add(Integer.valueOf(a.polinomio.get(i)+b.polinomio.get(i)));
			}
			i++;
		}
		copy(a,r,i);
		return r;
	}
	
	public static void copy(Polinomio a, Polinomio b, int index) {
		while( index < a.grado()) {
			b.polinomio.add(a.polinomio.get(index++));
		}
	}

	@Override
	public String toString() {
		String r = new String();
		for(int i = polinomio.size()-1; i >= 0; i--) {
			if(polinomio.get(i) != 0) {
				if(i>1) {
					r+=polinomio.get(i) + "x^" + i + " + ";
				}
				else {
					if(i>0) {
						r+=polinomio.get(i) + "x" + " + ";
					}
					else {
						r+=polinomio.get(i);
					}
				}
			}
			
		}
		return r;
	}

	
}
