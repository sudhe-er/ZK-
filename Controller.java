package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.zkoss.zhtml.Map;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Div;
import org.zkoss.zul.Label;

import model.bankdetails;

@SuppressWarnings("serial")
public class Controller extends GenericForwardComposer<Component> {

	private List<bankdetails> loandetails = new ArrayList<>(
			Arrays.asList(new bankdetails("AXIS Bank", Arrays.asList(new HashMap<String, String>() {
				{
					put("Home Loan", "Choose from a wide range of home loans depending on your needs");
				}
			}, new HashMap<String, String>() {
				{
					put("Personal Loan",
							"Avail Personal Loan for holiday, home renewation& marriage at attractive rate interests");
				}
			}, new HashMap<String, String>() {
				{
					put("Bussiness Loan", "Grow your business with minimum documentation & quick approvals");
				}
			}, new HashMap<String, String>() {
				{
					put("Loan Against Securities", "Grow your business with minimum documentation & quick approvals");
				}
			}, new HashMap<String, String>() {
				{
					put("Car Loan", "Benefit from a high Loan To Value ratio");
				}
			}, new HashMap<String, String>() {
				{
					put("Two Wheeler Loan", "Upto zero down payment and attractive interest rates");
				}
			}, new HashMap<String, String>() {
				{
					put("Education Loan", "Loans available for a variety of courses with easy loan disbursal");
				}
			}, new HashMap<String, String>() {
				{
					put("Gold Loan", "Avail best interest rates on your gold.");
				}
			}, new HashMap<String, String>() {
				{
					put("Loan Against Property",
							"Avail easy repayment tenure up to 20 years on Loan Against Property.");
				}
			}, new HashMap<String, String>() {
				{
					put("Loan Against FD", "Avail attractive interest rates against your loan");
				}
			})),

					new bankdetails("Bajaj Finserv", Arrays.asList(new HashMap<String, String>() {
						{
							put("Home Loan", "Choose from a wide range of home loans depending on your needs");
						}
					}, new HashMap<String, String>() {
						{
							put("Personal Loan",
									"Avail Personal Loan for holiday, home renewation& marriage at attractive rate interests");
						}
					}, new HashMap<String, String>() {
						{
							put("Bussiness Loan", "Grow your business with minimum documentation & quick approvals");
						}
					}, new HashMap<String, String>() {
						{
							put("Loan Against Securities",
									"Grow your business with minimum documentation & quick approvals");
						}
					}, new HashMap<String, String>() {
						{
							put("Car Loan", "Benefit from a high Loan To Value ratio");
						}
					}, new HashMap<String, String>() {
						{
							put("Two Wheeler Loan", "Upto zero down payment and attractive interest rates");
						}
					}, new HashMap<String, String>() {
						{
							put("Education Loan", "Loans available for a variety of courses with easy loan disbursal");
						}
					}, new HashMap<String, String>() {
						{
							put("Gold Loan", "Avail best interest rates on your gold.");
						}
					}, new HashMap<String, String>() {
						{
							put("Loan Against Property",
									"Avail easy repayment tenure up to 20 years on Loan Against Property.");
						}
					}, new HashMap<String, String>() {
						{
							put("Loan Against FD", "Avail attractive interest rates against your loan");
						}
					})),

					new bankdetails("LIC", Arrays.asList(new HashMap<String, String>() {
						{
							put("Home Loan", "Choose from a wide range of home loans depending on your needs");
						}
					}, new HashMap<String, String>() {
						{
							put("Personal Loan",
									"Avail Personal Loan for holiday, home renewation& marriage at attractive rate interests");
						}
					}, new HashMap<String, String>() {
						{
							put("Bussiness Loan", "Grow your business with minimum documentation & quick approvals");
						}
					}, new HashMap<String, String>() {
						{
							put("Loan Against Securities",
									"Grow your business with minimum documentation & quick approvals");
						}
					}, new HashMap<String, String>() {
						{
							put("Car Loan", "Benefit from a high Loan To Value ratio");
						}
					}, new HashMap<String, String>() {
						{
							put("Two Wheeler Loan", "Upto zero down payment and attractive interest rates");
						}
					}, new HashMap<String, String>() {
						{
							put("Education Loan", "Loans available for a variety of courses with easy loan disbursal");
						}
					}, new HashMap<String, String>() {
						{
							put("Gold Loan", "Avail best interest rates on your gold.");
						}
					}, new HashMap<String, String>() {
						{
							put("Loan Against Property",
									"Avail easy repayment tenure up to 20 years on Loan Against Property.");
						}
					}, new HashMap<String, String>() {
						{
							put("Loan Against FD", "Avail attractive interest rates against your loan");
						}
					})),

					new bankdetails("SBI", Arrays.asList(new HashMap<String, String>() {
						{
							put("Home Loan", "Choose from a wide range of home loans depending on your needs");
						}
					}, new HashMap<String, String>() {
						{
							put("Personal Loan",
									"Avail Personal Loan for holiday, home renewation& marriage at attractive rate interests");
						}
					}, new HashMap<String, String>() {
						{
							put("Bussiness Loan", "Grow your business with minimum documentation & quick approvals");
						}
					}, new HashMap<String, String>() {
						{
							put("Loan Against Securities",
									"Grow your business with minimum documentation & quick approvals");
						}
					}, new HashMap<String, String>() {
						{
							put("Car Loan", "Benefit from a high Loan To Value ratio");
						}
					}, new HashMap<String, String>() {
						{
							put("Two Wheeler Loan", "Upto zero down payment and attractive interest rates");
						}
					}, new HashMap<String, String>() {
						{
							put("Education Loan", "Loans available for a variety of courses with easy loan disbursal");
						}
					}, new HashMap<String, String>() {
						{
							put("Gold Loan", "Avail best interest rates on your gold.");
						}
					}, new HashMap<String, String>() {
						{
							put("Loan Against Property",
									"Avail easy repayment tenure up to 20 years on Loan Against Property.");
						}
					}, new HashMap<String, String>() {
						{
							put("Loan Against FD", "Avail attractive interest rates against your loan");
						}
					})),

					new bankdetails("UBI", Arrays.asList(new HashMap<String, String>() {
						{
							put("Home Loan", "Choose from a wide range of home loans depending on your needs");
						}
					}, new HashMap<String, String>() {
						{
							put("Personal Loan",
									"Avail Personal Loan for holiday, home renewation& marriage at attractive rate interests");
						}
					}, new HashMap<String, String>() {
						{
							put("Bussiness Loan", "Grow your business with minimum documentation & quick approvals");
						}
					}, new HashMap<String, String>() {
						{
							put("Loan Against Securities",
									"Grow your business with minimum documentation & quick approvals");
						}
					}, new HashMap<String, String>() {
						{
							put("Car Loan", "Benefit from a high Loan To Value ratio");
						}
					}, new HashMap<String, String>() {
						{
							put("Two Wheeler Loan", "Upto zero down payment and attractive interest rates");
						}
					}, new HashMap<String, String>() {
						{
							put("Education Loan", "Loans available for a variety of courses with easy loan disbursal");
						}
					}, new HashMap<String, String>() {
						{
							put("Gold Loan", "Avail best interest rates on your gold.");
						}
					}, new HashMap<String, String>() {
						{
							put("Loan Against Property",
									"Avail easy repayment tenure up to 20 years on Loan Against Property.");
						}
					}, new HashMap<String, String>() {
						{
							put("Loan Against FD", "Avail attractive interest rates against your loan");
						}
					}))));

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

		System.out.println("initilizer");
		rightbarid.setVisible(false);

	}

	public void getDetails(List<bankdetails> list) {
		for(bankdetails obj : list) {
			List<java.util.Map<String, String>> loans = obj.getLoansOffered();
			for(java.util.Map<String, String> mp : loans) {
				HashMap
			}
		}
		
	}

	public void onClick$card1(Event eve) {

		carouselid.setVisible(false);
		Div rightBar = (Div) rightbarid.getFellow("rightbarid");
		rightBar.getChildren().clear();
		rightbarid.setVisible(true);
		Executions.getCurrent().createComponents("Layouts.zul", rightbarid, null);
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
