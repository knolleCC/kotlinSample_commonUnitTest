# Kotlin sample: unit test in common module

## Problem 1: test run fails in IntelliJ IDEA 2018.1

1. Clone *common-test-fails-in-IDE*
2. Open project and import gradle main module (auto import whole project)
3. Run `SampleTest` via context menu
4. Error: *No JDK specified*

Temporary fix:
* Configure JDK as module SDK (instead of Kotlin SDK)
* However, any gradle-refresh will restore the old setting (Kotlin SDK)

## Problem 2: common test not runnable in IntelliJ IDEA 2018.1

1. Clone *common-test-not-runnable-in-IDE*
2. Open project and import gradle main module (auto import whole project)
3. Open context menu of `SampleTest`: no *run*-option available

Temporary fix:
* Add a test file to the JVM module (checkout *common-test-fails-in-IDE*)  
* Now the *run*-option is available for the JVM test file as well as the common test file
