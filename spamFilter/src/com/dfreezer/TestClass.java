package com.dfreezer;

class TestClass {

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            if (analyzer.processText(text) != Label.OK) {
                return analyzer.processText(text);
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {
        TextAnalyzer[] analyzers = {new SpamAnalyzer("fuck", "shit", "bitch", "ass"), new NegativeTextAnalyzer(), new TooLongTextAnalyzer(20)};
        String text1 = "Good string";
        String text2 = "fuuuuucking string";
        String text3 = "fuck string";
        String text4 = "the veeeeeeeeeeeeeeeerrrry bitch string";
        String text5 = "lol im sorry =(";

        System.out.println(checkLabels(analyzers, text1));
        System.out.println(checkLabels(analyzers, text2));
        System.out.println(checkLabels(analyzers, text3));
        System.out.println(checkLabels(analyzers, text4));
        System.out.println(checkLabels(analyzers, text5));

    }
}
