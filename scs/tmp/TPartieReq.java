public class TPartieReq{
    public static final int T_NOM = 30;
    public static final int MAX = 40;
    TIdReq idReq;
    char [] nomJoueur;
    TCoulJoueur pion;

    public TPartieReq(char [] nom, String pion){
        this.idReq = TIdReq.PARTIE;
        this.nomJoueur = nom;
        if(pion=="BLANC"){
            this.pion = TCoulJoueur.BLANC;
        }else{
            if(pion=="NOIR"){
                this.pion = TCoulJoueur.NOIR;
            }
        }
    }

    public byte[] toByte(){
        byte [] res = new byte[40];
        
        return res;
    } 

    
}