package bootcamp.pretest.qstwo;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class CapacityDAO {
	private List<Capacity> capacities = new ArrayList<Capacity>();
	
	public CapacityDAO() {
		try {
			capacities.add(new Capacity("Store001", "Prod1", "2021-02-19", 0.0));
			capacities.add(new  Capacity ("Store001", "Prod1", "2021-02-20", 2.0));
			capacities.add(new Capacity("Store001", "Prod1", "2021-02-21", 2.0));
			capacities.add(new Capacity("Store001", "Prod1", "2021-02-22", 0.0));
		} catch (ParseException e) {
			System.out.println("Unable to parse date: " + e.getMessage());
		}
	}

	public List<Capacity> getCapacities() {
		return capacities;
	}

	public void setCapacities(List<Capacity> capacities) {
		this.capacities = capacities;
	}

	@Override
	public String toString() {
		return String.format("CapacityDAO [capacities=%s]", capacities);
	}
	
	
}
