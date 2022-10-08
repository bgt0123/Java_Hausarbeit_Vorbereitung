package PdSe.Exceptions;

/**
 * Exceptions sind zwar nicht notwendig, da der Compiler diese sowieso übernimmt. Jedoch können sie dabei helfen um weitere
 * Informationen über Fehler zu bekomme(daher sind Exceptions auch nicht direkt für den User ausgerichtet).
 *
 * "throws" = Werfen einer Exception --> gegenteil zu catch
 * "catch" = Fängt das Programm auf wenn ein Fehler auftritt --> Ordnungsgemäße Fehlerbehandlung
 * StackTrace = Sagt aus wo die Exception aufgetreten ist --> Hilft bei der Fehleranalyse
 * Throwable = Basisklasse für Objekte, die Ausnahmesituationen signalisieren (Vorraussetzung für throw-catch Mechanismus)
 *
 * NullPointerException = Wird geworfen, wenn Null an einer Stelle steht, wo ein Objekt benötigt wird (kann sich hier auch einfach um ein Objekt handelt dem null zugewiesen wurde)
 * IllegalArgumentException = Parameter hat inkonsistenten Zustand
 * NumberFormatException = Falsch Formierter String soll geparsed werden
 * ArrayIndexOutOfBoundsException = Es wird versucht auf ein Index eines Arrays zuzugreifen, der nicht Teil ist
 *
 * unchecked Exceptions = Exceptions die nicht währen der compile time entstehen --> diese müssen von den Programmieren mit trow new ... abgefangen werden
 * checked Exceptions = Exceptions die während der compile-time aufgerufen werden --> diese müssen von den Programmieren mit try/catch blöcken abgefangen werden
 *
 * Annotationen die für das sorgfälltige Programmieren unterstützen:@Nullable, @NonNull
 *
 * RuntimeException = Zum Zeitpunkt der Kompilierung entsteht eine nicht überwachte Ausnahmesituation
 * https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html
 */
public class ThrowingException {

    public String getFirst(String[] s) throws LeeresArray {
        if (s==null){
            throw new LeeresArray("null!");
        }
        else if (s.length == 0){
            throw new LeeresArray("Leer!");
        }
        else {
            return s[0];
        }
    }

}
