package ph.sitedo.gerapersonas.modelo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by ph on 4/14/15.
 */
public enum Sobrenome {

  ARAUJO("Araújo"),
  BRUMADO("Brumado"),
  CARVALHO("Carvalho"),
  DRUMOND("Drumond"),
  ESPINDOLA("Espíndola"),
  FAGUNDES("Fagundes");

  private static final List<Sobrenome> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
  private static final int             SIZE   = VALUES.size();
  private static final Random          RANDOM = new Random();

  private String sobrenome;

  Sobrenome(String sobrenome) {

    this.sobrenome = sobrenome;
  }

  public static String sobrenomeRandomico() {

    return VALUES.get(RANDOM.nextInt(SIZE)).sobrenome;
  }
}
