import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Puzzle extends JFrame implements ActionListener  {
	
	JPanel panel;
	
	int puzzle_size = 3;
	JButton[][] buttons = new JButton[puzzle_size][puzzle_size];
 	JButton reset_b;
 	int empty = 9;
	
	public Puzzle() {
		setSize(500,600);
		setTitle("puzzle");
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		
		
		int num = 1;
		for (int row=0;row<puzzle_size;row++) {
			for ( int col=0;col<puzzle_size;col++) {
				buttons[row][col] = new JButton();
				
				if (row != puzzle_size-1 || col != puzzle_size-1) {
					buttons[row][col].setText(""+num);
					num++;
				}
				panel.add(buttons[row][col]);
			}
		}
		
		
		reset_b = new JButton("reset");
		
	
		add(reset_b, BorderLayout.SOUTH);
		add(panel,BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}

	public static void main(String[] args) {
		Puzzle p = new Puzzle();

	}

}
