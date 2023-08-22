#  Java Spring REST API

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatli bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

### Course Rest Api

 ### Başlangıç
 * Spring Initializr kullanarak bir Spring Boot projesi oluşturun.
 * İçerisinde ```Spring Web``` dependency eklenmeli.
 * Maven dependency management sistemini kullanarak tüm dependencyleri install edin.
 * Uygulamanızı  ```9000``` portundan ayağa kaldırın.
 * Bir öğrenci için rest api dizayn etmeniz istenmektedir.

### Amaç
 * Amacımız Alex isimli öğrencinin derslerini ve derslerden aldığı notları ekleyebileceğimiz bir rest api oluşturmak.
 * Bu Api'yi oluştururken error handling ve validation kurallarına uymalıyız.
 * Dependency Injection kurallarına uymalıyız.
 
 ### Görev 1
 * main metodunuzun olduğu paket altında ```controller```, ```entity```, ```exceptions``` isminde 3 adet daha paket oluşturunuz.
 * Project Lombok'u dependency olarak uygulamanıza ekleyin.
 * ```model``` paketinin altına ```CourseCredit``` adında bir interface tanımlayınız. ```int getCredit()``` ve ```int getGpa()``` adında iki metod tanımlayınız.
 * ```model``` paketi altına ```Course``` sınıfını tanımlayınız. ```int credit, Grade grade``` isimli 2 fielda sahip olmalı. Course sınıfının tek bir constructor değeri olmalı. ```int credit``` değerini almalı ve set etmeli. 
 * ```model``` paketi altına ```Grade``` sınıfını tanımlayınız. ```int coefficient, String note``` bu iki değişkenide set eden bir adet constructor tanımlayınız.

 ### Görev 2
 * ```controller``` paketi altında ```CourseController``` adında 1 tane controller yazmalısınız.
 * ```CourseController``` içerisinde course objelerini tutacak bir adet ```courses``` isminde List tutmalısınız. Controller bean ilk oluştuğunda bu listi tanımlamalı.
 * Amacımız CRUD işlemlerini tanımlayan endpointler yazmak. 
 * Aynı isimde birden fazla course ekleyemeyiz.
 * credit değeri hiçbir şekilde 0'dan küçük olamaz. 4'ten büyük olamaz.
 * [GET]/workintech/courses => tüm course listini dönmeli.
 * [GET]/workintech/courses/{id} => İlgili id deki course objesini dönmeli.
 * [POST]/workintech/courses => Bir adet course objesini courses listesine ekler.
 * [PUT]/workintech/courses/{id} => İlgili id deki course objesinin değerlerini yeni gelen data ile değiştirir.
 * [DELETE]/workintech/courses/{id} => İlgili id değerindeki course objesini listeden siler.


 ### Görev 3
 * Her endpointin hata fırlatabileceği senaryolar düşünülmeli ```exceptions``` paketi altına bu Error sınıfları oluşturulmalı.
 * Error Handling Global bir merkezden yönetilmeli. Controller sınıflarının altında olmamalı.
 * Her Controller ```@Slf4j``` ile işaretlenmelidir. Endpoint bir şekilde hata döndüğünde ```error logu``` basılmalı.
 * validation işlemleri controller sınıfı içinde kalmamalı. ```util``` paketi altında ```CourseValidation``` isimli bir sınıf oluşturunuz. Validation işlemlerini buraya alınız.

### Görev 4
 * Codepen üzerinden veya bir React uygulaması oluşturarak Spring Boot ile yazdığımız projeye request atmayı deneyiniz.
  cors hatasını nasıl çözebiliriz.

 
