package ph.sitedo.gerapersonas.modelo;

/**
 * Created by ph on 4/14/15.
 */
public class PessoaBuilder {

  private String nomeCompleto;
  private Cidade cidade;
  private String vinculo;
  private Long   id;

  public PessoaBuilder comNomeCompleto(String nomeCompleto) {

    this.nomeCompleto = nomeCompleto;

    return this;
  }

  public PessoaBuilder naCidade(Cidade cidade) {

    this.cidade = cidade;

    return this;
  }

  public PessoaBuilder comVinculo(String vinculo) {

    this.vinculo = vinculo;

    return this;
  }

  public Pessoa gera() {

    Pessoa pessoa = new Pessoa();

    pessoa.setNomeCompleto(nomeCompleto);
    pessoa.setCidade(cidade);
    pessoa.setVinculo(vinculo);
    pessoa.setId(id);

    return pessoa;
  }

  public PessoaBuilder comId(Long id) {

    this.id = id;

    return this;
  }
}
