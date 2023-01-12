package Exemplo2ApiReceitas.Alfa.Model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ListOfReceitas {
    public int count;
    public List<Receitas> recipes;
}
