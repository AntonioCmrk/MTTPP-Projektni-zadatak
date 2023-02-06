# MTTPP-Projektni-zadatak
Projektni zadatak iz kolegija Metode i tehnike testiranja programske podrške koji testira Web trgovinu "About You" pomoću ChromeDriver-a.

Sastoji se od 6 testova: 
1. Testiranje google rezultata kada se upiše ime stranice u tražilicu.
2. Testiranje prvog linka da li je link do Web trgovine.
3. Testiranje log in opcije.
4. Testiranje searck opcije.
5. Testiranje opcije stavljanja u košaricu.
6. Testiranje vađenja iz košarice.

Testovi su pisani u java programskom jeziku.

Opis datoteka korištenih u projektu: 
- PageObject: Nadređeni PageObject koji bi sve klase trebale naslijediti kako bi mogle izvoditi WebDriver testove.
- TestPlan: Klasa koja spaja sve testne metode zajedno.
- Utils: Konfiguracijska klasa koja prikazuje lokaciju chromedrivera i linkove potrebne za testiranje.
- WebShop: klasa koja uključuje sve lokatore, varijable i metode za automatizaciju.
