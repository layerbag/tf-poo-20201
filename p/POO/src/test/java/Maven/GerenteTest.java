package Maven;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;    
    
public class GerenteTest {

    public  Gerente f, g, h, i, j;

    @Before
    public void inicia() {
        f = new Gerente("1111", "Ana", 25, 2000.0, "123", "Programação");
        g = new Gerente("2222", "Beto", 30, 2500.00, "123", "Análise");
        h = new Gerente("3333", "Caio", 31, 3000.00, "123", "Vendas");
        i = new Gerente("4444", "Davi", 28, 3500.00, "123", "Projetos");
        j = new Gerente("5555", "Erica", 27, 2400.00, "123", "Suporte");
    }

    @Test
    public void testCadastraFuncionario() {
        Funcionario funcionario = new Funcionario("7777", "Estagiario", 20, 1000.00, 1, "Programação");
        assertTrue(f.cadastraFuncionario(funcionario));
        assertTrue(g.cadastraFuncionario(funcionario));
        assertTrue(h.cadastraFuncionario(funcionario));
        assertTrue(i.cadastraFuncionario(funcionario));
        assertTrue(j.cadastraFuncionario(funcionario));
    }

    @Test
    public void testRemoveFuncionarios() {
        Funcionario funcionario = new Funcionario("7777", "Estagiario", 20, 1000.00, 1, "Programação");
        f.cadastraFuncionario(funcionario);
        g.cadastraFuncionario(funcionario);
        h.cadastraFuncionario(funcionario);
        i.cadastraFuncionario(funcionario);
        j.cadastraFuncionario(funcionario);

        assertTrue(f.removeFuncionarios(funcionario));
        assertTrue(g.removeFuncionarios(funcionario));
        assertTrue(h.removeFuncionarios(funcionario));
        assertTrue(i.removeFuncionarios(funcionario));
        assertTrue(j.removeFuncionarios(funcionario));
    }

    @Test
    public void testToString() {
        String esperado = "1111\nAna\n25\n2000.0\n123\nProgramação";
        assertEquals(esperado,f.toString());
        
        esperado = "2222\nBeto\n30\n2500.0\n123\nAnálise";
        assertEquals(esperado, g.toString());
        
        esperado = "3333\nCaio\n31\n3000.0\n123\nVendas";
        assertEquals(esperado, h.toString());
        
        esperado = "4444\nDavi\n28\n3500.0\n123\nProjetos";
        assertEquals(esperado, i.toString());
        
        esperado = "5555\nErica\n27\n2400.0\n123\nSuporte";
        assertEquals(esperado, j.toString());
    }

    @Test
    public void testGetArrayList() {
        ArrayList<Funcionario> esperado = new ArrayList<>();
        assertEquals(esperado, f.getArrayList());
        assertEquals(esperado, g.getArrayList());
        assertEquals(esperado, h.getArrayList());
        assertEquals(esperado, i.getArrayList());
        assertEquals(esperado, j.getArrayList());
        
        Funcionario funcionario = new Funcionario("7777", "Fulano", 26, 1500.0, 2, "Programação");
        assertTrue(f.cadastraFuncionario(funcionario));
        assertTrue(g.cadastraFuncionario(funcionario));
        assertTrue(h.cadastraFuncionario(funcionario));
        assertTrue(i.cadastraFuncionario(funcionario));
        assertTrue(j.cadastraFuncionario(funcionario));
        esperado.add(funcionario);
        
        assertEquals(esperado, f.getArrayList());
        assertEquals(esperado, g.getArrayList());
        assertEquals(esperado, h.getArrayList());
        assertEquals(esperado, i.getArrayList());
        assertEquals(esperado, j.getArrayList());
        
    }

}

    