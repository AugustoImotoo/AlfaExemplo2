package Exemplo2ApiReceitas.Alfa.Model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Receitas {
    public String publisher;
    public String title;
    public String source_url;
    public String recipe_id;
    public String image_url;
    public double social_rank;
    public String publisher_url;
}
