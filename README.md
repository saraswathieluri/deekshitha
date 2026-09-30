# StudentMVC

Java MVC + Servlet + JDBC + MySQL web application.

## Requirements
- JDK 17+
- Maven
- Apache Tomcat 10+
- MySQL
- Eclipse or IntelliJ/VS Code

## Database
Run `database.sql` in MySQL.

Default connection:
- URL: jdbc:mysql://localhost:3306/studentinfo
- User: root
- Password: empty

Edit `DBConnection.java` if your MySQL password is different.

## Run
1. Import as a Maven project.
2. Make sure MySQL is running.
3. Run `database.sql`.
4. Build with `mvn clean package`.
5. Deploy `target/StudentMVC.war` to Tomcat 10+.
6. Open: http://localhost:8080/StudentMVC/
