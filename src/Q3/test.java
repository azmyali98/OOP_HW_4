package Q3;

public class test {

	public static void main(String[] args) {
		BillBoard b = new BillBoard();
		ColorGenerator c = ColorGenerator.getInstance();
		c.setBillBoardToNotify(b);
		b.setColorUpdatingAlgorithm(new SerialColorUpdatingAlgorithm());
	}

}
