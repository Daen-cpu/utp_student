public class Main {
    public static void main(String[] args) {
        // Тестирование абстрактного класса Student и его наследников
        Student student1 = new IUStudent("Иванов Иван Иванович", 3, 85);
        Student student2 = new MathStudent("Петров Петр Петрович", 2, 92);

        student1.writeExam();
        student2.writeExam();

        // Тестирование класса StringArrayHandler
        StringArrayHandler handler = new StringArrayHandler();
        handler.addString("Книга");
        handler.addString("Компьютер");
        handler.addString("Автомобиль");

        System.out.println("Самая длинная строка: " + handler.getMaxLengthString());
        System.out.println("Средняя длина строк: " + handler.getAverageLength());
    }
}
