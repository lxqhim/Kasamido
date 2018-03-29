all: clientTCP serveurTCP

fonctions.o: fonctionsTCP.c fonctionsTCP.h
	gcc -c fonctionsTCP.c -o fonctions.o

clientTCP: clientTCP.c protocole.h fonctions.o
	gcc clientTCP.c fonctions.o -o clientTCP  $(LD_FLAGS)

serveurTCP: serveurTCP.c protocole.h fonctions.o
	gcc serveurTCP.c fonctions.o -o serveurTCP   $(LD_FLAGS)

clean:
	rm clientTCP serveurTCP
veryclean:
	rm clientTCP serveurTCP fonctions.o
