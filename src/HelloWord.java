import br.com.kaikeCarmona.models.CalcularValores;

public class HelloWord {


    public static void main(String[] args){
        
        CalcularValores calculo = new CalcularValores();

        int res = calculo.calculaValores(10, 5);   
        System.err.println(res);
    }
}
