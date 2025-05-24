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
## Java Common Rules ()
```sh 
Class isimleri PascalCase göre yazılır
Class isimleri: Fiil olarak kullanmayız (mak-mek)
Class : Java 1 tane public class vardır (inner class hariç)
Class : Java static class yoktur (inner class hariç)

Paket isimleri: Küçük harflerle yazılır.
Paket isimleri: fiil olarak kullanmayız (mak-mek)
Paket kısa net bir şekilde olması gerekiyor.

Javada Her biten kelime ; ile bitirmek zorundayız.
```
---


## Java Core Information
```sh 
Java case sensitive bir dildir. (Küçük büyük harfe duyarlı yüksek seviyede bir dildir.)
```
---

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

### **12. Wrapper Types Nedir?**
**Wrapper Class’lar,** primitive veri tiplerinin nesne olarak kullanılmasını sağlar.

Örneğin:
```java
int num = 10;
Integer obj = Integer.valueOf(num);
```

**Primitive -> Wrapper Dönüşümleri:**
- **`int -> Integer`**
- **`double -> Double`**
- **`char -> Character`**
- **`boolean -> Boolean`**

Wrapper class’lar **Java Collections API’lerinde** kullanılır çünkü koleksiyonlar yalnızca nesne saklayabilir.


## Java Core (Primitive Types)
```sh 

```
---

**`javac` (Java Compiler) ve bayt kodu (bytecode) süreci**, derleme süresi ve oluşturulan `.class` dosyasının boyutunu etkileyebilir. Aşağıda bunun nasıl gerçekleştiğine dair detaylı bir açıklama bulabilirsiniz.
---

## **1. `javac` Derleyici ve Derleme Süresi**
### **Derleme Süresini Etkileyen Faktörler**
- **Kodun Karmaşıklığı:**
    - Daha fazla **sınıf, metod ve kod satırı** içeren projeler daha uzun sürede derlenir.
    - Büyük projelerde, bağımlılıklar ve `import` edilen kütüphaneler derleme süresini uzatabilir.

- **Optimize Edilmiş Derleme (`javac` Seçenekleri)**:
    - **Incremental Compilation (Artımlı Derleme):**
        - Eğer sadece değişiklik yapılan sınıflar derlenirse, `javac` süresi kısalır.
    - **Hata Ayıklama Seçenekleri (`-g:none`)**:
        - `javac -g:none` komutu hata ayıklama bilgilerini içermeyen bir bytecode oluşturur ve derleme süresini kısaltabilir.
    - **Çoklu İş Parçacığı (Multithreading) Kullanımı:**
        - Büyük projelerde **Gradle** gibi derleme sistemleri çoklu iş parçacığı desteği sağlar, böylece derleme süresi azalır.

- **Donanım ve JVM Yapılandırması:**
    - Daha hızlı CPU ve SSD kullanan sistemlerde derleme süresi düşer.
    - Yetersiz RAM veya düşük işlem gücü derleme süresini artırır.

---

## **2. Bayt Kodu (Bytecode) ve Dosya Boyutu**
**Bytecode,** `javac` tarafından üretilen **platformdan bağımsız bir ara koddur** ve `.class` dosyalarında saklanır.

### **Bytecode Boyutunu Etkileyen Faktörler**
1. **Kodun İçeriği ve Karmaşıklığı:**
    - Uzun metotlar, fazla satır kod ve daha fazla `class` tanımlaması dosya boyutunu artırır.

2. **Yerel Değişkenler ve Sabit Havuzu (Constant Pool):**
    - Java’nın **String Constant Pool** ve diğer sabit değişkenleri yönetme mekanizması, **fazla sayıda string veya sabit tanımı içeren** kodlarda `.class` dosyasının boyutunu artırabilir.

3. **Kullanılan Optimizasyonlar:**
    - **JVM Optimizasyonları:**
        - JVM, bayt kodunu çalıştırırken **Just-In-Time (JIT) Compiler** gibi tekniklerle optimizasyon yapar.
    - **Inline Kod Kullanımı:**
        - `final` ve `static` değişkenlerin derleme zamanında yerine konulması, bytecode boyutunu artırabilir.

4. **Lombok, Annotation Processing ve Kütüphaneler:**
    - **Lombok, Spring gibi kütüphaneler** **otomatik kod üretme (code generation)** yapıyorsa, `.class` dosya boyutunu artırabilir.
    - **Annotation Processing**, derleme zamanında ek kodlar üreterek dosya boyutunu büyütebilir.

