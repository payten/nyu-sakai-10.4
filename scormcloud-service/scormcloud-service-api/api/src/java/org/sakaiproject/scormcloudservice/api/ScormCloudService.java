package org.sakaiproject.scormcloudservice.api;

import javax.servlet.http.HttpServletRequest;

public interface ScormCloudService
{
    public String getScormPlayerUrl(String siteId, String externalId, String backurl) throws ScormRegistrationNotFoundException, ScormException;

    public void addCourse(String siteId, String externalId, String resourceId, String title, boolean graded) throws ScormException;

    public void updateCourse(String siteId, String externalId, String title, boolean graded) throws ScormException;

    public String addRegistration(String siteId, String externalId, String userId, String firstName, String lastName) throws ScormException;

    public void runImportProcessingRound() throws ScormException;

    public void runGradeSyncRound() throws ScormException;

    public void markCourseForGradeSync(String siteId, String externalId) throws ScormException;
}
