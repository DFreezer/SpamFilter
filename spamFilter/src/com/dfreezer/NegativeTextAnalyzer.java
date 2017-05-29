package com.dfreezer;

/*
NegativeTextAnalyzer должен конструироваться конструктором по-умолчанию.
 */
class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer{

    private String[] negativeLabels = {":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return negativeLabels;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
