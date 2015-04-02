/**
 * 
 */
package com.shailendra.main;

/**
 * @author Shailendra
 *
 */

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface DemoWS{
 
	@WebMethod String getHelloWorldAsString(String name);
 
}