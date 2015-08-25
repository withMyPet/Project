package vo;

public class Animal_detail extends Animal_kind{

	private int breed_code;
	private String breed_name;
	
	public Animal_detail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal_detail(int animal_code, String animal_name , int breed_code, String breed_name) {
		super(animal_code, animal_name);
		this.breed_code = breed_code;
		this.breed_name = breed_name;
	}
	public int getBreed_code() {
		return breed_code;
	}
	public void setBreed_code(int breed_code) {
		this.breed_code = breed_code;
	}
	public String getBreed_name() {
		return breed_name;
	}
	public void setBreed_name(String breed_name) {
		this.breed_name = breed_name;
	}
	
	

}