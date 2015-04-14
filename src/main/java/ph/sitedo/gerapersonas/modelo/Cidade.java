package ph.sitedo.gerapersonas.modelo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by ph on 4/14/15.
 */
public enum Cidade {

  BRASILIA("Brasília", "DF", "Distrito Federal"),
  SAO_PAULO("São Paulo", "SP", "São Paulo"),
  BELO_HORIZONTE("Belo Horizonte", "MG", "Minas Gerais"),
  FORTALEZA("Fortaleza", "CE", "Fortaleza"),
  RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro");

  private static final List<Cidade> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
  private static final int          SIZE   = VALUES.size();
  private static final Random       RANDOM = new Random();

  private String nome;
  private String siglaDoEstado;
  private String nomeDoEstado;

  Cidade(String nome, String siglaDoEstado, String nomeDoEstado) {

    this.nome = nome;
    this.siglaDoEstado = siglaDoEstado;
    this.nomeDoEstado = nomeDoEstado;
  }

  public static Cidade cidadeRandomica() {

    return VALUES.get(RANDOM.nextInt(SIZE));
  }

  public String getNome() {

    return nome;
  }

  public String getSiglaDoEstado() {

    return siglaDoEstado;
  }
}
