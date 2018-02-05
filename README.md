# Práctica UT06 - Métodos y sentencia Return

## Objetivo

El objetivo de esta práctica es el de desarrollar un pequeño programa que permita mediante diversos metodos trabajar y realizar distintos calculos sobre un array que se generará automaticamente con números aleatorios.

## Desarrollo

Para el desarrollo de esta práctica he dividio el problema en 5 partes que a su vez corresponden con los distintos métodos

* Imprimir el mayor valor del array.
* Imprimir el menor valor del array.
* Calcular la media de todos los valores del array.
* Imprimir todos los valores del array.
* Mostrar cuantas veces se repite un valor dado dentro del array.

En primer lugar se crea un método denominado mayorValor(). Este método recorre el array comprobando cada posición y así verificar si esta es mayor a la mayor encontrada anteriormente.

Seguidamente se crea el método menorValor(). Este método recorre el array comprobando cada posición y así verificando si esta es menor a la menor encontrada anteriormente.

Para calcular la media de todos los valores del array, se crea un método denominado calcularMedia(). Este método suma todos los valores del array y lo divide entre el total de elementos del array y así poder obtener la media.

El método que permite visualizar en pantalla el array se llama imprimirArray(). Este recorre el array imprimiendo cada posición en pantalla.

Para finalizar, se crea el método encontrarNumero(). Este método recorre el array posición a posición, en caso de contener un número igual al buscado, aumentará en uno las veces encontrado dicho numero.