5. **Obfuscation (Kod Gizleme) ve Minifikasyon:**
    - Eğer kod **ProGuard veya R8 gibi optimizasyon araçlarıyla küçültülürse**, bytecode dosya boyutu azalır.
    - **Android projelerinde R8 ve ProGuard kullanımı**, bytecode boyutunu küçültmek için yaygın bir tekniktir.

---

## **3. Örnek Bir Kodun Derleme Süresi ve Bytecode Boyutu Üzerindeki Etkisi**
Aşağıdaki iki kodu karşılaştıralım:

### **Kod 1 – Basit Java Kodu**
```java
public class SimpleClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
- **Derleme Süresi:** Çok kısa (~milisaniyeler)
- **Bytecode Boyutu:** Küçük (~1-2 KB)

---

### **Kod 2 – Daha Büyük ve Karmaşık Kod**
```java
import java.util.ArrayList;

public class ComplexClass {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(i);
        }
        System.out.println(numbers.size());
    }
}
```
- **Derleme Süresi:** Daha uzun (~milisaniyeler ile saniyeler arasında)
- **Bytecode Boyutu:** Daha büyük (~10-20 KB)

---

## **4. Sonuç**
- **Kodun karmaşıklığı ve kullanılan yapılar hem derleme süresini hem de bayt kodunun boyutunu etkiler.**
- **Optimize edilmiş derleme (`javac -g:none`, ProGuard gibi araçlar) bytecode boyutunu azaltabilir.**
- **Büyük projelerde derleme süresi donanıma ve çoklu iş parçacığı desteğine bağlı olarak değişebilir.**
- **Fazla sayıda sınıf, uzun metotlar ve büyük sabit havuzu derleme süresini ve bytecode boyutunu artırır.**

**Özet:** Daha fazla kod satırı, büyük sınıflar, fazladan kütüphane kullanımı ve karmaşık yapıların kullanımı hem derleme süresini uzatır hem de `.class` dosyalarının boyutunu artırır.


## Java Common Rules
```sh 

```
---

### **Java Değişken İsimlendirme Kuralları ve En İyi Uygulamalar**
Java'da değişken isimlendirme kuralları **sözdizimsel (syntax)** kurallar ve **en iyi uygulamalar (best practices)** olarak ikiye ayrılır. Sözdizim kurallarına uyulmazsa derleme hatası alınır, en iyi uygulamalara uyulmaması ise okunabilirliği ve bakımı zorlaştırır.
---

## **1. Java'da Değişken İsimlendirme Kuralları (Syntax Kuralları)**
Java'da değişken isimlendirme aşağıdaki zorunlu kurallara tabidir:

### ✅ **Geçerli Değişken İsimlendirme Kuralları**
1. **Alfabede yer alan harfler (`a-z`, `A-Z`) kullanılabilir.**
2. **Rakamlar (`0-9`) kullanılabilir, ancak değişken ismi rakamla başlayamaz.**
3. **Alt çizgi `_` ve dolar işareti `$` kullanılabilir.**
4. **Java anahtar kelimeleri (reserved words) değişken adı olarak kullanılamaz.**  
   Örneğin, `int`, `class`, `static`, `for`, `if` gibi kelimeler değişken adı olamaz.

### ❌ **Geçersiz Değişken İsimlendirme Örnekleri**
| **Geçersiz Değişken** | **Hata Nedeni** |
|------------------------|-----------------|
| `1number`             | Rakamla başlayamaz |
| `int`                 | Java anahtar kelimesidir |
| `first-name`          | `-` işareti kullanılamaz |
| `@value`              | `@` özel karakteri kullanılamaz |
| `my variable`         | Boşluk içeremez |

---

## **2. Java Değişken İsimlendirme En İyi Uygulamaları (Best Practices)**
Geçerli değişken adları derleme hatası vermez, ancak bazı yazım standartlarına uyulması okunabilirliği artırır. En iyi uygulamalar şunlardır:

### ✅ **1. Camel Case Kullanımı (Önerilir)**
Java'da değişkenler için **camelCase** kullanılır:
- İlk kelime **küçük harfle başlar**, sonraki kelimeler **büyük harfle başlar**.

**Örnek:**
```java
int studentAge;
double accountBalance;
String firstName;
boolean isActive;
```

### ✅ **2. Anlamlı ve Açıklayıcı İsimler Seçin**
- Kısa ve anlamsız değişken adlarından kaçının.
- Değişkenin ne yaptığını veya hangi veriyi sakladığını anlatan isimler kullanın.

❌ Kötü Örnek:
```java
int x;
double y;
```

✅ İyi Örnek:
```java
int studentCount;
double totalSalary;
```

---

### ✅ **3. Değişken Adları Küçük Harfle Başlamalıdır**
- **Java'da değişkenler küçük harfle başlar**, ardından gelen kelimeler büyük harfle devam eder.

❌ Kötü Örnek:
```java
int StudentCount;
```
✅ İyi Örnek:
```java
int studentCount;
```

---

### ✅ **4. Sabit Değerler (Constants) İçin `UPPER_CASE` Kullanılmalı**
- `final` değişkenler **büyük harf** ve **alt çizgi (`_`)** ile yazılmalıdır.

✅ **İyi Örnek (Sabitler için)**:
```java
final double PI = 3.14159;
final int MAX_USERS = 100;
```

---

### ✅ **5. Boşluk ve Özel Karakterler Kullanılmamalıdır**
Değişken isimlerinde **boşluk (space) veya özel karakterler (`@`, `#`, `!`, `-`, `%`)** kullanılamaz.

