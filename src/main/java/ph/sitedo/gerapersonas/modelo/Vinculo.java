package ph.sitedo.gerapersonas.modelo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by ph on 4/14/15.
 */
public enum Vinculo {

  BB("Banco do Brasil"),
  BANCO_CENTRAL("Banco Central"),
  COOPERFORTE("COOPERFORTE"),
  ASSOCIADO_FAMILIA("Associado Família"),
  CAIXA("Caixa Econômica Federal"),
  BANCO_DA_AMAZONIA("Banco da Amazônia");

  private static final List<Vinculo> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
  private static final int           SIZE   = VALUES.size();
  private static final Random        RANDOM = new Random();

  private String vinculo;

  Vinculo(String vinculo) {

    this.vinculo = vinculo;
  }

  public static String vinculoRandomico() {

    return VALUES.get(RANDOM.nextInt(SIZE)).vinculo;
  }

  public String getVinculo() {

    return vinculo;
  }
}
