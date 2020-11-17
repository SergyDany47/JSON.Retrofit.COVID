import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;



public class PintarHTML {

	public void crearHTML(Data d) {
		String columnas = "<table><tr><th>MUNICIPIO DISTRITO</th><th>FECHA</th><th>CASOS CONFIRMADOS ULTIMOS 14-DIAS</th>";
		String cuerpo = "";
		String fin = "</table>";

		ArrayList<Integer> datos = new ArrayList<Integer>();
		for (Incidencia i : d.getData()) {
			datos.add(i.getCasos_confirmados_ultimos_14dias());
		}

		for (Incidencia i : d.getData()) {
			cuerpo += "<tr>";
			cuerpo += "<td>" + i.getMunicipio_distrito() + "</td>";
			cuerpo += "<td>" + i.getFecha_informe() + "</td>";
			cuerpo += "<td style=" + "\"" + colorearHTML(datos, i.getCasos_confirmados_ultimos_14dias()) + "\"" + ">"
					+ i.getCasos_confirmados_ultimos_14dias() + "</td>";
			cuerpo += "</tr>";

		}
		String tablaFinal = columnas + cuerpo + fin;
		introducirHTML(tablaFinal);
	}

	public void introducirHTML(String tablaFinal) {
		try {
			FileWriter fw = new FileWriter(
					"C:\\Users\\SergioO\\Desktop\\UEM-Casa\\T-3\\Workspace\\JSON.Retrofit\\src\\Tabla.html");
			fw.write(tablaFinal);
			fw.close();
			System.out.println("Se ha exportado la tabla correctamente");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String colorearHTML(ArrayList<Integer> valores, int i) {
		ArrayList<Integer>datosFinales =new ArrayList<Integer>();
		for (Integer integer : valores) {
			datosFinales.add(integer);
		}
		Collections.sort(datosFinales);
		float max = datosFinales.get(datosFinales.size()-1);
		float min = datosFinales.get(0);

		float c = (120 - ((120 / (max - min))* i + ((120 * min / (max - min)))));
		String color = "background-color:hsl(" + c + ",100%,50%)";

		return color;

	}

}
