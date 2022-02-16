Feature: US1012 Kullanici istedigi basliktaki tum bilgileri listeler

  @DemoGuru
  Scenario: TC17 Kullanici istedigi basliktaki bilgileri listeleyebilmeli
  # 1.http://demo.guru99.com/test/web table element.php sayfasina gidelim
 # 2.Cucumber framework’de US1012_Guru_Web_Tables altinda
  #Scenario : TC_18_kullanici_sutun_basligi_ile_liste_alabilmeli
  #olusturun ve
  #asagidaki testi yapin
    #//span[text()='Tout accepter']

    Given kullanici "DemoGuruUrl" sayfasina gider
    And "Company", sutunundaki tum degerleri yazdirir