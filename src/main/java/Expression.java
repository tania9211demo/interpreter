import java.util.Map;

/**
 * Created by tatiana.biliaieva on 6/10/2016.
 */
public interface Expression {
  public int interpret(Map<String, Expression> variables);
}
