
public class IUStudent extends Student {

    public IUStudent(String fullName, int course, int lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(fullName + " с курса " + course + " на направлении 'Информационные технологии' пишет экзамен.");
    }
}
