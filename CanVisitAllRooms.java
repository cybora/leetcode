public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms.size() > 1 && rooms.get(0) == null) {
            return false;
        }
        int length = rooms.size();
        Queue<Integer> keyQueue = new LinkedList<>();
        boolean[] keysArr = new boolean[length];
        int count = 1;
        keysArr[0] = true;

        for (int key : rooms.get(0)) {
            if (!keysArr[key]) {
                keyQueue.add(key);
                keysArr[key] = true;
                count++;
            }
        }

        while (!keyQueue.isEmpty()) {
            int key = keyQueue.poll();
            for (int k: rooms.get(key)) {
                if (!keysArr[k]) {
                    keyQueue.add(k);
                    keysArr[k] = true;
                    count++;
                }
            }
        }

        return count == length;
    }
