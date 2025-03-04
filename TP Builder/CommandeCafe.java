public class CommandeCafe {
    private String typeCafe;
    private String typeLait;
    private int quantiteSucre;
    private boolean chantilly;
    private String sirop;

    //Constructeur privé
    private CommandeCafe(ConstructeurCommande builder) {
        this.typeCafe = builder.typeCafe;
        this.typeLait = builder.typeLait;
        this.quantiteSucre = builder.quantiteSucre;
        this.chantilly = builder.chantilly;
        this.sirop = builder.sirop;
    }

    //Méthode pour afficher la commande
    public void afficherCommande() {
        System.out.println("Commande de café :");
        System.out.println(" - Type de café : " + typeCafe);
        if (typeLait != null) {
            System.out.println(" - Type de lait : " + typeLait);
        }
        System.out.println(" - Quantité de sucre : " + quantiteSucre);
        if (chantilly){
            System.out.println(" - Chantilly : Oui");
        }
        if (sirop != null){
            System.out.println(" - Sirop :  " + sirop); 

        }
        System.out.println();


    }

    //Classe Builder interne
    public static class ConstructeurCommande {
        private String typeCafe; //Obligatoire
        private String typeLait; //Optionnel
        private int quantiteSucre = 0; // Par défaut 0
        private boolean chantilly = false; // Par défaut false
        private String sirop = null; // Par défaut null

        //Constructeur avec le type de café (obligatoire)
        public ConstructeurCommande(String typeCafe){
            this.typeCafe = typeCafe;
        } 

        //Méthodes pour configurer les options
        public ConstructeurCommande definirTypeLait(String typeLait) {
            this.typeLait = typeLait;
            return this;
        }

        public ConstructeurCommande definirQuantiteSucre(int quantiteSucre) {
            this.quantiteSucre = quantiteSucre;
            return this;
        }

        public ConstructeurCommande ajouterChantilly() {
            this.chantilly = true;
            return this;
        }

        public ConstructeurCommande ajouterSirop(String sirop) {
            this.sirop = sirop;
            return this;
        }

        // Méthode pour construire la commande
        public CommandeCafe construire() {
            if (quantiteSucre < 0){
                throw new IllegalArgumentException("La quantité de sucre ne peut pas être négative. ");
            }
            return new CommandeCafe(this);
        }
    }


    
    
}