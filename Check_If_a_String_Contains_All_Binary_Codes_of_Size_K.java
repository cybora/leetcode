
    public boolean hasAllCodes(String s, int k) {
        Set<String> binaries = new HashSet<>();
        int total = 1 << k;
        for (int i = 0; i <= s.length() - k; i++) {
            binaries.add(s.substring(i, i + k));
            if (binaries.size() == total)
                return true;
        }

        return binaries.size() == total;
    }
