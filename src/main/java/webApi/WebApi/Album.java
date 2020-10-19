package webApi.WebApi;

public class Album {
	
	private String userId;
	private String id;
	private String title;
	
	public Album () {}
	
	public Album(String userId, String id, String title) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
	}
	

	public String getUserId() {
		return userId;
	}
	

	public void setUserid(String userId) {
		this.userId = userId;
	}
	

	public String getId() {
		return id;
	}
	

	public void setId(String id) {
		this.id = id;
	}
	

	public String getTitle() {
		return title;
	}
	

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	

}
