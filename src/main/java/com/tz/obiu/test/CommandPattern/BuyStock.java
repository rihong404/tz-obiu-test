package com.tz.obiu.test.CommandPattern;

public class BuyStock implements Order {
	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
		this.abcStock.setName("BuyStock");
		this.abcStock.setQuantity(20);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		abcStock.buy();
	}
	
}
