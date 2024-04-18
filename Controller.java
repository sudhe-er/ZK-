package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Div;
import org.zkoss.zul.Label;

import model.bankdetails;

@SuppressWarnings("serial")
public class Controller extends GenericForwardComposer<Component> {
	private List<bankdetails> banks = new ArrayList<>(Arrays.asList(new bankdetails("Axis Bank", Arrays.asList(
			"Home Loan",
			"axis Home Loans is the largest Mortgage Lender in India, which has helped over 30 lakh families to achieve the dream of owning a home.",
			"4.3", "Personal Loan", "axis personal loan", "2.1")),
			new bankdetails("Bajaj finserv", Arrays.asList("Home Loan",
					"Home Loans is the largest Mortgage Lender in India, which has helped over 30 lakh families to achieve the dream of owning a home.",
					"4.3", "Personal Loan", " personal loan", "2.1")),
			new bankdetails("LIC Housing", Arrays.asList("Home Loan",
					"axis Home Loans is the largest Mortgage Lender in India, which has helped over 30 lakh families to achieve the dream of owning a home.",
					"4.3", "Personal Loan", "axis personal loan", "2.1")),
			new bankdetails("State Bank Of India", Arrays.asList("Home Loan",
					"axis Home Loans is the largest Mortgage Lender in India, which has helped over 30 lakh families to achieve the dream of owning a home.",
					"4.3", "Personal Loan", " personal loan", "2.1")),
			new bankdetails("Union Bank Of India", Arrays.asList("Home Loan",
					"axis Home Loans is the largest Mortgage Lender in India, which has helped over 30 lakh families to achieve the dream of owning a home.",
					"4.3", "Personal Loan", " personal loan", "2.1"))));

	private bankdetails selectedBank;
	private Component card1;
	private Component card2;
	private Component card3;
	private Component card4;
	private Component card5;
	private Component rightbarid;
	private Component carouselid;
	private Label bankName;
	private Label l1;
	private Label l2;
	private Label l3;
	private Label l11;
	private Label l22;
	private Label l33;
	private Label auxheadbank;

	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		System.out.println("\n\ncontrolller\n\n\n");
		initData();
	}

	private void initData() {
		self.setAttribute("Controller", this);
		self.setAttribute("banks", banks);
		System.out.println("initilizer");
		rightbarid.setVisible(false);

	}

	public void getDetails(int id) {
		selectedBank = banks.get(id);
		bankName.setValue(selectedBank.getName());
		auxheadbank.setValue(selectedBank.getName());
		List<String> loans = selectedBank.getLoansOffered();
		l1.setValue(loans.get(0));
		l2.setValue(loans.get(1));
		l3.setValue(loans.get(2));
		l11.setValue(loans.get(3));
		l22.setValue(loans.get(4));
		l33.setValue(loans.get(5));
	}

	public void onClick$card1(Event eve) {

		carouselid.setVisible(false);
		//
		// getDetails(0);
		// Include include = (Include) rightbarid.getFellow("carouselid");
		// if (include != null) {
		// include.setSrc("Layouts.zul");
		// }

		Div rightbarDiv = (Div) rightbarid.getFellow("carouselid");

		Component newComponent = Executions.createComponents("Layouts.zul", rightbarDiv, null);
		rightbarid.setVisible(true);

	}

	// public void onClick$card2(Event eve) {
	// carouselid.setVisible(false);
	// rightbarid.setVisible(true);
	// getDetails(1);
	// }
	//
	// public void onClick$card3(Event eve) {
	// carouselid.setVisible(false);
	// rightbarid.setVisible(true);
	// getDetails(2);
	// }
	//
	// public void onClick$card4(Event eve) {
	// carouselid.setVisible(false);
	// rightbarid.setVisible(true);
	// getDetails(3);
	// }
	//
	// public void onClick$card5(Event eve) {
	// carouselid.setVisible(false);
	// rightbarid.setVisible(true);
	// getDetails(4);
	// }

}
