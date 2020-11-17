
public class Incidencia {

	private String municipio_distrito;
	private String fecha_informe;
	private int casos_confirmados_ultimos_14dias;

	public String getMunicipio_distrito() {
		return municipio_distrito;
	}

	public void setMunicipio_distrito(String municipio_distrito) {
		this.municipio_distrito = municipio_distrito;
	}

	public String getFecha_informe() {
		return fecha_informe;
	}

	public void setFecha_informe(String fecha_informe) {
		this.fecha_informe = fecha_informe;
	}

	public int getCasos_confirmados_ultimos_14dias() {
		return casos_confirmados_ultimos_14dias;
	}

	public void setCasos_confirmados_ultimos_14dias(int casos_confirmados_ultimos_14dias) {
		this.casos_confirmados_ultimos_14dias = casos_confirmados_ultimos_14dias;
	}

	@Override
	public String toString() {
		return "Incidencia [municipio_distrito=" + municipio_distrito + ", fecha_informe=" + fecha_informe
				+ ", casos_confirmados_ultimos_14dias=" + casos_confirmados_ultimos_14dias + "]";
	}
	

}