package assementAndGrading;

public class Assessment {
    private double project;
    private double groupWork;
    private double testOne;
    private double testTwo;
    private double examScore;

    public Assessment() {}

    public Assessment(double project, double groupWork, double testOne, double testTwo, double examScore) {
        
        this.project = project;
        this.groupWork = groupWork;
        this.testOne = testOne;
        this.testTwo = testTwo;
        this.examScore = examScore;
    }

    // Setters
    
    public void setProject(double project) { 
        this.project = project; 
    }
    public void setGroupWork(double groupWork) {
         this.groupWork = groupWork; 
        }
    public void setTestOne(double testOne) { 
        this.testOne = testOne; 
    }
    public void setTestTwo(double testTwo) { 
        this.testTwo = testTwo; 
    }
    public void setExamsScore(double examScore) { 
        this.examScore = examScore; 
    }

    // Getters
    public double getProject() { 
        return project; 
    }
    public double getGroupWork() { 
        return groupWork; 
    }
    public double getTestOne() { 
        return testOne; 
    }
    public double getTestTwo() { 
        return testTwo; 
    }
    public double getExamsScore() { 
        return examScore; 
    }

    public double totalClassScore() {
        return groupWork + project + testOne + testTwo;
    }

    public double classScore50percent() {
        return totalClassScore() * 0.5;
    }

    public double totalExamsScore() {
        return examScore;
    }

    public double examsScore50percent() {
        return totalExamsScore() * 0.5;
    }

    public double total() {
        return totalClassScore() + totalExamsScore();
    }

    public AssessmentGrading getGrade() {
        double score = total();
        if (score >= 90) return AssessmentGrading.Excellent;
        else if (score >= 80) return AssessmentGrading.VeryGood;
        else if (score >= 70) return AssessmentGrading.Good;
        else if (score >= 60) return AssessmentGrading.HighAverage;
        else if (score >= 50) return AssessmentGrading.Average;
        else if (score >= 40) return AssessmentGrading.LowAverage;
        else if (score >= 30) return AssessmentGrading.Poor;
        else return AssessmentGrading.Fail;
    }

    @Override
    public String toString() {
        return "Project: " + project + "\n" +
               "Group Work: " + groupWork + "\n" +
               "Test One: " + testOne + "\n" +
               "Test Two: " + testTwo + "\n" +
               "Exam Score: " + examScore + "\n" +
               "Total Class Score: " + totalClassScore() + "\n" +
               "Total Exams Score: " + totalExamsScore() + "\n" +
               "Overall Total Score: " + total() + "\n" +
               "Grade: " + getGrade();
    }
}


