# Gürkan Özdemir
[GitHub](https://github.com/Grkann/calisma_tekrar1.git)
[JDK](https://www.oracle.com/java/technologies/downloads/#jdk24-windows)
[Intellij Idea Community](https://www.jetbrains.com/idea/download/?section=windows)
[Git](https://git-scm.com/downloads/win)
[Java Tutorials](https://www.w3schools.com/java/default.asp)

# Git
```sh
git init
git add .
git commit -m "add message"
git push -u origin master

git clone https://github.com/Grkann/calisma_tekrar1.git
```

---
## Java Common Rules
```sh
Class isimleri PascalCase e göre yazılır.
Class isimlerini fiil olarak kullanmayız.
Class : Javada 1 tane public class vardır.(inner class haric.)
Class : Javada static class yoktur.(inner class haric.)

Paket isimleri: Küçük harflerle yazılır.
Paket isimleri: Fii olarak kullanmayız.
Paket ismi kısa net bir şekilde olmalıdır.
```
---





```sh
Java Core Information

Java case sensitive bir dildir.(Küçük büyük harfe duyarlı yüksek seviye bir dildir.)

```

## Maven Nedir ?
```sh 

```
---
### **1. Maven Nedir?**
Maven, Java projelerini oluşturmak, yönetmek ve otomatikleştirmek için kullanılan bir **build automation** (inşa otomasyonu) aracıdır. Apache tarafından geliştirilmiştir ve özellikle Java projelerinde bağımlılık yönetimi, derleme, test etme ve dağıtım süreçlerini kolaylaştırır. Maven, XML tabanlı bir yapılandırma dosyası olan `pom.xml` kullanarak projenin yapılandırmasını ve bağımlılıklarını yönetir.

**Maven’in Sağladıkları:**
- **Bağımlılık Yönetimi:** Projeye eklenmesi gereken kütüphaneleri otomatik olarak indirir.
- **Proje Yapılandırması:** Projeyi standart bir yapıda düzenler.
- **Otomatik Derleme:** Projeyi derler (`mvn compile`).
- **Test Çalıştırma:** JUnit ve TestNG gibi test araçlarıyla testleri çalıştırır (`mvn test`).
- **Paketleme:** Projeyi `jar` veya `war` formatında paketler (`mvn package`).
- **Dağıtım Yönetimi:** Uygulamayı uzak sunuculara veya depolara gönderir (`mvn deploy`).

---


## pom.xml Nedir ?
```sh 

```
### **2. `pom.xml` Nedir?**
`pom.xml` (**Project Object Model**) dosyası, Maven projelerinin merkezi yapılandırma dosyasıdır. Projenin bağımlılıklarını, sürüm bilgilerini, eklentilerini ve yapılandırmalarını içerir.

Örnek bir `pom.xml` dosyası:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>my-app</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>2.7.4</version>
        </dependency>
    </dependencies>
</project>
```
Bu dosya:
- Projenin kimliğini (`groupId`, `artifactId`, `version`)
- Bağımlılıklarını (`dependencies`)
- Yapılandırmalarını içerir.

---


## JDK Nedir ?
```sh 

```
### **3. JDK (Java Development Kit) Nedir?**
**JDK (Java Development Kit)**, Java ile uygulama geliştirmek için kullanılan geliştirme ortamıdır. İçerisinde:
- **JRE (Java Runtime Environment)** (Çalışma zamanı ortamı)
- **JVM (Java Virtual Machine)** (Java Sanal Makinesi)
- **Java Compiler (javac)** (Java derleyicisi)
- **Java Debugger (jdb)** (Hata ayıklayıcı)
- **Java API ve kütüphaneleri** bulunur.

JDK olmadan Java kodu yazılamaz ve çalıştırılamaz.
---


## JRE Nedir ?
```sh 

```
### **4. JRE (Java Runtime Environment) Nedir?**
**JRE (Java Runtime Environment)**, Java uygulamalarını çalıştırmak için gereken ortamdır. İçerisinde:
- **JVM (Java Virtual Machine)** bulunur.
- **Java Kütüphaneleri** içerir.
- **Çalışma zamanı dosyaları** bulunur.

Eğer sadece Java programlarını çalıştırmak istiyorsanız, JDK yerine sadece JRE yükleyebilirsiniz. Ancak, JRE **Java kodu yazmak veya derlemek için yeterli değildir**.
---



### **5. JVM (Java Virtual Machine) Nedir?**
**JVM (Java Virtual Machine)**, Java programlarını çalıştıran sanal bir makinedir. JVM sayesinde Java platform bağımsızdır çünkü Java kodu her işletim sisteminde çalışabilecek **bayt koduna** (`.class` dosyalarına) çevrilir.

JVM’in Görevleri:
- **Bayt kodunu çalıştırır.**
- **Bellek yönetimini yapar (Garbage Collection).**
- **Çoklu iş parçacığını (multithreading) destekler.**
- **Platform bağımsızlığı sağlar.**
---


## Compiler Nedir ?
```sh 

```
### **5. Compiler (Derleyici) Nedir?**
**Compiler (Derleyici)**, insan tarafından yazılan yüksek seviyeli programlama dillerini makine koduna veya bayt koduna dönüştüren bir programdır. Java’da derleyici `javac` olarak adlandırılır.

**Java'da Çalışma Süreci:**
1. **Java kodu yazılır:** `MyClass.java`
2. **Derleyici (`javac`) çalıştırılır:** `javac MyClass.java`
3. **Bayt kodu (`.class` dosyası) oluşturulur:** `MyClass.class`
4. **JVM bayt kodunu çalıştırır.**
---


## Intepreter Nedir ?
```sh 

```
### **7. Interpreter (Yorumlayıcı) Nedir?**
**Interpreter (Yorumlayıcı),** programın satır satır çalıştırılmasını sağlayan bir programdır.
Java’da **JVM içerisinde yer alan yorumlayıcı (interpreter)**, bayt kodlarını satır satır çalıştırır.

**Derleyici (Compiler) vs. Yorumlayıcı (Interpreter):**
- **Derleyici**: Tüm kodu derleyerek tek seferde çalıştırılabilir hale getirir.
- **Yorumlayıcı**: Kodu satır satır çalıştırır.

Java hem **derleyici (`javac`)** hem de **yorumlayıcı (JVM içinde)** kullanır.
---

### **8. Java Nedir?**
Java, **nesne yönelimli (OOP), platform bağımsız, güvenli, çok iş parçacıklı (multithreading) ve taşınabilir** bir programlama dilidir.

- **1995’te Sun Microsystems tarafından geliştirildi.**
- **"Bir kere yaz, her yerde çalıştır" (Write Once, Run Anywhere - WORA)** prensibiyle çalışır.
- **Mobil, web, masaüstü ve büyük ölçekli sistemlerde kullanılır.**
---

### **9. Java’nın Özellikleri Nelerdir?**
- **Platform Bağımsızdır.** (JVM sayesinde her yerde çalışır)
- **Nesne Yönelimli Programlama (OOP) Desteği** vardır.
- **Güvenlidir.** (Bellek yönetimi ve güvenlik mekanizmaları içerir)
- **Çok İş Parçacıklı (Multithreading)** çalışmayı destekler.
- **Otomatik Bellek Yönetimi (Garbage Collection)** yapar.
- **Dağıtık ve Ağ Tabanlı Uygulamaları Destekler.**
---

### **10. Data Types (Veri Tipleri) Nedir?**
Java'da değişkenlerin alabileceği veri türlerini ifade eder. İki ana kategoriye ayrılır:
1. **Primitive Types (İlkel Veri Tipleri)**
2. **Reference Types (Referans Tipleri)**
---

### **11. Primitive Types Nedir?**
Java'daki **ilkel veri tipleri (Primitive Types)** hafızada doğrudan değer saklayan basit veri türleridir.

| Veri Tipi  | Boyut | Varsayılan Değer | Aralık |
|------------|------|----------------|------------------|
| `byte`     | 1B  | 0              | -128 to 127 |
| `short`    | 2B  | 0              | -32,768 to 32,767 |
| `int`      | 4B  | 0              | -2^31 to 2^31-1 |
| `long`     | 8B  | 0L             | -2^63 to 2^63-1 |
| `float`    | 4B  | 0.0f           | ~7 basamak |
| `double`   | 8B  | 0.0d           | ~15 basamak |
| `char`     | 2B  | '\u0000'       | Unicode karakterler |
| `boolean`  | 1B  | `false`        | `true` veya `false` |
---

```sh
Java Core (Common Rules)
```



```sh
Java Core(Data Types)
```


```sh
Java Core
```


```sh
Java Core
```


```sh
Java Core
```

```sh
Java Core
```

