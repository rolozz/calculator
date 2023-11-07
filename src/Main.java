import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        System.out.println(" Введите числа от 1 до 10, либо Римские от I до X, поддерживаемые операции: +,-,*,/.");
        String input = new Scanner(System.in).nextLine();
        System.out.println(calc(input));

    }


    public static String calc(String input) throws IOException {

        int a;
        int b;
        int preResult;
        String sign;
        String result;
        boolean roman;
        String[] nums = input.toUpperCase().replaceAll(" ","").split("[*/+\\-]");
        if (nums.length != 2) {
            throw new IOException("Должно быть 2 числа (не меньше 1(I) и не больше 10(X), поддерживаются только следующие операции: *,/,+,-.");
        }

        sign = searchSign(input);
        if (Roman.roman(nums[0]) && Roman.roman(nums[1])) {
            a = Roman.convertationArabian(nums[0]);
            b = Roman.convertationArabian(nums[1]);
            roman = true;
        } else if (!Roman.roman(nums[0]) && !Roman.roman(nums[1])) {
            a = Integer.parseInt(nums[0]);
            b = Integer.parseInt(nums[1]);
            roman = false;
        } else {
            throw new IOException("Оба числа должны быть римскими или арабскими");
        }
        if (a > 10 || b > 10) {
            throw new IOException("числа должны быть не больше 10");
        }
        preResult = calculation(a, b, sign);
        if (roman) {
            if (preResult <= 0) {
                throw new IOException("Римские числа не могут быть меньше I");
            }
            result = Roman.convertationRoman(preResult);
        }
        else {
            result = String.valueOf(preResult);
        }
        return result;
    }
    static String searchSign (String input){

        if (input.contains("*")) return "*";
        else if (input.contains("/")) return "/";
        else if (input.contains("+")) return "+";
        else if (input.contains("-")) return "-";
        return input;
    }

    static int calculation ( int a, int b, String sign){

        return switch (sign) {
            case "*" -> a * b;
            case "/" -> a / b;
            case "+" -> a + b;
            default -> a - b;
        };



    }

}
