## Restaurant System Project

This system here is a system to be developed using OOP logic in Java to create this system for learning and reinforcing the foundation in project logic and structuring.

## Index

- [Technologies and Tools Used](#technologies-and-tools-used)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Installation and Configuration](#installation-and-configuration)
- [Project Execution](#project-execution)

## Technologies and Tools Used

<br>
<div style="display: inline_block" align="center">

<img width="100" src="https://skillicons.dev/icons?i=java">

</div>
<br>

- ***Language:*** Java

## Prerequisites

You need to ensure that your development environment is properly configured. Here are the main prerequisites:

<br>
<div style="display: inline_block" align="center">

<img width="100" src="https://skillicons.dev/icons?i=java">

</div>
<br>

- Java Development Kit (JDK): ***version 8*** or higher as ***JDK 17*** recommended by the documentation.

#### IDE (Integrated Development Environment):

<br>
<div style="display: inline_block" align="center">

<img width="100" src="https://skillicons.dev/icons?i=vscode">
<img width="100" src="https://skillicons.dev/icons?i=eclipse">
<img width="100" src="https://skillicons.dev/icons?i=idea">

</div>
<br>

 - ***IntelliJ IDEA*** (with integrated Spring Boot plugin).
 - ***Eclipse*** (with the Spring Tools Suite - STS plugin).
 - ***VS Code*** (with extensions for Java and Spring Boot)

## Installation and Configuration

1. **Clone the repository**:
```bash
git clone https://github.com/seu-repositorio/sistema-gerenciamento-escola.git
```
2. **Go to the APP folder and run the code main**
```java
public class App {
public static void main(String[] args) throws Exception {
System.out.println("Hello, World!");
}
}
```
## Creating commands to be able to execute the complete .jar and run the project

- 1️⃣ Create the META-INF folder inside out/
Run this command in PowerShell to create the required folder:

 ```powershell
New-Item -ItemType Directory -Path out\META-INF -Force
 ```
- 2️⃣ Create MANIFEST.MF correctly
Now create the MANIFEST.MF file in PowerShell with:

```powershell
Set-Content -Path out\META-INF\MANIFEST.MF -Value "Manifest-Version: 1.0`nMain-Class: App.App`n"

```

- 1️⃣ Create the target folder (if it doesn't already exist)

```powershell
New-Item -ItemType Directory -Path target -Force
```

- 2️⃣ Create the .jar directly in the target folder

```powershell
jar cfm target/Restaurant-Poo-Project.jar out/META-INF/MANIFEST.MF -C out .
````

- 4️⃣ Run the .jar
Test to see if it works:

```powershell
java -jar target/Restaurant-Poo-Project.jar
```