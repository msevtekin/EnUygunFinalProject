package variables;

import config.XmlFileParse;

public class Var {

    private Var() {

    }

    public static final String apiUrl = XmlFileParse.xmlFileParse("apiURL", "var.xml");
    //XMLFileParse class'ında tanımladıgımız xmlFileParse() metoduyla "var.xml" de ki tanımladığımız variable'ı çekeriz

}