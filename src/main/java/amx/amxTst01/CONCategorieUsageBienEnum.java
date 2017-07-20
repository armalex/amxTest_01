package amx.amxTst01;


public enum CONCategorieUsageBienEnum {
    PAS_DAB("000", "AUTRE", "Autre"),
    ADMINISTRATION("001", "ADMINISTRATION", "Administration"),
    ENSEIGNEMENT("002", "ENSEIGNEMENT", "Enseignement"),
    SOCIOCULTUREL("003", "SOCIOCULTUREL", "Socioculture"),
    SPORT("004", "SPORT", "Sport"),
    CULTE("005", "CULTE", "Culte"),
    HABITATION("006", "HABITATION", "Habitation"),
    INDUSTRIE_COMMERCE("007", "INDUSTRIE_COMMERCE", "Industrie"),
    SANITAIRE_SOCIAL("008", "SANITAIRE_SOCIAL", "Sanitaire"),
    GENIE_CIVIL("009", "?", "Génie civil"),
    AUTRE("010", "?", "Autre"),
    INFORMATIQUE("020", "?", "Informatique"),
    VOL_COFFRE("030", "?", "Vol coffre"),
    TRANSPORT_FONDS("040", "?", "Transport fonds"),
    BRIS_MACHINE("050", "?", "Bris machine"),
    T_RISQUES_EXPO("060", "?", "T. Risques Expo."),
    T_RISQUES_OBJET("070", "?", "T. Risques objet"),
    AUTRE2("080", "?", "Autre"),
    DIVERS("090", "?", "Divers"),
    ANNULATION("096", "?", "Annulation"),
    INTEMPERIES("097", "?", "Intempéries"),
    MORTALITE_ANIMAUX("098", "?", "Mortalité animaux"),
    BOIS_SUR_PIEDS("099", "?", "Bois sur pieds"),
    ANIMAUX("201", "ANIMAUX", "Animaux"),
    AUTRES_BIENS_IMMO("202", "AUTRES_BIENS_IMMO", "Autres biens immobiliers"),
    BATIMENT_EN_COURS_CONTRUC("203", "BATIMENT_EN_COURS_CONTRUC", "Bâtiment en cours de construction"),
    BATIMENT_VOUE_DEMOLITION("204", "BATIMENT_VOUE_DEMOLITION", "Bâtiment voué à démolition"),
    BOIS_FORETS("205", "BOIS_FORETS", "Bois et forêts"),
    BUREAU_SIEGE_SOCIAL("206", "BUREAU_SIEGE_SOCIAL", "Bureau – Siège social"),
    CHAPITEAU_STRUC_LEGERE("207", "CHAPITEAU_STRUC_LEGERE", "Chapiteau et structure légère"),
    COMMERCE("208", "COMMERCE", "Commerce"),
    ENTREPOT_STOCKAGE("209", "ENTREPOT_STOCKAGE", "Entrepôt - Stockage"),
    EXPOSITION("210", "EXPOSITION", "Exposition"),
    GROUPE_ANIMAUX("211", "GROUPE_ANIMAUX", "Groupe d'animaux"),
    INDUSTRIE_COMMERCE2("212", "?", "Industrie - Commerce"),
    INFORMATIQUE_MULTIMEDIA("213", "INFORMATIQUE_MULTIMEDIA", "Informatique, multimédia"),
    LOGEMENT("214", "LOGEMENT", "Logement"),
    LOYERS_IMPAYES("215", "LOYERS_IMPAYES", "Loyers impayés"),
    MACHINE_DAB("216", "MACHINE_DAB", "Machine"),
    MANIFESTATION("217", "MANIFESTATION", "Manifestation"),
    OBJET("218", "OBJET", "Objet"),
    OUVRA_ART_GEN_CIV("219", "OUVRA_ART_GEN_CIV", "Ouvrage d'art et génie civil"),
    PORT("220", "PORT", "Port"),
    PROTECTION_FINANCIERE("221", "PROTECTION_FINANCIERE", "Protection financière"),
    SANITAIRE_SOCIAL2("222", "?", "Sanitaire et social"),
    SEJOUR("223", "SEJOUR", "Séjour"),
    SERRE("224", "SERRE", "Serre"),
    TRANSPORT_VALEURS("225", "TRANSPORT_VALEURS", "Transport de valeurs"),
    VALEUR_COFFRE("226", "VALEUR_COFFRE", "Valeurs en coffre"),
    VALEUR_CONGELATEUR("227", "VALEUR_CONGELATEUR", "Valeur en chambre froide, congélateur"),
    BIENS_EXT("913", "BIENS_EXT", "Biens extérieurs");

    /**
     * Code REGIS.
     */
    private String codeREGIS;

    /**
     * Code PROSPER.
     */
    private String codePROSPER;

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
    private CONCategorieUsageBienEnum(String codeREGIS, String codePROSPER, String libelle) {
        this.libelle = libelle;
        this.codeREGIS = codeREGIS;
        this.codePROSPER = codePROSPER;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getCodeREGIS() {
        return codeREGIS;
    }

    public String getCodePROSPER() {
        return codePROSPER;
    }

    @Override
    public String toString() {
        return this.getLibelle();
    }

    public static CONCategorieUsageBienEnum getEnumByCodeREGIS(String code) {
        for(CONCategorieUsageBienEnum value : CONCategorieUsageBienEnum.values()) {
            if(value.getCodeREGIS().equals(code)) {
                return value;
            }
        }

        return null;
    }

    public static CONCategorieUsageBienEnum getEnumByCodePROSPER(String code) {
        for(CONCategorieUsageBienEnum value : CONCategorieUsageBienEnum.values()) {
            if(value.getCodePROSPER().equals(code)) {
                return value;
            }
        }

        return null;
    }

    public static CONCategorieUsageBienEnum getEnum(String chaine) {
        for(CONCategorieUsageBienEnum valeur : CONCategorieUsageBienEnum.values()) {
            if(valeur.getLibelle().equals(chaine)) {
                return valeur;
            }
        }

        return null;

    }

}
