package br.edu.fapce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import br.edu.fapce.conversor.ConversorTemperatura;

@Path("conversor/temperatura")
public class ConversorTemperaturaService {

	@GET
	@Path("fahrenheit")
	public Response celsiusParaFahrenheit(@QueryParam("temperaturaCelsius") Double temperaturaCelsius) {
	 JSONObject jsonObject = new JSONObject();
	 jsonObject.put("fahrenheit", ConversorTemperatura.converterParaFahrenheit(temperaturaCelsius));
	 return Response.status(200).entity(jsonObject.toString()).build();
	}
	
	@GET
	@Path("celsius")
	public Response fahrenheitParacelsius(@QueryParam ("temperaturaFahrenheit") Double temperaturaFahrenheit) {
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("celsius", ConversorTemperatura.converterParaCelsius(temperaturaFahrenheit));
		return Response.status(200).entity(jsonObject.toString()).build();
	}
}
