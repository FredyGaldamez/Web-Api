package webApi.WebApi;

public class Foto {
	private int albumId;
	private int id;
	private String Title;
	private String url;
	private String thumbnailUrl;

	public Foto(int albumId, int id, String Title, String url, String thumbnailUrl) {
		super();
		this.albumId = albumId;
		this.id = id;
		this.Title = Title;
		this.url = url;
		this.thumbnailUrl = thumbnailUrl;
	}
	
	public Foto () {}

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

}
