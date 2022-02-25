package bootcamp.pretest.qstwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AvailabilityService  implements Callable<Integer> {
	private static final Logger logger = LoggerFactory.getLogger(AvailabilityService.class);
	AvailabilityRequest request;

	AvailabilityService() {
	}

	AvailabilityService(AvailabilityRequest request) {
		this.request = request;
	}

	private static List<Availability> availabilityList = new ArrayList<>();

	static {

		try {
			availabilityList.add(
					new Availability("Store001", "Prod1", new SimpleDateFormat("yyyy-MM-dd").parse("2021-02-19"), 1.0));
			availabilityList.add(
					new Availability("Store001", "Prod1", new SimpleDateFormat("yyyy-MM-dd").parse("2021-02-20"), 3.0));
			availabilityList.add(
					new Availability("Store001", "Prod1", new SimpleDateFormat("yyyy-MM-dd").parse("2021-02-21"), 0.0));
		} catch (ParseException e) {
			logger.error(e.getMessage());
		}
	}

	@Override
	public Integer call() throws Exception {
		logger.info("Availability Thread started Executing");
		Date reqDate = new SimpleDateFormat("yyyy-MM-dd").parse(this.request.getReqDate());
		
		
		return availabilityList.stream().filter(availability -> availability.getDate().compareTo(reqDate) == 0)
				.filter(availability -> availability.getAvailQty() > 0).collect(Collectors.toList()).size();
	}
}
