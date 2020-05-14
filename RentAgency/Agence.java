import java.util.Vector;

public class Agence {

  private String nom;
  Vector<Vehicule> flotte = new Vector<Vehicule>();

  public Agence (String nom) {
     this.nom = nom;
  }

  public void ajouter_flotte(Vehicule v) {
    flotte.add(v);
  }

  void afficher_flotte() {
    for (Vehicule v : flotte)
      v.afficher();

  }

}