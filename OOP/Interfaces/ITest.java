package OOP.Interfaces;

/**
 * In die Interfaces werden diejenigen Methoden eingefügt, die in den Strategieklassen werden--> Diese können dann in den darunter
 * liegenden Klassen erweitert und implementiert werden
 * Aus Interfaces bzw. Schnittstellen können keine Objekte erzeugt werden, jedoch können sie als übergeordneter Typ bei bspw.
 * Collections verwendet werden
 *
 * Variablen müssen zudem im Interface initiiert werden.
 *
 */
public interface ITest {
    void methode1();
    int uebergeordneteVar = 0;
}
