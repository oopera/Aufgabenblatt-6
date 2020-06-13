package de.hrw.progra2.assignment6;


    public enum FirstBundesligaSoccerClub{
        FC_AUGBURG("FC AUGSBURG", 1907, 19.018);
      /*  BAYER_LEVERKUSEN,
        BAYERM_MUENCHEN,
        BORUSSIA_DORTMUND,
        BORUSSIA_MOENCHENGLADBACH,
        EINTRACH_FRANKFURT,
        FORTUNA_DUESSELDORF,
        SC_FREIBURG,
        HERTHA_BSC,
        TSG_HOFFENHEIM,
        _1_FC_KOELN,
        RB_LEIBZIG,
        MAINZ_05,
        SC_PADERBORN,
        SCHALKE_04,
        UNION_BERLIN,
        WERDER_BREMEN,
        VFL_WOLFSBURG; */

        private final String Verein_Name;
        private final int GruendungsJahr;
        private final double MitliederAnzahl;

        FirstBundesligaSoccerClub(String vereinname, int gruendungsJahr, double mitliederAnzahl) {
            GruendungsJahr = gruendungsJahr;
            MitliederAnzahl = mitliederAnzahl;
            Verein_Name = vereinname;
        }

        public int getGruendungsJahr() {
            return this.GruendungsJahr;
        }

        public double getMitliederAnzahl() {
            return this.MitliederAnzahl;
        }

        @Override
        public String toString() {
            return ("Vereine der Bundesliga:" + '\n'+ Verein_Name + '\n' +
                    "Das Gruendungsjahr:" + GruendungsJahr +
                    '\n' + "Die Mitliederanzahl=" + MitliederAnzahl);
        }

        public String getVerein_Name() {
            return this.Verein_Name;




        }

        public static void main(String[] args){
            FirstBundesligaSoccerClub firstBundesligaSoccerClub = FirstBundesligaSoccerClub.FC_AUGBURG;

            System.out.println("Vereinname: " + FC_AUGBURG.getVerein_Name());

            System.out.println(FC_AUGBURG);

        }
    }