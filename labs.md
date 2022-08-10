# Konzultáción elhangzó gyakorlati feladatok

Tesztesetek írása akkor is javasolt, ha ez nem szerepel a feladatleírásban.

# Week01 (2022.07.25-2022.07.29)

## Day03

Hozz létre a `java-sv3-labs-XY` repository-d projektjében egy új csomagot, `consultations` néven!
Ebben hozz létre egy `w01d03` nevű alcsomagot! Ebben hozz létre egy `Person` nevű Java osztályt!
Ebben az osztályban hozz létre egy `main()` metódust, amelyet el tudsz majd indítani!
Ez a metódus az elindítása után írja ki a konzolra egy ember személyes adadtait, a következő
módon:

Név: Teszt Elek
Születési hely, idő: Budapest, 1983.05.27.
Anyja neve: Minta Gizella

(Tehát fontos, hogy külön sorokba kerüljenek az egyes adatok.)

Az elkészült feladatot commitold is, és a commit üzenete úgy kezdődjön, hogy: `ex-w01d03` !

## Day05

Készíts egy `w01d05.Rectangle` (téglalap) nevű osztályt, amelynek két 
attribútuma a téglalap két oldalának hossza! Készíts egy konstruktort, 
ami beállítja az attribútumok kezdeti értékét! Készíts egy `calculateArea()` 
nevű metódust, ami visszaadja a téglalap területét! 
Készíts egy `w01d05.Geometry` nevű osztályt melyben van egy `main()` metódus, 
itt teszteled az elkészített téglalapokat reprezentáló osztályt!
Commitold és töltsd fel a megoldásodat a megfelelő módon 
(ex-w01d05 kezdetű üzenettel)!


# Week02 (2022.08.01-2022.08.05)

## Day01
Készíts egy `w02d01.Car` osztályt, mely attribútumként tárolja, hogy hány litert a tankoltunk bele, és hány kilométert ment el ekkora mennyiségű üzemanyaggal. Mindkét attribútumhoz legyen setter metódus! Legyen egy metódus ami kiszámolja az autó átlag fogyasztását, azaz azt hogy 100km távolságon mennyit fogyasztott átlagosan. Legyen egy `w02d01.GasStation` osztály is melynek legyen egy ár attribútuma, amit konstruktoron keresztül állítunk be. Legyen egy metódusa, a tankolás, ami egy kocsit és egy liter mennyiséget vár paraméterül. Ez a metódus állítsa be a kocsi üzemanyag mennyiségét és adja vissza, hogy mennyit kellett ezért fizetni. Teszteled az osztályokat main metódusban! Commitold és töltsd fel a megoldásodat a megfelelő módon 
(ex-w02d01 kezdetű üzenettel)!

## Day03
Készíts egy `w02d03.Mathematics` osztályt, melyben van egy `boolean isPrime(int number)` metódus ami igaz értéket ad vissza, ha a paraméterül kapott szám prím, különben hamisat.Commitold és töltsd fel a megoldásodat a megfelelő módon 
(ex-w02d03 kezdetű üzenettel)!

## Day05 (kötelező)
Írj egy számkitaláló programot a `w02d05.GuessTheNumber` osztályba! A program kitalál egy véletlenszerű számot 1 és 100 között. Majd bekér a felhasználótól ciklusban számokat. Mindig megmondja, hogy a szám kisebb, nagyobb vagy egyenlő-e mint a gondolt szám. Legfeljebb 6-szor lehessen kérdezni, és a felhasználó kapjon visszajelzést arról is, ha kitalálta és arról is, ha nem!(commit: ex-w02d05)

