package HospitalXml;

public class Patient implements User {
	
	public Surgery surgery;
	
	private int id;
	private String name;
	private String email;
	private String nohp;

	@Override
	public String desc() {
		// TODO Auto-generated method stub
		return "User Patient had several surgery";
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Surgery surgery) {
		super();
		this.surgery = surgery;
	}
	

	public Surgery getSurgery() {
		return surgery;
	}

	public void setSurgery(Surgery surgery) {
		this.surgery = surgery;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNohp() {
		return nohp;
	}

	public void setNohp(String nohp) {
		this.nohp = nohp;
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", email=" + email + ", nohp=" + nohp + "]";
	}

}
