# MVC SpringBoot

## The project follows MVC architecture
- databases used: Mysql
- endpoints: POST: load an employee record, GET: all data

### Project Requirements:

- maven
- mysql
- create petshop database

To get data
- open MySql Command line Client
- put the password in

### Mysql commands

        show databases;
        
        show tables;
        
        use petshop;
        
        SELECT * FROM vet_doctor; 
        
        delete FROM veterinary_doctor;

### Data to test the API

#### Employee

- GET: http://localhost:8080/v1/employee/all

- POST: http://localhost:8080/v1/veterinaryDoctors/new

            {
            	"veterinaryRegistryId": "1",
                "dateOfBirth": "2020-02-12",
                "gender": "male",
                "firstName": "Joe",
                "lastName": "Doe",
                "middleName": "Adam",
                "alias": "Dr.JDA",
                "employmentDate": "2020-02-12",
                "salary": "60000",
                "contact": {
                    "emailAddress": "joe.doe@hmrc.com"
                },
                "specialities": [
                    {
                        "specialities": "CARDIOLOGY"
                    }
                ],
                "qualificationDate": "2020-02-12"
            }     



- GET: http://localhost:8080//v1/veterinaryDoctors/id/1

- GET: http://localhost:8080/v1/speciality/id/1

#### Owner

- POST: http://localhost:8080/v1/owners/new

          {
              "firstName": "Cristian",
              "lastName": "Vladut",
              "middleName": "None",
              "alias": "Cr",
              "dateOfBirth": "2000-02-12",
              "gender": "male",
              "contact": {
                  "emailAddress": "joe.doe@hmrc.com"
              }
          }

- GET: http://localhost:8080/v1/owners/id/1

### To reset .gitignore
        git rm -r --cached .