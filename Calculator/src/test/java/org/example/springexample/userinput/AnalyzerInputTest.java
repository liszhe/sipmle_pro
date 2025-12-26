package org.example.springexample.userinput;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.springexample.userinput.AnalyzerInput.*;
import static org.junit.jupiter.api.Assertions.*;
class AnalyzerInputTest {
    @Test
    @DisplayName("Test resault bracket")
    public void testResultBracket(){
        String string = "(5+5)";
        assertEquals("10.0", resultBracket(string));
    }

    @Test
    @DisplayName("Test result math")
    public void testResultMath(){
        String string = "5+2";
        assertEquals("7.0", resultMath(string));
    }


    @Test
    @DisplayName("Test get index multiplication and division")
    public void testGetIndexMultiplicationAndDivision(){
        String string = "5*2";
        assertEquals(1, getIndexMultiplicationAndDivision(string));
        string = "5/2";
        assertEquals(1, getIndexMultiplicationAndDivision(string));
    }

    @Test
    @DisplayName("Test get index summation and subtraction")
    public void testGetIndexSummationAndSubtraction(){
        String string = "5+2";
        assertEquals(1, getIndexSummationAndSubtraction(string));
        string = "5-2";
        assertEquals(1, getIndexSummationAndSubtraction(string));
    }

    @Test
    @DisplayName("Test get result multiplication and division")
    public void testGetResultMultiplicationAndDivision(){
        String string = "5*2";
        assertEquals("10.0", getResultMultiplicationAndDivision(string, 1));
        string = "5/2";
        assertEquals("2.5", getResultMultiplicationAndDivision(string, 1));
    }

    @Test
    @DisplayName("Test get result multiplication and division")
    public void testGetResultSummationAndSubtraction(){
        String string = "5+2";
        assertEquals("7.0", getResultSummationAndSubtraction(string, 1));
        string = "5-2";
        assertEquals("3.0", getResultSummationAndSubtraction(string, 1));
    }

    @Test
    @DisplayName("Test has bracket")
    public void testHasBracket(){
        String string = "21903829813(";
        assertTrue(hasBracket(string));
    }

    @Test
    @DisplayName("Test find id open bracket")
    public void testFindIdOpenBracket(){
        String string = "21903829813(";
        assertEquals(11, findIdOpenBracket(string));
    }

    @Test
    @DisplayName("Test find id open bracket")
    public void testFindIdCloseBracket(){
        String string = "21903829813)";
        assertEquals(11, findIdCloseBracket(string));
    }

    @Test
    @DisplayName("Test check has math operator")
    public void testHasMathOperator(){
        String string = "+-/*";
        assertTrue(hasMathOperator(string));
    }
}