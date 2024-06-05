public class DataHora {



	private Data data;

	private Hora hora;

	

	public DataHora(Data novaData, Hora novaHora) {

		this.data = novaData;

		this.hora = novaHora;

	}

	public void setData(Data novaData) {

		this.data = novaData;

	}

	public void setHora(Hora novaHora) {

		this.hora = novaHora;

	}

	public String toString() {

		return "Data: " + this.data + "\nHora: " + this.hora;

	}

}

