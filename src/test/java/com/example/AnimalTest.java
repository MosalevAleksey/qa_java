package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest extends TestCase {

    Animal animal = new Animal();

    @Test
    public void getFoodWhenPredator() throws Exception {
        var Expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(Expected, animal.getFood("Хищник"));
    }

    @Test
    public void getFoodWhenHerbivore() throws Exception {
             var Expected = List.of("Трава", "Различные растения");
        assertEquals(Expected, animal.getFood("Травоядное"));
    }


    @Test
    public void getFamilReturnFamily() {
        var Expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(Expected, animal.getFamily());
    }
}