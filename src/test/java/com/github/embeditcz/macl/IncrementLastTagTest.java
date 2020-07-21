package com.github.embeditcz.macl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Vlad on 03-Dec-17.
 */
public class IncrementLastTagTest extends AbstractTest {

    @Test
    public void testIncrementValue() {
        ChangelogExecutor executor = executor(new ChangelogConfiguration());

        assertEquals("2", executor.incrementLastTag("1"));
        assertEquals("10", executor.incrementLastTag("9"));

        assertEquals("17.2", executor.incrementLastTag("17.1"));
        assertEquals("17.10", executor.incrementLastTag("17.9"));

        assertEquals("17.1.1.1", executor.incrementLastTag("17.1.1.0"));
        assertEquals("17.1.1.10", executor.incrementLastTag("17.1.1.9"));

        assertEquals("17.1000", executor.incrementLastTag("17.999"));

        assertEquals("17.8-3m", executor.incrementLastTag("17.8-2m"));
        assertEquals("17.8-10m", executor.incrementLastTag("17.8-9m"));
        assertEquals("2017.04", executor.incrementLastTag("2017.03"));
    }

    @Test
    public void testIncrementIllegalFormat() {
        ChangelogExecutor executor = executor(new ChangelogConfiguration());

        assertException(() -> executor.incrementLastTag("abc"), "Can't find version number in the last tag");
    }

}
