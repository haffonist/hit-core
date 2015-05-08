//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.05 at 04:48:37 PM EDT 
//

package gov.nist.healthcare.tools.core.models;

import javax.xml.datatype.XMLGregorianCalendar;

public class TableLibrary implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	protected TableSet tableSet;
	protected NoValidation noValidation;
	protected String name;
	protected String organizationName;
	protected String tableLibraryVersion;
	protected StatusType status;
	protected String tableLibraryIdentifier;
	protected String description;
	protected String dateCreated;

	public TableLibrary() {
		super();
	}

	/**
	 * Gets the value of the tableSet property.
	 * 
	 * @return possible object is {@link TableSet }
	 * 
	 */
	public TableSet getTableSet() {
		return tableSet;
	}

	/**
	 * Sets the value of the tableSet property.
	 * 
	 * @param value
	 *            allowed object is {@link TableSet }
	 * 
	 */
	public void setTableSet(TableSet value) {
		this.tableSet = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the organizationName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrganizationName() {
		return organizationName;
	}

	/**
	 * Sets the value of the organizationName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOrganizationName(String value) {
		this.organizationName = value;
	}

	/**
	 * Gets the value of the tableLibraryVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTableLibraryVersion() {
		return tableLibraryVersion;
	}

	/**
	 * Sets the value of the tableLibraryVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTableLibraryVersion(String value) {
		this.tableLibraryVersion = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link StatusType }
	 * 
	 */
	public StatusType getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link StatusType }
	 * 
	 */
	public void setStatus(StatusType value) {
		this.status = value;
	}

	/**
	 * Gets the value of the tableLibraryIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTableLibraryIdentifier() {
		return tableLibraryIdentifier;
	}

	/**
	 * Sets the value of the tableLibraryIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTableLibraryIdentifier(String value) {
		this.tableLibraryIdentifier = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the dateCreated property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public String getDateCreated() {
		return dateCreated;
	}

	public NoValidation getNoValidation() {
		return noValidation;
	}

	public void setNoValidation(NoValidation noValidation) {
		this.noValidation = noValidation;
	}

}