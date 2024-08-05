public class Concerto extends Evento{

    public Concerto(String nome, String data, String hora, String local, double preco) {
        super(nome, data, hora, local, preco);
        this.capacidade = 150;
    }

    @Override
    public void extratoReceita() {
        System.out.println("==== Extrato da Receita do Concerto '" + this.getNome() + "' ====");
        for(Ingresso atual : this.ingressos) {
            if (atual != null) {
                System.out.println(atual.toString());
            }
        }
        System.out.println("==========================================================\n");

    }

    @Override
    public void addIngresso(Ingresso newIngresso) {
        if(ingressos.size() <= capacidade) {
            if (newIngresso.tipo == 'v' && ingressoVIPDisp() <= capacidade * 0.1) {
                this.ingressos.add(newIngresso);
            } else {
                this.ingressos.add(newIngresso);
            }
        }
    }
}