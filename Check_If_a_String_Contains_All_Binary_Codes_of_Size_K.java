
    public boolean hasAllCodes(String s, int k) {
        boolean[] binaries = new boolean[1 << k];
        Arrays.fill(binaries, false);
        int count = 0;

        for (int i = 0; i <= s.length() - k; i++) {
            String str = s.substring(i, i + k);
            int decimal=Integer.parseInt(str,2);
            if (!binaries[decimal]) {
                count++;
                binaries[decimal] = true;
            }
            if (count == binaries.length) {
                return true;
            }
        }

        return false;
    }