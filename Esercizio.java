import java.util.Scanner;
import java.util.FileWriter;
import java.util.FileReader;

class Esercizio {
    private static Scanner in = new Scanner (System.in);

    public static String inverti(String riga) {
        String agir;
        int i;
        agir = "";
        for (i=riga.length()-1; i>1; --i) {
            agir = agir + riga.charAt(i);
        }
        return agir;
    }

    public static void main(String args[]) {
        String inputFileName, outFileName, riga;
        System.out.println("Inserire il nome del file di input: ");
        inputFileName = in.nextLine();
        Scanner inputFile = new Scanner (new FileReader(inputFileName));
        System.out.println("Inserire il nome del file di output: ");
        outFileName = in.nextLine();
        FileWriter outFile = new FileWriter(outFileName);
        do {
            riga = inputFile.nextLine();
            riga = inverti(riga);
            outFile.write(riga);
            outFile.write(System.lineSeparator());
        } while(!inputFile.hasNextLine());
        inputFile.close();
        outFile.close();
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md 