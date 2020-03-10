
public class Circulo extends Figura{

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return this.raio * this.raio * Math.PI;
	}
	
	@Override
	public double perimetro() {
		return 2 * Math.PI * this.raio;
	}
}
