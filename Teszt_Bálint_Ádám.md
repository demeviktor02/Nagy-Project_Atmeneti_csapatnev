# Tesztjegyzőkönyv

Teszteléseket végezte: Bálint Ádám

Operációs rendszer: Android

Ebben a dokumentumban fel lesznek sorolva az elvégzett tesztek elvárásai és eredményei, illetve időpontjai (Alfa, Béta és Végleges verzió).

## Alfa teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Dátum visszalapozó gombra nyomás | 2022.12.08. | A naptár egy hónapot visszafelé vált | A naptár egy hónapot visszvált | Nem találtam hibát a működésében |
| Dátum előrelapozó gombra nyomás | 2022.12.08. | A naptár nézet egy hónapot előre vált | A naptár egy hónapot előre vált | Nem találtam hibát a működésében |
| A némitás ikonra kattintás  | 2022.12.08. | Eltűnik a notificationökből az event | Az event eltűnt a notificationökből  | Nem találtam hibát a működésében |
| A némitás megszüntetése ikonra kattintás  | 2022.12.08. | Megjelenik a notificationökben az event | Az event megjelent a notificationökben  | Nem találtam hibát a működésében |
| Tetszőleges dátumra való kattintás | 2022.12.08. | Megjelenik az esemény hozzáadása ablak | Megjelent az esemény hozzáadása ablak | Nem találtam hibát a működésében |

Az Alfatesztek során az alap funckiók mind hibátlanul működtek. Az esetleges hibák a későbbi fejlesztés során javításra kerülnek.

## Béta teszt

Az alkalmazás még nem teljes állapotban lévő funkcióinak tesztelése.

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Az Ok gombra kattintás| 2022.12.08. | Kilép a korábban megadott idővel | A megadott idővel kiléptünk  | Nem találtam hibát a működésében |
| A Cancel gombra kattintás | 2022.12.08. | Kilép az óra beállitásból  |Kilépett az óra beállitásból | Nem találtam hibát ebben a funkcióban |
| Az óra ikonra való kattintás | 2022.12.08. | Megjelenik az óra ikonja | Megjelent az óra ikonja | Nem találtam hibát a működésében |
| Óra beállitása | 2022.12.08. | Beállitja az órát  | Beállitja az órát | Nem találtam hibát a működésében |
| Perc beállitása | 2022.12.08. | Beállítja az percet  | Az perc nem állitódik be az időre amire beálitjuk | Nem találtam hibát a működésében |

A béta teszt során minden funkció kifogástalanul működött. A fennakadó problémák a további fejlesztés során javításra szorulnak.

## Végleges teszt

Az alkalmazás átadási állapotban van, minden eddigi hibás és hibátlan funkció újra tesztelése.

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Dátum visszalapozó gombra nyomás | 2022.12.08. | A naptár egy hónapot visszafelé vált | A naptár egy hónapot visszvált | Nem találtam hibát a működésében |
| Dátum előrelapozó gombra nyomás | 2022.12.08. | A naptár nézet egy hónapot előre vált | A naptár egy hónapot előre vált | Nem találtam hibát a működésében |
| Az óra ikonra való kattintás | 2022.12.08. | Megjelenik az óra ikonja | Megjelent az óra ikonja | Nem találtam hibát a működésében |
| Óra beállitása | 2022.12.08. | Beállitja az órát  | Beállitja az órát | Nem találtam hibát a működésében |
| Perc beállitása | 2022.12.08. | Beállítja az percet  | Az perc nem állitódik be az időre amire beálitjuk | Nem találtam hibát a működésében |
| A némitás ikonra kattintás  | 2022.12.08. | Eltűnik a notificationökből az event | Az event eltűnt a notificationökből  | Nem találtam hibát a működésében |
| A némitás megszüntetése ikonra kattintás  | 2022.12.08. | Megjelenik a notificationökben az event | Az event megjelent a notificationökben  | Nem találtam hibát a működésében |
| Az Ok gombra kattintás| 2022.12.08. | Kilép a korábban megadott idővel | A megadott idővel kiléptünk  | Nem találtam hibát a működésében |
| A Cancel gombra kattintás | 2022.12.08. | Kilép az óra beállitásból  |Kilépett az óra beállitásból | Nem találtam hibát ebben a funkcióban |

A Végleges teszt lezajlott, minden eltervezés szerint működik. 
Átadásra készen áll a megrendelőnek.

Tesztelést végezte és írta: Bálint Ádám

Befejezve: 2022.12.08. 07:30:00


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

Az alkalmazás átadási állapotban van, minden eddigi hibás és hibátlan funkció újra tesztelése.

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Delete gomb megnyomása A felugró event ablakban  | 2022.12.08. | El tűnik az ablak és törlődik az esemény az adott napról és időpontról | Az ablak el tűnik és törlődik az event  | Nem találtam hibát a működésében |
| Az Perc idő beállitása | 2022.12.08. | Be állitja az percet  | Az perc beálitódik az időre amire beálitjuk | Nem találtam hibát a működésében |
| Az Óra modositása | 2022.12.08. | Módositja a korábban beálitott órát  | Az óra módosul a korábban beálitott órárol | Nem találtam hibát a működésében |
| Az Perc modositása | 2022.12.08. | Módositja a korábban beálitott percet  | Az perc módosul a korábban beálitott percről | Nem találtam hibát a működésében |
| Az Név amit eventnek megadunk az jelenik meg| 2022.12.08. | Az a név amit megadtunk jelenmik meg a napnál amelyiknél megadtuk | Az a név amit megadtunk jelenmik meg a napnál amelyiknél megadtuk  | Nem találtam hibát a működésében |

A teszteket én is elvégeztem és nem találtam bennük hibát.

