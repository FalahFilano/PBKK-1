package HospitalXml;

import org.springframework.stereotype.Component;

@Component
public class MouthSurgery implements Surgery {

	@Override
	public Integer price() {
		return 5000000;
	}

	@Override
	public Integer surgeryTime() {
		return 2;
	}

	@Override
	public String details() {
		return "Surgery removing bad tooth";
	}

}
