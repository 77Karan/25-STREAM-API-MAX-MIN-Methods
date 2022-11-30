package pack1.max.min.avg;

public class Employee 
{
	private String name;
	private Integer age;
	private Integer sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	public Employee(String name, Integer age, Integer sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	

}
