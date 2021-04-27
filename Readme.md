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

- Data to test the load API
            
            {
                "firstName": "edd",
                "lastName": "world",
                "middleName": "None",
                "alias": "Cr",
                "dateOfBirth": "2020-02-12",
                "gender": "nongender",
                "employmentDate": "2020-02-12",
                "salary": "14",
                "contactDetails": {
                    "emailAddress": "goshawk@gmail.com"
                },
                "veterinaryDoctors" :[ 
                	{
                	"vetId": "14",
                	"qualificationDate": "2020-02-12",
                	"speciality" : "CARDIOLOGY"
                	}
                ] 
            }
            
- Data to use for the employee relation

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
                "contactDetails": {
                    "emailAddress": "joe.doe@hmrc.com"
                },
                "qualificationDate": "2020-02-12"
            }
            
- Data to test the employee relation with speciality

### To reset .gitignore 
        git rm -r --cached .