package Main;
import Class.Auto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.patente = "AEIOU12345";
        auto.color = "Azul";
        auto.kms = 60;
        auto.conAire = true;
        System.out.println("patente: " + auto.patente + ", Color: " + auto.color + ", kms: " + auto.kms + ", con Aire: " + auto.conAire);


        }
}