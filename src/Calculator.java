import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Calculator {
    public static void main(String[] args) throws Exception {
        InputStreamReader sc = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sc);
        String calculator = br.readLine();
        String[] data = calculator.split(" ");
        if (calculator.contains("I") || calculator.contains("V") || calculator.contains("X")) {
            int x = Convertation.convertationRomanToArab(data[0]);
            int y = Convertation.convertationRomanToArab(data[2]);
            int n = Calculating.calculation(x, y, data[1]);
            Convertation.convertationArabToRoman(n); }
        else {
            int x = Integer.parseInt(data[0]);
            int y = Integer.parseInt(data[2]);
            System.out.println(Calculating.calculation(x, y, data[1])); }
    }
}
