package projeto;

import java.text.DecimalFormat;

public class Formulario implements Comparable<Formulario> {

    
    private String nome;
    private String descricao;
    private Double valor;
    private boolean disponivelParaVenda;
    private static DecimalFormat deci = new DecimalFormat("0.00");

    
    public Formulario(String nome, String descricao, Double valor, boolean disponivelParaVenda) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.disponivelParaVenda = disponivelParaVenda;
    }

    public Formulario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean isDisponivelParaVenda() {
        return disponivelParaVenda;
    }

    public void setDisponivelParaVenda(boolean disponivelParaVenda) {
        this.disponivelParaVenda = disponivelParaVenda;
    }

    
    
    @Override
    public int compareTo(Formulario o) {

        return this.valor.compareTo(o.getValor());

    }

    
   
    @Override
    public String toString() {
        return "\nNome Do Produto: " + nome
                + "\nValor: " + deci.format(valor);
    }
    
    
    /*
    @Override
    public String toString() {
        return "\nNome: " + nome
                + "\nDescricao: " + descricao
                + "\nValor: " + valor
                + "\nDisponivel Para Venda: " + ((disponivelParaVenda == true) ? "Disponivel" : "Nao Disponivel") + "\n";
    }
    */

    
    
}
