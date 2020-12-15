package Maven;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Before;    
    
public class FuncionarioTest {

    private Funcionario f, g, h, i, j;

    @Before
    public void inicia() {
        f = new Funcionario("1111", "Ana", 20, 1800.00, 1, "Programação");
        g = new Funcionario("2222", "Beto", 22, 1500.00, 1, "Programação");
        h = new Funcionario("3333", "Caio", 21, 1000.00, 1, "Programação");
        i = new Funcionario("4444", "Davi", 25, 2500.00, 3, "Analise");
        j = new Funcionario("5555", "Erica", 26, 2500.00, 3, "Analise");

        f.batePonto();
        g.batePonto();
        h.batePonto();
        i.batePonto();
        j.batePonto();
    }

    @Test
    public  void testCalculaSalario() {
        double esperado = 1800.0;
        assertEquals(esperado, f.calculaSalario(0),0);

        esperado = 1500.0;
        assertEquals(esperado, g.calculaSalario(0),0);

        esperado = 1000.0;
        assertEquals(esperado, h.calculaSalario(0),0);

        i.setHorasExtras(5);
        esperado = 2550.0;
        assertEquals(esperado, i.calculaSalario(10),0);

        j.setHorasExtras(10);
        esperado = 2600.0;
        assertEquals(esperado, j.calculaSalario(10),0);
    }

    @Test
    public void testBatePonto() {
        Calendar c = Calendar.getInstance();

        assertEquals(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND), f.getHoraEntrada());
        assertEquals(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND), g.getHoraEntrada());
        assertEquals(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND), h.getHoraEntrada());
        assertEquals(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND), i.getHoraEntrada());
        assertEquals(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND), j.getHoraEntrada());
    }

    @Test
    public void testToStringConsulta() {
        String esperado = "Nome: Ana\nNível: 1\nHoras Extras deste mês: 0";
        assertEquals(esperado, f.toStringConsulta());

        esperado = "Nome: Beto\nNível: 1\nHoras Extras deste mês: 0";
        assertEquals(esperado, g.toStringConsulta());

        esperado = "Nome: Caio\nNível: 1\nHoras Extras deste mês: 0";
        assertEquals(esperado, h.toStringConsulta());

        esperado = "Nome: Davi\nNível: 3\nHoras Extras deste mês: 0";
        assertEquals(esperado, i.toStringConsulta());

        esperado = "Nome: Erica\nNível: 3\nHoras Extras deste mês: 0";
        assertEquals(esperado, j.toStringConsulta());
    }

    @Test
    public void testToString() {
        String esperado = "Ana";
        assertEquals(esperado, f.toString());

        esperado = "Beto";
        assertEquals(esperado, g.toString());

        esperado = "Caio";
        assertEquals(esperado, h.toString());

        esperado = "Davi";
        assertEquals(esperado, i.toString());

        esperado = "Erica";
        assertEquals(esperado, j.toString());
    }

}

    