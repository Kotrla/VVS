package projectVvs.demo;

/**
 * @author Koti
 *
 */
public class CollectedData {
	private int age;
	private float height,weight;
	private String gender;
	
	private double kcal=1;
	private double protein,carbs,fats = 1;


	public CollectedData(){

	}

	public CollectedData(int age, float height, float weight, String gender) {
		
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;

		this.kcal=this.getKcal();
		this.protein=this.getProtein();
		this.carbs=this.getCarb();
		this.fats=this.getFat();
	}

	public void setAll(int age, float height, float weight, String gender){
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;

		this.kcal=this.getKcal();
		this.protein=this.getProtein();
		this.carbs=this.getCarb();
		this.fats=this.getFat();


	}

	public void setAllNull(){
		this.age = 0;
		this.height = 0;
		this.weight = 0;
		this.kcal=0;
		this.carbs=0;
		this.fats=0;
		this.protein=0;
		this.gender=" ";

	}
	public double getKcal() {
		double rez=1;

		if(this.getGender().equals("Male")) {
			rez = 10 * this.getWeight() + 6.25 * this.getHeight() - 5 * this.getAge() + 5;
		}else {
			rez = 10 * this.getWeight() + 6.25 * this.getHeight() - 5 * this.getAge() - 161;
		}

		rez=rez+200;
	
		return rez;
	}
	public double getProtein() {
		double rez;
		rez= this.Wkcal() * 0.3;
		rez= rez / 4;
		return rez;
	}

	public double getCarb() {
		double rez;
		rez= this.Wkcal() * 0.5;
		rez= rez / 4;
		return rez;
	}
	
	public double getFat() {
		double rez;
		rez= this.Wkcal() * 0.2;
		rez= rez / 9;
		return rez;
	}
	

	
	public double Wkcal() {
		return kcal;
	}
	public int getAge() {
		return age;
	}
	public float getHeight() {
		return height;
	}
	public float getWeight() {
		return weight;
	}
	public String getGender() {
		return gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	

}
