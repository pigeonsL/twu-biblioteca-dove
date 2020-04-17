package com.twu.biblioteca.IO;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class InputTest extends Input{
    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();
    @Test //login input
    public void testInput(){
        systemInMock.provideLines("my input");
        assertEquals("my input", Input.getInput("any word"));
    }
}
