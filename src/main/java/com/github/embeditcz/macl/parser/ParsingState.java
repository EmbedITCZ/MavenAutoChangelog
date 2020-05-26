package com.github.embeditcz.macl.parser;

import com.github.embeditcz.macl.ChangelogConfiguration;

/**
 * @author Kisel on 27.10.2017.
 */
public class ParsingState {

    public ChangelogConfiguration conf;

    public String previousMatched;

    public boolean isPreviousAccepted;

    public boolean isAccepted;

    public ParsingState(ChangelogConfiguration conf) {
        this.conf = conf;
        this.isAccepted = false;
    }

}
