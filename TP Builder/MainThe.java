public class MainThe {
    public static void main(String[] args) {
        // Commande 1 : Thé simple sans sucre ni lait
        CommandeThe commandeThe1 = new CommandeThe.ConstructeurCommandeThe("Thé vert")
                .construire();
        commandeThe1.afficherCommande();

        // Commande 2 : Thé au lait avec miel et sucre
        CommandeThe commandeThe2 = new CommandeThe.ConstructeurCommandeThe("Thé noir")
                .definirTypeLait("Lait de soja")
                .definirQuantiteSucre(1)
                .ajouterMiel()
                .construire();
        commandeThe2.afficherCommande();

        // Commande 3 : Thé citronné sans lait mais avec du sucre
        CommandeThe commandeThe3 = new CommandeThe.ConstructeurCommandeThe("Thé blanc")
                .definirQuantiteSucre(2)
                .ajouterCitron()
                .construire();
        commandeThe3.afficherCommande();
    }
}
