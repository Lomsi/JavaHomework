package Lessons;

public class Homework2 {

    // הקוד גורם לשגיאה מכיוון שהמשתנה הראשון מסוג מחרוזת והשני מסוג מספר שלם, ולא
    // ניתן להוסיף מחרוזת בתור פעולת חשבון כלשהי

    // דרך א

    public static void Homework2Main(String[] args) {
        int num1 = 100;
        int num2 = 2000;
        int add_numbers = num1 + num2;

    }

    // דרך ב

    public static void Main2(String[] args) {
        String num1 = "100";
        Integer C_num1 = Integer.parseInt(num1);
        Integer num2 = 2000;
        Integer add_numbers = num2 + C_num1;

    }

}
