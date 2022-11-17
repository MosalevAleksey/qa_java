package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class LionTest extends TestCase {

    @Mock
    Felines felines;
    Feline feline;

    @Test
    public void getKittensReturn() throws Exception {
        Lion lion = new Lion("Самец", felines, feline);
        when(felines.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveManeReturnTrue() throws Exception {
        Lion lion = new Lion("Самка", felines, feline);
        assertEquals(false, lion.doesHaveMane());
    }

    @Test
    public void getFoodReturnPredatorFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", felines, feline);
        var food = lion.getFood();
        var Expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(Expected, food);

    }
}