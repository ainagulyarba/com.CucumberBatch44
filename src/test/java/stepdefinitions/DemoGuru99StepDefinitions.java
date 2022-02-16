package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class DemoGuru99StepDefinitions {

DemoGuruPage demoGuruPage=new DemoGuruPage();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenBaslik) {

        demoGuruPage.cookiesKabulEtButonu.click();
        Driver.getDriver().switchTo().frame(demoGuruPage.iframe);

     List<WebElement> baslikWebelementListesi =demoGuruPage.baslikWebelementListesi;

     List<String> baslikStringListesi= ReusableMethods.getElementsText(baslikWebelementListesi);

        int istenenSutunIndexi=baslikStringListesi.indexOf(istenenBaslik);

   List<WebElement>istenenSutunWebelementListesi= demoGuruPage.sutunListesiGetir(istenenSutunIndexi);
   List<String> istenenSutunStrList=ReusableMethods.getElementsText(istenenSutunWebelementListesi);
        System.out.println("istenenSutunStrList = " + istenenSutunStrList);


    }





}
