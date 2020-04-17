/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.WebServiceRef;
import xml.XMLUtil.DocumentTransformer;

/**
 *
 * @author dumaclem
 */
public class TestCabinetInfirmierClient {

    /**
     * @param args the command line arguments
     */
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/CabinetInfirmierServer/CabinetInfirmier.wsdl")
    public static void main(String[] args) {
       System.out.println(getNomCabinet());
    }

    private static String getNomCabinet() {
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service service = new fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service();
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier port = service.getCabinetInfirmierPort();
        return port.getNomCabinet();
    }
    
}
