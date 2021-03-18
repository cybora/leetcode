public int wiggleMaxLength(int[] nums) {
         if (nums.length < 2) {
            return 1;
        }

        boolean artis = false;

        int count = 1;

        int i = 1;
        for (; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                artis = true;
                count++;
                break;
            } else if (nums[i - 1] > nums[i]) {
                count++;
                break;
            }
        }


        for (; i < nums.length; i++) {
            if ((artis && (nums[i - 1] > nums[i])) || (!artis && (nums[i - 1] < nums[i]))) {
                artis = !artis;
                count++;
            }
        }

        return count;
    }