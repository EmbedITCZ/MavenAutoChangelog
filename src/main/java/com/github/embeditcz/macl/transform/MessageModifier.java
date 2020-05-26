package com.github.embeditcz.macl.transform;

import com.github.embeditcz.macl.parser.ParsingState;

/**
 * @author Vlad on 27-Oct-17.
 */
public interface MessageModifier {

    boolean accept(String currentLine, ParsingState state);

    String modify(String currentLine, ParsingState state);

}
