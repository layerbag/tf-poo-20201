package TF.POO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Before;    
    
public class FuncionarioTest {
    Funcionario a;

    @Before
    public void setup(){
        a = new Funcionario("5555", "JV", 20, 2500.00, 2,0,"Gerente de Projetos");
    }
        
    @Test
    public void testCalculaSalario() {
        double x;
        assertEquals(2550, a.calculaSalario(25),25);
    }

    @Test
    public void testFinalizaExpediente(){
        a.batePonto();
        a.finalizaExpediente();
        Calendar c = Calendar.getInstance();

        assertEquals(1, a.getHorasExtras());
    }

    
}
    