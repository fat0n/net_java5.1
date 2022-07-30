import ru.netology.javaqa.javaqamvn.services.SQRService;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {

        SQRService calculate = new SQRService();
        int min = 200;
        int max = 300;
        int finalResult = calculate.calcInTheRange(min, max);
        System.out.println(finalResult);
    }
}
