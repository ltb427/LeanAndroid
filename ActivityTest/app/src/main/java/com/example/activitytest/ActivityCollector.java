package com.example.activitytest;

import android.app.Activity;

import java.util.ArrayList;

public class ActivityCollector
{
    private static ArrayList<Activity> activities;

    static
    {
        activities = new ArrayList<>();
    }

    public static void addActivity(Activity activity)
    {
        activities.add(activity);
    }
    public static void removeActivity(Activity activity)
    {
        activities.remove(activity);
    }
    public static void finishAll()
    {
        for (Activity activity : activities)
        {
            if (!activity.isFinishing())
            {
                activity.finish();
            }
        }
        activities.clear();
        android.os.Process.killProcess(android.os.Process.myPid());
    }

}
