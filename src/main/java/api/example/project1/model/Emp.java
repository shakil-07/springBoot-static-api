package api.example.project1.model;
import java.time.LocalDate;
//Creating Schema of a Api

//Initialization
public class Emp {
    private Long id;
    private String name;
    private LocalDate dob;//Initializing the class not the variable
    private Integer age;

    //Empty Constructor
    public Emp() {
    }

    //Constructor with all the passing Args
    public Emp(Long id, String name, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
    }

   //Constructor with all the Args except id
//    public Emp(String name, LocalDate dob, Integer age) {
//        this.name = name;
//        this.dob = dob;
//        this.age = age;
//    }

    //Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    //ToString()
    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
