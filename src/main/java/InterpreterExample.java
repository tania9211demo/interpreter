import java.util.HashMap;
import java.util.Map;

/**
 * Created by tatiana.biliaieva on 6/10/2016.
 */
public class InterpreterExample {
  public static void main(String[] args) {
    String expression = "w x z - +";
    Evaluator sentence = new Evaluator(expression);
    Map<String, Expression> variables = new HashMap<>();
    variables.put("w", new Number(5));
    variables.put("x", new Number(10));
    variables.put("z", new Number(42));
    int result = sentence.interpret(variables);
    System.out.println(result);
  }
}
