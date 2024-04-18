package model;

import java.util.List;
import java.util.Map;

public class bankdetails {
	private String name;
	private List<Map<String, String>> loansOffered;

	public bankdetails(String name, List<Map<String, String>> loansOffered) {
		this.name = name;
		this.loansOffered = loansOffered;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Map<String, String>> getLoansOffered() {
		return loansOffered;
	}

	public void setLoansOffered(List<Map<String, String>> loansOffered) {
		this.loansOffered = loansOffered;
	}

}
