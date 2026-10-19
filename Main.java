package nivell2;

public class Main {
    public static void main(String[] args) {
        byte byteValue = ConsoleReader.readByte("Introdueix un byte:");
        System.out.println("Byte: " + byteValue);

        int intValue = ConsoleReader.readInt("Introdueix un enter:");
        System.out.println("Enter: " + intValue);

        float floatValue = ConsoleReader.readFloat("Introdueix un float:");
        System.out.println("Float: " + floatValue);

        double doubleValue = ConsoleReader.readDouble("Introdueix un double:");
        System.out.println("Double: " + doubleValue);

        char charValue = ConsoleReader.readChar("Introdueix un caràcter:");
        System.out.println("Caràcter: " + charValue);

        String text = ConsoleReader.readString("Introdueix un text:");
        System.out.println("Text: " + text);

        boolean answer = ConsoleReader.readYesNo("T'agrada Java?");
        System.out.println("Resposta: " + answer);
    }
}
