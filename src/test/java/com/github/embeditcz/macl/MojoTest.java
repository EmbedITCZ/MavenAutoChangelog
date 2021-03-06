package com.github.embeditcz.macl;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vlad on 17-Nov-17.
 */
public class MojoTest extends AbstractTest {

    @Test
    public void mojoConfigTest() {
        String applicableCommitPattern = "applicableCommitPattern";
        String commitFormat = "commitFormat";
        String lastTagFormat = "lastTagFormat";
        String lastTagPattern = "lastTagPattern";
        String mergeRequestReplacement = "MR#";
        String mergeRequestReplacePattern = "mergeRequestReplacePattern";
        String pathToChangelog = "pathToChangelog";
        String unreleasedRowPattern = "unreleasedRowPattern";

        ChangelogMojo mojo = new ChangelogMojo();
        mojo.applicableCommitPattern = applicableCommitPattern;
        mojo.commitFormat = commitFormat;
        mojo.lastTagFormat = lastTagFormat;
        mojo.lastTagPattern = lastTagPattern;
        mojo.mergeRequestReplacement = mergeRequestReplacement;
        mojo.mergeRequestReplacePattern = mergeRequestReplacePattern;
        mojo.pathToChangelog = pathToChangelog;
        mojo.unreleasedRowPattern = unreleasedRowPattern;

        ChangelogConfiguration result = mojo.getChangelogConfiguration();

        Assert.assertEquals(result.pathToChangelog.toString(), pathToChangelog);
        Assert.assertEquals(result.lastTagFormat, lastTagFormat);
        Assert.assertEquals(result.lastTagPattern.pattern(), lastTagPattern);
        Assert.assertEquals(result.mergeRequestReplacement, mergeRequestReplacement);
        Assert.assertEquals(result.mergeRequestReplacePattern.pattern(), mergeRequestReplacePattern);
        Assert.assertEquals(result.unreleasedRowPattern.pattern(), unreleasedRowPattern);
    }

}
