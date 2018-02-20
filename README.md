# Spring_Api
Spring Boot Api with Mysql Database 


## Database Configuration 
create database example_db;



## Api ends point

**localhost:8087/demo/add** (post method)

{
  "user":{
    "email":"vicky123modi.com",
    "name":"vicky",
    "password":"vicky123"
  },
  "city":"surat",
  "contact":8401060120,
  "fname":"vicky",
  "lname":"modi"
}

**result** saved 

**localhost:8087/demo/all_detail** (get method)

**result** [
               {
                   "uid": 1,
                   "fname": "vicky",
                   "lname": "modi",
                   "city": "surat",
                   "contact": 8401060120,
                   "user": {
                       "id": 1,
                       "name": "vicky",
                       "email": "vicky123modi.com",
                       "password": "vicky123"
                   }
               }
           ]
           
**localhost:8087/demo/all** (get method)

**result** [
               {
                   "id": 1,
                   "name": "vicky",
                   "email": "vicky123modi.com",
                   "password": "vicky123"
               }
           ]
           
**localhost:8087/demo/add_language?language=java** (get method)

**result** saved

**localhost:8087/demo/all_language** (get method)

**result** [
               {
                   "lid": 1,
                   "lname": "java"
               }
           ]