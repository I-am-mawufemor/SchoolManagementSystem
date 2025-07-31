import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate dateOfBirth;
    private String parents;
    private String telephone;
    private String email;

    // default constructor
    public Student() {
    }
    // parameter constructor 
    public Student(String name, LocalDate dateOfBirth, String parents, String telephone, String email) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.parents = parents;
        this.telephone = telephone;
        this.email = email;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }
    public void setDatefBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setParents(String parents){
        this.parents = parents;
    }

    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    public void setEmail(String email){
        this.email = email;
    }

    
    // getters
    public String getName(){
        return name;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public String getParents(){
        return parents;
    }

    public String getTelephone(){
        return telephone;
    }
    public String getEmail(){
        return email;
    }   

    // method to calculate age
    public int geAge() {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    } 
    
    public String toString() {
        return name + " - " + dateOfBirth + " - " + parents + " - " + telephone + " - " + email + " - Age: " + geAge();
    }
}
