from  Modelo1 import Universidad, Carrera

 u = Universidad ("UCE", "800", "50000")
 print (u)
   u.establecer_nombre ("UCE")
   print (u)
   print (u.obtener_profesores())

 u = Carrera ("Medicina", "200", "10000")
 print (u)
   u.establecer_nombreCarrera ("Medicina")
   print (u)
   print (u.obtener_alumnos())

