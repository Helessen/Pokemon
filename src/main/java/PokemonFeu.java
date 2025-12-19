public class PokemonFeu extends Pokemon implements Attaquant {


    public PokemonFeu(String nom, int niveau, int pvMax) {
        super(nom, niveau, pvMax);
    }

    public void attaquer(){
        System.out.println(nom + " lance une attaque Flammèche !");
    }
}
