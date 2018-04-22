# Kotlin sample: unit test in common module

## Problem: test run fails in IntelliJ IDEA 2018.1

1. Clone *master*
2. Open project and import gradle main module (auto import whole project)
3. Run `SampleTest` via context menu
4. Error: *No JDK specified*

Temporary fix:
* configure JDK as module SDK (instead of Kotlin SDK)
* however, any gradle-refresh will restore the old setting (Kotlin SDK)
