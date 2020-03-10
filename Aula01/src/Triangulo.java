
public class Triangulo extends Poligono{
	
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double base, double altura) {
		super(base, altura);
	}
	
	public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
		super(base, altura);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	@Override
	public double area() {
		return (super.getBase() * super.getAltura())/2;
	}
	
	@Override
	public double perimetro() {
		return this.lado1 + this.lado2 + this.lado3;
	}
}
