class BestTimeToBuySellStock {
  static maxProfit(prices) {
    let minPrice = Number.MAX_VALUE,
      maxProfit = 0;
    for (let price of prices) {
      if (price < minPrice) minPrice = price;
      else if (price - minPrice > maxProfit) maxProfit = price - minPrice;
    }
    return maxProfit;
  }

  static maxProfit1(prices) {
    return 0;
  }
}

// Example usage:
const prices = [7, 1, 5, 3, 6, 4];
console.log("Max Profit: " + BestTimeToBuySellStock.maxProfit(prices));
console.log("Max Profit: " + BestTimeToBuySellStock.maxProfit1(prices));
