package com.dfreezer;

/**
 * Created by 4567 on 29.05.2017.
 */

/*
NegativeTextAnalyzer должен конструироваться конструктором по-умолчанию.
 */
public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer{

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
