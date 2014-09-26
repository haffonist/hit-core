/**
 * This software was developed at the National Institute of Standards and
 * Technology by employees of the Federal Government in the course of their
 * official duties. Pursuant to title 17 Section 105 of the United States Code
 * this software is not subject to copyright protection and is in the public
 * domain. This is an experimental system. NIST assumes no responsibility
 * whatsoever for its use by other parties, and makes no guarantees, expressed
 * or implied, about its quality, reliability, or any other characteristic. We
 * would appreciate acknowledgement if the software is used. This software can
 * be redistributed and/or modified freely provided that any derivative works
 * bear some notice that they are derived from it, and any modified versions
 * bear some notice that they have been modified.
 */
package gov.nist.healthcare.tools.core.models.soap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Harold Affo (NIST)
 * 
 */
public class SoapMessageElement implements Serializable {

	private static final long serialVersionUID = 1L;

	public static String DEFAULT_TYPE = "default";

	private SoapMessageElementData data;

	private String label;

	private List<SoapMessageElement> children;

	public SoapMessageElement() {
		this.data = null;
		this.children = null;
		this.label = "No defined";
	}

	public SoapMessageElement(SoapMessageElementData data) {
		this(data, null);
	}

	public SoapMessageElement(SoapMessageElementData data,
			SoapMessageElement parent) {
		this.data = data;
		this.children = new ArrayList<SoapMessageElement>();
		if (parent != null) {
			if (parent.getChildren() == null) {
				parent.setChildren(new ArrayList<SoapMessageElement>());
			}
			parent.getChildren().add(this);
		}
		label = data.getName();
	}

	public SoapMessageElement(SoapMessageElementData data, String label,
			SoapMessageElement parent) {
		this.data = data;
		this.children = new ArrayList<SoapMessageElement>();
		if (parent != null) {
			if (parent.getChildren() == null) {
				parent.setChildren(new ArrayList<SoapMessageElement>());
			}
			parent.getChildren().add(this);
		}
		this.label = label;
	}

	public SoapMessageElement(String type, SoapMessageElementData data,
			SoapMessageElement parent) {
		this(data, parent);
	}

	public SoapMessageElementData getData() {
		return this.data;
	}

	public void setData(SoapMessageElementData data) {
		this.data = data;
	}

	public List<SoapMessageElement> getChildren() {
		return this.children;
	}

	public void setChildren(List<SoapMessageElement> children) {
		this.children = children;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getChildCount() {
		return this.children != null ? this.children.size() : 0;
	}

	public boolean isLeaf() {
		if (this.children == null) {
			return true;
		}
		return this.children.size() == 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (this.data == null ? 0 : this.data.hashCode());
		return result;
	}

	@Override
	public String toString() {
		if (this.data != null) {
			return this.data.toString();
		}
		return "";
	}

	public SoapMessageElement getChild(int line) {
		List<SoapMessageElement> children = getChildren();
		for (SoapMessageElement node : children) {
			SoapMessageElementData data = node.getData();
			if (data.getStart().getLine() == line) {
				return node;
			}
		}
		return null;
	}
}
