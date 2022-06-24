package dp;

class kit_2 {
    public int solution(int[][] triangle) {
        int answer = 0;
        int height = triangle.length;
        // 삼각형 높이의 길이만큼
        int[][] d = new int[height][height];
        d[0][0] = triangle[0][0];
        
        for(int i = 1; i < height; i++) {
            for(int j = 0; j <= i; j++) {
            //왼쪽 끝인 경우
            if(j == 0) {
                d[i][j] = d[i-1][j] + triangle[i][j];
            //오른쪽 끝인 경우
            } else if(j == i){
                d[i][j] = d[i-1][j-1] + triangle[i][j];
            }
            //왼쪽, 오른쪽 끝인 아닌 내부인 경우
            else{
                d[i][j] = Math.max(d[i-1][j-1], d[i-1][j]) + triangle[i][j];
            }
            
            // 최대값 갱신
            answer = Math.max(answer, d[i][j]);
        }
    }
        return answer;
    }
}