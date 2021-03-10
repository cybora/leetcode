public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int thousands = num / 1000;
            if (thousands != 0) {
                sb.append("M".repeat(thousands));
                num -= 1000 * thousands;
            }
            if (num >= 900) {
                sb.append("CM");
                num -= 900;
            }
            int fiveHundreds = num / 500;
            if (fiveHundreds != 0) {
                sb.append("D".repeat(fiveHundreds));
                num -= 500 * fiveHundreds;
            }
            if (num >= 400) {
                sb.append("CD");
                num -= 400;
            }
            int hundreds = num / 100;
            if (hundreds != 0) {
                sb.append("C".repeat(hundreds));
                num -= 100 * hundreds;
            }
            if (num >= 90) {
                sb.append("XC");
                num -= 90;
            }
            int fifties = num / 50;
            if (fifties != 0) {
                sb.append("L".repeat(fifties));
                num -= 50 * fifties;
            }
            if (num >= 40) {
                sb.append("XL");
                num -= 40;
            }
            int tens = num / 10;
            if (tens != 0) {
                sb.append("X".repeat(tens));
                num -= 10 * tens;
            }
            if (num >= 9) {
                sb.append("IX");
                num -= 9;
            }
            int fives = num / 5;
            if (fives != 0) {
                sb.append("V".repeat(fives));
                num -= 5 * fives;
            }
            if (num >= 4) {
                sb.append("IV");
                num -= 4;
            }
            for (int i = 0; i < num; i++) {
                sb.append("I");
            }
            num = 0;
        }

        return sb.toString();
    }