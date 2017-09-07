/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.radieproject.Main;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author radie
 */

public class MainTest {
    
    Main main = new Main();
    
    @Test
    public void testAddition(){      
        
        assertEquals(5, main.addition(2,3));
    }
    
    @Test
    public void testConcat2String(){
        assertEquals("undeux",main.concat2String("un", "deux"));
    }
    
}
