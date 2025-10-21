/*
Ejercicio 2
A continuación tienes una lista en la que están mezcladas varias clases con
instancias de esas clases. Para ponerlo un poco más difícil, todos los elementos
están escritos en minúscula. Di cuáles son las clases, cuáles las instancias,
a qué clase pertenece cada una de estas instancias y cuál es la jerarquía
entre las clases: paula, goofy, gardfiel, perro, mineral, caballo, tom, silvestre,
pirita, rocinante, milu, snoopy, gato, pluto, animal, javier, bucefalo, pegaso,
ayudante_de_santa_claus, cuarzo, laika, persona, pato_lucas.
 */

/*
CLASES (es decir, tipos de objetos) Son sustantivos genéricos que definen una categoría.
Animal, Persona, Perro, Gato, Caballo, Mineral
INSTANCIAS (objetos concretos) Son nombres propios o específicos, objetos individuales de alguna clase:
paula, goofy, gardfiel, tom, silvestre, pirita, rocinante, milu, snoopy,
pluto, javier, bucefalo, pegaso, ayudante_de_santa_claus, cuarzo, laika, pato_lucas
Asociación: ¿a qué clase pertenece cada instancia?
paula	Persona
javier	Persona
ayudante_de_santa_claus	Perro
goofy	Perro
milu	Perro
snoopy	Perro
pluto	Perro
laika	Perro
gardfiel (debería ser “garfield”)	Gato
tom	Gato
silvestre	Gato
pato_lucas	Animal (más específicamente: pato)
rocinante	Caballo
bucefalo	Caballo
pegaso	Caballo
pirita	Mineral
cuarzo	Mineral

Jerarquía entre las clases

Podemos representarlo así:

        ┌──────────────┐
        │    animal    │
        └──────┬───────┘
               │
    ┌──────────┼───────────┐
    │          │           │
  persona     perro        gato
               │             │
         ayudante_de_santa_claus, goofy, ...

    caballo           mineral
      │                 │
  rocinante, ...      pirita, cuarzo

En lenguaje orientado a objetos:
-Animal sería la superclase (padre).
-Perro, Gato, Caballo, Persona heredan de Animal.
-Mineral no pertenece a esa jerarquía (es otra clase independiente).

Representación conceptual en código

No es necesario implementarlo, pero se podría modelar así:

class Animal {
    String nombre;
}

class Persona extends Animal {}
class Perro extends Animal {}
class Gato extends Animal {}
class Caballo extends Animal {}

class Mineral {
    String nombre;
}

Y las instancias:

Persona paula = new Persona();
Perro pluto = new Perro();
Gato tom = new Gato();
Caballo rocinante = new Caballo();
Mineral pirita = new Mineral();
 */

public class Ej1_002 {
}




