class Universidad 
     def __ init (self, name, n_profesores, n_alumnos):
     self.nombre = name 
     self.profesores = n_profesores
     self.alumnos = n_alumnos 

     def establecer_nombre (self, n):
         self.nombre = n 

     def establecer_profesores (self, n):
         self.profesores = n 

     def establecer_alumnos (self, n):
         self.alumnos = n 

     def obtener_nombre (self):
         return self.nombre

     def obtener_profesores (self):
         return self.profesores
     
     def obtener_alumnos (self):
         return self.alumnos

     def __str__(self):
         return "Universidad: %s, Número de profesores: %d, Número de alumnos: %d\n" \
             % (self.nombre, self.profesores, self.alumnos)


class Carrera
     def __ init (self, nameC, c_profesores, c_alumnos):
     self.nombreCarrera = nameC 
     self.profesores = c_profesores
     self.alumnos = c_alumnos 

     def establecer_nombreCarrera (self, c):
         self.nombre = c 

     def establecer_profesores (self, c):
         self.profesores = c 

     def establecer_alumnos (self, c):
         self.alumnos = c 

     def obtener_nombreCarrera (self):
         return self.nombreCarrera

     def obtener_profesores (self):
         return self.profesores
     
     def obtener_alumnos (self):
         return self.alumnos

     def __str__(self):
         return "Carrera: %s, Número de profesores: %d, Número de alumnos: %d\c" \
             % (self.nombreCarrera, self.profesores, self.alumnos)