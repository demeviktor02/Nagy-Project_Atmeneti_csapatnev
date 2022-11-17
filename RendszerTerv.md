## Cél:
#### A rendszer legfőbb célja, hogy a felhasználók, cégek és magánszemélyek egyaránt könnyeben tudják rendezni a mindennapi tevékenységeiket, egyszerűbben tudják beosztani idejüket. Ezt egy naptár alapú nyilvántartó, eseménykezelő rendszer segítségével érjük el. A naptár rendszer segítségével a felhasználók be tudják táplálni a rendszerbe a mindennapi általános és váratlan egyszeri programokat az életükből és ezzel át tuják látni, könnyebben tudják kezelni mindennapjaikat. A program segítségével lehetőség van a különböző időpontok és programok módosítására, hozzáadására és törlésére így a felhasználók megtervezhetik a számukra legideálisabb beosztását a mindennapoknak. A magánembereknek ez ideális lehet az időbeosztásuk megszervezésében. Illetve cégeknek, vállalkozóknak is ideális tevékenségük megszervezésében.

## 1. Bevezetés
#### A mai rohanó világunkban az embereknek rengeteg dolorgra kell egyszerre odafigyelniük. A legkülönbözőbb programok megfelelő beosztása sokaknak gondot jelent. Ezzel napjukra rányomja a bélyegét a folyamatos ide-oda kapkodás és a fejetlen rohanás az egyik eseményből a másikba. Ennek a problémának a megoldására álltunk elő egy eseménykezelő, nyilvántartó alkalmazás készítésével, amellyel az időnk beosztása egy új szintre léphet. Ehhez nem kell mást tenni mint az alkalmazás letöltése után betáplálni a rendszerbe különböző programjainkat és ezzel egy sokkal átláthatóbb rendszert kapunk amin kedvünk és lehetőségeink szerint módosíthatunk.

## 2. Projekt terv
#### A rendszer létrehozásához rendelkezésre álló erőforrások: A felhasználó által használt notebookok/asztali számítógépek melyeknek rendelkezniük kell egy futó opercációs rendszerrel(Windows 7, Windows 10, Linux)
- Scrum Masters: Czafik Milán
- Product Owner: Czafik Milán , Bálint Ádám , Deme Viktor , Török Marcell , Katona Bálint
- Contributer: Bálint Ádám
- Contributer: Deme Viktor
- Contributer: Török Marcell
- Contributer: Katona Bálint
- Megrendelő: Bagoly Gábor

## 3. Résztvevők és főbb szereplők:
- Bálint Ádám: Fő oldal, a program fejlesztése és dizájn,tesztelés.
- Deme Viktor: A program fejlesztése és dizájn, tesztelés.
- Török Marcell: A program fejlesztése és dizájn, tesztelés.
- Katona Bálint: A program fejlesztése és dizájn, tesztelés.
- Czafik Milán: A fejlesztés felülvizsgálása.

## 4. Mérföldkövek:
1.    Feladatok kiosztása megegyezés és tudás szerint.
2.   Dokumentációk, leírások képernyő tervek véglegesítése.
3.  Git repo folyamatos frissítése amikor akármi elkészül.
4.   Folyamatos kapcsolattartás a projektben résztvevőkkel.
5.    Tesztelési folyamatok befejezése.
6.   Felkészülés a projekt bemutatására.
7.  Bemutatás.

## 5. Funkcionális terv
### A program funkcionális leírása:
#### Futtatás után egy kezelőfelület jelenik meg, ahol egy naptár látható az atuális év, aktuális hónapjának a napjaival a kezdőfelületen. A naptáron belül tudunk lapozni, ezzel megtekintve a következő és előző hónapok napjainak az elrendezését. Az egyes napokra kattintva hozzájuk tudunk rendelni időpontokat és tevékenységeket, amiket majd az adott időpontban el akarunk végezni. Az itt megadott eseményeknek meg tudjuk adni a címét, azt, hogy időben mikor aktuálisak, illetve az eseményhez tartozó leírást tudunk készíteni. Ezeket az eseményeket utólagosan is át tudjuk írni(nevet és leírást egyaránt). Illetbe át tudjuk helyezni az időpontjukat és törölni is tudjuk őket. Be tudunk állítani ismétlődő eseményeket, amelyeket a naptár egy adott héten/hónapban mindig elhelyez. A naptár folyamatosan frissül, így minden egyes esemény elhelyezés után látjuk a már lefoglalt időpontjainkat.

