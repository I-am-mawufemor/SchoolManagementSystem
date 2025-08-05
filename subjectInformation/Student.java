package subjectInformation;
import java.time.LocalDate;
import java.util.regex.Pattern;

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
        if(name != null && name.isEmpty()){
            this.name = name;
        }else{
            System.out.println("Invalid name");
        }
        
    }
    public void setDatefBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setParents(String parents){
        if (parents != null && parents.isEmpty()) {
            this.parents = parents;
        }else{
            System.out.println("Invalid parent name");
        }
       
    }

    public void setPhoneNumber(String telephone) {
        // Basic regex: allows +233 followed by 9 digits OR 0 followed by 9 digits
        if (telephone != null && telephone.matches("^(\\+233|0)[0-9]{9}$")) {
            this.telephone = telephone;
        } else {
            System.out.println("Invalid phone number format. Use +233XXXXXXXXX or 0XXXXXXXXX.");
        }
    }
    
    public void setEmail(String email){
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if(email != null && Pattern.matches(emailRegex, email)){
          
            this.email = email;
        }
        else {
            System.out.println("Invalid email format");
        }
        
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
