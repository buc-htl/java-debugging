import java.util.ArrayList;
import java.util.List;

public class StacktraceExample {

    public static void main(String[] args) {

        //Diese Zeile löst eine Exception aus. Wenn wir sie nicht abfangen, bzw. abfangen und die Exception ausgeben, wird der sogenannte Stacktrace angezeigt.
        //Am Stacktrace sieht man welche Methoden (in welchen Zeilen) aufgerufen wurden und welche Zeile schlussendlich zum Fehler geführt hat.
        new StacktraceExample().doSomething();
    }

    private void doSomething(){

        doSomethingElse(new ArrayList<>());
    }

    private void doSomethingElse(List<String> namen){
            namen.add(44,"dfd");
    }
}
