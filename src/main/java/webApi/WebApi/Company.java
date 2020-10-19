package webApi.WebApi;

public class Company {
	
	private String name;
	private String catchPhrase;
	private String bs;
	
	public Company () {}
	
	public Company(String name, String catchFrase, String bs) {
		super();
		this.name = name;
		this.catchPhrase = catchFrase;
		this.bs = bs;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcatchPhrase() {
		return catchPhrase;
	}

	public void setCatchFrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}
	
	

}
