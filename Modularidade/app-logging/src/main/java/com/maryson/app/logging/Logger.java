package com.maryson.app.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static void info(String msg) {
        SimpleDateFormat sdf = new SimpleDateFormat("ss/MM/yyyy HH:mmm:ss");
        System.out.println("[INFO]" + sdf.format(new Date()) + " - " + msg);
    }
}
