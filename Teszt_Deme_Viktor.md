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
| Tetszőleges dátumra való kattintás | 2022.12.01. | Megjelenik az esemény hozzáadása ablak | Megjelenik az esemény hozzáadása ablak | Nem találtam hibát a működésében |
| Írás az esemény hozzáadása ablak textboxba | 2022.12.01. | Egy tetszőleges szöveg beírható amit az esemény címének szánunk | Egy tetszőleges szöveg beírható amit az esemény címének szánunk | Nem találtam hibát a működésében |
| Az időt mutató textre kettintás az esemény hozzáadása ablakban | 2022.12.01. | Egy óra nézet jön elő ahol megadhatjuk az aktuális esemény pontos idejét | Egy óra nézet jön elő ahol megadhatjuk az aktuális esemény pontos idejét | Nem találtam hibát a működésében |
| Event véglegesítése az add event gomb megnyomásával | 2022.12.01. | A rendszer rögzíti az eventet az adatbázikba a megadott adatokkal | A rögzített időpont hibásan jelenik meg az adatbázisban | Az időpont mentése hibás, javításra szorul |
| Tetszőleges dátumra való kattintás, ahol már létezik meglévő esemény | 2022.12.01. | Megjelenik az az adott esemény pontos neve és ideje |  Megjelenik az az adott esemény pontos neve, viszont az idő hibásan jelenik meg | Az idő megjelenítése hibás javításra szorul |

A Béta teszt sikeresen zajlott.
A Béta teszt során akadtan hibák, mely(ek) javításra szorulnak.