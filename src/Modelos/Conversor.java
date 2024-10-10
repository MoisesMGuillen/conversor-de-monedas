package Modelos;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.math.BigDecimal;

public class Conversor {
    private String monedaBase; //La moneda base con la cual se hara una conversion a otra
    private String monedaObjetivo; //Moneda objetivo a la cual se busca hacer la conversion
    private BigDecimal tasaDeConversion; //La tasa de conversion a la moneda objetivo. El uso de big decimal es debido a los errores en los decimales de un double
    private Consultas consultas = new Consultas(); //Inicializar la clase que se encarga de la consulta

    //Nota: Cambiar a que construya el Json de forma recursiva
    public void construir(String base,String objetivo) {
        monedaBase = base; //Capturando la moneda "base" del jsonObject
        monedaObjetivo = objetivo; //Capturando la moneda "objetivo" del jsonObject
        JsonObject jsonObject = JsonParser.parseString(consultas.consulta(base))
                .getAsJsonObject()
                .getAsJsonObject("conversion_rates"); //Extrayendo de forma recursiva la tasa de conversion de la consulta a la API
        tasaDeConversion = jsonObject.get(objetivo).getAsBigDecimal(); //Recuperar la tasa de conversion del
    }

    //Conversion de divisas, haciendo una multiplicacion entre los numeros obtenidos.
    public void conversion(BigDecimal entrada){
        System.out.println("El valor "+ entrada + " ["+ monedaBase + "] corresponde al valor final de ==> "
                + tasaDeConversion.multiply(entrada) + " [" + monedaObjetivo+"]");
    }

}