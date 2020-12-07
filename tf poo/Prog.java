public class Prog {
    public static void main(final String[] args) {
        Tarefa t = new Tarefa("tarefa 1");
        Gerente g = new Gerente();
        Gerente g2 = new Gerente();
        g.adicionTarefa(t);
        g.removeTarefa(t);
        
    }
}