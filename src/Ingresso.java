import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class Ingresso implements IReceita {
    private Date data;
    protected double valor;
    protected char tipo;
    public SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy"); // Para converter String para Date

    public Ingresso(String data, double valor) {
        try{ // Converte String para Date
            this.data = formatoData.parse(data);
        }catch (Exception e){
            System.out.println("<< Date Error >>");
        }
        this.valor = valor;
        this.tipo = 'n';
    }

    public double getValor () {
        return this.valor;
    }

    public char getTipo() {
        return tipo;
    }

    @Override
    public double totalReceita() {
        return valor;       //receita de um ingresso é seu valor
    }

    @Override
    public String toString() {
        return "Ingresso [ Data: " + data + " || Valor: " + valor + " || Tipo: " + tipo + " ]";
    }

    @Override
    public void extratoReceita() {
        System.out.println(this.toString());
    }

}