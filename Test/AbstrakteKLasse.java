

/**
 * Abstrakte Klasse = Eine abstrakte Klasse ist eine Klasse, von der keine Instanzen erzeugt werden sollen. Sie dient ausschließlich als
 * Superklasse fur andere Klassen. Abstrakte Klassen durfen abstrakte Methoden anbieten (Dürfen nicht-abstratkte Klassen
 *
 * Abstrakte Methoden dürfen dabei keine Implementierung enthalten
 * Wenn eine Klasse nicht implementierte Methoden besitzt, kann sie nicht instanziiert werden und wird als abstrakte Klasse bezeichnet,
 * da sie keine konkrete Form annehmen kann.
 *
 * Abstrakte Klasse vs. Interface (wann was benutzen)=
 */
public abstract class AbstrakteKLasse {
    int i = 1;
    public void implementedMethod (){
        System.out.println("Dies ist eine implementierte Methode einer abstrakten Klasse.");
    }

    public abstract void nonimplementedMethod();
}
