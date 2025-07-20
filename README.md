

````markdown
# 🎓 EduNexus Backend — Intelligent Learning Engine Powered by Spring Boot

> An enterprise-grade backend system designed to revolutionize e-learning through smart assessments, seamless enrollments, secure user management, and blazing-fast APIs. Built to scale. Built to impress.

---

## 🧰 Tech Stack

| Layer         | Technologies Used                          |
|---------------|---------------------------------------------|
| **Language**  | Java 17                                     |
| **Framework** | Spring Boot, Spring MVC, Spring Security    |
| **ORM**       | Hibernate (JPA)                             |
| **Database**  | MySQL                                       |
| **Build Tool**| Maven (with Wrapper)                        |
| **IDE/Tools** | Eclipse, IntelliJ, Postman                  |
| **Versioning**| Git                                         |

---

## 🚀 Features at a Glance

- 🔐 **Role-Based Authentication** for users and admins  
- 📚 **Course Enrollment** system with validation  
- 🧪 **Test Management**: Create, take, and evaluate tests  
- 📊 **User Test Results** with API endpoints  
- ✉️ **Contact API** for feedback collection  
- 🌐 **CORS Configuration** for frontend integration  
- 🧼 **Custom Exception Handling** for cleaner response flow  

---

## 📁 Project Structure

<pre>
StudentLearningApp/
├── configuration/
│   ├── AdminSecureConfig.java       # Admin route protection
│   ├── CrosConfig.java              # CORS rules
│   └── SpringConfig.java            # General spring configuration
├── controller/
│   ├── UserController.java
│   ├── CourseController.java
│   ├── TestController.java
│   └── ContactController.java
├── dto/
│   ├── CourseRequest.java
│   ├── TestDto.java
│   ├── PasswordUpdateRequest.java
│   └── UserTestResultDto.java
├── entity/
│   ├── Users.java
│   ├── Course.java
│   ├── Enrollment.java
│   └── Test.java
├── repository/
│   ├── UserRepo.java
│   ├── CourseRepo.java
│   └── EnrollmentRepo.java
├── StudentLearningAppApplication.java
├── pom.xml
└── mvnw
</pre>

---

## ⚙️ How to Run It Locally

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/yourusername/EdunexusBackend-v2.git
cd EdunexusBackend-v2/StudentLearningApp
````

### 2️⃣ Configure the Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/edunexus
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
```

### 3️⃣ Start the Application

```bash
./mvnw spring-boot:run
```

✅ Now, your backend will be live at `http://localhost:8080/`

---

## ⚠️ Exception Handling and Edge Cases

* 🛑 **Invalid Login Attempts** → 401 responses with clear message
* 🔐 **Unauthorized Access** → Blocked with secure role check
* 🚫 **Non-existing Resource** (Courses/Tests) → Graceful error JSON
* 📌 **Validation Errors** → Clean DTO-based validation with messages

---

## ✨ Why This Project Stands Out

* 🎯 **Production-ready architecture**
* 📦 **Modular, testable code**
* 🔒 **Security-first development**
* 🔁 **Easily scalable to microservices**
* 🧱 **Real-world pattern: DTO → Entity → Repo → Controller**

---

## 🔮 Future Enhancements

* 📘 Swagger UI for live API docs
* 🔐 JWT Token Authentication
* 🧪 JUnit + Mockito-based test coverage
* 📊 Admin dashboards with metrics
* 📦 Docker containerization
* 🌍 Internationalization (i18n) support

---

## 👨‍💻 Developer Info

Built with ❤️ by **Raghvendra Singh**
🎖️ Grand Finalist - Viksit Bharat Hackathon | IIM Analytics Finalist
📍 Pune, Maharashtra
📧 [raghvendrarajivasingh07@gmail.com](mailto:raghvendrarajivasingh07@gmail.com)
🔗 [LinkedIn Profile](https://linkedin.com/in/Raghvendra-Singh04)

---

> ⚡ *“This backend isn’t just functional — it’s strategic, clean, and crafted to reflect real-world backend development maturity.”*

