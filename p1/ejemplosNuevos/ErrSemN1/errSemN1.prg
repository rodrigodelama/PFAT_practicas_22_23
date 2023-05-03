PF2023 Rectangulo (ancho, alto) 

vars
int i;
color c,d;

size(alto+10, ancho+10);

c:= black;
d:= c+1;

while (i<ancho) do
  plot(d, i+5, 5);
  plot(black, i+5, (alto+4));
  i:=i+1;
end;

i:=0;

while (i<alto) do
  plot(black, 5, i+5);
  plot(black, (ancho+4), i+5);
  i:=i+1;
end;

