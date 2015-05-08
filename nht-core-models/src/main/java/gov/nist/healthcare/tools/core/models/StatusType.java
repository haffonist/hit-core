//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.05 at 04:48:37 PM EDT 
//

package gov.nist.healthcare.tools.core.models;

public enum StatusType {

	ACTIVE("Active"), DRAFT("Draft"), SUPERCEDED("Superceded");
	private final String value;

	StatusType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static StatusType fromValue(String v) {
		for (StatusType c : StatusType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
