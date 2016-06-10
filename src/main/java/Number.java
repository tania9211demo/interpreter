import java.util.Map;

/**
 * Created by tatiana.biliaieva on 6/10/2016.
 */
class Number implements Expression {
  private int number;

  public Number(int number) {
    this.number = number;
  }

  public int interpret(Map<String, Expression> variables) {
    return number;
  }
}
