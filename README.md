# **Web Tabanlı Bankacılık Uygulaması Otomasyon Test Projesi**

## 📋 **Proje Hakkında**
Bu proje, bir web tabanlı bankacılık uygulamasının otomasyon testlerini kapsamaktadır. Kullanıcıların login olma, para transferi, kart ile para yatırma ve hesap ayarları işlemlerini başarıyla gerçekleştirebilmesi için gerekli tüm işlevlerin test edilmesi hedeflenmiştir. Proje, kullanıcı deneyimini ve güvenliğini artırmayı amaçlayan kapsamlı bir test stratejisi sunar.

---

## 🔧 **Proje Özellikleri**
- **Fonksiyonlar:**
  - Kullanıcı girişi
  - Para transferi işlemleri.
  - Kart ile para yatırma işlemi.
  - Hesap ayarları
  - UI/UX testleri.
  - Farklı tarayıcı uyumluluk testleri (Chrome, Firefox, Edge).

- **Kullanılan Teknolojiler:**
  - **Java:** Test otomasyonu kodlaması için.
  - **Selenium WebDriver:** Tarayıcı otomasyonu için.
  - **Gauge:** BDD formatında test yazımı ve raporlama için.
  - **JUnit:** Test yönetimi ve organizasyonu için.
  - **Log4j:** Loglama mekanizması.
  - **Maven:** Bağımlılık yönetimi ve test çalıştırma için.
  - **Tasarım Deseni:** Page Object Model (POM) kullanıldı.

---
## Test Kapsamı ve Modüller
| Modül | Kapsam |
| -- | -- | 
| Kullanıcı girişi | Kullanıcı geçerli bilgilerle giriş yapabilir. | 
| Para Transferi | Kullanıcı farklı bir hesaba para gönderebilir. | 
| Kart ile Para Yatırma | Kullanıcı, kart bilgilerini girerek hesabına para yatırabilir. | 
| Hesap Bilgisi Güncelleme | Kullanıcı, hesap bilgilerini düzenleyebilir. | 
---
## 🚀 **Kurulum Talimatları**
### **1. Gerekli Araçlar ve Yazılımlar**
Projeyi çalıştırmak için aşağıdaki yazılımların bilgisayarınızda kurulu olduğundan emin olun:
- **Java JDK 11 veya üstü:** [Java İndirme](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Apache Maven 3.6 veya üstü:** [Maven İndirme](https://maven.apache.org/download.cgi)
- **Git** (opsiyonel): Kodları klonlamak için.
- **IDE (IntelliJ IDEA, Eclipse vb.):** Projeyi düzenlemek ve çalıştırmak için.
- **Gauge 1.6.3 veya üstü:** [Gauge](https://gauge.org/)

### **2. Depoyu Klonlayın**
Projeyi klonlamak için aşağıdaki komutu kullanın:

```
git clone https://github.com/gizemmolo/CatchylabsBankProject.git
```
---
## 🎮 **Kullanım Yönergeleri**
### **Nasıl Test Çalıştırılır?**
1. Proje dizinine gidin.
2. Maven kullanarak testleri çalıştırın
```
mvn gauge:execute
```

### **Tag Kullanarak Testleri Çalıştırmak**
```
mvn gauge:execute -DspecsDir=specs -Dtags="tagName"
```
---
## 📊 Test Raporları
3. Test süreçlerinin sonuçlarını ve detaylarını içeren raporlar otomatik olarak oluşturulmaktadır. Gauge raporlama aracı ile görsel ve detaylı bir formatta test sonuçları sunulur.

     * Raporların Görüntülenmesi:

         * Test sonuçları **reports/html-report/index.html** dosyasına kaydedilir. Tarayıcıda bu dosyayı açarak başarı oranlarını ve hata detaylarını inceleyebilirsiniz.
     * Hata Logları:

        * Tüm test adımları ve hatalar **logs/gauge.log** dosyasında saklanır. Bu dosya, test sonuçlarının detaylı analizi için kullanılabilir.
---
## 📂 Proje Yapısı
```
CatchylabsBankProject/
├── logs/
│   └── gauge.log               # Log kayıtları
├── reports/
│   └── html-report/
│           └── index.html      # Test raporları
├── specs/
│   └── account/
│   └── login/
├── src/
│   └── test/
│       └── java/
│           └── base/           # Base Test ve Base methodlar
│           └── pages/          # Sayfa nesneleri (Page Object Model)
│           └── steps/          # Test Stepleri
│ 
│ 
├── pom.xml                     # Maven bağımlılıkları
└── README.md                   # README dosyası
```
---
## 🛠 **Sorun Giderme İpuçları**
**Kurulum ile İlgili Sorunlar**

1. **mvn komutu çalışmıyor:**

* Maven'in sistem PATH değişkenine eklendiğinden emin olun.
* Yükleme talimatlarını [buradan](https://maven.apache.org/install.html) kontrol edin.

2. **java komutu bulunamadı:**

* Java'nın kurulu olduğundan ve PATH değişkenine eklendiğinden emin olun.
* Java versiyonunuzu doğrulamak için:
```
java -version
```
3. **Raporlama Sorunları**
* Raporlar eksikse veya hatalı oluşturulmuşsa, rapor klasörünü temizleyin ve testleri yeniden çalıştırın:
```
mvn clean test
```
4. **Geliştirici Modunda Test Çalıştırma**
* Daha fazla detay görmek ve testlerin hata ayıklamasını yapmak için Maven debug modunu kullanabilirsiniz:
```
mvn gauge:execute -X
```
---
## 🔗 Kaynaklar
Projenizi daha etkili bir şekilde geliştirmek ve yönetmek için aşağıdaki kaynakları kullanabilirsiniz:

- [Selenium Resmi Dokümantasyonu](https://www.selenium.dev/documentation/)
- [Gauge Resmi Dokümantasyonu](https://docs.gauge.org/)
- [JUnit Resmi Dokümantasyonu](https://junit.org/junit5/docs/current/user-guide/)
- [Maven Kullanım Kılavuzu](https://maven.apache.org/guides/index.html)
---
## 📞 İletişim
Proje hakkında herhangi bir sorunuz varsa veya destek almak isterseniz iletişime geçebilirsiniz:

Hazırlayan: Gizem MOLO

E-posta: gizem.molo@testinium.com

