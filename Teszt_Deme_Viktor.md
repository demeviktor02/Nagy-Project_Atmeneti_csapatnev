# Tesztjegyzőkönyv

Teszteléseket végezte: Deme Viktor

Operációs rendszer: Android

Ebben a dokumentumban lesz felsorolva az elvégzett tesztek elvárásai és eredményei, illetve időpontjai (Alfa, Béta és Végleges verzió).

## Alfa teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Dátum előre lapozó gomb megnyomása | 2022.12.01. | A naptár nézet egy hónapot előre vált | A naptár egy hónapot előre vált | Nem találtam hibát a működésében |
| Dátum vissza lapozó gomb megnyomása | 2022.12.01. | A naptár nézet egy hónapot visszafelé vált | A naptár egy hónapot visszafelé vált | Nem találtam hibát a működésében |
| Aktuális hónap, év kiíírása | 2022.12.01. | A napár nézet tetején megjelenik az aktuális hónap, év | A napár nézet tetején megjelenik az aktuális hónap, év | Nem találtam hibát a működésében |
| Aktuális hónap, év kiírásának változtatása előre lapozásnál | 2022.12.01. | A napár nézet tetején változik az aktuális hónap, év előre haladóan | A napár nézet tetején változik az aktuális hónap, év nem változik | Az év, hónap kiírása hibás, a funkció javításra szorul |
| Aktuális hónap, év kiírásának változtatása hátra lapozásnál | 2022.12.01. | A napár nézet tetején változik az aktuális hónap, év hátra haladóan | A napár nézet tetején változik az aktuális hónap, év nem változik | Az év, hónap kiírása hibás, a funkció javításra szorul |

Az Alfa tesztelés során a vizsgált elemek mind hibátlanul működtek mindenféle fennakadások nélkül.
Az Alfa tesztelés során a vizsgált elemek között volt ami nem megfelelően működött, ez a későbbiek során javításra szorul.

Következő tesztelésnél a többi funkció kerül vizsgálatra illetve elemzésre.
## Béta teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Tetszőleges dátumra való kattintás | 2022.12.04. | Megjelenik az esemény hozzáadása ablak | Megjelenik az esemény hozzáadása ablak | Nem találtam hibát a működésében |
| Írás az esemény hozzáadása ablak textboxba | 2022.12.04. | Egy tetszőleges szöveg beírható amit az esemény címének szánunk | Egy tetszőleges szöveg beírható amit az esemény címének szánunk | Nem találtam hibát a működésében |
| Az időt mutató textre kattintás az esemény hozzáadása ablakban | 2022.12.04. | Egy óra nézet jön elő ahol megadhatjuk az aktuális esemény pontos idejét | Egy óra nézet jön elő ahol megadhatjuk az aktuális esemény pontos idejét | Nem találtam hibát a működésében |
| Event véglegesítése az add event gomb megnyomásával | 2022.12.04. | A rendszer rögzíti az eventet az adatbázikba a megadott adatokkal | A rögzített időpont hibásan jelenik meg az adatbázisban | Az időpont mentése hibás, javításra szorul |
| Tetszőleges dátumra való kattintás, ahol már létezik meglévő esemény | 2022.12.04. | Megjelenik az az adott esemény pontos neve és ideje |  Megjelenik az az adott esemény pontos neve, viszont az idő hibásan jelenik meg | Az idő megjelenítése hibás javításra szorul |

A Béta teszt sikeresen zajlott.
A Béta teszt során akadtan hibák, mely(ek) javításra szorulnak.

A végleges tesztelés során az összes fent felsorolt vizsgálati elem újra ellenőrzésre kerül. Ezzel együtt az új funkciók is tesztelésre kerültek.

## Végleges teszt
| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Aktuális hónap, év kiírásának változtatása előre lapozásnál | 2022.12.07. | A napár nézet tetején változik az aktuális hónap, év előre haladóan | A napár nézet tetején változik az aktuális hónap, év előre haladóan | Hiba javítva, nem találtam hibát a működésében |
| Aktuális hónap, év kiírásának változtatása hátra lapozásnál | 2022.12.07. | A napár nézet tetején változik az aktuális hónap, év hátra haladóan | A napár nézet tetején változik az aktuális hónap, év hátra haladóan | Hiba javítva, nem találtam hibát a működésében |
| Event véglegesítése az add event gomb megnyomásával | 2022.12.07. | A rendszer rögzíti az eventet az adatbázikba a megadott adatokkal | A rendszer rögzíti az eventet az adatbázikba a megadott adatokkal | Hiba javítva, nem találtam hibát a működésében |
| Tetszőleges dátumra való kattintás, ahol már létezik meglévő esemény | 2022.12.07. | Megjelenik az az adott esemény pontos neve és ideje |  Megjelenik az az adott esemény pontos neve és ideje | Hiba javítva, nem találtam hibát a működésében |
| Esemény törlése gombra kattintás már meglévő eseménynél | 2022.12.07. | Az adott esemény törlődik a naptár nézetből és az adatbázisból |  Az adott esemény törlődik a naptár nézetből és az adatbázisból | Nem találtam hibát a működésében |

