public class Assessment {
    private String subject;
    private double project;
    private double groupWork;
    private double testOne;
    private double testTwo;
    private double examScore;
    
    //default constructor 
    public Assessment(){

    }
    // constructor 
    public  Assessment(String subject, double project, double groupWork, double testOne, double testTwo, double examScore) {
    this.subject = subject;
    this.project = project;
    this.groupWork = groupWork;
    this.testOne = testOne;
    this.testTwo = testTwo;
    this.examScore = examScore;
        
    }
    // setters
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void setProject(int project){
        this.project=project;
    }
    public void setGroupWork(int groupWork){
        this.groupWork = groupWork;
    }

   
    public void setTestOne(int testOne){
        this.testOne=testOne;
    }
    public void setTestTwo(int testTwo){
        this.testTwo=testTwo;
    }
    public void setExamsScore(int examScore){
        this.examScore = examScore;
    }


    // getters
    public String getSubject(){
        return subject;
    }
    public double getProject(){
        return project;
    }
    public double getGroupWork(){
        return groupWork;
    }
    public double getTestOne(){
        return testOne;
    }
    public double getTestTwo(){
        return testTwo;
    }

    public double getExamsScore(){
        return examScore ;
    }

// calculate to score 
public double totalClassScore(){
    double totalClassScore = 0;
    totalClassScore = (getGroupWork()+getProject()+getTestOne() + getTestTwo())/2;
    return totalClassScore;
}
public double totalExamsScore(){
    double totalExamsScore = getExamsScore()/2;
    return totalExamsScore;
}
public double total(){
    double total = 0;
    total = totalClassScore() + totalExamsScore();
    return total;
}

public String toString() {
    return "Subject: " + subject + "\n" +
           "Project: " + project + "\n" +
           "Group Work: " + groupWork + "\n" +
           "Test One: " + testOne + "\n" +
           "Test Two: " + testTwo + "\n" +
           "Exam Score: " + examScore + "\n" +
           "Total Class Score: " + totalClassScore() + "\n" +
           "Total Exams Score: " + totalExamsScore() + "\n" +
           "Overall Total Score: " + total();
}
}