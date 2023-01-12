package Exemplo2ApiReceitas.Alfa.Controller;
import Exemplo2ApiReceitas.Alfa.Model.ListOfReceitas;
import Exemplo2ApiReceitas.Alfa.Service.ReceitasService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ReceitasController {

    ReceitasService receitasService;

    @GetMapping("/receitas/{title}")
    @ResponseStatus(HttpStatus.OK)
    public Flux<ListOfReceitas> ListAllReceitas(@PathVariable String title) {
        return receitasService.ListAllReceitas(title);

    }


}
