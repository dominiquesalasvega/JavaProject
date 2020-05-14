public class Voiture extends Vehicule {

    private int  portes;
    
    // constructeur
    public Voiture(String marque, String modele, double prix, int portes ) {
      super(marque,modele,prix);
      this.portes=portes;
    }
    
    public void afficher() {
    System.out.println("[Voiture] marque:" + marque +
                          ", modèle:" + modele +
                          " (prix jour : " + prix +
                          " Eur)  (" + portes +
                          " portes)");
      }
    }