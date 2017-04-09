package joinMember;

public class memberDTO {
	
	String nameReal, phoneReal, idReal, car1Real, car2Real, car3Real;
	
	public memberDTO(String nameReal, String phoneReal, String idReal,
					String car1Real, String car2Real, String car3Real) {
		// TODO Auto-generated constructor stub
		
		this.nameReal = nameReal;
		this.phoneReal = phoneReal;
		this.idReal = idReal;
		this.car1Real = car1Real;
		this.car2Real = car2Real;
		this.car3Real = car3Real;
	}

	@Override
	public String toString() {
		return "memberDTO [nameReal=" + nameReal + ", phoneReal=" + phoneReal + ", idReal=" + idReal + ", car1Real="
				+ car1Real + ", car2Real=" + car2Real + ", car3Real=" + car3Real + "]";
	}

	public String getNameReal() {
		return nameReal;
	}

	public void setNameReal(String nameReal) {
		this.nameReal = nameReal;
	}

	public String getPhoneReal() {
		return phoneReal;
	}

	public void setPhoneReal(String phoneReal) {
		this.phoneReal = phoneReal;
	}

	public String getIdReal() {
		return idReal;
	}

	public void setIdReal(String idReal) {
		this.idReal = idReal;
	}

	public String getCar1Real() {
		return car1Real;
	}

	public void setCar1Real(String car1Real) {
		this.car1Real = car1Real;
	}

	public String getCar2Real() {
		return car2Real;
	}

	public void setCar2Real(String car2Real) {
		this.car2Real = car2Real;
	}

	public String getCar3Real() {
		return car3Real;
	}

	public void setCar3Real(String car3Real) {
		this.car3Real = car3Real;
	}
	
	

}
