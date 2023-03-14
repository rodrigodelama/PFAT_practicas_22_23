PF2023 Exp (ancho, color) 

vars
int i, j;

size(210, ancho);

j:=10;



while (i<ancho*j) do
  if (color=1) then
    plot(black, i/j, 
         5 + Real2Int(10.0 * exp(Int2Real((i-ancho*5)*3)/Int2Real(ancho*5))));
  end;

  if (color=2) then
    plot(grey, i/j, 
         5 + Real2Int(10.0 * exp(Int2Real((i-ancho*5)*3)/Int2Real(ancho*5))));
  end;

  if (color=3) then
    plot(blue, i/j, 
         5 + Real2Int(10.0 * exp(Int2Real((i-ancho*5)*3)/Int2Real(ancho*5))));
  end;

  if (color=4) then
    plot(red, i/j, 
         5 + Real2Int(10.0 * exp(Int2Real((i-ancho*5)*3)/Int2Real(ancho*5))));
  end;

  if (color=5) then
    plot(green, i/j, 
         5 + Real2Int(10.0 * exp(Int2Real((i-ancho*5)*3)/Int2Real(ancho*5))));
  end;

  if (color=6) then
    plot(yellow, i/j, 
         5 + Real2Int(10.0 * exp(Int2Real((i-ancho*5)*3)/Int2Real(ancho*5))));
  end;

  if (color=7) then
    plot(orange, i/j, 
         5 + Real2Int(10.0 * exp(Int2Real((i-ancho*5)*3)/Int2Real(ancho*5))));
  end;

  i:=i+1;

end;



