package lect2_luckyTickets;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LuckyTicketsTest {
    public static void main(String[] args) throws IOException {
        String absPath = "C:\\Users\\Игорь\\IdeaProjects\\otus_algo\\otus\\src\\lect2_luckyTickets\\tickets\\";

//      тестирование варианта с подсчетом количества сумм n-чисел
        for (int i = 0; i < 10; i++) {
            Path inputPath = Paths.get(absPath + "test." + i + ".in");
            Path outputPath = Paths.get(absPath + "test." + i + ".out");
            File file = inputPath.toFile();
            File outFile = outputPath.toFile();
            try {
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String strIn = reader.readLine();
                FileReader frOut = new FileReader(outFile);
                BufferedReader readerOut = new BufferedReader(frOut);
                String strOut = readerOut.readLine();
                PowLickyTickets luckyTickets = new PowLickyTickets();
                System.out.println("For " + Integer.parseInt(strIn)  + " half-size - is " + strOut + " - " +
                        luckyTickets.getLuckyTicketsCount(Integer.parseInt(strIn)).equals(Long.parseLong(strOut)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("---------next alg----------");
//Тестирование варианта с рекурсией: - глубже 5 - считает очень долго
        for (int i = 0; i < 5; i++) {
            Path inputPath = Paths.get(absPath + "test." + i + ".in");
            Path outputPath = Paths.get(absPath + "test." + i + ".out");
            File file = inputPath.toFile();
            File outFile = outputPath.toFile();
            try {
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String strIn = reader.readLine();
                FileReader frOut = new FileReader(outFile);
                BufferedReader readerOut = new BufferedReader(frOut);
                String strOut = readerOut.readLine();
                LuckyTickets luckyTickets = new LuckyTickets(Integer.parseInt(strIn)*2);
                System.out.println("For " + Integer.parseInt(strIn)  + " half-size - is " + strOut + " - " +
                        luckyTickets.getLuckyTicketsCount().equals(Long.parseLong(strOut)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
