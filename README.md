# pwa
web project 

## Web service requests

- How to use the web service ?
    **{host_local ou host_distant}:{port}/{BASE_URL}/{TABLE}/{METHODE}**

- EXEMPLE :
1. local
    * http://localhost:8080/pwa/services/dailyReport/all
    * http://localhost:8080/pwa/services/dailyReport/add
    * http://localhost:8080/pwa/services/dailyReport/serialNumber/1
    * http://localhost:8080/pwa/services/dailyReport/delete/1
    
    * http://localhost:8080/pwa/services/automate/add
    * http://localhost:8080/pwa/services/automate/all
    * http://localhost:8080/pwa/services/automate/Check/serialNumber/1
    * http://localhost:8080/pwa/services/automate/serialNumber/1
    * http://localhost:8080/pwa/services/automate/delete/3
  

- METHODE
    * ***GET***

    | TABLE | GET                   | Description               | 
    | ----  | ----                  | ----                      |
    |dailyReport	| /all               | dailyReport list         |
    |dailyReport	| /{id}              |  dailyReport by id       |
    |dailyReport	| /serialNumber/{id} | dailyReport by serialNumber |
    |    	| ----                  | ----                      |
    |automate   	| /all                  | automate list              |
    |automate	| /serialNumber/{id}    | automate by serialNumber |
    |automate	| /Check/serialNumber/{id} | check if automate exist |
    
    * ***POST***

    | TABLE | POST                  | Description               | 
    | ----  | ----                  | ----                      |
    |dailyReport	| /add                 | add dailyReport `json` and `xml`  |
     |dailyReport	| /add/list                | add list of dailyReport `json` and `xml`  |
    |	            | ----                  | ----                      |
    |automate	| /add                 | add automate `json`  |
    |automate	| /add/list                 | add list of automate `json`  |
    
     
    * ***DELETE***

    | TABLE | DELETE                  | Description               | 
    | ----  | ----                  | ----                      |
    |dailyReport	| /delete/{id}         | delete dailyReport by id  |
    |automate   	| /delete/{serialNumber} | delete automate by serialNumber  |
    |dailyReport	| /delete/all         | delete all dailyReports  |
    |automate   	| /delete/all | delete all automates |
    |	            | ----                  | ----                      |

## EXECUTE the Web Service localy with the JAR file

0. Download jar/pwa-api-project-0.0.1-SNAPSHOT.jar
1. Instal and configure Mysql as followed
    * add user `pwa_user` avec pour mot de passe `pwa_pwd` 
     >GRANT ALL PRIVILEGES ON *.* TO 'pwa_user'@'localhost' IDENTIFIED BY 'pwa_pwd';
    * if you want you can create a database `pwa_db`
        - >sudo mysql -u pwa_user -p
        - >CREATE DATABASE pwa_db;
2. Instal JDK
3. Go on google and typed (execute a jar file on linux (or windows) ) or checkout the [help section ](#Help)
* java -jar Minecraft.jar (ubuntu)

## Help

* [Export jar](https://www.youtube.com/watch?v=qDTUYkaXAEc)
* [Execute jar Ubuntu](https://askubuntu.com/questions/101746/how-can-i-execute-a-jar-file-from-the-terminal)

* [google drive documentation](https://drive.google.com/drive/folders/1PR4mM98NHjPSkyEAsH8Las0ueLAN4RAo?usp=sharing)
