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
@WebService(serviceName = "webServiceCalculadora")
public class webServiceCalculadora {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "calculadora")
    public double calculadora(@WebParam(name = "num1")double num1,@WebParam(name = "num2") double num2, 
            @WebParam(name="operador")String operador){
        double resultado = 0;
            switch(operador)
            {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    resultado = num1 / num2;
                    break;
            }
        return resultado;
    }
    /*@WebMethod(operationName = "suma")
    public double suma(@WebParam(name = "num1") double num1,@WebParam(name = "num2") double num2){
        return num1+num2;
    }
    @WebMethod(operationName = "suma")
    public double resta(@WebParam(name = "num1") double num1,@WebParam(name = "num2") double num2){
        return num1-num2;
    }
    @WebMethod(operationName = "suma")
    public double multiplicacion(@WebParam(name = "num1") double num1,@WebParam(name = "num2") double num2){
        return num1*num2;
    }
    @WebMethod(operationName = "suma")
    public double division(@WebParam(name = "num1") double num1,@WebParam(name = "num2") double num2){
        return num1/num2;
    }*/
}
