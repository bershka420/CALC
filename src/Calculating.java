public class Calculating{
    static int calculation(int numOne, int numTwo, String operation) throws Exception {
        int n = 0;
        try {
            if (numOne < 1 || numTwo < 1 || numOne > 10 || numTwo > 10) throw new Exception();
        } catch (Exception e) {
            System.err.println("Нарушен диапазон от 1 до 10 включительно ИЛИ Введены некоректные числа");
            System.exit(0);
        }
        try {
            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/"))
                throw new Exception();
        } catch (Exception e) {
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
    }}