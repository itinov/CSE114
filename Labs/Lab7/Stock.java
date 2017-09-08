package Labs.Lab7;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #7
 */

public class Stock {

	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.previousClosingPrice = this.currentPrice;
		this.currentPrice = currentPrice;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}

	public static void main(String[] args) {

		Stock stocks = new Stock("ORCL", "Oracle Corporation");
		stocks.setCurrentPrice(34.5);
		stocks.setCurrentPrice(34.35);
		System.out.println("Stock Name: " + stocks.getName());
		System.out.println("Stock Symbol: " + stocks.getSymbol());
		System.out.println("Previous Price: " + stocks.getPreviousClosingPrice());
		System.out.println("Current Price: " + stocks.getCurrentPrice());
		System.out.printf("Percent Changed: %.4f", stocks.getChangePercent());
	}
}
