package com.dfreezer;

/*
SpamAnalyzer должен конструироваться от массива строк с ключевыми словами.
Объект этого класса должен сохранять в своем состоянии этот массив строк в приватном поле keywords.
 */


class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private String[] keywords;

    SpamAnalyzer(String... keywords) {
        this.keywords = keywords.clone();
    }

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
