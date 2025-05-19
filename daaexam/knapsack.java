public class knapsack {
    public static void main(String[] args) {
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        int capacity = 50;

        double[] ratio = new double[weight.length];
        for (int i = 0; i < weight.length; i++) {
            ratio[i] = (double) value[i] / weight[i];
        }

        // Simple selection sort by ratio
        for (int i = 0; i < ratio.length - 1; i++) {
            for (int j = i + 1; j < ratio.length; j++) {
                if (ratio[i] < ratio[j]) {
                    // swap ratio
                    double temp = ratio[i]; ratio[i] = ratio[j]; ratio[j] = temp;
                    // swap weight
                    int tmpW = weight[i]; weight[i] = weight[j]; weight[j] = tmpW;
                    // swap value
                    int tmpV = value[i]; value[i] = value[j]; value[j] = tmpV;
                }
            }
        }

        double maxVal = 0;
        for (int i = 0; i < weight.length; i++) {
            if (capacity >= weight[i]) {
                maxVal += value[i];
                capacity -= weight[i];
            } else {
                maxVal += ratio[i] * capacity;
                break;
            }
        }

        System.out.println("Max value = " + maxVal);
    }
}
