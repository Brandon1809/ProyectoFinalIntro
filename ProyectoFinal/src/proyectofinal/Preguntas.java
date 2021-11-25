
package proyectofinal;


public class Preguntas {
    private String textoPreg;
    private String respA;
    private String respB;
    private String respC;
    private String respD;
    private String respCorrecta;
    
    public Preguntas(){
    }
    public void settextoPreg(String ptextoPreg){
        textoPreg=ptextoPreg;
    }
    public void setrespA(String prespA){
        respA=prespA;
    }
    public void setrespB(String prespB){
        respB=prespB;
    }
    public void setrespC(String prespC){
        respC=prespC;
    }
    public void setrespD(String prespD){
        respD=prespD;
    }
    public void setrespCorrecta(String prespCorrecta){
        respCorrecta=prespCorrecta;
    }
    
    
    
    public String gettextoPreg(){
        return textoPreg;
    }
    public String getrespA(){
        return respA;
    }
    public String getrespB(){
        return respB;
    }
    public String getrespC(){
        return respC;
    }
    public String getrespD(){
        return respD;
    }
    public String getrespCorrecta(){
        return respCorrecta;
    }
    
 
}
