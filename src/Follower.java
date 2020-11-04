public class Follower {
	public String name;
	
	public Follower(String username) {
		this.name = username;
	}
	
	public void releaseNotification(String trackName, String artistName) {
		System.out.println(name+", "+artistName+" just released a his new track: "+trackName+". Come and listen.");
	}
	
	public void follow(Artist a) {
		if(this.isFollowingArtist(a)) {
			System.out.println("Already following "+a.name);
		}
		else {
			a.addFollower(this);
		}
	}
	
	public void unfollow(Artist a) {
		if(this.isFollowingArtist(a)) {
			a.removeFollower(this);
		}
		else {
			System.out.println("Not following "+a.name);
		}
	}
	
	private boolean isFollowingArtist(Artist a) {
		return a.following(this);
	}
}
