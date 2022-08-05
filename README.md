# This is the preconfigured maven Web project.
This is the preconfigured maven Web project that contains all startup configurations for Bring ApplicationContext.

## NOTE: THIS PROJECT IS WRITTEN ON JAVA 17

Steps:
> 1. Clone the project

> 2. Create in your **.m2** (Windows example of this folder *C:\Users\Pavlo_Khshanovskyi\.m2*) folder **setting.xml** file

<details>
<summary> screenshot: </summary> 

![Screenshot 2022-08-06 004753](https://user-images.githubusercontent.com/55089853/183218865-51f58f05-22dd-4a96-9237-8b114362eaeb.png)
</details>

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
        <password>bring_token</password>
    </server>
</servers>
</settings>             
``` 
> 4. Replace *your_github_email* in this file on your email from the GitHub account

> 5. [Contact Bring team and ask a token for downloading dependency](https://github.com/khshanovskyi/get_token/blob/main/README.md)

> 6. Replace *bring_token* on provided from Bring team.

> 7. Build the project.

> 8. Add Tomcat (or another server configuration) as on screenshots
<details>
<summary> screenshots: </summary> 

> ![tom-1](https://user-images.githubusercontent.com/55089853/183022183-ce323574-7062-4298-8818-11deddf7c9ae.png)
> ![Screenshot 2022-08-05 100956](https://user-images.githubusercontent.com/55089853/183022290-e0447ccf-72b7-470a-975e-34fad2d6f07c.png)
</details>

> 9. Start your server.