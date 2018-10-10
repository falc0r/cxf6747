package org.apache.cxf.cxf6747;

public class TestServiceImpl implements TestService {

	@Override
	public TestClass getObject() {
		return new TestClass(TestEnum.TWO);
	}

}
