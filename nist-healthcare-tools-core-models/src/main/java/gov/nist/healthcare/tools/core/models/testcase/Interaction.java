/**
 * This software was developed at the National Institute of Standards and Technology by employees
 * of the Federal Government in the course of their official duties. Pursuant to title 17 Section 105 of the
 * United States Code this software is not subject to copyright protection and is in the public domain.
 * This is an experimental system. NIST assumes no responsibility whatsoever for its use by other parties,
 * and makes no guarantees, expressed or implied, about its quality, reliability, or any other characteristic.
 * We would appreciate acknowledgement if the software is used. This software can be redistributed and/or
 * modified freely provided that any derivative works bear some notice that they are derived from it, and any
 * modified versions bear some notice that they have been modified.
 */
package gov.nist.healthcare.tools.core.models.testcase;

import gov.nist.healthcare.tools.core.models.actor.Actor;
import gov.nist.healthcare.tools.core.models.message.Message;
import gov.nist.healthcare.tools.core.models.validationcontext.ValidationContext;

public class Interaction {

	private String name;

	private String description;

	private Actor senderActor;

	private Actor responderActor;

	private Message message;

	private ValidationContext validationContext;

	public Interaction() {
		super();
		this.message = new Message();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public Actor getSenderActor() {
		return senderActor;
	}

	public void setSenderActor(Actor senderActor) {
		this.senderActor = senderActor;
	}

	public Actor getResponderActor() {
		return responderActor;
	}

	public void setResponderActor(Actor responderActor) {
		this.responderActor = responderActor;
	}

	public ValidationContext getValidationContext() {
		return validationContext;
	}

	public void setValidationContext(ValidationContext validationContext) {
		this.validationContext = validationContext;
	}

}