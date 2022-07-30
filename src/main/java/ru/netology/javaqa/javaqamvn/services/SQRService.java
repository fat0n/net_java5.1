package ru.netology.javaqa.javaqamvn.services;

public class SQRService {
    int result = 0;


    public int calcInTheRange(int min, int max) {
        for (int i = 10; i <= 99; i++) {
            int iCalc = i * i;

            if (iCalc >= min && iCalc <= max) {
                result = result + 1;


           }

        }

        return result;
    }


}
