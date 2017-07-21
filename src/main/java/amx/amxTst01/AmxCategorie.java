package amx.amxTst01;


public enum AmxCategorie {
    TEST("000", "AUTRE", "Autre"),
    TEST1("000", "AUTRE", "Autre"),
    BIENS_EXT("111", "NIMPORTE", "NIMPORTE");

    /**
     * Code REGIS.
     */
    private String codeAmx1;

    /**
     * Code PROSPER.
     */
    private String codeAmx2;

    /**
     * Libellé.
     */
    private String libelle;

    /**
     * Construction de l'occurence.
     * 
     * @param libelle
     * @param code
     */
    private AmxCategorie(String codeREGIS, String codePROSPER, String libelle) {
        this.libelle = libelle;
        this.codeAmx1 = codeAmx1;
        this.codeAmx1 = codeAmx2;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getCodeAmx1() {
        return codeAmx1;
    }

    public String getCodeAmx2() {
        return codeAmx2;
    }

    @Override
    public String toString() {
        return this.getLibelle();
    }

    public static AmxCategorie getEnumByCodeREGIS(String code) {
        for(AmxCategorie value : AmxCategorie.values()) {
            if(value.getCodeAmx1().equals(code)) {
                return value;
            }
        }

        return null;
    }

    public static AmxCategorie getEnumByCodePROSPER(String code) {
        for(AmxCategorie value : AmxCategorie.values()) {
            if(value.getCodeAmx2().equals(code)) {
                return value;
            }
        }

        return null;
    }

    public static AmxCategorie getEnum(String chaine) {
        for(AmxCategorie valeur : AmxCategorie.values()) {
            if(valeur.getLibelle().equals(chaine)) {
                return valeur;
            }
        }

        return null;

    }

}
