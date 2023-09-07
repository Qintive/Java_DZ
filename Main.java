public class Main
{
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("четное!");
        } else {
            System.out.println("нечетное..");
        }

        System.out.println("Введенное число: " + number);
    }
}
