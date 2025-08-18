package assementAndGrading;

public class PrimSchSubjects implements SchoolSubject {
// This class implements the SchoolSubject interface for primary school subjects
    private String[] coreSubjects = {"Mathematics", "English Language", "Science","Social Studies"};
    private String[] electiveSubjects = {"History", "French", "Creative Arts and design", "Physical Education", "Computing","Religious and Moral Education",
    "Our World Our People", "Ghanaian Language"};

    @Override
    public String[] getCoreSubbjects() {
        return coreSubjects;
    }

    @Override
    public String[] getElectiveSubjects() {
        return electiveSubjects;
    }
    
}
