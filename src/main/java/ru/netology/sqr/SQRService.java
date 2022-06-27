package ru.netology.sqr;

public class SQRService {
    public int calculate(int beginning, int ending) {
        int j = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i >= beginning) && (i * i <= ending)) {
                j++;
            }
        }
        return j;
    }

}


