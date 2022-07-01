package api.stepdefinitions;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

public class TestBaseApi {
    protected RequestSpecification spec;

    public void setup(){
        spec=new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("https://automationexercise.com/api")).build();
                //setBaseUri(ConfigReader.getProperty("url"))
    }
    public String[] stringParcala(String string){
        String[] product=string.split("}},");
        return product;
    }

    public void diziYazdir(String[] dizi){
        for (int i=0; i<dizi.length;i++){
            System.out.println(dizi[i]);
        }
    }
    public int idBul(String stringID){
        String idStr=stringID.substring(stringID.indexOf("id"));
        //+5,string.indexOf(",")-2-string.indexOf("id")+5);
        System.out.println("---------");
        int id=Integer.parseInt(idStr.substring(5,idStr.indexOf(",")));
        System.out.println(id);
        return id;
    }

    // >>>>>   devam edilecek
    public String nameBul(String string) {
        return "5";
    }
    public String priceBul(String string){

    return "3";
    }
    public String brandBul(String string){
        return "4";
    }

}
