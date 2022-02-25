package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseConverterTest {


    @Test
    public void testStarToE() {
        //Arrange
        Converter convert = new Converter();

        //Act
        String actual = convert.convertInput("*");

        //Assert
        assertEquals("E", actual);
    }

    @Test
    public void testStarsToH() {
        //Arrange
        Converter convert = new Converter();
        //Act
        String actual = convert.convertInput("****");

        //Assert
        assertEquals("H", actual);
    }

    @Test
    public void testEToStar() {

        Converter convert = new Converter();
        String actual = convert.convertInput("E");


        assertEquals("*", actual);
    }

    @Test
    public void testHToStars() {

        Converter convert = new Converter();
        String actual = convert.convertInput("H");


        assertEquals("****", actual);
    }

    @Test
    public void testHEJToMorse() {

        Converter convert = new Converter();
        String actual = convert.EngToMorse("HEJ");


        assertEquals("**** * *---", actual);
    }

    @Test
    public void testMorseToHEJ() {

        Converter convert = new Converter();
        String actual = convert.MorseToEng("**** * *---");


        assertEquals("HEJ", actual);
    }
}
