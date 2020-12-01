package mainPackage;

public class Piramide {
	private float altura;
	private float ladoA;
	private int tipoTinta;
	
	public float calcLadoA1() {
		return (float) Math.sqrt((altura * altura) + (ladoA * ladoA));
	}
	
	public float calcAreaBase() {
		return ladoA * ladoA * 4;
	}
	
	public float calcAreaLado() {
		return (2 * ladoA * calcLadoA1()) /2;
	}
	
	public float calcVolume() {
		return calcAreaBase()  * altura /3 ;
	}
	
	public float calcAreaTotal() {
		return calcAreaBase() + (4 * calcAreaLado());
	}
	
	public float calcLitrosNecessarios() {
		return calcAreaTotal() / 4.76f;
	}
	
	public int calcLatasNecessarias() {
		return (int) Math.ceil(calcLitrosNecessarios() / 18);
	}
	
	public float calcPreco() {
		float custo = 0;
		
		switch (tipoTinta) {
			case 1: {
				custo = 127.90f;
				break;
			}
			case 2: {
				custo = 258.98f;
				break;
			}
			case 3:{
				custo = 344.34f;
				break;
			}
			default:
				return 0f;
		}
		
		return calcLatasNecessarias() * custo;
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getLadoA() {
		return ladoA;
	}
	public void setLadoA(float ladoA) {
		this.ladoA = ladoA;
	}
	public int getTipoTinta() {
		return tipoTinta;
	}
	public void setTipoTinta(int tipoTinta) {
		this.tipoTinta = tipoTinta;
	}
	
	
}
