package array;

// 121. Best Time to Buy and Sell Stock
public class sol_121 {
	 public int maxProfit(int[] prices) {
	        int buyPrice = prices[0];
	        int sellPrice = -1;
	        
	        for(int i = 0; i < prices.length; i++) {
	            buyPrice = Math.min(buyPrice, prices[i]);
	            sellPrice = Math.max(sellPrice, prices[i] - buyPrice);
	           
	        }
	        return sellPrice;
	    }
}
