import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class ConversionDeMoneda {

    public Moneda conversionDeMoneda(String baseCode) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/3f614570fe59a24f551fc2d2/latest/" + baseCode);


            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            try {
                HttpResponse<String> response = null;
                response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                //System.out.println(json);

                Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy
                        .UPPER_CAMEL_CASE).create();

                return gson.fromJson(json, Moneda.class);
                //crea instancia Gson,
                //usa fromJson para convertir cuerpo de respuesta http (json) en objeto Pelicula
                //response.body() devuelve el cuerpo de la respuesta http como cadena de texto

            } catch (IOException | InterruptedException e ) {
                throw new RuntimeException(e);
            }

    }

    public void mostrarMenu(){
        System.out.println("********************************");
        System.out.println("1) Dolar ==> Peso argentino");
        System.out.println("2) Peso ==> Peso dolar");
        System.out.println("3) Dolar ==> Real brasileño");
        System.out.println("4) Real brasileño ==> Dolar");
        System.out.println("5) Dolar ==> Peso Colombiano");
        System.out.println("6) Peso Colombiano ==> Dolar");
        System.out.println("7) Salir");
        System.out.println("********************************");

    }

    public double operacionDeCambio(double valor, double tipoCambio){
        return (valor * tipoCambio);
    }
}
