
public class StudentData {
	String stdName;
	int mks_csc;
	int mks_mm;
	public StudentData() {
		
	}
	public StudentData(String stdName, int mks_csc, int mks_mm) {
		super();
		this.stdName = stdName;
		this.mks_csc = mks_csc;
		this.mks_mm = mks_mm;
	}
	int getTotMks() {
		// return(mks_csc + mks_m);
		int tot = mks_csc + mks_mm;
		return tot;
	}
	
	// get the avg , result , grade
	
	float getavg() {
		// get the tot mks
		// divide by 2
		int tot = getTotMks();
		float avg= tot/2 ;
		return avg ;
	}
	String getresult() {
		float avg = getavg();
		if(avg >40) {
			return "pass";
		}
		else {
			return "fail";
		}
	}
	String getgrade() {
		float avg = getavg();
		if(avg>40) {
			return " A";
		}
		else {
			return "B";
		}
	}
	
}
