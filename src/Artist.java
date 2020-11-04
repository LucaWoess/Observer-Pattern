import java.util.ArrayList;
import java.util.List;

public class Artist {
	public String name;
	private String newTrack;
	private List<Follower> follower = new ArrayList<>();
	
	public Artist(String artistName) {
		this.name= artistName;
	}
	
	public void addFollower(Follower f) {
		this.follower.add(f);	// Add follower
	}
	
	public void removeFollower(Follower f) {
		this.follower.remove(f);	// Remove follower
	}

	public boolean following(Follower f) {
		return this.follower.contains(f);	// Returns true if this list contains the element
	}
	
	public void releaseTrack(String trackName) {	
		this.newTrack = trackName;
		for(int i=0;i<follower.size();i++) {	// Releases a new track
			follower.get(i).releaseNotification(this.newTrack, this.name);
		}
	}
}
