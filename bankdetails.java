package model;

import java.util.List;

public class bankdetails {
	private String name;
	private List<String> loansOffered;

	public bankdetails(String name, List<String> loansOffered) {
		this.name = name;
		this.loansOffered = loansOffered;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLoansOffered() {
		return loansOffered;
	}

	public void setLoansOffered(List<String> loansOffered) {
		this.loansOffered = loansOffered;
	}

}
