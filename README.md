# DemoBlazeTest
Automation tests of a website that was built for practicing test automation. There is a smoke test and different regression tests. 

This project is an automated smoke test for a website demoblaze.com. The project basically tests the core functions of the mentioned website – buying a device, signing up, and logging in.

For regression testing, I have written the following test cases:

• SNU-001 – Successful sign up on the website.

• SNU-002 - Creating a username that contains special character.

• SNU-003 - Trying to create an account without entering required data

• SNU-004 - Trying to create the account with the same username that has already been created.

• LGN-001 – Successful log in on the website.

• LGN-002 - Trying to log in without entering required data.

• LGN-003 - Trying to log in with username that has not been registered

I have also written a smoke end2end test where the user is buying a device and providing all the necessary info.

Scripting language is Java. I have used the following tools:

• IntelliJ IDEA Community Edition 2021.3.1. - https://www.jetbrains.com/idea/download/#section=windows

• Java Development Kit (JDK) 17.0.1. - https://www.oracle.com/java/technologies/downloads/#jdk17-windows

• Chrome driver 103.0.5060.53 - https://chromedriver.chromium.org/downloads - I have created a new directory named Resources and chrome driver was in that directory

• org.seleniumhq.selenium - https://mvnrepository.com/artifact/org.seleniumhq.selenium

• org.testng - https://mvnrepository.com/artifact/org.testng/testng

• org.apache.commons - https://mvnrepository.com/artifact/org.apache.commons
