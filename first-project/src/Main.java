public class Main {
    static void main() {
        int yearOfRelease = 1800;
        boolean includeInPlan = true;
        double ratingOfMovie = 9.2;
        String tipePlan = "plus";

        if (yearOfRelease >= 2022) {
            System.out.println("Lançamentos");
        } else {
            System.out.println("Filme retrô e antigo");
        }

        if (includeInPlan == true && tipePlan.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Necessario pagar a locação!!");
        }
    }
}