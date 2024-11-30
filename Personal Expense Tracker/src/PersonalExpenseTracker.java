import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

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
		
		JButton newExpense = new JButton("new Expense");
		JButton addCategories = new JButton("add category");
		JButton view = new JButton("view");
		JPanel buttonsLayout = new JPanel();
		buttonsLayout.add(newExpense);
		buttonsLayout.add(addCategories);
		buttonsLayout.add(view);
		frame.add(buttonsLayout, BorderLayout.SOUTH);
		
		newExpense.addActionListener(e-> {
			newExpense();
			frame.setVisible(false);
		});
		
		addCategories.addActionListener(e-> {
			newCategory();
			frame.setVisible(false);
		});
		
		view.addActionListener(e-> {
			view();
			frame.setVisible(false);
		});
		
		frame.setVisible(true);
	}
	
	public static void newExpense(){
		PersonalExpenseTracker tracker = new PersonalExpenseTracker();
		JFrame frame = new JFrame("NewExpenseTracker");
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel nameExpense = new JLabel("Enter new Expense:");
		nameExpense.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panel.add(nameExpense);
		
		JTextField text = new JTextField();
		text.setMaximumSize(new java.awt.Dimension(200, 30));
		panel.add(text);
		
		frame.add(panel);
		
		JButton addExpense = new JButton("add");
		JButton back = new JButton("Back");
		JPanel buttonsLayout = new JPanel();
		buttonsLayout.add(addExpense);
		buttonsLayout.add(back);
		frame.add(buttonsLayout, BorderLayout.SOUTH);
		
		addExpense.addActionListener(e-> {
			tracker.mainMenu();
			frame.setVisible(false);
		});
		
		back.addActionListener(e-> {
			tracker.mainMenu();
			frame.setVisible(false);
		});
		frame.setVisible(true);
	}
	
	public static void newCategory(){
		PersonalExpenseTracker tracker = new PersonalExpenseTracker();
		JFrame frame = new JFrame("NewCategory");
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel nameExpense = new JLabel("Enter new Category:");
		nameExpense.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panel.add(nameExpense);
		
		JTextField text = new JTextField();
		text.setMaximumSize(new java.awt.Dimension(200, 30));
		panel.add(text);
		
		frame.add(panel);
		
		JButton addExpense = new JButton("add");
		JButton back = new JButton("Back");
		JPanel buttonsLayout = new JPanel();
		buttonsLayout.add(addExpense);
		buttonsLayout.add(back);
		frame.add(buttonsLayout, BorderLayout.SOUTH);
		
		addExpense.addActionListener(e-> {
			tracker.mainMenu();
			frame.setVisible(false);
		});
		
		back.addActionListener(e-> {
			tracker.mainMenu();
			frame.setVisible(false);
		});
		frame.setVisible(true);
	}
	
	public static void view(){
		PersonalExpenseTracker tracker = new PersonalExpenseTracker();
		JFrame frame = new JFrame("ViewExpense");
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton back = new JButton("Back");
		frame.add(back, BorderLayout.SOUTH);
		
		back.addActionListener(e-> {
			tracker.mainMenu();
			frame.setVisible(false);
		});
		
		frame.setVisible(true);
	}

}
