import java.util.*;
public class VideoStore {
ArrayList<video> store=new ArrayList<>();
public void addVideo(String name) {
	store.add(new video(name));
}
public void doCheckOut(String name) {
	for(video y:store) {
		if(y.videoName.equals(name))
		{
			y.checkOut=true;
			y.docheckout();
		}
		break;
	}
}
public void doReturn(String name) {
	for(video y:store) {
		if(y.videoName.equals(name))
			y.doReturn();break;
	}
}
public void receiverating(String name,int rating) {
	for(video y:store) {
		if(y.videoName.equals(name)) {
			y.rating=rating;
			y.receiveRating(rating);
		}
	}
}
public void listinventory() {
	System.out.println("Videoname | Checkout status | rating");
	for(video y:store) {
		System.out.println(y.videoName+" "+y.checkOut+" "+y.rating);
	}
}

}
