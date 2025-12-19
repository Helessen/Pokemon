public class PokemonElectrik extends Pokemon implements Attaquant{


    public PokemonElectrik(String nom, int niveau, int pvMax) {
        super(nom, niveau, pvMax);
    }

    public void attaquer(){
        System.out.println(nom + " lance une attaque FATAL FOUDRE MAGGLE !");
    }
}
