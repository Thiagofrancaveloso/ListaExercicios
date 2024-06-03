public class DataHora {

	private String data;
	private String hora;
	
	public DataHora (String novaData, String novaHora){
		this.data = novaData;
		this.hora = novaHora;
	}
	
	public String getData() {
		return data;
	}
	
	public String getHora() {
		return hora;
	}
	
	public void setData (String novaData) {
		this.data = novaData;
	}
	
	public void setHora (String novaHora) {
		this.hora = novaHora;
	}
}