## Day05 (szorgalmi-hétfőre)
A történet: A török szultán úgy dönt 100 nappal a születésnapja előtt, hogy kienged néhány rabot a 100 cellás börtönéből. A börtönben a zárak kétállásúak, tehát vagy nyitva van vagy zárva. (Nem lehet duplára zárni). Azt parancsolja az őrnek hogy a 100. szülinapjáig minden nap menjen végig a börtönben. Az első napon minden záron fordítson egyet, így minden ajtó nyitva lesz. A második napon, minden második záron fordítson egyet, így minden második ajtó bezáródik. A harmadik napon, minden harmadik záron fordítson egyet. Így ha megnézzük a 3. ajtó zárva lesz, de a 6. nyitva. És ezt a folyamatot folytatja tovább, egészen a 100. napig. Az őr ezt a procedúrát nem akarja minden nap végrehajtani, ezért segítsünk neki és mondjuk meg, hogy a 100. napon mely ajtók lesznek nyitva, azaz végül melyik cellákból szabadulhatnak a rabok.

A feladat megoldásához készíts egy `Prison` nevű osztályt amiben attribútumként tárolod a cellákat valamilyen adatszerkezetben. Az osztályban legyen egy metódus, `void openFreeCells()` melyben megvalósítod, a fenti feladathoz szükséges algoritmust, és a cella attribútumban a megfeleő cellák "nyitva" lesznek. Végül legyen egy `Sultan` nevű osztályod amiben van egy `main()` metódus, amiben példányosítasz egy börtönt, lefuttatod az algoritmust végül kiírod a képernyőre a szabad cellák sorszámát.

# Week03 (2022.08.08-2022.08.12)

## Day02
Készíts egy `w03d02.Actor` nevű osztályt, melynek attribútumai a színész neve, születési éve. Ezeket konstruktorban állítsd be és készíts hozzájuk gettereket.

Legyen még egy `w03d02.Movie` osztály is. Ennek 3 attribútuma, a film címe, megjelenés éve és a színészek listája. Első kettőt konstruktorban állítsuk be. Legyen benne egy `addActor(Actor actor)` metódus, amivel egy színészt tudunk hozzáadni a listához. Legyen egy `int actorsInTheirTwenties()` nevű metódus, amivel megszámolod, hogy hány színész járt a 20-as éveiben a film készítésekor. 
(Mivel mindkét osztályban csak év van, így a feladatot úgy kell értelmezni, hogy hányadik életévében jár)

Teszteld a megoldásod main() metódusban.(commit: ex-w03d02)

## Day03

Készíts egy `w03d03.Movie` nevű osztályt, melyben szerepel a film címe, illetve időpontok listája amikor játszák a moziban (`LocalDateTime`). Mind a két attribútumot konstruktorban állítsuk be! 

Készítsd el a `w03d03.Cinema` nevű osztályt, melyben filmek listája szerepel. Legyen egy `addMovie(Movie movie)` metódus, amivel filmet lehet hozzáadni a listához. 

Készíts egy `findMovieByTime(LocalDateTime time)` nevű metódust, ami listában visszaadja azon filmek címét, amiket a paraméterül kapott időpontban játszanak. (commit: ex-w03d02)
A feladathoz tartozó main metódus: 

```java
  public static void main(String[] args) {
        Cinema cinema = new Cinema();

        cinema.addMovie(new Movie("Titanic", Arrays.asList(
                LocalDateTime.of(2022,8,10,12,45),
                LocalDateTime.of(2022,8,10,22,25)
                )));
        cinema.addMovie(new Movie("Jurassic Park", Arrays.asList(
                LocalDateTime.of(2022,8,10,19,45),
                LocalDateTime.of(2022,8,10,20,25),
                LocalDateTime.of(2022,8,10,22,25)
        )));

        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2022,8,10,10,45))); // []
        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2022,8,10,19,45))); // [Jurassic Park]
        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2022,8,10,22,25))); // [Titanic, Jurassic Park]

    }
```
Bónusz (nem kötelező) feladat úgy átírni a programot, hogy azokat a filmeket adja vissza, amiket a kapott időponthoz képest fél órán belül játszanak. 

