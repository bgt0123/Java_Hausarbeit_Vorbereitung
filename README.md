# Java_Hausarbeit_Vorbereitung
Dies ist eine Vorbereitung für die Hausarbeit in PdSe bei Herr Zimmermann.
Zunächst werden dafür die Grundlagen der OOP wiederholt, um dann die behandelten Punkte abzuarbeiten.

# Objektorientierte Programmierung
1. Klassen -> Konstruktor, Getter & Setter, Innere Klassen
2. Vererbung -> Superklasse, Subklasse
3. Interfaces
4. Abstraktion -> Abstrakte Methoden, Abstrakte Klassen
5. Kohäsion & Kopplung
6. Refactoring
7. Subtyping 
8. Late Binding



# Praxis der Softwareentwicklung
1. Dependency Injection
2. Factoring
3. Delegation
4. Testing / Test First
5. File Handling (IO Streams)
6. Exceptions/ Exception Handling(Selfmade)
7. BuildTools
8. Lambdas 
9. Threads
10. Vergleich (Comarable, Comperator, ...)
11. Klassendesign - Mantras(DRY, DTSTTMPW), SOLID (Single Responsibility, Dependency Inversion), Metriken (LCOM, Abhängigkeitsgraph), Anti Pattern (Blutleere Klasse, Gottklasse)
12. CRC-Karten
13. UML Modellierung
14. Mocking
15. Mockito (https://danonrockstar.com/the-way-you-are-using-mocks-is-wrong-5de17cb0bbb4)
16. Maven
17. Packages


#IntelliJ Tipps & Tricks:
- Creating a Class Diagram = left click on Package & Press CTRL+ALT+Shift+U
- View Class Diagramm left = click on Package & Press CTRL+ALT+Shift+D

#Generelle Tipps & Tricks
- Dezimalzahlen wie Eurocents, sollten in Cents benutzt werden und nicht in Doubles gerechnet werden
- Bsp.: 200 €cents antatt 2,00 €
- Packetnamen sollten i.d.R. komplett klein geschrieben werden
- Klassengröße = Mehr als 50 Lines of Code ist eine große Klasse --> Mehrere Kleine Klassen sind besser als einzelne große, um die Lesbarkeit zu verbessern
- Methodengröße = Mehr als 10 Lines of Code sind lang --> Besser mehrere kleine
- In der Super und Subklasse sollten nicht 2-mal die gleiche Variable definiert werden --> dies kann später zu Problemen führen
- Interfaces sollten so schlank wie möglich definiert werden
- 

# Wichtige Definitionen aus der Vorlesung
- Exemplarvariablen --> Variablen die außerhalb der Methoden definiert sind und mit den Konstruktor initialisiert werden
--> Signatur= private TYP NAME --> Stellt eine Kapselung sicher bei der getter & setter verwendet werden sollen
- Exemplarvariablen bestehen für die Dauer des Objektes
- Strategie Klasse = Diese Klassen implementieren die Business Logik, worin es giöt Duplikationen zu vermeiden durch Interfaces und den entsprechenden Klassen
 Zudem weiß die Startegie Klasse nicht was in hinter dem Interface steht. --> Sollte aus Sicherheitsgründen und der Kapselung auch nicht so sein
- 

# Konzepte
- DTSTTMPW = "Do the simplest thing that might possibly work" ->
- DRY = "Don't repeat yourself" ->
- Erweiterbarkeit = Beeinflusst die Code basis nicht sonder erweitert die Funktionalität einer Klasse bspw. eines Objektes 
  (Code-Modifikationen != Erweiterungen) --> Prinzip "Never Change a running System" --> Diese Erweiterbarkeit wird i.d.R. durch Interfaces ermöglicht
    ! Zu viele Erweiterungspunkte sind nicht effektiv
- protected = Erlaub den Zugriff der Subklassen auf die Variablen (sollte aber vermieden werden da protected das Geheimnisprinzip verletzt)
- Abstraktion = Möglichkeit Bestandteile zu ignorieren, um den Fokus der Betrachtung auf eine höhere Ebene lenken zu können.
- Modularisierung = Zerlegung eines Ganzen in wohldefinierte Tiele, die getrennt erstellt und untersucht werden können
und die in wohldefinierter Weise interagieren
- Wiederverwendbarkeit = DRY Prinzip verfolgen, um die Wartbarkeit zu vermindern --> Daher das Prinzip der Vererbung und Interfaces
- Polymorphie = Variablen sind Polymorph da ein Objekt einer Implementierten Klasse auf ein Interfacetyp zugewiesen werden kann (bspw. IPost p = new MessagePost();)
- Subtyping
- Kapselung
- Geheimnisprinzip = private Exemplarvariablen können nicht in der Unterklasse benutzt werden
- 