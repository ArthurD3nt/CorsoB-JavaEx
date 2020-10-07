#!/bin/bash

#Richiede input user e lo assegna alla variablie name
read name

#Esegue lo scirpt java utilizzando come argument la variabile name
exec java HelloWorld.java $name
