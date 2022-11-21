package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class CatTest extends TestCase {

    @Mock
    Feline feline;


    @Test
    public void getSoundSayMay() {
        Cat cat = new Cat(feline);
        var sound = cat.getSound();
        assertEquals("Мяу", sound);
    }

    @Test
    public void getFoodPredatorFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(this.feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        var Expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(Expected, cat.getFood());
    }
}