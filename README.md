# Software and IDE Requirement and Installation details
1. Java 8+ I had used Java 15
2. IDE like STS I had used VSCODE and Added Extention
   ( you can add all extention from https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack)
   extention name a. Spring Boot Tools  b. Spring Initializr Java Support c. Spring Boot Dashboard
3. MYSQL for Database I had used MYSQL 8.0.3
4. SpringBoot Dependency 1. web Spring 2. Spring Data JPA 3. MYSQL Driver
5. Maven
   Note : try to have same version of software which i mention here so that it work smothly

# SETUP JAVA IN YOU MACHINE
step 1 : Download and Install Java Into your Machine URL : https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html
step 2 : Add JAVA_HOME AND SET ENVIRONMENT PATH for Java
step 3 : add variable_name JAVA_HOME and path somethink like C:\Program Files\Java\jdk-15.0.2
step 4 : in below section of the environment variable CLICK on path and add this : %JAVA_HOME%\bin
open terminal and type java --version you can see java version mean you have install correctly

# SETUP MAVEN HOME In YOUR Machine
Step 1 : Download and Install Maven 3.9.6 in your machine using URL : https://maven.apache.org/download.cgi
step 2 : put the Maven file on some location and then add maven bin path in environment variable
i.e Variable Name : MAVEN_HOME variable value : C:\Users\techfirdous\development\apache-maven-3.9.6-bin\apache-maven-3.9.6\bin and
 Variable Name : M2_HOME variable value : C:\Users\techfirdous\development\apache-maven-3.9.6-bin\apache-maven-3.9.6\bin (it may not needed)

# setup MYSQL Database 
step 1 : Install Mysql workbench 8.0.36 from https://dev.mysql.com/downloads/installer/
download this one Windows (x86, 32-bit), MSI Installer	8.0.36	285.3M	Dow
Step 2 : Install MYSQL by following the guideline mention in the following link
https://www.freecodecamp.org/news/how-to-install-mysql-workbench-on-windows/#:~:text=There%20are%20a%20lot%20of,completely%20free%2C%20by%20the%20way.

step 3 : setup mysql variable as mention above

# setup VSCODE to Develop SpringBoot Application
1. Install VSCOde https://code.visualstudio.com/
2. On Left Portion Click On Extension
3.  Search and Install  a. Spring Boot Tools  b. Spring Initializr Java Support c. Spring Boot Dashboard

# Other IDE
1. STS
2. Intellij
   

# test all thinks are Install correctly in your machine or not 
open CMD and tyep the following command and press enter one by one
1. java --version (if it show java version then your java install correctly)
2. echo %JAVA_HOME% (it should show you your javahome path like : C:\Program Files\Java\jdk-15.0.2)
3. echo %MAVEN_HOME% it should show you your maven path
4. re-check your environment variable has MYSQL path set similar to C:\Program Files\MySQL\MySQL Server 8.0\bin


# Create Your First Springboot Project (Boiler Plate springBoot Project)

Create Your Boiler Plate By Using any of these method
1. Using STS 
 Click on new -> project -> SpringBoot Starter
OR
 Using WEB
Open the URL in any browser https://start.spring.io/
OR
VSCode
To install, launch VS Code and from the Extensions view (Ctrl+Shift+X), search for vscode-spring-initializr . Once you have the extension installed, open the Command Palette (Ctrl+Shift+P) and type Spring Initializr to start generating a Maven or Gradle project and then follow the wizard.

2. Under Project Select Maven
3. Language : Java
4. Spring Boot : 3.2.2
5. Dependencies and these 3 dependency
   a.  web Spring
   b. Spring Data JPA
   c. MYSQL Driver

If you are using WEB then ZIP file will get Downloaded Extract it for IDE like STS,Intellij and VSCode it will save There.

Now Your Setup Is Done

   




 


