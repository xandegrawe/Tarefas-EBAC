package classeCarros;

/**
 * 
 * @author Alexandre.Grawe
 *
 */
public class Carros {
	/**
	 * @param args
	 */
	private String Marca;
	private String Modelo;
	private int Ano;
	
	public static void main(String[] args) {
		System.out.print("Bem Vindo à pesquisa de carros \n");
	}
		
	
	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}



	public int getAno() {
		return Ano;
	}



	public void setAno(int ano) {
		Ano = ano;
	}


	public String getMarca() {
		return Marca;
	}



	public void setMarca(String marca) {
		Marca = marca;
	}

}
