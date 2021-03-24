public boolean reorderedPowerOf2(int N) {
        Set<String> numberSet = new HashSet<>();
        for (int i = 0; i < 30; i++) {
            char[] chars = String.valueOf((long)Math.pow(2.0d, (double)i)).toCharArray();
            Arrays.sort(chars);
            String val = String.valueOf(chars);
            numberSet.add(val);
        }

        char[] inputChars = String.valueOf(N).toCharArray();
        Arrays.sort(inputChars);
        String sortedInput = String.valueOf(inputChars);
        
        return numberSet.contains(sortedInput);
    }