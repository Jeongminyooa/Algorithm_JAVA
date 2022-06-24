package dp;

class kit_4 {
    public int solution(int[] money) {
       int len = money.length;
        // 첫번째 집을 털 경우
        int[] dp0 = new int[len];
        
        // 첫번째 집을 털지 않을 경우
        int[] dp = new int[len];
        dp0[0] = dp0[1] = money[0];
        dp[1] = money[1];

        for (int i = 2; i < len; i++) {
            dp0[i] = Math.max(dp0[i-1], money[i] + dp0[i-2]);
            dp[i] = Math.max(dp[i-1], money[i] + dp[i-2]);
        }

        return Math.max(dp0[len-2], dp[len-1]);
    }
}