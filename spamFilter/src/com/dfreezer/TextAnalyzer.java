package com.dfreezer;

/**
 * Created by 4567 on 29.05.2017.
 */

/**
 * {@code Label} contain types of all possible labels
 */
enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

/**
 * {@code TextAnalyzer} is the interface of spam filter
 */
interface TextAnalyzer {
    Label processText(String text);
}
