import java.util.ArrayList;
import java.util.List;

public class Geometria {

	public static void main(String[] args) {
		List<Figura> figuras = new ArrayList<>();
		List<Retangulo> retangulos = new ArrayList<>();
	
		figuras.add(new Losango(10, 10));
		figuras.add(new Retangulo(1,5));
		figuras.add(new Quadrado(2));
		figuras.add(new Circulo(9));
		
		retangulos.add(new Retangulo(1,5));
		retangulos.add(new Quadrado(2));
		
		System.out.println("Áreas:");
		for (Figura f: figuras) {
			if (f instanceof Losango) {
				System.out.println("Losango:\nÁrea: " + f.area());
			} else if (f instanceof Retangulo) {
				//retangulos.add(f);
				System.out.println("Retangulo:\nÁrea: " + f.area());
			} else if (f instanceof Quadrado) {
				//retangulos.add(f);
				System.out.println("Quadrado:\nÁrea: " + f.area());
			} else {
				System.out.println("Círculo:\nÁrea: " + f.area());
			}
		}
		
		for(Retangulo r: retangulos) {
			if(r instanceof Quadrado) {
				System.out.println("Quadrado:\nDiagonal: " + r.diagonal());
			} else {
				System.out.println("Retangulo:\nDiagonal: " + r.diagonal());
			}
		}
	}

}
