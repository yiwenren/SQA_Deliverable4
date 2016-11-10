/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yiwenren
 */
public class GameOfLifeTest {
    
    public GameOfLifeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //The following three test cases test the method convertToInt(int x)
    //Because this method is called by the method getNumNeighbors(int x, int y)
    //So we need to set the situations of neighborhood
    //The method convertToIntOriginal(int x) is the original method
    
    // In the first test case, we assume all neighbors alive 
    // Then the number of neighbors should be 8
    // The results of the two methods should be the same
     @Test
     public void convertToIntTest1() {
         int size = 15;
         Cell[][] cells = new Cell[size][size];
         for(int i = 0; i < size; i++){
             for(int j = 0; j < size; j++){
                 cells[i][j] = new Cell();
                 cells[i][j].setAlive(true);
             }
             
         }
         MainPanel panel = new MainPanel(size);
         panel.setCells(cells);
         int originalSituation = panel.convertToIntOriginal(8);
         int currentSituation = panel.convertToInt(8);
         //test whether the result of method modifies equals to that of method before
         assertEquals(originalSituation, currentSituation);
     }
     
    // In the second test case, we assume all neighbors dead 
    // Then the number of neighbors should be 0
     @Test
     public void convertToIntTest2() {
         int size = 15;
         Cell[][] cells = new Cell[size][size];
         for(int i = 0; i < size; i++){
             for(int j = 0; j < size; j++){
                 cells[i][j] = new Cell();
                 cells[i][j].setAlive(true);
             } 
         }
         MainPanel panel = new MainPanel(size);
         panel.setCells(cells);
         int originalSituation = panel.convertToIntOriginal(0);
         int currentSituation = panel.convertToInt(0);
         //test whether the result of method modifies equals to that of method before
         assertEquals(originalSituation, currentSituation);
     }
     
    // In the third test case, we assume all neighbors are alive or dead, which is generated randomly 
    // Then the number of neighbors should be a random integer from 0 to 8
     @Test
     public void convertToIntTest3() {
         int size = 15;
         Cell[][] cells = new Cell[size][size];
         Random random = new Random();
         boolean[] live = {true, false}; 
         for(int i = 0; i < size; i++){
             for(int j = 0; j < size; j++){
                 cells[i][j] = new Cell();
                 boolean live2 = live[random.nextInt(2)];
                 cells[i][j].setAlive(live2);
             } 
         }
         MainPanel panel = new MainPanel(size);
         panel.setCells(cells);
         
         int num = random.nextInt(9);
         System.out.print("num = " + num);
         int originalSituation = panel.convertToIntOriginal(num);
         int currentSituation = panel.convertToInt(num);
         //test whether the result of method modifies equals to that of method before
         assertEquals(originalSituation, currentSituation);
     }
     
     
     //The following three test cases test the method toString() in class Cell
     //The method toStringOriginal(int x) is the original method
     //The results of the two methods should be the same
     
     //In the first test case, we assume the cell is alive
     //Then the text on the button should be "X"
     //The results of the two methods should be the same
     @Test
     public void testToString1() {
        Cell c = new Cell();
        c.setAlive(true);
        String original = c.toStringOriginal();
        String current = c.toString();
        assertEquals(original, current);
    }
     
     //In the second test case, we assume the cell is dead
     //Then the text on the button should be "."
     //The results of the two methods should be the same
     @Test
     public void testToString2() {
        Cell c = new Cell();
        c.setAlive(false);
        String original = c.toStringOriginal();
        String current = c.toString();
        assertEquals(original, current);
    }
     
     //In the thrid test case, we assume the cell has been alive
     //Then the text on the button should be " "
     //The results of the two methods should be the same
     @Test
     public void testToString3() {
        Cell c = new Cell();
        c.setAlive(true);
        c.setAlive(false);
        String original = c.toStringOriginal();
        String current = c.toString();
        assertEquals(original, current);
    }
    
}
