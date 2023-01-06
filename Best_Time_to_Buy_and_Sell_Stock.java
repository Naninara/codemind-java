import java.util.*;
class BestTimeToSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i]= sc.nextInt();
        }
        System.out.println(maxProfit(x));
    }

    private static int maxProfit(int[] x) {
        int min = Integer.MAX_VALUE;
        int profit =0;
        for (int j : x) {
            min = Math.min(j, min);
            profit = Math.max(profit, j - min);
        }
        return profit;
    }
}
