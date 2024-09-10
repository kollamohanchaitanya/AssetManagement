Expected Output
REST API Endpoints:

Asset Management:

GET /assets: Retrieve a list of all assets.
GET /assets/{id}: Retrieve a specific asset by ID.
POST /assets: Create a new asset.
PUT /assets/{id}: Update an existing asset.
DELETE /assets/{id}: Delete an asset.
Portfolio Management:

GET /portfolios: Retrieve a list of all portfolios.
GET /portfolios/{id}: Retrieve a specific portfolio by ID.
POST /portfolios: Create a new portfolio.
PUT /portfolios/{id}: Update an existing portfolio.
DELETE /portfolios/{id}: Delete a portfolio.
Transaction Management:

GET /transactions: Retrieve a list of all transactions.
GET /transactions/{id}: Retrieve a specific transaction by ID.
POST /transactions: Create a new transaction.
PUT /transactions/{id}: Update an existing transaction.
DELETE /transactions/{id}: Delete a transaction.
User Management:

GET /users: Retrieve a list of all users.
GET /users/{id}: Retrieve a specific user by ID.
POST /users: Create a new user.
PUT /users/{id}: Update an existing user.
DELETE /users/{id}: Delete a user.
Security:

JWT Authentication: The application uses JWT tokens to authenticate users. Requests to the API endpoints will need to include a valid JWT token in the Authorization header.
Database Initialization:

The data.sql file initializes the database with sample data. This might include pre-defined assets, portfolios, transactions, and users.
Unit Tests:

The AssetManagementApplicationTests.java file will contain unit tests that validate the functionality of your application. Running these tests will ensure that your controllers, services, and repositories work as expected.
Sample Data:

When the application starts, the database is populated with initial data from data.sql, allowing you to test the API endpoints with pre-defined data.
How to See the Output
Run the Application:

Use your IDE or command line to start the Spring Boot application. For example, if you're using Maven, you can run mvn spring-boot:run or use ./mvnw spring-boot:run if using the Maven Wrapper.
Access the API:

Use a tool like Postman or cURL to make HTTP requests to the endpoints. For instance, http://localhost:8080/assets will return a list of assets if the application is running on port 8080.
Check the Logs:

Review the application logs for any startup messages or errors. This will give you insights into how the application is running and whether it's correctly interacting with the database.
Run Tests:

Execute the unit tests to verify that all functionalities are working correctly. This can typically be done using your build tool's test command, like mvn test for Maven.
