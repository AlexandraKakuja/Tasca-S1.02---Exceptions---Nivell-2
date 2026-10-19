package nivell2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Torna-ho a provar.");
            } finally {
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Torna-ho a provar.");
            } finally {
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Torna-ho a provar.");
            } finally {
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Torna-ho a provar.");
            } finally {
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine();

            try {
                if (input.length() != 1) {
                    throw new InvalidInputException(
                            "Cal introduir exactament un caràcter."
                    );
                }
                return input.charAt(0);
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static boolean readYesNo(String message) {
        while (true) {
            System.out.println(message + " (s/n)");
            String input = scanner.nextLine();

            try {
                if (input.equals("s")) {
                    return true;
                } else if (input.equals("n")) {
                    return false;
                }

                throw new InvalidInputException(
                        "Entrada no vàlida. Introdueix 's' o 'n'."
                );
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
