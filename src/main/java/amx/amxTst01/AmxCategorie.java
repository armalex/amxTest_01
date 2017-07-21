package amx.amxTst01;


public enum AmxCategorie {
    TEST("000", "AUTRE", "Autre"),
    TEST1("000", "AUTRE", "Autre"),
    BIENS_EXT("codeAmx1", "codeAmx2", "codeAmx3");

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
    private String codeAmx3;

    /**
     * Construction de l'occurence.
     * 
     * @param libelle
     * @param code
     */
    private AmxCategorie(String codeAmx1, String codeAmx2, String codeAmx3) {
        this.codeAmx3 = codeAmx3;
        this.codeAmx1 = codeAmx1;
        this.codeAmx2 = codeAmx2;
    }

    public String getCodeAmx3() {
        return codeAmx3;
    }

    public String getCodeAmx1() {
        return codeAmx1;
    }

    public String getCodeAmx2() {
        return codeAmx2;
    }

//    @Override
//    public String toString() {
//        return this.getEnumByCodeAmx3();
//    }

    public static AmxCategorie getEnumByCodeAmx1(String code) {
        for(AmxCategorie value : AmxCategorie.values()) {
            if(value.getCodeAmx1().equals(code)) {
                return value;
            }
        }

        return null;
    }

    public static AmxCategorie getEnumByCodeAmx2(String code) {
        for(AmxCategorie value : AmxCategorie.values()) {
            if(value.getCodeAmx2().equals(code)) {
                return value;
            }
        }

        return null;
    }

    public static AmxCategorie getEnumByCodeAmx3(String code) {
        for(AmxCategorie valeur : AmxCategorie.values()) {
            if(valeur.getCodeAmx3().equals(code)) {
                return valeur;
            }
        }

        return null;

    }

}
