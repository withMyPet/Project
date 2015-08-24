package vo;

import java.util.Date;

public class Pet extends Animal_detail{

	private String e_mail;
	private int pet_no;
	private Date birthdate;
	private char gender;
	private String img;
	private String name;
	private Date pet_reg_date;
	
	public Pet() {
		super();
		
	}
	
	public Pet(int animal_code, String animal_name, int breed_code,
			String breed_name, String e_mail, int pet_no, Date birthdate,
			char gender, String img, String name, Date pet_reg_date) {
		super(animal_code, animal_name, breed_code, breed_name);
		this.e_mail = e_mail;
		this.pet_no = pet_no;
		this.birthdate = birthdate;
		this.gender = gender;
		this.img = img;
		this.name = name;
		this.pet_reg_date = pet_reg_date;
	}	
	
	



}