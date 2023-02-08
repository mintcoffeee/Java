package class_;

public class Compute {	// 1인분 
	private int x, y, sum, sub, mul;
	private double div;
	
	public void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void calc() {
		sum = x + y;
		sub = x - y;
		mul = x * y;
		div = (double)x / y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSum() {
		return sum;
	}
	public int getSub() {
		return sub;
	}
	public int getMul() {
		return mul;
	}
	public String getDiv() {
		return String.format("%.2f", div);
	}
	
}

