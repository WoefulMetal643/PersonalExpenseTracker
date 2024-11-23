import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class PersonalExpenseTracker{
	
	private class Expense{
		private ArrayList<String> nameExpense;
		String expense;
		Double cost;
		
		public Expense(){
			nameExpense = new ArrayList<>();
			nameExpense.add("Housing");
			nameExpense.add("Utilities");
			nameExpense.add("Food");
			nameExpense.add("Transport");
			nameExpense.add("Entertainment");
			expense="";
			cost = 0.0;
		}
		
		public void setExpense(String expense,Double cost) {
			this.expense=expense;
			this.cost = cost;
		}
		
		public double getValue(){
			return cost;
		}
		
		public ArrayList<String> arrayList() {
			return nameExpense;
		}
	}
	
	private Expense expense;
	
	public PersonalExpenseTracker() {
        expense = new Expense(); // Initialize the Expense object
    }

	public static void main(String[] args){
		PersonalExpenseTracker tracker = new PersonalExpenseTracker();
		tracker.mainMenu();
	}
	
	public void mainMenu() {
		JFrame frame = new JFrame("PersonalExpenseTracker");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JList<String> list = new JList<>(expense.arrayList().toArray(new String[0]));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scroll = new JScrollPane(list);
		frame.add(scroll);
		
		frame.setVisible(true);
	}
	
	public static void newExpense(){
		JFrame frame = new JFrame("NewExpenseTracker");
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
