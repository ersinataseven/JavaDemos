public class Main {
    public static void main(String[] args) {

        // Kalın ve ince sesli harfleri belirleme.

        char harf = 'A';

        switch (harf) {
            case 'A':
            case 'O':
            case 'I':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");

    }
}