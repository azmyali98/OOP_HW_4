package Q3;

public class test {

	public static void main(String[] args) {
		BillBoard b = new BillBoard();
		ColorGenerator c = ColorGenerator.getInstance();
		c.setBillBoardToNotify(b);
		b.setColorUpdatingAlgorithm(new SerialColorUpdatingAlgorithm());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.setColorUpdatingAlgorithm(new ColumnColorUpdatingAlgorithm());
	}

}
