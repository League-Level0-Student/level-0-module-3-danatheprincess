void setup(){
  size(500,500);
}

void draw(){
  int size = 300;
  for(int i=0; i<10; i++){
    
    if (i%2==0){
      fill(#ED0E0E);
    }
    else {
      fill(#050404);
    }
    
    ellipse(250,250,size,size);
    size-=30;
  }
}
