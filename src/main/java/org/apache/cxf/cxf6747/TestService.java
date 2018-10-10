package org.apache.cxf.cxf6747;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "TestService", targetNamespace = "http://apache.org/cxf/cxf6747")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TestService {

	TestClass getObject();
	
}
