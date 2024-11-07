package org.audit_logging.aspect;

import org.aspectj.lang.annotation.Pointcut;

/** Класс поинткатов для аспектов*/
public class PointCuts {
    @Pointcut("within(@org.audit_logging.annotations.Loggable *)")
    public void isAnnotateLoggable() {}

    @Pointcut("execution(* * (..))")
    public void isAllExecution() {}

    @Pointcut("isAnnotateLoggable() && execution(* save(..))")
    public void saveServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* findById(..))")
    public void anyFindByIdService(){}

    @Pointcut("isAnnotateLoggable() && execution(* update*(..))")
    public void updateUserServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* delete(..))")
    public void deleteServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* findAll())")
    public void findAllHabitsServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* getHabitsByStatus(..))")
    public void findHabitsByStatusForUserServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* getHabitsByDate(..))")
    public void findHabitsByDatesForUserServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* updateTitleByIdHabitByIdUser(..))")
    public void updateHabitTitleServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* updateDescriptionByIdHabitByIdUser(..))")
    public void updateHabitDescriptionServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* updateRepeatByIdHabitByIdUser(..))")
    public void updateHabitRepeatServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* updateStatusByIdHabitByIdUser(..))")
    public void updateHabitStatusServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* getHabitFulfillmentStatistics(..))")
    public void getHabitFulfillmentServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* percentSuccessHabits(..))")
    public void percentSuccessServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* reportHabit(..))")
    public void reportHabitServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* setDoneDates(..))")
    public void setDoneDatesHabitServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* switchOnOrOffPushNotification(..))")
    public void switchOnOrOffPushNotificationServiceMethod(){}

    @Pointcut("isAnnotateLoggable() && execution(* blockByIdUser(..))")
    public void blockUserServiceMethod(){}

}