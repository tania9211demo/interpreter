import java.util.Map;

/**
 * Created by tatiana.biliaieva on 6/10/2016.
 */
class Variable implements Expression {
  private String name;

  public Variable(String name) {
    this.name = name;
  }

  public int interpret(Map<String, Expression> variables) {
    if (null == variables.get(name)) return 0; //Either return new Number(0).
    return variables.get(name).interpret(variables);
  }
}