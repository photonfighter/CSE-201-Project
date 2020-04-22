import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class to represent a Game.
 * @author Chandler Davis (davisc10@miamioh.edu)
 *
 */
public class Game implements Serializable {
	/**
	 * 
	 */
	private String name;
	private static final long serialVersionUID = 6746977338198319164L;
	private final Profile uploader;
	private double rating;
	private ArrayList<String> comments;
	private String description;
	private ArrayList<String> previews;
	
	public Game(String name, Profile uploader, double rating, ArrayList<String> comments, String description, ArrayList<String> previews) {
		this.name = name;
		this.uploader = uploader;
		this.rating = rating;
		//this.comments = new ArrayList<String>(comments);
		this.comments = comments;
		this.description = description;
		//this.previews = new ArrayList<String>(previews);
		this.previews = previews;
	}
	
	public Game() {
		this("",null,0.0,new ArrayList<String>(),"",new ArrayList<String>());
	}
	
	public Game(String name,Profile uploader, String description, ArrayList<String> previews) {
		this(name,uploader, 0.0, null, description, previews);
	}
	
	public boolean comment(Profile commenter, String newComment) {
		return false;
	}
	
	public boolean delete(Profile commenter, String delComment) {
		return false;
	}
	
	public boolean editOwnComment(Profile commenter, String oldComment, String newComment) {
		return false;
	}
	
	public boolean editDesc(Profile user, String newDesc) {
		return false;
	}
	
	public boolean editPreviews(Profile user, ArrayList<String> newPreviews) {
		return false;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public ArrayList<String> getComments() {
		return comments;
	}

	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<String> getPreviews() {
		return previews;
	}

	public void setPreviews(ArrayList<String> previews) {
		this.previews = previews;
	}

	public Profile getUploader() {
		return uploader;
	}
}
