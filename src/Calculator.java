import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args) throws Exception {
        InputStreamReader sc = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sc);
        String calculator = br.readLine();
        String[] data = calculator.split(" ");
        if (calculator.contains("I")||calculator.contains("V")||calculator.contains("X")){
            int x =   Convertation.convertationRomanToArab(data[0]);
            int y = Convertation.convertationRomanToArab(data[2] );

            int n = Calculating.calculation(x,y,data[1]);
            Convertation.convertationArabToRoman(n);

        }
        else {
            int x = Integer.parseInt(data[0]);
            int y =  Integer.parseInt(data[2]);

            System.out.println(Calculating.calculation(x,y,data[1]));

        }
    }

    static class Calculating{
        static int calculation(int numOne, int numTwo, String operation) throws Exception { int n = 0;

           /* try {
                if (!operation.equals("+")&&!operation.equals("-")&&!operation.equals("/")&&!operation.equals("*"))
                    throw new Exception();
            }
            catch (Exception e){
                System.err.println("Введен неверный знак");
                System.exit(0);
            }*/
            try {
                if (numOne < 1 || numTwo < 1 || numOne > 10 || numTwo > 10) throw new Exception();
            }
            catch (Exception e){
                System.err.println("Нарушен диапазон от 1 до 10 включительно ИЛИ Введены некоректные числа");
                System.exit(0);
            }
            try {
                if (!operation.equals("+")&&!operation.equals("-")&&!operation.equals("*")&&!operation.equals("/")) throw new Exception();
            }
            catch (Exception e){
                System.err.println("Программа принимает только операции + - / *");
                System.exit(0);
            }
            switch (operation) {

                case "+" -> {
                    n = numOne + numTwo;
                    return n;
                }
                case "-" -> {
                    n = numOne - numTwo;
                    return n;
                }
                case "/" -> {
                    n = numOne / numTwo;
                    return n;
                }
                case "*" -> n = numOne * numTwo;
            }

            return n;
        }
    }
    static class Convertation{
        static int convertationRomanToArab(String roman) {

            return switch (roman) {
                case "I" -> 1;
                case "II" -> 2;
                case "III" -> 3;
                case "IV" -> 4;
                case "V" -> 5;
                case "VI" -> 6;
                case "VII" -> 7;
                case "VIII" -> 8;
                case "IX" -> 9;
                case "X" -> 10;
                default -> 0;

            };



        }
        static void convertationArabToRoman(int result){
            ArrayList<String> romResult = new ArrayList<>();

            romResult.add("I");
            romResult.add("II");
            romResult.add("III");
            romResult.add("IV");
            romResult.add("V");
            romResult.add("VI");
            romResult.add("VII");
            romResult.add("VIII");
            romResult.add("IX");
            romResult.add("X");
            romResult.add("XI");
            romResult.add("XII");
            romResult.add("XIII");
            romResult.add("XIV");
            romResult.add("XV");
            romResult.add("XVI");
            romResult.add("XVII");
            romResult.add("XVIII");
            romResult.add("XIX");
            romResult.add("XX");
            romResult.add("XXI");
            romResult.add("XXII");
            romResult.add("XXIII");
            romResult.add("XXIV");
            romResult.add("XXV");
            romResult.add("XXVI");
            romResult.add("XXVII");
            romResult.add("XXVIII");
            romResult.add("XXIX");
            romResult.add("XXX");
            romResult.add("XXXI");
            romResult.add("XXXII");
            romResult.add("XXXIII");
            romResult.add("XXXIV");
            romResult.add("XXXV");
            romResult.add("XXXVI");
            romResult.add("XXXVII");
            romResult.add("XXXVIII");
            romResult.add("XXXIX");
            romResult.add("XL");
            romResult.add("XLI");
            romResult.add("XLII");
            romResult.add("XLIII");
            romResult.add("XLIV");
            romResult.add("XLV");
            romResult.add("XLVI");
            romResult.add("XLVII");
            romResult.add("XLVIII");
            romResult.add("XLIX");
            romResult.add("L");
            romResult.add("LI");
            romResult.add("LII");
            romResult.add("LIII");
            romResult.add("LIV");
            romResult.add("LV");
            romResult.add("LVI");
            romResult.add("LVII");
            romResult.add("LVIII");
            romResult.add("LIX");
            romResult.add("LX");
            romResult.add("LXI   ");
            romResult.add("LXII");
            romResult.add("LXIII");
            romResult.add("LXIV");
            romResult.add("LXV");
            romResult.add("LXVI");
            romResult.add("LXVII");
            romResult.add("LXVIII");
            romResult.add("LXIX");
            romResult.add("LXX");
            romResult.add("LXXI");
            romResult.add("LXXII");
            romResult.add("LXXIII");
            romResult.add("LXXIV");
            romResult.add("LXXV");
            romResult.add("LXXVI");
            romResult.add("LXXVII");
            romResult.add("LXXVIII");
            romResult.add("LXXIX");
            romResult.add("LXXX");
            romResult.add("LXXXI");
            romResult.add("LXXXII");
            romResult.add("LXXXIII");
            romResult.add("LXXXIV");
            romResult.add("LXXXV");
            romResult.add("LXXXVI");
            romResult.add("LXXXVII");
            romResult.add("LXXXVIII");
            romResult.add("LXXXIX");
            romResult.add("XC");
            romResult.add("XCI");
            romResult.add("XCII");
            romResult.add("XCIII");
            romResult.add("XCIV");
            romResult.add("XCV");
            romResult.add("XCVI");
            romResult.add("XCVII");
            romResult.add("XCVIII");
            romResult.add("XCIX");
            romResult.add("C");


            System.out.println(romResult.get(result- 1));
        }}}