/**
 * 
 */
package org.sakaiproject.evaluation.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jimeng
 *
 */
public class EvalEmailProcessingData implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Long id;
	protected Long eauId;
	protected String userId;
	protected String groupId;
	protected Long emailTemplateId;
	protected Long evalId;
	protected Date evalDueDate;
	protected Long responseId;
	protected Byte processingStatus;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the eauId
	 */
	public Long getEauId() {
		return eauId;
	}
	/**
	 * @param eauId the eauId to set
	 */
	public void setEauId(Long eauId) {
		this.eauId = eauId;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the emailTemplateId
	 */
	public Long getEmailTemplateId() {
		return emailTemplateId;
	}
	/**
	 * @param emailTemplateId the emailTemplateId to set
	 */
	public void setEmailTemplateId(Long emailTemplateId) {
		this.emailTemplateId = emailTemplateId;
	}
	/**
	 * @return the evalDueDate
	 */
	public Date getEvalDueDate() {
		return evalDueDate;
	}
	/**
	 * @param evalDueDate the evalDueDate to set
	 */
	public void setEvalDueDate(Date evalDueDate) {
		this.evalDueDate = evalDueDate;
	}
	/**
	 * @return the groupId
	 */
	public String getGroupId() {
		return groupId;
	}
	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	/**
	 * @return the evalId
	 */
	public Long getEvalId() {
		return evalId;
	}
	/**
	 * @param evalId the evalId to set
	 */
	public void setEvalId(Long evalId) {
		this.evalId = evalId;
	}
	/**
	 * @return the responseId
	 */
	public Long getResponseId() {
		return responseId;
	}
	/**
	 * @param responseId the responseId to set
	 */
	public void setResponseId(Long responseId) {
		this.responseId = responseId;
	}
	/**
	 * @return the availableEmailStatus
	 */
	public Byte getProcessingStatus() {
		return processingStatus;
	}
	/**
	 * @param availableEmailStatus the availableEmailStatus to set
	 */
	public void setProcessingStatus(Byte processingStatus) {
		this.processingStatus = processingStatus;
	}
}
