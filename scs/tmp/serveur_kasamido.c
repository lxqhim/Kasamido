#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

#include <sys/socket.h>

#include "fonctionsTCP.h"
#include "protocolKamisado.h"

#define TAIL_BUF 50

/*Server treatment*/


/*Main function*/
int main(int argc, char** argv) {
  int sockConx;
	int SERV_PORT = 2019;
	int sockTrans,	      /*local socket*/
      err;  	          /*communication error*/
  int errT;             /*Treatment Error*/
  TIdReq codeReq;        /*request ID*/
  TCodeRep codeErr;      /*error ID*/
	//byte *input;           /*donnees recu*  ------tmp*/
  /* structures de données pour la gestion du buffer */
  char buffer[TAIL_BUF];     /* buffer pour les donnes */
  int plein = 0;             /* buffer plein */
  sockConx = socketServeur(SERV_PORT);
  if (sockConx < 0) {
    perror("(serveur) erreur socketServeur");
    return -1;
  }
	sockTrans = accept(sockConx, NULL, NULL);
    if (sockTrans < 0) {
      perror("(serveur) erreur sur accept");
      close(sockConx);
      return -2;
    }
		//printf("11111111111111");
    err = recv(sockTrans, buffer, sizeof(TIdReq), MSG_PEEK);
    int tmp = atoi(buffer);
    if(tmp==PARTIE){
      printf("coup partie");
    }
    
		if(err > 0){
			printf("%d",err);
		}
		//codeReq = (TIdReq)&buf;
    if (err < 0) {
      perror("(serveur) erreur dans la reception");
      shutdown(sockTrans, SHUT_RDWR); close(sockTrans);
      close(sockConx);
      return -3;
    }

    if (err == 0) {
      printf("Fin de la connexion \n");
      shutdown(sockTrans, SHUT_RDWR); close(sockTrans);
    } 
			/*
      switch(codeReq) {
      
      case PARTIE :
          plein = 1;
	        err = send(sockTrans, &plein, sizeof(int), 0);
	    break;

      default :
	     
          err = send(sockTrans, &plein, sizeof(int), 0);
      	}
    	}*/
			//printf("%s",buffer);
    shutdown(sockTrans, SHUT_RDWR); close(sockTrans);
	/*
  if ((err = traitServ(sockConx)) < 0) {
    close(sockConx);
    return err;
  }*/

  close(sockConx);

  return 0;
}
