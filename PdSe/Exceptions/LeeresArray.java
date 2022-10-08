package PdSe.Exceptions;

/**
 * Dies ist eine eigenentwickelte Exception
 *
 * Zwar würde diese eigenentwickelte Klasse im Praxisfall nicht viel Sinn machen, da es bereits eine Exception gibt, die leere
 * Arrays abfängt.
 * Der Vorteil von eigenentwickelten Exceptions ist, dass bspw. die Message vorher noch verarbeitet/ abgeändert werden kann
 * bevor sie an die Exception und dann an die Throwable Klassen übergeben wird.
 *
 */
public class LeeresArray extends Exception{
    public LeeresArray(String message){
        super(message);
    }
    public LeeresArray(){
        super();
    }
}
