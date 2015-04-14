package ph.sitedo.gerapersonas;

import ph.sitedo.gerapersonas.modelo.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ph on 4/14/15.
 */
public class Gera {

  private static final Set<Pessoa> pessoas = new HashSet<Pessoa>();

  public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

    long i = 1;

    while (pessoas.size() < 2000) {
      pessoas.add(gerarPessoas(i));
      System.out.println("pessoas.size() " + pessoas.size() + " i: " + i);
      i++;
    }

    PrintWriter writer = new PrintWriter("json.txt", "UTF-8");

    writer.println(escreverInicioDoArrayJSON());
    System.out.println(escreverInicioDoArrayJSON());
    for (Pessoa p : pessoas) {
      System.out.println(escreverPessoaJSON(p) + ",");
      writer.println(escreverPessoaJSON(p) + ",");
    }
    writer.println(escreverFinalDoArrayJSON());
    System.out.println(escreverFinalDoArrayJSON());
    writer.close();
  }

  private static String escreverPessoaJSON(Pessoa p) {

    return "{\"inscricao\": " + p.getId() + ", " + "\"nome\": \"" + p.getNomeCompleto() + "\", " + "\"vinculo\": \"" + p.getVinculo() + "\", " + "\"cidade\": \""
      + p.getCidade().getNome() + "\", \"uf\": \"" + p.getCidade().getSiglaDoEstado() + "\"}";
  }

  private static String escreverFinalDoArrayJSON() {

    return "]";
  }

  private static String escreverInicioDoArrayJSON() {

    return "[";
  }

  private static Pessoa gerarPessoas(long i) {

    Pessoa pessoa = new PessoaBuilder().comId(i)
                                       .comNomeCompleto(Nome.nomeRandomico() + " " + Sobrenome.sobrenomeRandomico())
                                       .naCidade(Cidade.cidadeRandomica())
                                       .comVinculo(Vinculo.vinculoRandomico())
                                       .gera();

    return pessoa;
  }
}
