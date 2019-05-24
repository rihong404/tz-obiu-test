package com.tz.obiu.test.CommandPattern;

public class SellStock implements Order {
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
		this.abcStock.setName("SellStock");
		this.abcStock.setQuantity(10);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		abcStock.sell();
	}
}
