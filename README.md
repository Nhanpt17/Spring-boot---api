# Spring-boot---API  
Build a Simple REST API  

## Setup  

### Prerequisites  
1. **IDE Recommendation**: Use IntelliJ IDEA. Ensure your IDE has the **Lombok** plugin installed.  
2. **Database**: The project uses **MySQL** as the database.  

### Configuration  
After downloading the project, update the database configuration in the `application.properties` file located at `src\main\resources`:  

1. Open the `application.properties` file.  
2. Update the following lines with your MySQL credentials:  
   ```properties
   spring.datasource.username=root  
   spring.datasource.password=yourpassword  
   ```  

---

## Instruction  

### Testing the API with Postman  

#### 1. **Get All Students**  
- **Method**: `GET`  
- **URL**: `http://localhost:8080/api/students`  

#### 2. **Get a Student by ID**  
- **Method**: `GET`  
- **URL**: `http://localhost:8080/api/students/{id}`  
  Replace `{id}` with the student's ID.  
  - **Example**: To get the student with ID `1`:  
    `http://localhost:8080/api/students/1`  

#### 3. **Add a New Student**  
- **Method**: `POST`  
- **URL**: `http://localhost:8080/api/students`  
- **Body**:  
  Go to **Body** -> **Raw** -> Select **JSON** and provide the student's details.  
  - **Example**:  
    ```json
    {
      "firstName": "Kula",
      "lastName": "Lumbua",
      "gender": "Male"
    }
    ```  

#### 4. **Update a Student**  
- **Method**: `PUT`  
- **URL**: `http://localhost:8080/api/students/{id}`  
  Replace `{id}` with the student's ID you want to update.  
- **Body**:  
  Provide the updated student details in **Body** -> **Raw** -> Select **JSON**.  
  - **Example**:  
    ```json
    {
      "firstName": "Kulaba",
      "lastName": "Lumbuasa",
      "gender": "Male"
    }
    ```  

#### 5. **Delete a Student**  
- **Method**: `DELETE`  
- **URL**: `http://localhost:8080/api/students/{id}`  
  Replace `{id}` with the student's ID you want to delete.  
  - **Example**: To delete the student with ID `1`:  
    `http://localhost:8080/api/students/1`  
