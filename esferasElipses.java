
//Declaracion de variables globales
int x=0;
int velocidad =1;

void setup(){
 size(200,200);
 smooth();
}

void draw(){
 background(255);
 mueve();
 rebota();
 muestraPelota((color(0,255,0)),100,32,32);
 muestraPelota((color(255,0,0)),50,16,16);
 muestraPelota((color(255,255,0)),150,8,8);
 muestraPelota((color(0,127,255)),25,30,30);
}
 //Funcion que mueve la bola
 void mueve(){
   //Cambia segun la velocidad
 x=x + velocidad;
 }
 // Funcion que renota la bola
 void rebota(){
 /* Si se ha llegafo a una orilla, invierte la velocidad*/
  if ((x>width) || (x<0)){
  velocidad = velocidad * -1;
  }
 }
 //Funcion que  muestra la bola1
 void muestraPelota(color colorPelota, float posicionY, float alto,float ancho){
 /*Despliega el circulo en la localizacion x */
 stroke(0);
 fill(colorPelota);
 ellipse(x,posicionY,ancho,alto);
  ellipse(x,posicionY,ancho,alto);
   ellipse(x,posicionY,ancho,alto);
  ellipse(x,posicionY,ancho,alto);
}
