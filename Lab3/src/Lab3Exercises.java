import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myframe = new JFrame("Jerry Bassat Castillo");
		myframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myframe.setLocation(900, 450);
		
		myframe.setSize(200, 200);
		
		MyPanelClass myPanel = new MyPanelClass();
        myframe.getContentPane().add(myPanel);
		myframe.setVisible(true);
	
	}
}