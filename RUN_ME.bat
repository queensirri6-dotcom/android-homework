@echo off
echo ================================================
echo        ANIMAL HIERARCHY - LAUNCHER
echo ================================================
echo.

REM --- Point to Android Studio bundled JDK ---
set JAVA_HOME=C:\Program Files\Android\Android Studio\jbr
set PATH=%JAVA_HOME%\bin;%PATH%

if not exist "%JAVA_HOME%\bin\java.exe" (
    echo ERROR: Java not found at %JAVA_HOME%
    echo Please check your Android Studio installation.
    pause
    exit /b 1
)

echo Building project...
call gradlew.bat jar
if %ERRORLEVEL% neq 0 (
    echo BUILD FAILED.
    pause
    exit /b 1
)

echo.
echo Running Animal Hierarchy Demo...
echo ================================================
echo.
"%JAVA_HOME%\bin\java.exe" -jar build\libs\AnimalHierarchy-1.0.0.jar
echo.
pause
