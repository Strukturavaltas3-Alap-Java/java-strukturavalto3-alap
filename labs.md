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

Készíts egy `findMovieByTime(LocalDateTime time)` nevű metódust, ami listában visszaadja azon filmek címét, amiket a paraméterül kapott időpontban játszanak. (commit: ex-w03d03)
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

## Day04
Adott egy részvény, aminek ismerjük a múltbéli napi árfolyamait. A kérdés az, hogyha ezeket az árfolyamokat előre tudtuk volna, akkor mekkora lett volna a legnagyobb profit amit elérhettünk volna? (commit:ex-w03d04) A feladathoz tartozó main metódus:
```java
public static void main(String[] args) {
        Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4));
        System.out.println(stock.maxProfit());  //8.17

        Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0));
        System.out.println(stock2.maxProfit()); //6.0
    }
```

## Day05
Készítsd el a `Passenger` osztályt, ami egy utast reprezentál. Minden utasnak legyen egy neve egy jegy azonosítója (pl.: FK452-1234) és egy csomag mennyisége.

Egy másik osztály legyen a `Plane`. Minden repülőnek van egy max kapacitás attribútuma és egy utaslistája. Legyen egy `boolean addPassenger(Passenger passanger)` metódus, ami hozzáad egy emebert a listához, ha van még hely, ha nincs akkor hamis értékkel tér vissza.

Legyen egy metódus a `int numberOfPackages()` ami visszaadja, hogy összesen hány bőrönd került fel a gépre.(commit: ex-w03d05)

# Week04 (2022.08.15-2022.08.19)

## Day01
Tökéletes számnak nevezzük azokat a természetes számokat, amelyek megegyeznek az önmaguknál kisebb osztóik összegével. (Forrás: Wikipédia)
Készits egy `numbers.PerfectNumbers` osztályt, amiben van egy `boolean isPerfectNumber(int number)` metódus, ami eldönti egy számról, hogy tökéletes szám-e.

Például: A 6 tökéletes szám mert a nála kisebb osztóinak összege 1+2+3=6

Írj teszteseteket a feladathoz!(commit: ex-w04d01)

## Day02
Készíts egy `NameValidator` nevű osztályt, benne egy `boolean isValidName(String name)` nevű metódussal, ami eldönti egy String-ről, hogy név-e. Akkor tekintjük névnek, ha legalább 2 szóból áll és mindegyik rész nagy betűvel kezdődik. (commit: ex-w04d02)

## Day03
Készítsd el a `Hangamn` (aksztófa) alkalmazást a konzultáción elhangzott specifikáció alapján!(commit: ex-w04d03)


## Day04
Készíts egy `Numbers` nevű osztályt, amiben van egy `int sumOfDigits(int number)` nevű metódus, ami visszaadja a paraméterül kapott szám számjegyeinek összegét.(commit: ex-w04d04) 


# Week06 (2022.08.29-2022.09.03)

## Day02
Készíts egy `User` nevű osztályt. Minden felhasználónak legyen egy felhasználóneve és egy e-mail címe.

Készíts egy `UserRepository` nevű osztályt, melyben legyen egy lista felhasználókkal. Legyen egy metódus ami felhasználónév alapján visszaad egy `User`-t. Ha a felhasználó nem található dobj `IllegalArgumentException`-t. (commit: ex-w06d02) 

## Day03
Adott egy fájl, melyben egy elsős diák tanévkezdésre beszerzendő tanszereinek
leírása található. A fájl tartalma:

```java
3;négyzetrácsos füzet;kis alakú
2;vonalas füzet;elsős(14-32), kis alakú
1;radír;jó minőségű
1;hegyező;tartályos
50;rajzlap;félfamentes
10;rajzlap;műszaki
2;mappa;A4-es méretű, gumis
```

Hozd létre az adatokból a `schoolequipment.csv` állományt az `src/main/resources`
könyvtárban! Hozz létre egy `SchoolEquipment` osztályt, ami a fájl egy sorát
reprezentálja! Majd készítsd el a `FirstA` osztályt, ami tárol egy listát az
első osztályban szükséges tanszerekről, és konstruktorban beolvassa a paraméterül
(`Path`) átadott fájl tartalmát! Készíts unit teszteket is! (commit: ex-w06d03)

### Day04 (Csoportmunka)
A feladatban egy biciklis futár egy heti munkáját rögzítjük és készítünk statissztikákat. <br>

A futár minden fuvar után feljegyzi, hogy a hét hányadik napján történt a fuvar. Ezután azt, hogy az adott nap hányadik fuvarját teljesítette és ezután azt, hogy hány kilométer volt az adott fuvar. A futár egy-egy fuvarját reprezentálja a `Ride` nevű osztály, adatagokkal, konstruktorra, getterekkel.<br>

