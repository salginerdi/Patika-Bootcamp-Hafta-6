# JDBC ile Veritabanı Uygulaması

Bu Java projesi, MySQL veritabanına nasıl bağlanılacağını ve "employees" tablosundan veri nasıl çekileceğini göstermektedir.
JDBC (Java Veritabanı Bağlantısı) API'sini kullanarak bağlantı kurma, SQL sorgusu çalıştırma ve alınan veriyi görüntüleme işlemlerini gerçekleştirir.

### Gereksinimler

Bu projeyi çalıştırmadan önce aşağıdaki gereksinimleri kurduğunuzdan emin olun:

- Java Geliştirme Kiti (JDK)
- MySQL Veritabanı
- MySQL için JDBC Sürücüsü

### Kurulum

Bu depoyu yerel makinenize klonlayın:

git clone https://github.com/kullaniciadiniz/calisan-veritabani-baglantisi.git

Projeyi Java geliştirme ortamınızda açın (örneğin, IntelliJ IDEA, Eclipse).

MySQL JDBC sürücüsünü projenize dahil ettiğinizden emin olun.

### Yapılandırma
DBConnect.java dosyasında, MySQL veritabanı yapılandırmanızla uyuşacak şekilde aşağıdaki sabitleri düzenlemeniz gerekebilir:

-DB_URL: MySQL veritabanınızın URL'si.
-DB_USER: MySQL kullanıcı adınız.
-DB_PASSWORD: MySQL şifreniz.

### Kullanım
Java ortamınızda DBConnect sınıfını çalıştırın. Bu, MySQL veritabanına bağlanacak ve "employees" tablosundan veri çekecektir.

Alınan veri, her çalışanın ID, Adı, Pozisyonu ve Maaşı olarak konsolda görüntülenecektir.

-Örnek Çıktı

ID: 1
Adı: John Doe
Pozisyon: Müdür
Maaş: 60000
=============================================
ID: 2
Adı: Jane Smith
Pozisyon: Geliştirici
Maaş: 55000
=============================================
...

====================================================================================

# Database Application with JDBC
This Java project demonstrates how to connect to a MySQL database and retrieve data from the "employees" table. It uses the JDBC (Java Database Connectivity) API to establish a connection, execute an SQL query, and display the retrieved data.

### Prerequisites
Before running this project, make sure you have the following prerequisites installed:

Java Development Kit (JDK)
MySQL Database
JDBC Driver for MySQL
Installation
Clone this repository to your local machine:

git clone https://github.com/yourusername/employee-database-connection.git

Open the project in your Java development environment (e.g., IntelliJ IDEA, Eclipse).

Make sure to include the MySQL JDBC driver library in your project.

### Configuration
In the DBConnect.java file, you may need to modify the following constants to match your MySQL database setup:

-DB_URL: The URL of your MySQL database.
-DB_USER: Your MySQL username.
-DB_PASSWORD: Your MySQL password.

### Usage
Run the DBConnect class in your Java environment. It will connect to the MySQL database and retrieve data from the "employees" table.

The retrieved data will be displayed in the console, showing the ID, Name, Position, and Salary of each employee.

-Example Output

ID: 1
Name: John Doe
Position: Manager
Salary: 60000
=============================================
ID: 2
Name: Jane Smith
Position: Developer
Salary: 55000
=============================================
...