## 6. Fizikai környezet
### Futtatás módja:
- Minden számítógépen lokálisan fut majd
### Futtató környezet:
- Android 5.0 (Lollipop)
### Elérhető operációs rendszerek:
- Windows 7
- Windows 8
- Windows 8.1
- Windows 10
### Szoftver moduljai:
- A szoftver egy naptár nézeten alapuló android studio alkalmazás
### Fejlesztői környezet:
- Android Studio
- Java 17

## 7. Teszt terv
### Leírja a teszt típusát, a metodológiáját és a riport készítés módszerét. Emellett meghatározza a teszt elvárásokat, a teszt-esetek elvárt eredményeit, sikerességének kritériumait, a kockázatok kezelését és a hatáskörön kívül eseteket.
### Mi a programunkban a fejlesztői, elfogadási, megbízhatósági és megfelelési teszteket fogjuk elvégezni.
### Fejlesztői teszt:
- A fejlesztői tesztelés célja a rendszer alapvető funkcióinak ellenőrzése, a hibakezelés és az alapvető funkciók működésének vizsgálata.
### Prototípus teszt:
- A prototípus tesztelés célja a rendszer már működő moduljainak önálló tesztelése, a modulon belüli hibák azonosításának és kiküszöbölésének érdekében.
### Integrációs teszt:
- Az integrációs teszt célja a rendszer más rendszerekhez történő illesztésének vizsgálata, a több rendszereken keresztül átívelő funkciók tesztelésének érdekében.Az adatmigrációs tesztelés az integrációs teszteléshez tartozik, ennek lényege, hogy a bevezetendő rendszerbe áttöltik azokat az adatokat, amelyekkel a rendszer dolgozni fog és letesztelik a betöltött adatok, illetve az adatokat kezelő funkciók helyességét.
### Elfogadási teszt:
- Az elfogadási teszt (angolul User Acceptance Test) célja a rendszer teljes funkcionalitásának vizsgálata a felhasználók szemszögéből.
### Terheléses teszt:
- A terheléses teszt célja a tervezett kapacitások, valamint a rendelkezésre álló növekedési potenciál meghatározása.
### Go live teszt:
- A go-live teszt egy próbaélesítés, melynek során a korábbi rendszerek továbbra is üzemelnek annak érdekében, hogy az élesítéskor keletkező problémák ne befolyásolják a normál üzemi működést.
### Megbízhatósági teszt:
- A megbízhatósági teszt célja, hogy a rendszerrel elvégezhető feladatokról - lehetőleg mindről -megmutassa, hogy hosszú időn át képesek determinisztikusan és konzisztensen működni adottkörnyezetben. Más aspektusból – alacsonyabb tesztszinten – azt várjuk el egy-egy művelettől, hogyugyanazt az eredményt kapjuk, ha újra és újra végrehajtjuk adott körülmények között.
### Hordozhatósagi teszt:
- A hordozhatósági teszt célja a különböző platformokon működő képes használat(Windows operáiós rendzserek, Linux, Android, IOS)
### Megfelelési teszt:
- A szerződésekben foglaltakat vizsgálja, hogy a projekt minden része megfelel e a szerződött fél kritériumaival.

### A projekt tesztelése során főleg a fejlesztői tesztet alkalmaztuk


## 8. Telepités
#### A programott Githubon keresztül lehet telepíteni miután elvégeztük a letöltést. 
#### Ez után kibontjuk a mappát oda ahová szeretnénk és futtatjuk az alkalmazást.
### Nemfunkcionális követelmények:
- megbízhatóság
- válaszidő
- tárfoglalás
- rugalmasság
- robosztusság
- hordozhatóság
