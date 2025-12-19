import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        Pokemon pok1 = new PokemonElectrik("Pikachu", 55, 107);
        Pokemon pok2 = new PokemonFeu("Salamiche", 5, 18);
        Pokemon pok3 = new PokemonEau("Moruereine", 12, 32);

        List<Pokemon> pokedex= new ArrayList<>();
        pokedex.add(pok1);
        pokedex.add(pok2);
        pokedex.add(pok3);

        //pokedex.forEach(System.out::println);
        ((PokemonElectrik) pok1).attaquer();
        ((PokemonFeu) pok2).attaquer();
        ((PokemonEau) pok3).attaquer();
    }
}
