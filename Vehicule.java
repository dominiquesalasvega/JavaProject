public class Vehicule {

    protected String marque;
    protected String modele;
    protected double prix;
    
      // constructeur
      public Vehicule(String marque, String modele, double prix) {
        this.marque=marque;
        this.modele=modele;
        this.prix=prix;
      }
      void afficher() {
        System.out.println("[Vehicule] marque:" + marque +
                           ", modèle:" + modele + 
                           " (prix jour : " +  prix + " Eur)");
      }
    }
    