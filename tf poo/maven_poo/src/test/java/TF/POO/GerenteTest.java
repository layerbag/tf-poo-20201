package TF.POO;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;    

public class GerenteTest {
    Gerente g;
    @Before
    public void setup(){
        g = new Gerente("2222", "chefe", 55, 5000.00, "123", "Gerente de Projetos");
    }
        
    @Test
    public void testToString() {
        assertEquals("2222\nchefe\n55\n5000.0\n123\nGerente de Projetos", g.toString());
        g = null;
    }

    
}
    