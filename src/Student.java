public abstract class Student {
    protected String fullName;
    protected int course;
    protected int lastExamGrade;

    public Student(String fullName, int course, int lastExamGrade) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamGrade = lastExamGrade;
    }


    public abstract void writeExam();
    public String getFullName() {
        return fullName;
    }

    public int getCourse() {
        return course;
    }

    public int getLastExamGrade() {
        return lastExamGrade;
    }

    @Override
    public String toString() {
        return "Студент: " + fullName + ", Курс: " + course + ", Оценка за последний экзамен: " + lastExamGrade;
    }
}