A Végleges teszt lezajlott és minden funkció rendesen működik, esztétikailag is megfelelő a program.

Átadásra készen áll a megrendelőnek.

Tesztelést végezte és írta: Deme Viktor

Befejezve: 2022.12.07.


## Alfa teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Add event gomb megnyomása | 2022.12.01. | Megjelenik egy esemény a naptárban |  Megjelenik egy esemény a naptárban | Nem találtam hibát a működésében |
| A korábban hozzá adott event helyes időben jelenjen meg | 2022.12.01. |  A korábban hozzá adott event helyes időben jelenik meg |  Megjelenik A korábban hozzá adott event helyes időben | Nem találtam hibát a működésében |
| Delete gomb megnyomása A felugró event ablakban  | 2022.12.01. | El tűnik az ablak és törlődik az esemény az adott napról és időpontról | Az ablak el tűnik de az időpontban ott marad az esemény  | A event törlése hibás, a funkció javitásra szorul |
| A némitás iconra kattintás  | 2022.12.05. | El tűnik a notification barról az event | Az event el tűnt a notification barról  | Nem találtam hibát a működésében |
| A Visza némitás iconra kattintás  | 2022.12.05. | VIsza tér a notification  | A notification viszatért  | Nem találtam hibát a működésében |


## Béta teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Az Óra ikonra való kattintás | 2022.12.08. | Meg jelenik az óra | Az óra ikonja meg jelenik | Nem találtam hibát a működésében |
| Az Óra idő beállitása | 2022.12.08. | Be állitja az órát  | Az óra beállitódik az időre amire beálitjuk | Nem találtam hibát a működésében |
| Az Perc idő beállitása | 2022.12.08. | Be állitja az percet  | Az perc nem állitódik be az időre amire beálitjuk | A perc beálitása hibás javitásra szorul |
| A Cancel gombra Kattintás | 2022.12.08. | Ki lép az óra beálitásból  | Az óra beálitásból kilépunk | Nem találtam hibát ebben a funkcióban. |
| Az Ok gombra kattintás| 2022.12.08. | Ki lép a korábban megadott idővel | A megadott idővel ki léptünk  | Nem találtam hibát a működésében |


## Végleges teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Delete gomb megnyomása A felugró event ablakban  | 2022.12.08. | El tűnik az ablak és törlődik az esemény az adott napról és időpontról | Az ablak el tűnik és törlődik az event  | Nem találtam hibát a működésében |
| Az Perc idő beállitása | 2022.12.08. | Be állitja az percet  | Az perc beálitódik az időre amire beálitjuk | Nem találtam hibát a működésében |
| Az Óra modositása | 2022.12.08. | Módositja a korábban beálitott órát  | Az óra módosul a korábban beálitott órárol | Nem találtam hibát a működésében |
| Az Perc modositása | 2022.12.08. | Módositja a korábban beálitott percet  | Az perc módosul a korábban beálitott percről | Nem találtam hibát a működésében |
| Az Név amit eventnek megadunk az jelenik meg| 2022.12.08. | Az a név amit megadtunk jelenmik meg a napnál amelyiknél megadtuk | Az a név amit megadtunk jelenmik meg a napnál amelyiknél megadtuk  | Nem találtam hibát a működésében |

A teszteket én is elvégeztem, nem találtam hibát a funkciók működésében!



