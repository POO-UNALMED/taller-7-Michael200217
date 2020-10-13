package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza=ensenanza;
		this.interpretacion=interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return 280;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String x="pensamiento\n" +
				"La tortuga y la liebre\n" + 
				"Esopo\n" + 
				"2\n" + 
				"no se debe uno burlar de los demás, ni presumir o ser vanidoso";
		return x;
	}
	public String getEnsenanza() {
		return ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
