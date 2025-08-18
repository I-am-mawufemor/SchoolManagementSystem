package subjectSchoolInfo;

// import java.time.LocalDate;
import java.util.regex.Pattern;

public class School {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String principalName;
    // private LocalDate establishedYear;
    private String schoolType; // e.g., Primary, Secondary, etc.
    private String location;

    // Default constructor
    public School() {
    }

    // Parameterized constructor
    public School(String name, String address, String phoneNumber, String email, String principalName,String schoolType, String location) {

        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.principalName = principalName;
        this.schoolType = schoolType;
    
        this.location = location;
    }
 
    // Getters and Setters
    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }else {
            System.out.println("Invalid school name");
        }
        
    }

    public void setAddress(String address) {
        if(address != null && !address.isEmpty()) {
            this.address = address;
        }else {
            System.out.println("Invalid school address");
        }
        
    }
    public void setPhoneNumber(String phoneNumber) {
        // Basic regex: allows +233 followed by 9 digits OR 0 followed by 9 digits
        if (phoneNumber != null && phoneNumber.matches("^(\\+233|0)[0-9]{9}$")) {
            this.phoneNumber = phoneNumber;
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
    public void setPrincipalName(String principalName) {
        if(principalName != null && !principalName.isEmpty()) {
            this.principalName = principalName;
    }else{
            System.out.println("Invalid principal name");
        }
    }

    /*public void setEstablishedYear(LocalDate establishedYear) {
        if(establishedYear != null && establishedYear.isBefore(LocalDate.now())) {
            this.establishedYear = establishedYear;
        }else{
            System.out.println("Invalid established year");
        }
        
    } */ 
    public void setSchoolType(String schoolType){
        if (schoolType != null && schoolType.isEmpty()) {
            this.schoolType = schoolType;
        }else{
            System.out.println("Invalid school type");
        }
    }

    public void setLoction(String location){
        if(location != null && location.isEmpty())
        {
            this.location =location;
        }else{
            System.out.println("Invalid school location");
        }

    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }

    public String getPrincipalName(){
        return principalName;
    }

    /* public LocalDate getEstablishedYear(){
        return establishedYear;
    }*/ 
    public String getSchoolType(){
        return schoolType;
    }

    public String getLocation(){
        return location;
    }

    public String toString(){
        return "Name of School: "+ name + "\nAddress" +address+ "\nPhone Number: "+phoneNumber+ 
        "\nEmail: " + email + "\nName of principal: "+principalName +  "\nSchool Type: "
        + schoolType + "\nLocation: "+ location; 
    }
}

