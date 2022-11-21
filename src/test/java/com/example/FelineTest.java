package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends TestCase {

    Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        var Expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(Expected, feline.eatMeat());
    }

    @Test
    public void getKittens() {
        var Expected = 1;
        assertEquals(Expected, feline.getKittens());
    }

    @Test
    public void getFamily() {
        var Expected = "Кошачьи";
        assertEquals(Expected, feline.getFamily());
    }


}