## Alfa teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Naptár nézet megjelenés | 2022.12.01. | Az alkalmazás betöltésekor egy naptár jelenik meg | Az előre gombra nyomva a dátum a címsorban nem változik. | Nem találtam hibát ebben a funckióban. |
| Aktuális év, hónap megjelenése | 2022.12.01. | Az alkalmazás betöltésekor a címsorban az aktuális év, hónap jelenik meg. | Az alkalmazás betöltésekor a címsorban az aktuális év, hónap jelenik meg. | Nem találtam hibát ebben a funkcióban. |
| Dátum lapozása visszafelé | 2022.12.01. | A visszagombra nyomva a dátum visszább lép egyet. | A visszagombra nyomva a dátum visszább lép egyet. | Nem találtam hibát ebben a funkcióban. |
| Dátum lapozása előre | 2022.12.01. | Az előre gombra nyomva a dátum előrébb lép egyet. | Az előre gombra nyomva a dátum előrébb lép egyet. | Nem találtam hibát ebben a funkcióban. |
| Dátum lapozása visszafelé kiiratás | 2022.12.01. | Az visszagombra nyomva a dátum a címsorban visszább lép egyet. | Az visszagombra nyomva a dátum a címsorban nem változik. | A funkció hibás, későbbiekben javításra szorul. |
| Dátum lapozása előre kiiratás | 2022.12.01. | Az előre gombra nyomva a dátum a címsorban előrébb lép egyet. | Az előre gombra nyomva a dátum a címsorban nem változik. | A funkció hibás, későbbiekben javításra szorul. |


## Béta teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Tetszőleges napra nyomás | 2022.12.05. | Adott napra nyomva megjelenik egy kis ablakban a nap és a hozzá tartozó eventek. | Adott napra nyomva megjelenik egy kis ablakban a nap és a hozzá tartozó eventek. | Nem találtam hibát ebben a funkcióban. |
| Tetszőleges nap ablakban textboxba írás | 2022.12.05. | Bármilyen szöveget tudunk írni a textboxba. | Bármilyen szöveget tudunk írni a textboxba. | Nem találtam hibát ebben a funkcióban. |
| Tetszőleges nap ablakban event időpont beállítása | 2022.12.05. | Egy óra jön elő, ahol az eventnek pontos időt tudunk beállítani. | Egy óra jön elő, ahol az eventnek pontos időt tudunk beállítani. | Nem találtam hibát ebben a funkcióban. |
| Tetszőleges nap event hozzáadása | 2022.12.05. | Add event gombra nyomva elmenti az eventet az adott napra. | Add event gombra nyomva elmenti az eventet az adott napra. | Nem találtam hibát ebben a funkcióban. |
| Tetszőleges nap  több event hozzáadása | 2022.12.05. | Több eventet is el tudunk menteni egy adott napra. | Több eventet is el tudunk menteni egy adott napra. | Nem találtam hibát ebben a funkcióban. |
| Eventek megjelenése | 2022.12.05. | Adott nap eventjei megfelelő névvel és időponttal jelennek meg. | Adott nap eventjei megfelelő névvel és időponttal jelennek meg. | Nem találtam hibát ebben a funkcióban. |
| Eventek törlése | 2022.12.05. | Delete event gombra nyomva törlődik az adatbázisból az event. | Nem törlődik az adatbázisból az event. | A funkció hibás, későbbiekben javításra szorul. |
| Értesítés a közelgő eventről | 2022.12.05. | Az event közeledtével értesítést kapunk a telefonon. | Nem kapok értesítést az eventről. | A funkció hibás, későbbiekben javításra szorul. |

## Végleges teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Dátum lapozása visszafelé kiiratás | 2022.12.07. | Az visszagombra nyomva a dátum a címsorban visszább lép egyet. | Az visszagombra nyomva a dátum a címsorban visszább lép egyet. | A funkció javításra került, nem találtam hibát. |
| Dátum lapozása előre kiiratás | 2022.12.07. | Az előre gombra nyomva a dátum a címsorban előrébb lép egyet. | Az előre gombra nyomva a dátum a címsorban előrébb lép egyet. | A funkció javításra került, nem találtam hibát. |
| Eventek törlése | 2022.12.07. | Delete event gombra nyomva törlődik az adatbázisból az event. | Delete event gombra nyomva törlődik az adatbázisból az event. | A funkció javításra került, nem találtam hibát. |
| Értesítés a közelgő eventről | 2022.12.07. | Az event közeledtével értesítést kapunk a telefonon. | Az event közeledtével értesítést kapunk a telefonon. | A funkció javításra került, nem találtam hibát. |
| Értesítés némítása a közelgő eventről | 2022.12.07. | Az event közeledtével nem kapunk értesítést a telefonon. | Az event közeledtével nem kapunk értesítést a telefonon. | Nem találtam hibát ebben a funkcióban. |
| Értesítés némítás levétele a közelgő eventről | 2022.12.07. | Az event közeledtével értesítést kapunk a telefonon. | Az event közeledtével értesítést kapunk a telefonon. | Nem találtam hibát ebben a funkcióban. |

A teszteket én is elvégeztem, nem találtam hibát a funkciók működésében!



