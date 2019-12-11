package test;

import dubs.BigAndSmaller;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class BigAndSmallerTest {

    @Test
    public void findWithNonOrderNumberList() {
        int[] numbers = {9, 6, 8, 2, 9, 3};
        BigAndSmaller algorithm = new BigAndSmaller();
        algorithm.find(numbers);

        assertEquals(9, algorithm.getBigger());
        assertEquals(2, algorithm.getSmaller());
    }

    @Test
    public void findWithOrderNumberList() {
        int[] numbers = {5, 6, 7, 8, 9, 10};
        BigAndSmaller algorithm = new BigAndSmaller();
        algorithm.find(numbers);

        assertEquals(10, algorithm.getBigger());
        assertEquals(5, algorithm.getSmaller());
    }

    @Test
    public void findWithIdenticNumberList() {
        int[] numbers = {2, 5, 6, 10, 7, 8, 10, 9, 10};
        BigAndSmaller algorithm = new BigAndSmaller();
        algorithm.find(numbers);

        assertEquals(10, algorithm.getBigger());
        assertEquals(2, algorithm.getSmaller());
    }

    @Test
    public void findWithEmptyList() {
        int[] numbers = {};
        BigAndSmaller algorithm = new BigAndSmaller();
        algorithm.find(numbers);

        assertEquals(Integer.MIN_VALUE, algorithm.getBigger());
        assertEquals(Integer.MAX_VALUE, algorithm.getSmaller());
    }

}
