package de.nordakademie;

public class Client {
	public Client(int age, Sex sex, TelephoneNumber tel) {
		super();
		this.age = age;
		this.sex = sex;
		this.tel = tel;
	}

	private int age;
	private Sex sex;
	TelephoneNumber tel;

	public TelephoneNumber getTel() {
		return tel;
	}

	public void setTel(TelephoneNumber tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

}
