public class MaxWealth {

    static void main() {
        System.out.println(maximumWealth(new int[][]{{1,2,4},{2,1,3}}));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, sum);

        }

        return maxWealth;
    }
}
