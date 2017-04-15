/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webServices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Andrea
 */
@WebService(serviceName = "webServiceLogin")
public class webServiceLogin {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "acceso")
    public String acceso(@WebParam(name = "user") String user,@WebParam(name = "psw") String psw){
        String acceso;
        if((user.equals("Wasp"))&&(psw.equals("04rowan")))
        {
            acceso = "Ok";
        }else{
            acceso = "!OK";
        }
        return acceso;
    }
}
