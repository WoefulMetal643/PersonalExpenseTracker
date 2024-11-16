import java.util.ArrayList;
import javax.swing.*;

public class PersonalExpenseTracker{
	
	private class Expense{
		String nameExpense;
		Double cost;
		
		Expense(String nameExpense, Double cost){
			this.nameExpense=nameExpense;
			this.cost=cost;
		}
		
		public double getValue(){
			return cost;
		}
	}

	public static void main(String[] args){
		ArrayList<Expense> PersonalList;
		
		newExpense();
	}
	
	public static void newExpense(){
		JFrame frame = new JFrame("PersonalExpenseTracker");
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
