public class Main {

    public static void main(String[] args) {

        natoAlphabet('a');
        natoAlphabet('A');
        natoAlphabet('B');
        natoAlphabet('C');
        natoAlphabet('D');
        natoAlphabet('E');

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(10);

    }

    public static void natoAlphabet(char character) {

        switch (character) {

            case 'A':
                System.out.println("Character 'A' is Able");
                break;
            case 'B':
                System.out.println("Character 'B' is Baker");
                break;
            case 'C':
                System.out.println("Character 'C' is Charlie");
                break;
            case 'D':
                System.out.println("Character 'D' is Dog");
                break;
            case 'E':
                System.out.println("Character 'E' is Easy");
                break;
            default: System.out.println("Character " + "'" + character + "'" + " is invalid. Try a different One.");
        }
    }

    public static void printDayOfWeek(int day) {

        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfTheWeek);
    }
}

