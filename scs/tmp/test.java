import javax.swing.text.DefaultStyledDocument.ElementBuffer;

public class TPartieReq{
    public static final int T_NOM = 30;
    public TIdReq idReq;
    public String nomJoueur[];
    public TCoulJoueur pion;

    public TPartieReq(TIdReq req, String nom, TCoulJoueur c){
        this.idReq = req;
        this.nomJoueur = new String[30];
        this.nomJoueur = nom;
        this.pion = c;
    }

    public static void main(String[] args) {
        TPartieReq req1 = new TPartieReq(TIdReq.PARTIE, mach, TCoulJoueur.BLANC);
        System.out.println("size:"+Object.size);
    }
}