public class MainCafe {
    public static void main(String[] args) {
        // Commande 1 : Café noir sans sucre ni lait
        CommandeCafe commande1 = new CommandeCafe.ConstructeurCommande("Expresso")
                .construire();
        commande1.afficherCommande();

        // Commande 2 : Café avec lait et sucre
        CommandeCafe commande2 = new CommandeCafe.ConstructeurCommande("Latte")
                .definirTypeLait("Lait entier")
                .definirQuantiteSucre(2)
                .construire();
        commande2.afficherCommande();

        // Commande 3 : Café gourmand avec chantilly et sirop caramel
        CommandeCafe commande3 = new CommandeCafe.ConstructeurCommande("Cappuccino")
                .definirTypeLait("Lait d'amande")
                .definirQuantiteSucre(1)
                .ajouterChantilly()
                .ajouterSirop("Caramel")
                .construire();
        commande3.afficherCommande();
    }
}