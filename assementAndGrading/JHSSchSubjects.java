package assementAndGrading;

public class JHSSchSubjects implements SchoolSubject {
    // This class implements the SchoolSubject interface for Junior High School subjects
    private String[] coreSubjects = {"Mathematics", "English Language", "Integrated Science", "Social Studies"};
    private String[] electiveSubjects = {"History", "French", "Creative Arts and Design","Basic Design and Technology",
                                         "Computing", "Religious and Moral Education",
                                         "Ghanaian Language"};

    @Override
    public String[] getCoreSubbjects() {
        return coreSubjects;
    }

    @Override
    public String[] getElectiveSubjects() {
        return electiveSubjects;
    }
    
}