❌ Geçersiz:
```java
int my variable;
String first-name;
```

✅ Geçerli:
```java
int myVariable;
String firstName;
```

---

### ✅ **6. `_` ve `$` Kullanımı (Genellikle Önerilmez)**
- **`_`** ve **`$`** kullanılabilir, ancak **genellikle değişken isimlerinde kullanılmaz**.
- **Özel durumlar:**
    - `_` genellikle **sabit değerlerde** (`final static`) kullanılır.
    - `$` genellikle **otomatik üretilen kodlarda** kullanılır (örneğin, Java'nın iç mekanizmalarında).

✅ Geçerli:
```java
String _privateVar;  // Genellikle kaçınılır
String $generatedCode;  // Kullanılabilir ama önerilmez
```

---

## **3. Özet**
| **Kural**                           | **Örnek (✅ Doğru)** | **Örnek (❌ Yanlış)** |
|--------------------------------------|---------------------|---------------------|
| **Harf, rakam, `_`, `$` kullanılabilir** | `age`, `userName`, `account_balance` | `user-name`, `1stName`, `my var` |
| **Rakamla başlayamaz**               | `name1`            | `1name` |
| **Anahtar kelimeler kullanılamaz**    | `totalAmount`      | `class`, `int` |
| **Camel case kullanılmalı**          | `studentCount`     | `Studentcount`, `student_count` |
| **Sabit değişkenler büyük harfle yazılmalı** | `MAX_USERS`, `PI`  | `MaxUsers`, `piValue` |
| **Boşluk içeremez**                   | `fullName`         | `full name` |

---

## **4. Örnek Kullanımlar**
### ✅ **İyi Uygulama Örnekleri**
```java
public class NamingExample {
    public static void main(String[] args) {
        int studentCount = 25;
        double accountBalance = 1050.75;
        final double PI = 3.14159;
        boolean isAvailable = true;

        System.out.println("Student Count: " + studentCount);
        System.out.println("Account Balance: $" + accountBalance);
        System.out.println("PI: " + PI);
        System.out.println("Available: " + isAvailable);
    }
}
```
---

### **Sonuç**
- Java değişken isimlendirme kurallarına uymak kodun **okunabilirliğini, bakımını ve standartlarını artırır**.
- **Camel Case** kullanımı önerilir: `myVariable`
- **Sabitler (`final`) büyük harfle yazılır**: `MAX_VALUE`
- **Değişken isimleri anlamlı olmalı**: `userName`, `totalAmount`
- **Java anahtar kelimeleri değişken adı olarak kullanılamaz**.

Bu kurallara uymak, kodunuzu daha **anlaşılır, düzenli ve sürdürülebilir** hale getirecektir. 🚀


## Primitive Types
```sh 

```
---

# **Java'da Primitive Type (İlkel Veri Tipleri) - Detaylı Açıklama**

Java'da **Primitive Types (İlkel Veri Tipleri)**, temel ve hafif veri tipleridir. Java'nın **hafıza yönetimi**, **hızlı işlem yapabilme** ve **düşük bellek tüketimi** sağlaması için kullanılırlar. Primitive türler, doğrudan bellekte saklanır ve nesne (`Object`) değildirler.

Java’da **8 adet** primitive type vardır:
- **Tam sayı tipleri:** `byte`, `short`, `int`, `long`
- **Ondalıklı sayılar:** `float`, `double`
- **Karakter tipi:** `char`
- **Mantıksal tip:** `boolean`

---

## **1. Java'da Primitive Veri Tiplerinin Genel Özellikleri**
1. **Nesne Değildir:**
    - Primitive değişkenler doğrudan bellekte saklanır.
    - `Integer`, `Double` gibi **Wrapper Class’lar** nesne iken, `int`, `double` gibi **primitive türler** nesne değildir.

2. **Daha Verimlidir:**
    - Nesne yerine doğrudan hafızada saklandıkları için işlemler daha hızlı gerçekleştirilir.
    - Örneğin, `int` yerine `Integer` kullanılırsa **heap bellekte fazladan bir nesne oluşur**.

3. **Varsayılan Değerleri Vardır:**
    - Primitive değişkenler **başlangıç değerleriyle** başlar (örneğin `int` için `0`, `boolean` için `false`).

4. **Değer Tutarlar, Referans Değil:**
    - Primitive türler **değer bazlıdır**, yani doğrudan değişkenin içinde tutulur.
    - `int x = 10;` yazıldığında, `x` değişkeninin içinde `10` değeri saklanır.

---

# **2. Java Primitive Veri Tipleri**
Aşağıda **Java'nın 8 primitive veri tipi** detaylı bir şekilde açıklanmaktadır.

## **A. Tam Sayı Türleri (Integer Types)**
Bu veri tipleri **ondalıklı olmayan** sayıları saklamak için kullanılır.

| **Tip**    | **Boyut** | **Aralık**                 | **Varsayılan Değer** |
|------------|---------|---------------------------|-----------------|
| `byte`     | 1 byte  | -128 to 127               | 0               |
| `short`    | 2 byte  | -32,768 to 32,767         | 0               |
| `int`      | 4 byte  | -2³¹ to (2³¹-1)           | 0               |
| `long`     | 8 byte  | -2⁶³ to (2⁶³-1)           | 0L              |

### **1. `byte` (1 Byte - Küçük Tam Sayılar)**
- **Bellek tasarrufu** sağlamak için kullanılır.
- **Sık kullanılan küçük değerler** için uygundur.
- Örneğin **100 kişilik öğrenci listesi** tutarken kullanışlıdır.

```java
byte smallNumber = 100;
byte minByte = -128;
byte maxByte = 127;
```

### **2. `short` (2 Byte - Orta Büyüklükte Tam Sayılar)**
- `byte`'tan büyük, `int`'ten küçük değerler için kullanılır.
- **Bellek kullanımını optimize etmek** için uygundur.

```java
short shortNumber = 32000;
short minShort = -32768;
short maxShort = 32767;
```

### **3. `int` (4 Byte - Standart Tam Sayılar)**
- Java'da **en çok kullanılan** tam sayı tipidir.
- Varsayılan olarak **tamsayı değerleri `int` türündedir**.

```java
int myAge = 25;
int totalUsers = 500000;
int minInt = -2147483648;
int maxInt = 2147483647;
```

### **4. `long` (8 Byte - Büyük Tam Sayılar)**
- Büyük sayılar için kullanılır.
- Sayının sonuna **`L` harfi** eklenmelidir (`long number = 10000000000L;`).

```java
long population = 7800000000L; // Dünya nüfusu
long distanceToSun = 149600000000L; // Güneşe olan mesafe (km)
```

---

## **B. Ondalıklı Sayılar (Floating Point Types)**
Ondalıklı sayılar için kullanılan **kayan nokta tipleridir**.

| **Tip**    | **Boyut** | **Yaklaşık Hassasiyet** | **Varsayılan Değer** |
|------------|---------|---------------------|-----------------|
| `float`    | 4 byte  | ~7 basamak          | 0.0f            |
| `double`   | 8 byte  | ~15 basamak         | 0.0d            |

### **1. `float` (4 Byte - Daha Az Hassas)**
- Daha az yer kaplar ama **kesinlik kaybı olabilir**.
- Sayının sonuna **`f` eklenmelidir** (`float pi = 3.14f;`).

```java
float pi = 3.14159f;
float gravity = 9.81f;
```

### **2. `double` (8 Byte - Daha Hassas)**
- **Hassas matematiksel işlemler** için kullanılır.
- **Varsayılan ondalıklı veri tipidir.**

```java
double precisePi = 3.141592653589793;
double speedOfLight = 299792458.0;
```

---

## **C. `char` (Karakter Tipi)**
- **Tek bir karakter saklar.**
- **Unicode destekler**, yani her dili ve sembolü içerebilir.

```java
char letter = 'A';
char digit = '5';
char symbol = '@';
char smiley = '\u263A'; // ☺ Unicode karakter
```

---

## **D. `boolean` (Mantıksal Veri Tipi)**
- **İki olası değer alır:** `true` veya `false`
- **Kontrol yapılarında (if, while, for)** yaygın kullanılır.

```java
boolean isJavaFun = true;
boolean isRaining = false;
```

---

# **3. Primitive Türler İçin Varsayılan Değerler**
Java'da bir primitive değişken **başlangıç değeri atanmazsa**, şu varsayılan değerleri alır:

| **Veri Tipi** | **Varsayılan Değer** |
|--------------|-----------------|
| `byte`       | 0               |
| `short`      | 0               |
| `int`        | 0               |
| `long`       | 0L              |
| `float`      | 0.0f            |
| `double`     | 0.0d            |
| `char`       | '\u0000' (Boş karakter) |
| `boolean`    | false           |

---

# **4. Primitive ve Wrapper Class Arasındaki Fark**
Java, primitive türlerin nesne olarak kullanılmasını sağlayan **Wrapper Class’ları** içerir.

| **Primitive Type** | **Wrapper Class** |
|-------------------|-----------------|
| `byte`           | `Byte`           |
| `short`          | `Short`          |
| `int`            | `Integer`        |
| `long`           | `Long`           |
| `float`          | `Float`          |
| `double`         | `Double`         |
| `char`           | `Character`      |
| `boolean`        | `Boolean`        |

Örneğin:
```java
int x = 10;
Integer y = Integer.valueOf(x); // Primitive -> Wrapper (Boxing)
int z = y.intValue(); // Wrapper -> Primitive (Unboxing)
```

---


## Primitive type - Wrapper Type
```sh 

```
---
Java'da **primitive types** (ilkel türler) ve **wrapper types** (sarmalayıcı türler) arasındaki farkları detaylı bir şekilde inceleyelim.

---

## 1. **Primitive Type ve Wrapper Type Nedir?**
- **Primitive Types**: Java'daki en temel veri türleridir. Bellekte doğrudan değerleri saklarlar ve **hafıza açısından daha verimli** çalışırlar.
- **Wrapper Types**: Primitive türlerin nesne (object) olarak kullanılabilmesini sağlayan Java sınıflarıdır. Java'da **koleksiyonlar (List, Set, Map gibi)** nesnelerle çalıştığından, primitive türlerin nesne versiyonları (wrapper types) kullanılır.

---

## 2. **Primitive Types ve Wrapper Types Karşılaştırması**
| **Özellik**            | **Primitive Types**         | **Wrapper Types**          |
|----------------------|------------------------|------------------------|
| **Tanım**            | Doğrudan değeri saklayan türlerdir. | Primitive türleri sarmalayan sınıflardır. |
| **Hafıza Kullanımı**  | Daha az bellek kullanır, daha verimlidir. | Daha fazla bellek tüketir (ekstra nesne oluşturur). |
| **Depolama**         | Stack bellekte saklanır. | Heap bellekte saklanır (Nesne olarak oluşturulduğu için). |
| **Değer Tipi**       | Değer (value) tipindedir. | Referans (object) tipindedir. |
| **Null Olabilir mi?** | **Hayır** (null olamaz). | **Evet** (null olabilir). |
| **Varsayılan Değer**  | int → 0, double → 0.0, boolean → false vb. | null (eğer nesne oluşturulmamışsa). |
| **Nesne Davranışı**  | Nesne değildir, direkt hesaplama yapar. | Nesnedir, metodları vardır. |
| **Koleksiyonlarda Kullanım** | **Doğrudan kullanılamaz** (List<int> gibi bir şey yazamayız). | **Kullanılabilir** (List<Integer> mümkündür). |
| **Dönüştürme İşlemi** | Boxing & Unboxing gerektirir. | Boxing & Unboxing ile primitive türlere dönüşebilir. |

---

## 3. **Primitive Türler ve Karşılık Gelen Wrapper Türler**
| **Primitive Type** | **Wrapper Class** |
|-------------------|-----------------|
| `byte`           | `Byte`          |
| `short`          | `Short`         |
| `int`            | `Integer`       |
| `long`           | `Long`          |
| `float`          | `Float`         |
| `double`         | `Double`        |
| `char`           | `Character`     |
| `boolean`        | `Boolean`       |

---

## 4. **Örneklerle Açıklamalar**

### 4.1 **Primitive Type Kullanımı**
```java
public class PrimitiveExample {
    public static void main(String[] args) {
        int x = 10;
        double y = 20.5;
        boolean isJavaFun = true;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Java eğlenceli mi? " + isJavaFun);
    }
}
```
📌 **Burada `x`, `y` ve `isJavaFun` değişkenleri doğrudan bellekte saklanır, nesne oluşturulmaz.**

---

### 4.2 **Wrapper Type Kullanımı**
```java
public class WrapperExample {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(10);
        Double y = Double.valueOf(20.5);
        Boolean isJavaFun = Boolean.TRUE; // veya new Boolean(true) (Eski kullanım)

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Java eğlenceli mi? " + isJavaFun);
    }
}
```
📌 **Burada `x`, `y` ve `isJavaFun` nesne olarak saklanır, heap bellekte yer kaplar.**

---

## 5. **Autoboxing ve Unboxing (Primitive ile Wrapper Arasındaki Dönüşüm)**
Java 5 ile gelen **Autoboxing** ve **Unboxing**, primitive ve wrapper türleri arasında otomatik dönüşüm yapılmasını sağlar.

### 5.1 **Autoboxing (Primitive → Wrapper)**
**Primitive türler, otomatik olarak wrapper nesnelere dönüşür.**
```java
public class AutoboxingExample {
    public static void main(String[] args) {
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue; // Autoboxing

        System.out.println("Wrapper Integer: " + wrapperValue);
    }
}
```
**Bu kod,** `Integer wrapperValue = Integer.valueOf(primitiveValue);` **ile aynıdır.**

---

### 5.2 **Unboxing (Wrapper → Primitive)**
**Wrapper türler, otomatik olarak primitive değerlere dönüşür.**
```java
public class UnboxingExample {
    public static void main(String[] args) {
        Integer wrapperValue = 200;
        int primitiveValue = wrapperValue; // Unboxing

        System.out.println("Primitive int: " + primitiveValue);
    }
}
```
**Bu kod,** `int primitiveValue = wrapperValue.intValue();` **ile aynıdır.**

---

## 6. **Primitive Type vs. Wrapper Type Kullanım Senaryoları**

| **Senaryo** | **Primitive Kullanımı** | **Wrapper Kullanımı** |
|------------|--------------------|--------------------|
| **Hız & Performans Önemli** | ✅ Daha hızlı | ❌ Yavaş |
| **Bellek Verimliliği** | ✅ Az bellek kullanır | ❌ Fazla bellek harcar |
| **Koleksiyonlarda Kullanım (List, Set, Map)** | ❌ Kullanılamaz | ✅ Kullanılabilir |
| **Null Değer Atama** | ❌ Mümkün değil | ✅ Mümkün |
| **Nesne Yönelimli Programlama Gerekirse** | ❌ Uygun değil | ✅ Nesne olarak kullanılabilir |
| **Metodlarla Çalışma** | ❌ Metod içermez | ✅ `Integer.parseInt()`, `Double.valueOf()` gibi metodlar kullanılabilir |

---

## 7. **Ne Zaman Hangi Tür Kullanılmalı?**
- **Performans kritikse ve koleksiyonlarla çalışılmıyorsa → Primitive types kullanılmalı.**
- **Koleksiyonlar (List, Map, Set) veya nesne yönelimli bir yapı gerekiyorsa → Wrapper types kullanılmalı.**
- **Null değerler gerekliliği varsa → Wrapper types tercih edilmeli.**
- **Hesaplamalar yapılıyorsa → Primitive types daha hızlı ve verimli çalışır.**

---

## 8. **Sonuç**
| **Konu** | **Primitive Type** | **Wrapper Type** |
|---------|-----------------|-----------------|
| Hafıza Kullanımı | Az bellek harcar | Daha fazla bellek tüketir |
| Hız | Daha hızlıdır | Daha yavaştır |
| Null Olabilir mi? | ❌ Hayır | ✅ Evet |
| Nesne mi? | ❌ Hayır | ✅ Evet |
| Koleksiyonlarda Kullanılabilir mi? | ❌ Hayır | ✅ Evet |

📌 **Özetle**, performans gereken durumlarda **primitive types** kullanılır, nesne yönelimli işlemler ve koleksiyonlar için **wrapper types** gereklidir.

💡 **Soru:** `List<int> list = new ArrayList<>();` neden hatalıdır?
📌 Çünkü **primitive types koleksiyonlarda kullanılamaz.** `List<Integer> list = new ArrayList<>();` şeklinde **wrapper type** kullanmalıyız.

Bu detaylı açıklamalar, primitive ve wrapper türleri arasındaki farkları net bir şekilde anlamanıza yardımcı olacaktır! 🚀



# **Sonuç**
- **Primitive türler** doğrudan bellekte saklanır, nesne değildir.
- **Daha hızlıdır ve daha az bellek tüketir**.
- **8 temel tür vardır:** `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.
- **Matematik işlemleri ve kontrollerde en verimli yöntemleri sunar**.

**Primitive türler Java'nın temelini oluşturur ve performans açısından büyük avantaj sağlar! 🚀**

## Wrapper new kullanımı()
```sh 

```
---
Eğer **wrapper sınıflarını** `new` anahtar kelimesiyle oluşturmak istiyorsak, her bir primitive türünün **wrapper sınıfını** kullanarak aşağıdaki gibi yazabiliriz:

```java
public class WrapperExample {
    public static void main(String[] args) {
        Byte wrapperTypeByte = new Byte((byte) 127);
        wrapperTypeByte = null; // Wrapper sınıflar null alabilir
        System.out.println(wrapperTypeByte);

        Short wrapperTypeShort = new Short((short) 32767);
        Integer wrapperTypeInt = new Integer(2147483647);
        Long wrapperTypeLong = new Long(9223372036854775807L);

        Float wrapperTypeFloat = new Float(14.23f);
        Double wrapperTypeDouble = new Double(14.23);

        Boolean wrapperTypeBoolean = new Boolean(true);
        Character wrapperTypeChar = new Character('a');

        System.out.println("Short: " + wrapperTypeShort);
        System.out.println("Integer: " + wrapperTypeInt);
        System.out.println("Long: " + wrapperTypeLong);
        System.out.println("Float: " + wrapperTypeFloat);
        System.out.println("Double: " + wrapperTypeDouble);
        System.out.println("Boolean: " + wrapperTypeBoolean);
        System.out.println("Character: " + wrapperTypeChar);
    }
}
```

### **Önemli Notlar**
1. **Java 9 ve Sonrasında `new` Kullanımı Önerilmez**
    - Java 9'dan itibaren `new Byte()`, `new Integer()` gibi kullanımlar **depreceated (kullanım dışı)** olarak işaretlenmiştir.
    - Bunun yerine **doğrudan atama** yapılmalıdır:
      ```java
      Byte wrapperTypeByte = 127;  // Önerilen kullanım
      ```
    - **Çünkü:** Java **autoboxing** mekanizması sayesinde `new` kullanmadan da bu türleri otomatik olarak wrapper class'lara çevirebilir.

2. **Performans ve Bellek Yönetimi**
    - `new` kullanımı **gereksiz nesne oluşturduğu için heap belleği gereksiz yere doldurur**.
    - Örneğin:
      ```java
      Integer a = 100;  // Autoboxing (Önerilen kullanım)
      Integer b = new Integer(100); // Heap bellekte yeni nesne oluşturur
      ```
    - **`new Integer(100)` kullanırsanız heap’te yeni bir nesne oluşturulur ve gereksiz hafıza tüketilir.**

### **Sonuç**
- **Eğer eski sürümlerle çalışmıyorsanız** ve özel bir nedeniniz yoksa, `new` kullanmadan **autoboxing** yöntemini tercih etmelisiniz.
- **Java 9+ ile çalışıyorsanız**, `new` kullanmaktan kaçının ve doğrudan atamaları kullanın. 🚀



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

