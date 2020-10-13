/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarjson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import sun.applet.Main;

/**
 *
 * @author leeo6
 */
public class GerarJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileWriter writeFile = null;
        JSONObject objetoJson = new JSONObject();
        objetoJson.put("nome","Leonardo");
        objetoJson.put("sobrenome","Gorkes");
        objetoJson.put("CPF","423.177.569-19");
        objetoJson.put("Celular","1196730898");
        
        try {
        writeFile = new FileWriter("C:/Users/leeo6/OneDrive/Desktop/UNIP GERAL/UNIP 8 SEMESTRE/Vinicius/dados_cliente.json");
        writeFile.write(objetoJson.toJSONString());
        writeFile.close();
        } catch (IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println(objetoJson.toJSONString());
    }
    
}
