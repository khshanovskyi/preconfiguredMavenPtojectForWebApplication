# This is the preconfigured maven Web project.
This is the preconfigured maven Web project that contains all startup configurations for Bring ApplicationContext.

Steps:
> 1. Clone the project

> 2. Create in your **.m2** (Windows example of this folder *C:\Users\Pavlo_Khshanovskyi\.m2*) folder **setting.xml** file

> 3. Add to **setting.xml** ->
```
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">

<activeProfiles>
    <activeProfile>github</activeProfile>
</activeProfiles>

<profiles>
    <profile>
        <id>github</id>
        <repositories>
            <repository>
                <id>central</id>
                <url>https://repo1.maven.org/maven2</url>
            </repository>
            <repository>
                <id>github</id>
                <url>https://maven.pkg.github.com/maingroon/svydovets-bring</url>
                <snapshots>
                    <enabled>true</enabled>
                </snapshots>
            </repository>
        </repositories>
    </profile>
</profiles>

<servers>
    <server>
        <id>github</id>
        <username>your_github_email</username>
        <password>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</password>
    </server>
</servers>
</settings>             
``` 
> 4. Replace *your_github_email* in this file on your email from the GitHub account
> 5. Build the project.
> 6. Add Tomcat (or another server configuration) as on screenshots
> 7. Start your server