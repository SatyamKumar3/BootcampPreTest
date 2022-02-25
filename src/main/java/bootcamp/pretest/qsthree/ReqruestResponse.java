package bootcamp.pretest.qsthree;

public class ReqruestResponse {

	private String storeID;
	private String requestDate;

	public ReqruestResponse() {
		// TODO Auto-generated constructor stub
	}
	
	

	public ReqruestResponse(String storeID, String requestDate) {
		super();
		this.storeID = storeID;
		this.requestDate = requestDate;
	}



	public String getStoreID() {
		return storeID;
	}

	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}
	
	

}
