/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

public class TrianguloRectangulo {
    String RespTipoTriangulo;
    int base, altura;
    
    TrianguloRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea(){
        return base*altura/2;
    }
    
    double calcularPerimetro(){
        return base + altura + calcularHipotenusa();
    }
    
    double calcularHipotenusa(){
        return Math.pow(altura*altura + base*base, 0.5);
    }
    
    String determinarTipoTriangulo(){
        if((base==altura) && (base==calcularHipotenusa()) && (altura==calcularHipotenusa())){
            RespTipoTriangulo = "Es un triángulo equilátero";
        }
        else if ((base!=altura) && (base!=calcularHipotenusa()) && (altura!=calcularHipotenusa())){
            RespTipoTriangulo = "Es un triángulo escaleno";
        }
        else{
            RespTipoTriangulo = "Es un triángulo isóceles";
        }
        
        return RespTipoTriangulo;
    }
}
