public int[] plusOne(int[] digits) {
        int remaining = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                digits[digits.length - 1]++;
            }
            digits[i] += remaining;
            if (digits[i] == 10) {
                remaining = 1;
                digits[i] = 0;
            } else {
                remaining = 0;
            }
        }

        if (digits[0] != 0) {
            return digits;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        System.arraycopy(digits, 0, newDigits, 1, digits.length);
        return newDigits;
    }
