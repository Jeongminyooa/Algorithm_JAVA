package dp;

class kit_3 {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int mod = 1000000007;
        int[][] dp = new int[n + 1][m + 1];
        
        // 물 웅덩이
        for(int i = 0; i < puddles.length; i++) {
            dp[puddles[i][1]][puddles[i][0]] = -1;
        }
        
        // 0,0 -> 0,1 or 1,0 
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < m + 1; j++) {
                if(i == 1 && j == 1) {
                    // 집 
                    dp[i][j] = 1;
                    continue;
                }
                if(dp[i][j] == -1) {
                    // 물 웅덩이
                    dp[i][j] = 0;
                    continue;
                }

                // 위에서 + 왼쪽에서 온 경로
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % mod;
                
            }
        }
         answer = dp[n][m];
        return answer;
    }
}