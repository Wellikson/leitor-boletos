
import com.mycompany.leitor.boletos.LeituraRetornoBancoBrasil;
import com.mycompany.leitor.boletos.LeituraRetornoBradesco;
import com.mycompany.leitor.boletos.ProcessarBoletos;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author wellikson
 */
public class Principal {

    public static void main(String[] args) {
        final ProcessarBoletos processador = new ProcessarBoletos(new LeituraRetornoBradesco());
//         final ProcessarBoletos processador = new ProcessarBoletos(new LeituraRetornoBancoBrasil());

        String arquivo = "bradesco-1.csv";
//        String arquivo = "banco-brasil-1.csv";

        Path path = Paths.get(arquivo);
        System.out.println("Lendo Boleto " + path.toAbsolutePath() + "\n");

        processador.processar(String.valueOf(path.toAbsolutePath()));
    }

}
