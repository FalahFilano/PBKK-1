package HospitalXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		
		User user = context.getBean("profil", User.class);
		
		Patient patient = (Patient) user;
		
		System.out.println(patient.toString());
		System.out.println("Surgery Details : " + patient.getSurgery().details());
		System.out.println("Surgery Price : Rp " + patient.getSurgery().price());
		
		context.close();
	}

}
