# 🚀 Spring Boot + Jenkins CI/CD Pipeline

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=flat-square&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=flat-square&logo=apachemaven)
![Jenkins](https://img.shields.io/badge/Jenkins-CI%2FCD-blue?style=flat-square&logo=jenkins)
![GitHub](https://img.shields.io/badge/GitHub-Source%20Control-black?style=flat-square&logo=github)

> A complete CI/CD pipeline implementation integrating a Spring Boot REST application with Jenkins — automating the entire lifecycle from source control to deployment.

---

## 📌 Overview

This project demonstrates how to set up a real-world **CI/CD pipeline** using Jenkins and Spring Boot. Every push to GitHub automatically triggers Jenkins to clone the repository, build the application with Maven, and deploy the running JAR — with zero manual intervention.

**What gets automated:**
- Cloning the latest code from GitHub
- Building and packaging the application via Maven
- Running the Spring Boot application as a deployable JAR

---

## 🛠️ Tech Stack

| Technology | Purpose |
|-----------|---------|
| Java 17 | Runtime (LTS) |
| Spring Boot | REST application framework |
| Maven | Build & dependency management |
| Jenkins | CI/CD automation server |
| Git & GitHub | Source control & webhook triggers |

---

## 📂 Project Structure

```
SpringBoot-Jenkins/
│── src/
│   ├── main/
│   │   ├── java/          # Application source code
│   │   └── resources/     # Config files (application.properties)
│   └── test/              # Unit & integration tests
│
│── pom.xml                # Maven build configuration
│── Jenkinsfile            # Pipeline-as-code definition
│── README.md
```

---

## ⚙️ Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- Jenkins (local or remote)
- Git

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/imran-049-imran/SpringBoot-Jenkins.git
cd SpringBoot-Jenkins
```

### 2️⃣ Build the Project

```bash
mvn clean install
```

### 3️⃣ Run the Application

```bash
java -jar target/*.jar
```

The application starts at: `http://localhost:8080`

---

## 🤖 Jenkins Setup

### Configure the Pipeline

1. Open Jenkins → `http://localhost:8080`
2. Click **New Item** → select **Pipeline**
3. Under **Pipeline**, set **Definition** to `Pipeline script from SCM`
4. Set **SCM** to `Git` and enter the repo URL:
   ```
   https://github.com/imran-049-imran/SpringBoot-Jenkins.git
   ```
5. Set the **Script Path** to `Jenkinsfile`
6. Click **Save** → **Build Now**

---

## 📜 Jenkinsfile

The pipeline is defined as code and versioned alongside the application:

```groovy
pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/imran-049-imran/SpringBoot-Jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run') {
            steps {
                sh 'java -jar target/*.jar'
            }
        }
    }
}
```

### Pipeline Flow

```
GitHub Push → Jenkins Trigger → Clone Repo → Maven Build → Deploy JAR
```

---

## ✅ Features

- **Automated builds** — every commit triggers a full Maven build
- **Pipeline-as-code** — Jenkinsfile is version-controlled with the app
- **Reproducible environment** — `mvn clean install` ensures consistent artifacts
- **GitHub integration** — webhook-driven trigger on push events
- **Zero manual deployment** — from commit to running app, fully automated

---

## 🔭 Roadmap

- [ ] 🐳 Docker containerization
- [ ] ☸️ Kubernetes deployment
- [ ] 🧪 Automated test stage (JUnit / Mockito)
- [ ] ☁️ Cloud deployment (AWS / Azure)
- [ ] 📊 Jenkins build health dashboard

---

## 👨‍💻 Author

**Imran Ismail Attar**
- GitHub: [@imran-049-imran](https://github.com/imran-049-imran)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

> ⭐ If this project helped you understand CI/CD, consider giving it a star!
