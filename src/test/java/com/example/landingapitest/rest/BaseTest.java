package com.example.landingapitest.rest;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    protected static ExtentReports extent;
    protected static ExtentTest test;

    @BeforeAll
    public static void setupReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @AfterAll
    public static void tearDownReport() {
        extent.flush();
    }
}
