package com.dfreezer;

/**
 * Created by 4567 on 29.05.2017.
 */

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

interface TextAnalyzer {
    Label processText(String text);
}
