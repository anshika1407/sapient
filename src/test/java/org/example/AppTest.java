package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;
    /**
     * Rigorous Test :-)
     */
    public AppTest()
    {
        app = new App();
    }

    @Test
    public void shouldReturnValidResult() throws IllegalArgumentException {
        int[] arr = new int[]{8,7,7,5,3,8,8,3,5,3,7};
        assertEquals( 4, app.getminimum(arr) );
    }

    @Test
    public void shouldHandleNullScenario() throws IllegalArgumentException {
        assertEquals( 0, app.getminimum(null) );
    }

    @Test
    public void shouldHandleEmptyScenario() throws IllegalArgumentException {
        assertEquals( 0, app.getminimum(new int[]{}) );
    }

    @Test
    public void shouldHandleAllElementsSimilar() throws IllegalArgumentException {
        assertEquals( 1, app.getminimum(new int[]{1,1,1,1,1,1,1,1}) );
    }

    @Test(expected = IllegalArgumentException.class)
    public void shoulThrowException() throws IllegalArgumentException {
         app.getminimum(new int[]{1,1,1,1,1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,11,1,1,
                 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,11,1});
    }
}
