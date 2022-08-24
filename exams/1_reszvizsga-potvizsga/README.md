# Vizsgafeladat

A feladatok megoldásához az IDEA fejlesztõeszközt használd! Bármely régebbi osztályt megnyithatsz.

Az exams repository-ba dolgozz. Ezen könyvtár tartalmát nyugodtan át lehet másolni (`pom.xml`, tesztesetek). Ha másik Java verziót használsz,
akkor ne felejtsd el a megfelelõ paramétereket átírni a `pom.xml`-ben.
Az exams repository-n belül a projekt neve legyen: `sv3-2022-jvjbf-elso-reszvizsga-potvizsga`. 
GroupId: `training360`, artifactId: `sv3-2022-jvjbf-elso-reszvizsga-potvizsga`.

Ha ezzel kész vagy, azonnal commitolj, a commit szövege legyen: "init".

Az egyes feladatokat külön csomagba szervezd! A csomagneveket a feladat leírásában találod. Minden egyes feladathoz tartozik
egy-egy elõre elkészített `XxxTest` osztály, mindegyikben több `test()` metódussal. Ezekkel a megoldásod helyességét
ellenõrizheted. Ha a tesztek nem futnak, akkor ne a
`test()` metóduson változtass, hanem a saját megoldásodat nézd át újra!

A feladatra 90 perced van összesen!

Ha letelik az idõ, mindenképp commitolj, akkor is, ha nem vagy kész! A commit idõpontja alapján fogjuk ellenõrizni a megoldásod.
Ha nincs commitod az idõ lejárta elõtt, akkor sajnos nem tudjuk értékelni a megoldásod! Fontos, hogy csak olyan kódot tölts fel, amit egybõl tudunk futtatni!
Ha a kódod egyes részei nem fordulnak le, akkor inkább tedd õket kommentbe.

## Számok (10 pont)

Az `numbers.Numbers` osztályban írj egy `int sumOfPositiveEvenNumbers(List<Integer> numbers)` metódust, 
amely visszaadja a listában lévõ pozitív páros számok összegét. 

## Focicsapat

### 1. rész (20 pont)

Készíts egy `teams.Player` nevû osztályt, melynek attribútumai a játékos neve, születési ideje, a mez száma, és a pozíciója,
ami a következõ értékeket veheti fel: `GOALKEEPER, DEFENDER, MIDFIELDER, STRIKER`. Minden attribútumot konstruktorban
állíts be!

Készíts egy `teams.Team` nevû osztályt, melyben a csapat neve és a játékosok listája található. A csapat nevét konstruktorban állítsuk be. 
Legyen benne egy `boolean addPlayer(Player)` metódus,
ami hozzáad egy játékost a listához. Ami fontos, hogy a listában legfeljebb 18 játékos lehessen. (Azért ennyi, hogy legyenek cserék is.)

Készíts egy `teams.League` nevû osztályt, melyben csapatok listája található, és ezt a listát konstruktorban kapja meg. 


### 2. rész (20 pont)

Bõvítsd a `Team` osztályt egy `int countBirthBefore(LocalDate date)` metódussal, ami megszámolja, hogy hány játékos született a 
paraméterül átadott dátum elõtt.

Bõvítsd a `Team` osztályt egy `boolean isPlayerWithNameInTeam(String name)` metódussal, ami igazzal tér vissza, ha a csapatban 
szerepel a paraméterül kapott nevû játékos. 

Bõvítsd a `League` osztályt egy `Team findTeamWithPlayer(String name)` nevû metódussal, ami visszaadja a csapatot, amiben a 
paraméterül kapott nevû játékos szerepel. Ha egyik csapatban sem szerepel, akkor térj vissza `null` referenciával. 
(Feltételezhetjük, hogy nincs két ugyanolyan nevû játékos.)







