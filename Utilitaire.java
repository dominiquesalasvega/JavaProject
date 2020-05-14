class Utilitaire extends Vehicule {

    private double cubage;
    
      // constructeur
      public Utilitaire(String marque, String modele, double prix, double cubage) {
        super(marque,modele,prix);
        this.cubage=cubage;
      }
      // affiche
      public void afficher() {
        System.out.println("[Utilitaire] marque:" + marque +
                          ", modèle:" + modele +
                          " (prix jour : " + prix +
                          " Eur)  (" + cubage +
                          " m3)");
      }
    }