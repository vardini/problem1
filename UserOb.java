package learnmaps;

public class UserOb {

	public UserOb(int userId,int in, int out) {
		this.userid = userId;
		this.inTime = in;
		this.outTime = out;
	}
	int userid;
	int inTime;
	int outTime;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "in - "+inTime +" outTime - "+outTime;
	}
}
