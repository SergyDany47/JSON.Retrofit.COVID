import java.util.List;

public class Data {

	private List<Incidencia> data;

	public List<Incidencia> getData() {
		return data;
	}

	public void setData(List<Incidencia> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data [data=" + data + "]";
	}
	
}
