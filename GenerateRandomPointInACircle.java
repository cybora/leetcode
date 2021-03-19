class Solution {
    
    private final double radius;
    private final double x_center;
    private final double y_center;

    public Solution(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {
        double topY = y_center + radius;
        double bottomY = y_center - radius;
        double rightX = x_center + radius;
        double leftX = x_center - radius;


        boolean notValid = true;
        double randX = 0.0d;
        double randY = 0.0d;

        while (notValid) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 4 + 1);
            double distance;
            if (randomNum == 1) {
                randX = x_center + Math.random() * (rightX - x_center);
                randY = y_center + Math.random() * (topY - y_center);
                distance = Math.sqrt(Math.pow(randX - x_center, 2.0d) + Math.pow(randY - y_center, 2.0d));
            } else if (randomNum == 2) {
                randX = x_center + Math.random() * (rightX - x_center);
                randY = y_center - Math.random() * (y_center - bottomY);
                distance = Math.sqrt(Math.pow(randX - x_center, 2.0d) + Math.pow(randY - y_center, 2.0d));
            } else if (randomNum == 3) {
                randX = x_center - Math.random() * (x_center - leftX);
                randY = y_center - Math.random() * (y_center - bottomY);
                distance = Math.sqrt(Math.pow(randX - x_center, 2.0d) + Math.pow(randY - y_center, 2.0d));
            } else {
                randX = x_center - Math.random() * (x_center - leftX);
                randY = y_center + Math.random() * (topY - y_center);
                distance = Math.sqrt(Math.pow(randX - x_center, 2.0d) + Math.pow(randY - y_center, 2.0d));
            }
            if (distance <= radius) {
                notValid = false;
            }
        }

        return new double[]{randX, randY};
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */
