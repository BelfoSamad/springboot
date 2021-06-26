package com.deveos.springboot.beans;

/**
 * Sometimes some enterprise applications needs some functionalities piloted by containers that
 * works regulary or periodically
 */
public class TimerServiceBean {

    //you can disable persistent timer service with persistent=false (doesn't survive stopping of container)

    //@Schedule(hour="6", dayOfMonth="1"): first day of each month at 6am
    //@Schedule(dayOfWeek="Mon-Fri", hour="22"): every monday/friday of each week at 10pm
    //@Schedule(hour = "22", minute = "30", dayOfWeek = "Fri"): every friday at 10:30pm
    //@Schedule(hour = "*", dayOfWeek = "1"): every hour of each monday
    //@Schedule(hour = "23", dayOfMonth = "Last Fri", month="*"): last friday of each month at 11pm
    //@Schedule(minute = "*/15", hour = "12/1"): every 15min starting of 12pm
}
