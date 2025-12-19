public class PokemonEau extends Pokemon implements Attaquant{

    public PokemonEau(String nom, int niveau, int pvMax) {
        super(nom, niveau, pvMax);
    }

    public void attaquer(){
        System.out.println(nom + " lance une attaque Pistolet à eau !");
    }
}
