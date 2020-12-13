package TF.POO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Before;    
    
public class FuncionarioTest {
    Funcionario a;

    @Before
    public void setup(){
        a = new Funcionario("5555", "JV", 20, 2500.00, 2,"Gerente de Projetos");
    }
        
    @Test
    public void testCalculaSalario() {
        double x;
        assertEquals(2550, a.calculaSalario(25),50);
    }

    @Test
    public void testFinalizaExpediente(){
        a.batePonto();
        assertEquals(true, a.isNaEmpresa());
        a.finalizaExpediente();
        

        assertEquals(1, a.getHorasExtras());
        assertEquals(false, a.isNaEmpresa());

    }

    @Test
    public void testGetHoraEntrada(){
        a.batePonto();
        Calendar c = Calendar.getInstance();
        assertEquals(c.get(11) +":"+ c.get(12) + ":" + c.get(13),a.getHoraEntrada());
    }
}
    