package com.github.embeditcz.macl.transform;

import com.github.embeditcz.macl.parser.ParsingState;

/**
 * @author Kisel on 27.10.2017.
 */
public interface MessageTransformer {

    String transform(String needle, ParsingState state);

}
