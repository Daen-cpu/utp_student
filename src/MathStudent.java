
public class MathStudent extends Student {

    public MathStudent(String fullName, int course, int lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(fullName + " с курса " + course + " на математическом направлении пишет экзамен.");
    }
}
