import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaJsonMonedas {
    public  Monedas consulta(String monedaOrigen, String monedaConvertir) {
        String clave="1e4604921f1500740fc36337";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"
                +clave+"/pair/"+monedaOrigen+"/"+monedaConvertir);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException("No se encontró información de la conversión"+ e.getMessage());
        }
        return new Gson().fromJson(response.body(),Monedas.class);



    }
}
