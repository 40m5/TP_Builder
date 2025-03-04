public class CommandeThe {
    private String typeThe;
    private String typeLait;
    private int quantiteSucre;
    private boolean miel;
    private boolean citron;


    //Constructeur privé
    private CommandeThe(ConstructeurCommandeThe builder){
        this.typeThe = builder.typeThe;
        this.typeLait = builder.typeLait;
        this.quantiteSucre = builder.quantiteSucre;
        this.miel = builder.miel;
        this.citron = builder.citron;
    }

    //Méthode pour afficher la commande
    public void afficherCommande() {
        System.out.println("Commande de thé :");
        System.out.println(" - Type de thé : " + typeThe);
        if (typeLait != null){
            System.out.println(" - Type de lait : " + typeLait);
        }
        System.out.println(" - Quantité de sucre : " + quantiteSucre);
        if (miel){
            System.out.println(" - Miel : Oui");
        }
        if (citron){
            System.out.println(" - Citron : Oui");
        }
        System.out.println();

    }

    //Classe Builder interne 
    public static class ConstructeurCommandeThe{
        private String typeThe; //Obligatoire
        private String typeLait; //Optionnel
        private int quantiteSucre = 0; // Par défaut 0
        private boolean miel = false; // Par défaut false
        private boolean citron = false; // Par défaut false

        //Constructeur avec le type de thé (obligatoire)
        public ConstructeurCommandeThe(String typeThe) {
            this.typeThe = typeThe;
        }

        //Méthodes pour configurer les options
        public ConstructeurCommandeThe definirTypeLait(String typeLait) {
            this.typeLait = typeLait;
            return this;
        }

        
        public ConstructeurCommandeThe definirQuantiteSucre(int quantiteSucre) {
            this.quantiteSucre = quantiteSucre;
            return this;
        }

        public ConstructeurCommandeThe ajouterMiel() {
            this.miel = true;
            return this;
        }

        public ConstructeurCommandeThe ajouterCitron() {
            this.citron = true;
            return this;
        }

        // Méthode pour construire la commande 
        public CommandeThe construire(){
            if (miel && citron){
                throw new IllegalArgumentException("Impossible d'ajouter du miel et du citron ensemble.");
            }
            return new CommandeThe(this);
        }
    }

        
    


    
}