Készítsd el a `Courier` osztályt, ez fogja a futárt reprezentálni. Legyen egy `rides` listája, ami fuvarokat tárol. Legyen egy `addRide(Ride ride)` metódus, ami csak sorrendben enged hozzáadni elemeket a listához. 
Figyeljünk viszont arra, hogy nem feltétlenül minden nap dolgozott a futár, de ha már bekerült egy 3. napi fuvar, akkor ne kerülhessen be egy 2. napi. És arra is figyelj, hogy a napon belül is sorrendben kerüljenek be az adatok. 
Ha a paraméterül kapott `Ride` nem felel meg a feltételeknek dobjunk `IllegalArgumentException`-t.<br>

Legyen egy `CourierFileManager`, amiben van egy `createCourierByFile(Path path)` nevű metódus, ami egy paraméterül kapott
file alapján elkészít egy futár objektumot és visszaadja azt! <br>

Egy minta file:
```
1 1 12
1 2 11
2 1 10
4 1 19
4 2 5
4 3 9
```
Itt látható, hogy a futár nem dolgozott a 3. 5. 6. és 7. napon. (commit: ex-w06d04)


# Week07 (2022.09.05-2022.09.10)

## Day01
Adott egy file, amiben napi teendők találhatók. Először egy dátum, majd pontosvesszővel a teendők. Készíts Egy `ToDo` nevű osztályt, aminek attribútuma egy dátum és teendők String listája. 
Készíts egy `ToDoList` nevű osztályt, amiben ToDo-k listája található. Legyen benne egy `void createToDoListFormFile(Path path)` ami beolvassa a fájlt és feltötlti a listát a megfelelő elemekkel. (ex-w07d01)<br>
Egy minta file:
```
2022-09-05;learning,cleaning
2022-09-06;cooking
2022-09-07;dentist,cleaning,sweaping
2022-09-08;learning
```

## Day03
Készíts egy `day03.NumberSequence` osztályt, aminek van egy egész számokból 
álló listája. Legyen benne két `void updateList()` metódus. Az egyik egy listát 
kap paraméterül és annak összes elemét belepakolja az attribútumba, a másik három 
számot kap, melyből az első hogy hány véletlen számot generáljon a másik kettő pedig 
a minimum és maximum érték ami között generáljon (zárt intervallum) és az így generált 
számokat rakja bele az attribútumba. Legyen egy metódus `closeToAverage(int value)`, 
ami kigyűjti és visszaadja azokat a számokat egy listában, amik az átlagtól legfeljebb 
a paraméterül átadott értékben térnek el!(commit: ex-w07d03)
 
## Day05
Készíts egy `Recipe` osztályt, melynek van egy neve, egy hozzávalók listája
és egy leírása (minden String típusú). Receptet létre lehet hozni csak a neve
alapján, vagy név és leírás alapján.
Legyen egy `addIngredient()` metódus, amivel LEGALÁBB egy hozzávalót hozzá lehet
adni a listához. (Egyet kötelező!)
Írj teszteseteket is!
(commit: ex-w07d05)

# Week08 (2022.09.12-2022.09.16)

## Day03
Az alábbi feladatban egy koncertre való beléptetést fogunk megvalósítani. Készíts egy  `day03.Ticket` osztályt. Minden jegyen rajta van, a zenekar neve, a pontos dátum és időpont, és az ár.
Ezeket konstruktorban állítsuk be. Legyen továbbá egy `entryTime()` metódus, ami megmondja, hogy mikor léphetünk be a rendezvényre (csak az időpontot, dátumot már nem). Ez itt legyen egy órával a kezdés előtt. <br>

Legyen egy `day03.FrontOfStageTicket` osztályunk, ami a legjobb helyekre szól és a `Ticket` leszármazottja. Ennek ára 30%-al több mint a sima jegynek. Ennek az osztálynak további attribútuma egy extra kód, amivel később olcsóbban tudunk vásárolni. Ezeket mind konstruktorban állítsuk be. Ilyen típusú jeggyel a koncertkezdés előtt 2 órával tudunk bemenni.<br>

Legyen egy `Person` osztályunk, akinek csupán egy jegy attribútuma van és ezt konstruktorban állítjuk be.<br>

Illetve legyen még egy `Concert` osztály, ami már a rendezvényt reprezentálja és van egy emberek listája. Legyen egy `addPerson()` nevű metódusa, ami egy embert és egy pontos időpontot vár paraméterül és ellenőrzi, hogy az ember be mehet-e a koncertre a kapott időpontban. Ha igen hozzáadjuk a listához, ha nem `IllegalArgumentException`-t dobunk. 
