package ph.sitedo.gerapersonas.modelo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by ph on 4/14/15.
 */
public enum Nome {

  ASTOLFO("Astolfo"),
  BRUNO("Bruno"),
  CARLOS("Carlos"),
  DIEGO("Diego"),
  EVANDRO("Evandro"),
  FABRICIO("Fabrício");

  private static final List<Nome> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
  private static final int        SIZE   = VALUES.size();
  private static final Random     RANDOM = new Random();

  private String nome;

  Nome(String nome) {

    this.nome = nome;
  }

  public static String nomeRandomico() {

    return VALUES.get(RANDOM.nextInt(SIZE)).nome;
  }
}
