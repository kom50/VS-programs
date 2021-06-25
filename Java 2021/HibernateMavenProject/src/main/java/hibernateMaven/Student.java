package hibernateMaven;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
    private int id;
    private String name;
    private String city;
    
    public Student() {}
    public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		return "Id : "+this.id+", Name : "+this.name+", City : "+this.city;
	}
}
