package org.apache.cxf.cxf6747;

import javax.xml.bind.annotation.XmlAttribute;

public class TestClass {

	@XmlAttribute
	private TestEnum enumField;
	
	TestClass() { }
	
	TestClass(TestEnum enumValue) {
		this.enumField = enumValue;
	}
	
}
