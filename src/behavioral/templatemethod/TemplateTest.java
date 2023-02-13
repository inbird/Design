package behavioral.templatemethod;

public class TemplateTest {
    public static void main(String[] args) {
        KoreanTeacher koreanTeacher = new KoreanTeacher();
        MathTeacher mathTeacher = new MathTeacher();
        EnglishTeacher englishTeacher = new EnglishTeacher();

        koreanTeacher.start();
        System.out.println();
        mathTeacher.start();
        System.out.println();
        englishTeacher.start();
    }
}
