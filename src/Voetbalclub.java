public class Voetbalclub {
    private final String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;
    private int aantalGespeeld;
    private int aantalPunten;

    public Voetbalclub(String nm) {
        naam = nm;

    }

    public int getaantalGewonnen() {
        return aantalGewonnen;
    }


    public int getaantalVerloren() {
        return aantalVerloren;
    }

    public int getaantalGelijk() {
        return aantalGelijk;
    }


    public int aantalGespeeld() {
        aantalGespeeld =  getaantalGewonnen()+getaantalGelijk()+getaantalVerloren();
        return aantalGespeeld;

    }


    public int aantalPunten() {
        aantalPunten = ((aantalGewonnen*3)+aantalGelijk);
        return aantalPunten;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen+1;
        if (ch == 'g')
            aantalGelijk= aantalGelijk+1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren+ 1;

    }
    public String toString(){
        return naam +' '+ aantalGespeeld+' '+ aantalGewonnen+ ' '+ aantalGelijk+ ' ' + aantalVerloren + ' '+ aantalPunten;

}
}






