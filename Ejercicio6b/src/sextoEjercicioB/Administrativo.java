package sextoEjercicioB;

public class Administrativo extends Empleado {
	
	private int hsMes;
	private int hsExtra;
	
	public int getHsMes() {
		return hsMes;
	}
	public void setHsMes(int hsMes) {
		this.hsMes = hsMes;
	}
	public int getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(int hsExtra) {
		this.hsExtra = hsExtra;
	}
	
	public double getSueldo() {
		
		return getSueldoBase() * ((getHsExtra() * 1.5) + getHsMes() )/getHsMes(); 
	}
	

}
