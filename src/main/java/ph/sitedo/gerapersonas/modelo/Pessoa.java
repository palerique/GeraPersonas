package ph.sitedo.gerapersonas.modelo;

/**
 * Created by ph on 4/14/15.
 */
public class Pessoa {

  Long id;
  private String nomeCompleto;
  Cidade cidade;
  String vinculo;

  public void setNomeCompleto(String nomeCompleto) {

    this.nomeCompleto = nomeCompleto;
  }

  public String getNomeCompleto() {

    return nomeCompleto;
  }

  public void setCidade(Cidade cidade) {

    this.cidade = cidade;
  }

  public Cidade getCidade() {

    return cidade;
  }

  public void setVinculo(String vinculo) {

    this.vinculo = vinculo;
  }

  public void setId(Long id) {

    this.id = id;
  }

  public Long getId() {

    return id;
  }

  public String getVinculo() {

    return vinculo;
  }
}
