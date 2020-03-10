
public class Triangulo extends Poligono{
	
	public Triangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return (super.getBase() * super.getAltura())/2;
	}
	
	@Override
	public double perimetro() {
		return 0;
	}
}
