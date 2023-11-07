
class Roman{

    static String[] romanArr = {"0","I","II","III","IV","V","VI","VII","VIII","IX","X",
            "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
            "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
            "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
            "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
            "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
            "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
            "LXXI","LXXII","LXXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXXIX","LXXX",
            "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXVIII","LXXXIX","XC",
            "XCI","XII","XIII","XCIV","XCV","XCVI","XVII","XCVIII","ХХIХ","C"};  //массив римских чисел 1-100
    static boolean roman(String number){

        for (String i : romanArr) {
            if (number.equals(i)) {
                return true;
            }
        }
        return false;
    }

    static int convertationArabian(String roman){

        for (int i = 0; i < romanArr.length;i++){
            if (roman.equals(romanArr[i])){
                return i;
            }
        }
        return -1;
    }

    static String convertationRoman(int arabian){

        return romanArr[arabian];
    }

}