public class final {
    import java.util.Scanner;

public class DatingSimulatorSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrée utilisateur
        System.out.print("Quel est ton genre (homme/femme) ? ");
        String genre = sc.nextLine();

        System.out.print("Quelle est ta taille en cm ? ");
        int taille = sc.nextInt();
        int scoreTaille = (taille >= 175) ? 15 : (taille >= 165 ? 10 : 5);

        System.out.print("Quel est ton salaire annuel ($) ? ");
        double salaire = sc.nextDouble();
        int scoreSalaire = (salaire >= 80000) ? 15 : (salaire >= 50000 ? 10 : 5);

        System.out.println("Ton niveau d'éducation : ");
        System.out.println("1. Au secondaire (moyenne 75 et moins)");
        System.out.println("2. Au secondaire (moyenne plus de 75)");
        System.out.println("3. Université ou collège");
        System.out.print("Choisis 1, 2 ou 3 : ");
        int education = sc.nextInt();
        int scoreEducation = (education == 3) ? 15 : (education == 2 ? 10 : 5);

        System.out.print("Note ta vie sociale sur 10 : ");
        int social = sc.nextInt();
        int scoreSocial = (social >= 8) ? 15 : (social >= 5 ? 10 : 5);

        System.out.print("Combien de relations sérieuses as-tu eues ? ");
        int relations = sc.nextInt();
        int scoreRelations = (relations >= 3) ? 15 : (relations >= 1 ? 10 : 5);

        System.out.print("Note ta confiance en toi sur 10 : ");
        int confiance = sc.nextInt();
        int scoreConfiance = (confiance >= 8) ? 15 : (confiance >= 5 ? 10 : 5);

        sc.nextLine(); // vide le buffer
        System.out.print("Choisis un intérêt (musique, sport, lecture, voyage) : ");
        String interet = sc.nextLine().toLowerCase();
        int scoreInteret = (interet.equals("sport") || interet.equals("voyage")) ? 10 : 7;

        // Score total
        int scoreTotal = scoreTaille + scoreSalaire + scoreEducation + scoreSocial +
                         scoreRelations + scoreConfiance + scoreInteret;

        // Identifier le point le plus faible
        int plusBas = scoreTaille;
        String critereFaible = "taille";
        if (scoreSalaire < plusBas) { plusBas = scoreSalaire; critereFaible = "salaire"; }
        if (scoreEducation < plusBas) { plusBas = scoreEducation; critereFaible = "éducation"; }
        if (scoreSocial < plusBas) { plusBas = scoreSocial; critereFaible = "vie sociale"; }
        if (scoreRelations < plusBas) { plusBas = scoreRelations; critereFaible = "expérience amoureuse"; }
        if (scoreConfiance < plusBas) { plusBas = scoreConfiance; critereFaible = "confiance en soi"; }
        if (scoreInteret < plusBas) { plusBas = scoreInteret; critereFaible = "intérêt"; }

        // Résultat
        System.out.println("\n---------------------------------");
        System.out.println("Ton score final : " + scoreTotal + " / 100");
        if (scoreTotal >= 80) {
            System.out.println("WOW, tu as un excellent profil ! Tu as de très bonnes chances.");
        } else if (scoreTotal >= 60) {
            System.out.println("Ton profil est bon, mais tu pourrais améliorer certains aspects.");
        } else {
            System.out.println("Tu peux améliorer ton profil pour avoir plus de chances.");
        }

        // Conseil personnalisé + Follow-up
        System.out.println("\nTon point qui est statistiquement le plus faible : " + critereFaible);
        if (critereFaible.equals("taille")) {
            System.out.println("Conseil : Travaille ta posture et porte des vêtements qui te mettent en valeur.");
            System.out.print("Es-tu insécure par rapport à ta taille ? (oui/non) : ");
            String reponse = sc.nextLine().toLowerCase();
            if (reponse.equals("non")) {
                System.out.println("Tu seras sans doute à 100/100 dans le futur. La confiance, c'est tout !");
            } else {
                System.out.println("La mentalité est tout. Sois fier de qui tu es !");
            }
        } else if (critereFaible.equals("salaire")) {
            System.out.println("Conseil : Essaie de trouver un emploi plus stable ou un revenu en plus.");
            System.out.print("As-tu un plan pour améliorer ton revenu ? (oui/non) : ");
            String reponse = sc.nextLine().toLowerCase();
            if (reponse.equals("oui")) {
                System.out.println("C'est un bon début. Continue comme ça !");
            } else {
                System.out.println("Réfléchis à tes options, chaque petit pas compte.");
            }
        } else if (critereFaible.equals("éducation")) {
            System.out.println("Conseil : Pense à faire des cours pour améliorer ton profil.");
            System.out.print("Es-tu motivé à apprendre plus ? (oui/non) : ");
            String reponse = sc.nextLine().toLowerCase();
            if (reponse.equals("oui")) {
                System.out.println("C'est parfait, apprendre fait toujours progresser !");
            } else {
                System.out.println("Il n'est jamais trop tard pour essayer. Commence petit !");
            }
        } else if (critereFaible.equals("vie sociale")) {
            System.out.println("Conseil : Va à des événements et connecte-toi avec plus de gens.");
            System.out.print("Est-ce que tu veux améliorer ta vie sociale ? (oui/non) : ");
            String reponse = sc.nextLine().toLowerCase();
            if (reponse.equals("oui")) {
                System.out.println("Courage, ça commence par dire bonjour !");
            } else {
                System.out.println("Parfois, sortir un peu peut faire une grosse différence.");
            }
        } else if (critereFaible.equals("expérience amoureuse")) {
            System.out.println("Conseil : Prends ton temps, chaque expérience compte.");
            System.out.print("Est-ce que ça te dérange ? (oui/non) : ");
            String reponse = sc.nextLine().toLowerCase();
            if (reponse.equals("non")) {
                System.out.println("Parfait. Tu vis ta vie à ton rythme !");
            } else {
                System.out.println("Ne t'en fais pas. L'amour vient quand on s'y attend le moins.");
            }
        } else if (critereFaible.equals("confiance en soi")) {
            System.out.println("Conseil : Fixe-toi des petits objectifs faciles.");
            System.out.print("As-tu confiance en toi parfois ? (oui/non) : ");
            String reponse = sc.nextLine().toLowerCase();
            if (reponse.equals("oui")) {
                System.out.println("Appuie-toi sur ces moments. Ils te rendent plus fort !");
            } else {
                System.out.println("Travaille sur toi un peu chaque jour. Tu y arriveras.");
            }
        } else if (critereFaible.equals("intérêt")) {
            System.out.println("Conseil : Essaie de diversifier tes passions et les partager.");
            System.out.print("Est-ce que tu fais souvent des nouvelles activités ? (oui/non) : ");
            String reponse = sc.nextLine().toLowerCase();
            if (reponse.equals("oui")) {
                System.out.println("C'est super, ça t'aide à mieux te connaître !");
            } else {
                System.out.println("N'aie pas peur d'essayer. Même une fois, ça change tout.");
            }
        }

        // Message final
        System.out.println("\nMerci d'avoir utilisé ce simulateur !");
        System.out.println("N'hésite pas à refaire le test avec un ami ou un membre de ta famille !");
        System.out.println("---------------------------------");
        sc.close();
    }
}
}
