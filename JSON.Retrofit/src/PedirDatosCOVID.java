import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PedirDatosCOVID {

	public void pedirDatos() {
		Retrofit retrofit = new Retrofit.Builder().baseUrl("http://datos.comunidad.madrid/")
				.addConverterFactory(GsonConverterFactory.create()).build();
		InterfazCOVID service = retrofit.create(InterfazCOVID.class);

		Call<Data> datos = service.recuperarDatos();
		datos.enqueue(new Callback<Data>() {

			@Override
			public void onResponse(Call<Data> call, Response<Data> response) {
				PintarHTML pintarTabla = new PintarHTML();
				Data d = response.body();
				System.out.println("DATOS PEDIDOS CORRECTAMENTE");
				pintarTabla.crearHTML(d);
			}

			@Override
			public void onFailure(Call<Data> call, Throwable t) {
				// TODO Auto-generated method stub

			}
		});
		
	}
}
