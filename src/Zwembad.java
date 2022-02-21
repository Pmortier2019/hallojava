public class Zwembad {
    private double Breedte;
    private double Lengte;
    private double Diepte;

    public Zwembad(double br, double le, double dp)


    {
        Breedte = br;
        Lengte = le;
        Diepte = dp;


    }
    public Zwembad(){

    }
    public String toString(){
        return "Dit zwembad is"+ this.Breedte+ "meter breed " + this.Lengte+ "meter lang, en " + this.Diepte +"meter diep";

    }
    public double getBreedte(){
        return Breedte;
    }

    public double getLengte() {

        return Lengte;
    }

    public double getDiepte() {
        return Diepte;
    }


    public void setBreedte(double v) {
    }

    public void setLengte(double v) {
    }

    public void setDiepte(double v) {
    }

    public double inhoud() {
        return (Breedte*Lengte*Diepte);
    }
}
