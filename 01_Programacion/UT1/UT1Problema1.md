# UT1 - Problema 1: Calculadora geomètrica per a TechVille


**Agrupament:** Individual 

<img src="./activitat1.1.webp" alt="Problema 1" width="200"/>

### **Pregunta guia**
**Com podem desenvolupar un programa que ajude els residents de TechVille a calcular l'àrea i el perímetre de diverses formes geomètriques per a aplicacions pràctiques com la planificació de  jardins, la construcció de mobles i el disseny d'espais urbans?**

### **Objectius d'aprenentatge**

En completar aquesta activitat, sereu capaços de:

- Aplicar conceptes de programació en Java per resoldre problemes geomètrics del món real.
- Implementar càlculs matemàtics precisos utilitzant les expressions i funcions de la biblioteca Math de Java.
- Desenvolupar una interfície d'usuari simple però efectiva per a l'entrada i eixida de dades.
- Practicar l'ús de format d'impressió precís en Java.
- Analitzar i reflexionar sobre com les eines de programació poden millorar la planificació urbana i la vida quotidiana.

### **Context i descripció del problema**

TechVille, una ciutat innovadora i tecnològica, està implementant un sistema digital per a millorar la qualitat de vida dels seus residents. Aquest sistema necessita una eina que permeta als ciutadans realitzar càlculs geomètrics precisos per a diverses aplicacions quotidianes i professionals.

L'ajuntament us ha contractat per desenvolupar un prototip d'aquesta eina, que servirà com a base per a futures aplicacions més complexes en la planificació urbana i el disseny d'espais.

### **El problema a resoldre:**

Desenvolupar un programa en Java que:
   - Permeta als usuaris calcular l'àrea i el perímetre de tres formes geomètriques: cercle, rectangle i triangle.
   - Proporcione resultats precisos amb dos decimals
   - Funcione de la mateixa manera per a tots els ciutadans de TechVille. Per això, el format d'eixida ha de ser consistent en tots els casos.

### **Què necessites per a fer aquesta activitat?**

- Ordinador amb editor de text i el compilador "javac" funcionant. (Pots utilitzar NetBeans si ho prefereixes).
- Accés a recursos en línia per investigar fórmules geomètriques i millors pràctiques de programació.

### **Requisits del programa**

1. **Entrada de dades:**
   - Demana a l'usuari les dimensions necessàries per a cada forma geomètrica.

2. **Processament:**
   - Calcula l'àrea i el perímetre de cada forma.
   - Calcula la hipotenusa del triangle.

3. **Eixida de dades:**
   - Mostra els resultats amb el format especificat, utilitzant dos decimals de precisió. 
   - **Important:** El format d'eixida ha de ser consistent per a tots els usuaris. Això vol dir que has de respectar el format que es presenta a continuació (en negreta l'entrada d'usuari).

### **Exemple de funcionament del programa:**
<pre>
Dis-me el valor del radi d'un cercle: <span style="color:blue"><b>3</b></span>

Ara dis-me el valor de la base d'un rectangle: <b>5.0</b>

No oblides dir-me també el valor de l'altura del rectangle: <b>4</b>

De moment tenim un cercle de perímetre 18.84 i àrea 28.26 i un rectangle d'àrea 20.00 

M'agrada el teorema de Pitàgores dis-me el valor del catet 1: <b>3</b>

I també del catet 2: <b>3</b>

D'acord el valor de la hipotenusa al quadrat és 18.00 per tant el valor de la hipotenusa és 4.24
</pre>

### **Instruccions**

1. **Investigació preliminar:**
   - Investiga les fórmules per calcular àrees, perímetres i la hipotenusa.
   - Busca exemples de codi Java per a l'entrada/eixida formatada i càlculs matemàtics (expressions).

2. **Desenvolupament del programa:**
   - Escriu el codi en un editor de text senzill (bloc de notes, gedit, xed, nano...).
   - Utilitza les funcions `System.out.printf` i `Math.sqrt` per assegurar que el format d'eixida és el correcte.
   - Afegeix comentaris al codi per explicar cada pas i facilitar la comprensió.

3. **Proves i depuració:**
   - Compila el codi utilitzant el compilador "javac".
   - Corregeix qualsevol error de compilació que aparega.
   - Prova el programa amb diferents conjunts de dades per assegurar que els càlculs són correctes.

4. **Reflexió i documentació:**
   - Escriu un breu informe que incloga:
      - Una explicació del teu procés de desenvolupament.
      - Els reptes que has enfrontat i com els has superat.
      - Suggeriments per a futures millores o funcionalitats addicionals.

### **Notes d'ajuda:**
 - Si vols vore els valors decimals limitats a N decimals, hauràs de fer ús de la funció `System.out.printf`. Per exemple, suposant que la variable `quantitat` val 3.457323432 i la variable `resultat` val 8.432312:

   ```java
   System.out.printf("Quantitat val %.2f i resultat %.2f \n", quantitat, resultat);
   ```

   **Mostra per pantalla:** Quantitat val 3.46 i resultat 8.43

 - Si vols calcular l'arrel quadrada d'un nombre has d'utilitzar la funció `Math.sqrt(valor)`. El valor pot ser un literal, expressió o variable numèrica de la qual vols calcular la seua arrel quadrada. Per exemple, suposant que la variable `valor` val 4:

   ```java
   System.out.println("L'arrel quadrada de " + valor + " és " + Math.sqrt(valor));
   ```

   **Mostra per pantalla:** L'arrel quadrada de 4 és 2.0


### **Entrega**

- Envia el fitxer del codi font (`UT1Problema1.java`) i l'informe en un document PDF.
- Recorda seguir la convenció de noms.
- **Important:** Afig el teu nom i cognoms sempre com a comentari al principi dels fitxers JAVA (En NetBeans després de \@author ).

### ***Extensió opcional***
Per als estudiants que acaben abans o vulguen un repte addicional:

- Afegiu càlculs per a formes geomètriques addicionals (per exemple, trapezi o pentàgon regular).