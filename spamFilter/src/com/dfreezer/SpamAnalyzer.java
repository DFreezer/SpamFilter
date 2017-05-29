package com.dfreezer;

/*
SpamAnalyzer должен конструироваться от массива строк с ключевыми словами.
Объект этого класса должен сохранять в своем состоянии этот массив строк в приватном поле keywords.
 */

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private String keywords;

    @Override
    protected String getKeywords() {
        return null;
    }

    @Override
    protected Label getLabel() {
        return null;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
