
public class video {
String videoName;
boolean checkOut;
int rating;
public video(String Name) {
	videoName=Name;
}
public String getName() {
	return videoName;
}
public void docheckout() {
	System.out.println("Video"+this.videoName+"checkedout successfully");
	
}
public void doReturn() {
System.out.println("Video"+this.videoName+"returned successfully");
}
public void receiveRating(int rating) {
	System.out.println("Rating"+rating+"has mapped to "+videoName);
}
public int getrating() {
	return rating;
}
public boolean checkout() {
	return checkOut;
}

}
