package bootcamp.pretest.qsthree;

import java.time.LocalTime;

public class Calendar {
	private String locationID;
	private String Day;
	private LocalTime  cutOffTime;
	
	public Calendar() {
		// TODO Auto-generated constructor stub
	}

	public Calendar(String locationID, String day, LocalTime cutOffTime) {
		super();
		this.locationID = locationID;
		Day = day;
		this.cutOffTime = cutOffTime;
	}

	public String getLocationID() {
		return locationID;
	}

	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}

	public String getDay() {
		return Day;
	}

	public void setDay(String day) {
		Day = day;
	}

	public LocalTime getCutOffTime() {
		return cutOffTime;
	}

	public void setCutOffTime(LocalTime cutOffTime) {
		this.cutOffTime = cutOffTime;
	}
	
}
