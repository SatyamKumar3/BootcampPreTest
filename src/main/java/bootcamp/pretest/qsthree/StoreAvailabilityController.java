package bootcamp.pretest.qsthree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreAvailabilityController {

//	@Autowired
	StoreAvailabilityService availabilityService;

	@PostMapping("/findStoreAvailability")
	public ResponseEntity<ReqruestResponse> findStoreAvailability(@RequestBody ReqruestResponse request) {

		return null;
	}

}
