import java.util.*;
public class VideoLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("MAIN MENU\r\n"
				+ "1.Add Videos:\r\n"
				+ "2. Check Out Video:\r\n"
				+ "3. Return Video :\r\n"
				+ "4. Receive Rating :\r\n"
				+ "5. List Inventory :\r\n"
				+ "6. Exit :");
		System.out.println("Enter the choice : ");
		VideoStore v=new VideoStore();
		int t=s.nextInt();
		while(t<=6) {
			switch(t) 
			{
			case 1:
				System.out.println("Enter the name of the video you want : ");
				String name=s.next();
				v.addVideo(name);
				break;
			case 2:
				System.out.println("Enter the name of the video you want to check out : ");
				String name1=s.next();
				v.doCheckOut(name1);
				break;
			case 3:
				System.out.println("Enter the name of the video you want to return : ");
				String name2=s.next();
				v.doReturn(name2);
				break;
			case 4:
				System.out.println("Enter the name of the video you want to rate : ");
				String name3=s.next();
				System.out.println("Enter the rating for this video : ");
				int rating=s.nextInt();
				v.receiverating(name3, rating);break;
			case 5:
				v.listinventory();break;
			case 6:
				System.out.println("Exiting !!!. Thanks for using application");
				return;
			default:
				break;
			}
			System.out.println("Enter the choice : ");
			t=s.nextInt();
		}
	}

}
