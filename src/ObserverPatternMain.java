public class ObserverPatternMain {
	public static void main(String[] args) {
		Artist a1 = new Artist("BonezDerMc");
		
		Follower f1 = new Follower("36187");
		Follower f2 = new Follower("KapitänZurSee");
		
		f1.follow(a1);
		//f1.follow(a1); //(Already Following)
		f2.follow(a1);
		
		a1.releaseTrack("Skoda Fabia");
		
		f2.unfollow(a1);
		//f2.unfollow(a1); //(Not Following)

		a1.releaseTrack("Hühnchen mit Reis");
	}
}
