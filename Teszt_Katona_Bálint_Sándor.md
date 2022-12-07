# Tesztjegyzőkönyv

Teszteléseket végezte: Katona Bálint Sándor

Operációs rendszer: Android

Ebben a dokumentumban lesz felsorolva az elvégzett tesztek elvárásai és eredményei, illetve időpontjai (Alfa, Béta és Végleges verzió).

## Alfa teszt

Az alkalmazás kezdetleges funkcióinak tesztelése.

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Naptár nézet megjelenés | 2022.12.01. | Az alkalmazás betöltésekor egy naptár jelenik meg | Az előre gombra nyomva a dátum a címsorban nem változik. | Nem találtam hibát ebben a funckióban. |
| Aktuális év, hónap megjelenése | 2022.12.01. | Az alkalmazás betöltésekor a címsorban az aktuális év, hónap jelenik meg. | Az alkalmazás betöltésekor a címsorban az aktuális év, hónap jelenik meg. | Nem találtam hibát ebben a funkcióban. |
| Dátum lapozása visszafelé | 2022.12.01. | A visszagombra nyomva a dátum visszább lép egyet. | A visszagombra nyomva a dátum visszább lép egyet. | Nem találtam hibát ebben a funkcióban. |
| Dátum lapozása előre | 2022.12.01. | Az előre gombra nyomva a dátum előrébb lép egyet. | Az előre gombra nyomva a dátum előrébb lép egyet. | Nem találtam hibát ebben a funkcióban. |
| Dátum lapozása visszafelé kiiratás | 2022.12.01. | Az visszagombra nyomva a dátum a címsorban visszább lép egyet. | Az visszagombra nyomva a dátum a címsorban nem változik. | A funkció hibás, későbbiekben javításra szorul. |
| Dátum lapozása előre kiiratás | 2022.12.01. | Az előre gombra nyomva a dátum a címsorban előrébb lép egyet. | Az előre gombra nyomva a dátum a címsorban nem változik. | A funkció hibás, későbbiekben javításra szorul. |


Az Alfa tesztelés során az alap funckiók szinte mind hibátlanul működtek mindenféle hibák nélkül. Az esetleges hibák a későbbi fejlesztés során javításra kerülnek.

## Béta teszt

Az alkalmazás még nem teljes állapotban lévő funkcióinak tesztelése.

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Tetszőleges napra nyomás | 2022.12.05. | Adott napra nyomva megjelenik egy kis ablakban a nap és a hozzá tartozó eventek. | Adott napra nyomva megjelenik egy kis ablakban a nap és a hozzá tartozó eventek. | Nem találtam hibát ebben a funkcióban. |
| Tetszőleges nap ablakban textboxba írás | 2022.12.05. | Bármilyen szöveget tudunk írni a textboxba. | Bármilyen szöveget tudunk írni a textboxba. | Nem találtam hibát ebben a funkcióban. |
| Tetszőleges nap ablakban event időpont beállítása | 2022.12.05. | Egy óra jön elő, ahol az eventnek pontos időt tudunk beállítani. | Egy óra jön elő, ahol az eventnek pontos időt tudunk beállítani. | Nem találtam hibát ebben a funkcióban. |
| Tetszőleges nap event hozzáadása | 2022.12.05. | Add event gombra nyomva elmenti az eventet az adott napra. | Add event gombra nyomva elmenti az eventet az adott napra. | Nem találtam hibát ebben a funkcióban. |
| Tetszőleges nap  több event hozzáadása | 2022.12.05. | Több eventet is el tudunk menteni egy adott napra. | Több eventet is el tudunk menteni egy adott napra. | Nem találtam hibát ebben a funkcióban. |
| Eventek megjelenése | 2022.12.05. | Adott nap eventjei megfelelő névvel és időponttal jelennek meg. | Adott nap eventjei megfelelő névvel és időponttal jelennek meg. | Nem találtam hibát ebben a funkcióban. |
| Eventek törlése | 2022.12.05. | Delete event gombra nyomva törlődik az adatbázisból az event | Nem törlődik az adatbázisból az event. | A funkció hibás, későbbiekben javításra szorul. |
| Értesítés a közelgő eventről | 2022.12.05. | Az event közeledtével értesítést kapunk a telefonon. | Nem kapok értesítést az eventről. | A funkció hibás, későbbiekben javításra szorul. |

A béta teszt során a legtöbb funkció kifogástalanul működött. A fennakadó problémák a további fejlesztés során javításra szorulnak.

## Végleges teszt

Az alkalmazás átadási állapotban van, minden eddigi hibás és hibátlan funkció újra tesztelése.

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Dátum lapozása visszafelé kiiratás | 2022.12.07. | Az visszagombra nyomva a dátum a címsorban visszább lép egyet. | Az visszagombra nyomva a dátum a címsorban visszább lép egyet. | A funkció javításra került, nem találtam hibát. |
| Dátum lapozása előre kiiratás | 2022.12.07. | Az előre gombra nyomva a dátum a címsorban előrébb lép egyet. | Az előre gombra nyomva a dátum a címsorban előrébb lép egyet. | A funkció javításra került, nem találtam hibát. |
