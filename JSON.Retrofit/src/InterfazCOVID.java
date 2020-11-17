import retrofit2.Call;
import retrofit2.http.GET;

public interface InterfazCOVID {
	// http://datos.comunidad.madrid/
	@GET("catalogo/dataset/7da43feb-8d4d-47e0-abd5-3d022d29d09e/resource/877fa8f5-cd6c-4e44-9df5-0fb60944a841/download/covid19_tia_muni_y_distritos_s.json")
	Call<Data> recuperarDatos();

}
