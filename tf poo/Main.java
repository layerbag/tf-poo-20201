public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("2222", "chefe", 55, 5000.00, 123, "Gerente de Projetos");
        Funcionario f = new Funcionario("5555", "JV", 20, 2500.00, 2);
        Tarefa t = new Tarefa(555, 1, 20, false);

        f.batePonto();
        System.out.println(f.getHoraEntrada());
        f.finalizaExpediente();
        

    }
}
