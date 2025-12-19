public abstract class Pokemon {
    String nom;
    int niveau;
    int pvMax;

    public Pokemon(String nom, int niveau, int pvMax) {
        this.nom = nom;
        this.niveau = niveau;
        this.pvMax = pvMax;
    }

    public void afficherInfo(){
        System.out.println("Vous avez un " + nom + " de niveau " + niveau + " avec "+ pvMax + " PV.");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPvMax() {
        return pvMax;
    }

    public void setPvMax(int pvMax) {
        this.pvMax = pvMax;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                ", pvMax=" + pvMax +
                '}';
    }
}
