package com.dfreezer;

/**
 * Created by 4567 on 29.05.2017.
 */

/*
TooLongTextAnalyzer должен конструироваться от int'а с максимальной допустимой длиной комментария.
Объект этого класса должен сохранять в своем состоянии это число в приватном поле maxLength.
 */
public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;

    @Override
    public Label processText(String text) {
        return null;
    }
}
