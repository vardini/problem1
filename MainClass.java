package learnmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		List<UserOb> users = getObjects();

		HashMap<Integer, UserOb> resultMap = new HashMap<Integer, UserOb>();
		
		for(UserOb user : users) {
			
			UserOb userTemp = resultMap.get(user.userid);
			
			if(userTemp == null) {
				resultMap.put(user.userid, user);
			}
			else {
				if(user.inTime < userTemp.inTime) {
					userTemp.inTime = user.inTime;
				}
				
				if(user.outTime > userTemp.outTime) {
					userTemp.outTime = user.outTime;
				}
			}
		}
			
		System.out.println(resultMap);

	}

	private static List<UserOb> getObjects() {

		List<UserOb> users = new ArrayList<UserOb>();

		users.add(new UserOb(100023, 1, 4));
		users.add(new UserOb(100024, 2, 5));
		users.add(new UserOb(100023, 3, 8));
		users.add(new UserOb(100023, 1, 2));

		return users;

	}
}
