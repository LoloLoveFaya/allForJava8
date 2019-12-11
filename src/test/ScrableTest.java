package test;

import dubs.Scrable;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScrableTest {

    @Test
    public void normalScrableResult(){
        String word = "abcd";
        Scrable scrable = new Scrable();

        Integer result = scrable.getScore(word);
        assertEquals(java.util.Optional.of(16), java.util.Optional.of(result));
    }
}
