public class TCoupReq{
    TIdReq     idRequest;     /* Identificateur de la requete */
    int        numPartie;     /* Numero de la partie (commencant a 1) */
    TCoup      typeCoup;      /* Type du coup : deplacement ou passe */
    TPion      coul;          /* Info du pion joue */
    TDeplPion  deplPion; 
}