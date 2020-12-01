package mainPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float altura = 0;
		
		do {
			System.out.print("Informe a altura da pirâmide: ");
			altura = scan.nextFloat();
			
			if(altura <= 0){
				System.out.println("Erro. A altura deve ser um valor positivo.");
			}
		} while(altura <= 0);
		
		float ladoA = 0;
		do {
			System.out.print("Informe o tamanho do lado ab: ");
			ladoA = scan.nextFloat();
			if(ladoA <= 0){
				System.out.println("Erro. O lado deve ser um valor positivo.");
			}
		} while(ladoA <= 0);
		
		
		int tipoTinta = 0;
		do {
			System.out.println("Informe o tipo de tinta: 1,2 ou 3 ");
			tipoTinta = scan.nextInt();
			
			if(tipoTinta <= 0 || tipoTinta >= 4){
				System.out.println("Erro. O tipo da tinta deve estar entre 1 e 3.");
			}
		}while(tipoTinta<=0 || tipoTinta >= 4);
		
		Piramide piramide  = new Piramide();
		
		piramide.setAltura(altura);
		piramide.setLadoA(ladoA);
		piramide.setTipoTinta(tipoTinta);
		
		System.out.println("Ab: "+piramide.getLadoA());
		System.out.println("h: "+piramide.getAltura());
		System.out.println("a1: "+piramide.calcLadoA1());
		System.out.println("Área triângulo: "+piramide.calcAreaLado());
		System.out.println("Área da base: "+piramide.calcAreaBase());
		System.out.println("Área Total: "+piramide.calcAreaTotal());
		System.out.println("Tipo de tinta: "+piramide.getTipoTinta());
		System.out.println("Litros: "+piramide.calcLitrosNecessarios());
		System.out.println("Latas: "+piramide.calcLatasNecessarias());
		System.out.println("Preço: "+piramide.calcPreco());
		System.out.println("Volume: "+piramide.calcVolume());
		
	}

}
