
public class Quadrado extends Retangulo {
	
	public Quadrado(double aresta) {
		super(aresta, aresta);
	}
	
	@Override
	public double perimetro() {
		return super.getBase() * 4;
	}
	
}
