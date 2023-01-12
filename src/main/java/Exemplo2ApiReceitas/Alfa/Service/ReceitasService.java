package Exemplo2ApiReceitas.Alfa.Service;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import Exemplo2ApiReceitas.Alfa.Model.*;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class ReceitasService {

    private final WebClient webClient = WebClient.create();
    public Flux<ListOfReceitas> ListAllReceitas(String title) {
        String url = "https://forkify-api.herokuapp.com/api/search?q=" + title;
        return webClient
                .get()
                .uri(url)
                .accept(APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(ListOfReceitas.class);
    }

}

