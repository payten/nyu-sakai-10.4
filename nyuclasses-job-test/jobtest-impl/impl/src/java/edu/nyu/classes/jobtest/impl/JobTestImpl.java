package edu.nyu.classes.jobtest.impl;

import java.text.ParseException;

import org.quartz.Scheduler;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.CronTrigger;
import org.quartz.SchedulerException;

import org.sakaiproject.api.app.scheduler.JobBeanWrapper;
import org.sakaiproject.component.cover.ServerConfigurationService;;
import org.sakaiproject.api.app.scheduler.SchedulerManager;
import org.sakaiproject.component.cover.ComponentManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JobTestImpl {

    private static final Logger LOG = LoggerFactory.getLogger(JobTestImpl.class);

    String JOB_NAME = "NYUClassesTestJob";
    String JOB_GROUP = "NYUClassesTestJob";

    public void init()
    {
        SchedulerManager schedulerManager = (SchedulerManager) ComponentManager.get("org.sakaiproject.api.app.scheduler.SchedulerManager");

        Scheduler scheduler = schedulerManager.getScheduler();

        try {
            if (!scheduler.isStarted()) {
                LOG.info("Doing nothing because the scheduler isn't started");
                return;
            }

            // Delete any old instances of the job
            scheduler.deleteJob(JOB_NAME, JOB_GROUP);

            // Then reschedule it
            String cronTrigger = ServerConfigurationService.getString("nyu.test.job.cron", "0 */15 * * * ?");

            JobDetail detail = new JobDetail(JOB_NAME, JOB_GROUP, NYUClassesTestJob.class, false, false, false);

            detail.getJobDataMap().put(JobBeanWrapper.SPRING_BEAN_NAME, this.getClass().toString());

            Trigger trigger = new CronTrigger("NYUClassesTestJobTrigger", "NYUClassesTestJob", cronTrigger);

            scheduler.scheduleJob(detail, trigger);

            LOG.info("Scheduled Quartz test job!");

        } catch (SchedulerException e) {
            LOG.error("Error while scheduling Quartz test job", e);
        } catch (ParseException e) {
            LOG.error("Parse error when parsing cron expression", e);
        }
    }

    public void destroy()
    {
        LOG.info("Destroying Quartz test job");
    }
}
