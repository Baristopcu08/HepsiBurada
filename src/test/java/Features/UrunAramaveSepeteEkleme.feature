Feature: Urun Arama ve Sepete Ekleme

  @Smoke
  Scenario: Urun Arama ve alışverişi tamamlama
    Given Kullanici Ana Sayfadadir
    When  Kullanıcı ürün arama alanına "Ipone" yazar
    *     Kullanıcı listelenen Ürünlerden birinine tıklar
    *     Kullanıcı ürünü sepete ekler
    *     Kullanıcı "Sepete git" butonuna tıklar
    *     Kullanıcı Alışveriş Kredisi linkine tıklar
    Then  Açılan ekranda "Alışveriş Kredisi" bölümün olduğunu görür
    When  Kullanıcı açılan açılan bilgi ekranını kapatır
    When  Kullanıcı Karta taksit yapılamaz linkine tıklar
    Then  Açılan ekranda "Karta taksit yapılamaz" bölümün olduğunu görür
    When  Kullanıcı açılan açılan bilgi ekranını kapatır
    When  Kullanıcı "Alışverişi tamamla" butonuna tıklar
