# Tasca-S1.05

En tots els exercicis hem de fer el seguent:

Obrim la terminal i primerament fem servir el comando **javac** per compilar els
arxius amb codi font Java (.java) en arxius que contenen codi de bytes en la seva
forma binaria (.class). Llavors utilizem el comando **java** per executar l’arxiu
.class utilitzant una màquina virtual de java (JVM). 

**NIVELL 1**

**Exercici 1:**

A l’hora d’executar el comando java, hem de passar per paràmetre la ruta d’un
directori, del qual es mostrarà per pantalla els arxius que conté ordenats per
ordre alfabètic.

**Exercici 2:**

Hem de fer el mateix que en l’exercici 1, però ara, quan s’imprimeixi el directori
que passem per paràmetre, ho farà creant un arbre de directoris, amb els arxius
ordenats alfabèticament i indicant la seva última data de modificació. 
Exemple:

<img width="404" alt="image" src="https://user-images.githubusercontent.com/117647645/207939203-c6f83389-db6c-4287-a3bd-2499e8a25764.png">

**Exercici 3:**

En aquest cas en lloc d’imprimir-se el resultat per pantalla, es guarda en un
fitxer txt.

**Exercici 4:**

Quan passo l’argument en el comando java, he de finalitzar la ruta escrivint el
nom del fitxer del qual vull que es mostri el contingut per consola + .txt (/nom Arxiu.txt).  

**Exercici 5:**

En aquest cas no passo cap argument ja que la ruta que faig servir en el
FileOutputStream y en el FileInputStream (ruta del file.ser) ja la tinc escrita
en el programa. Un cop es desserialitza l’objecte me’l mostra per consola. 
Exemple:

<img width="423" alt="image" src="https://user-images.githubusercontent.com/117647645/207939691-191337a0-db04-4af8-a152-4c48cc5accea.png">

**NIVELL 2**

**Exercici 1:**

Mitjançant l’arxiu configuration.properties.txt no necessito passar cap ruta com
a paràmetre ja que en el codi he marcat la ruta on es troba aquest arxiu, i també
indico la clau, mitjançant la qual s’obtindrà el valor. (Parella clau-valor)
Per exemple, “path” es la clau, i “/Users/annasantasusanaberch/CosesVaries” és el
valor.  

<img width="347" alt="image" src="https://user-images.githubusercontent.com/117647645/207939972-d51c161b-072e-429e-af87-9cbd7a3cc242.png">

