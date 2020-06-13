package de.hrw.progra2.assignment6;

/**
 * Enumerator for text placeholders.
 */
public enum CologneDistricts {
    Innenstadt,
    Rodenkirchen,
    Lindenthal,
    Ehrenfeld,
    Nippes,
    Chorweiler,
    Porz,
    Kalk,
    Mülheim;

    public String partOfTown;


    private boolean InnenstadtContrains(String partOfTown) {

       if(partOfTown == "Altstadt-Süd") {
           return true;
       } else if(partOfTown == "Neustadt-Süd"){
           return true;
       } else if(partOfTown == "Deutz"){
           return true;
       } else if(partOfTown == "ltstadt-Nord"){
           return true;
       } else if(partOfTown == "Neustadt-Nord"){
           return true;
       } else {
           return false;
       }}

    private boolean RodenkirchenContains(String partOfTown) {

        if(partOfTown == "Altstadt-Süd") {
            return true;
        } else if(partOfTown == "Neustadt-Süd"){
            return true;
        } else if(partOfTown == "Deutz"){
            return true;
        } else if(partOfTown == "ltstadt-Nord"){
            return true;
        } else if(partOfTown == "Neustadt-Nord"){
            return true;
        } else {
            return false;
        }}


        public static void main (String[]args){
            System.out.println("Stadtbezirk " + Innenstadt + " :" + CologneDistricts.Innenstadt.InnenstadtContrains("Altstadt-Süd"));
        }
    }


