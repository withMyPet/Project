package vo;

public class Animal_detail extends Animal_kind{

	private int breed_code;
	private String breed_name;
	
	public Animal_detail() {
		super();
	}
	
	public Animal_detail(int animal_code, String animal_name , int breed_code, String breed_name) {
		super(animal_code, animal_name);
		this.breed_code = breed_code;
		this.breed_name = breed_name;
	}

	@Override
	public String toString() {
		return "Animal_detail [breed_code=" + breed_code + ", breed_name="
				+ breed_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + breed_code;
		result = prime * result
				+ ((breed_name == null) ? 0 : breed_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal_detail other = (Animal_detail) obj;
		if (breed_code != other.breed_code)
			return false;
		if (breed_name == null) {
			if (other.breed_name != null)
				return false;
		} else if (!breed_name.equals(other.breed_name))
			return false;
		return true;
	}
}