# PROYECTO-2
## Gestión de memoria
   
   Visión general de la gestión de memoria
La gestión de memoria contiene el recopilador de basura y el asignador. Es responsable de asignar memoria además de recopilar basura. Como la asignación de memoria es una tarea pequeña, en comparación con la de recopilación de basura, el término “recopilación de basura” normalmente también significa “gestión de memoria”.
    
    Asignación
El asignador es un componente de la gestión de memoria que tiene la responsabilidad de asignar áreas de memoria para la JVM. La tarea de asignación de memoria es pequeña en comparación con la de recopilación de basura.
    
    Descripción detallada de la recogida de basura global
La recopilación de basura se realiza cuando se produce un error de asignación en la asignación de bloqueo de almacenamiento dinámico o si se realiza una llamada específica a System.gc(). La hebra que tiene el error de asignación o la llamada System.gc() toma el control y realiza la recopilación de basura.
    
    Recopilador de basura simultáneo generacional
La estrategia de recopilación de basura generacional es idónea para una aplicación que crea muchos objetos de corta duración, ya que es típico de muchas aplicaciones transaccionales.
    
    #Política de recopilación equilibrada de basura
La política equilibrada de recopilación de basura utiliza un diseño basado en regiones para el almacenamiento dinámico de Java™. Dichas regiones se gestionan individualmente para reducir el tiempo de parada máximo en grandes almacenamientos dinámicos , y también se beneficia de las características de NUMA en el hardware de servidores modernos.
    
    #Cómo dimensionar el almacenamiento dinámico
Puede dimensionar el almacenamiento dinámico para que se ajuste a sus requisitos.
     
     #Interacción del recopilador de basura con otras aplicaciones
Si comprende el modo en que el recopilador de basura funciona podrá comprender la relación que tiene con las aplicaciones.

     #Cómo coexistir con el recopilador de basura
Utilice esta información general como ayuda para diagnosticar problemas en la coexistencia de las aplicaciones con el recopilador de basura (GC).

      #Preguntas frecuentes sobre el recopilador de basura
Algunos ejemplos de temas que tienen respuesta en este apartado son los valores predeterminados, las políticas del recopilador de basura, las hebras de ayudante del recopilador de basura, el desbordamiento de la pila de marcación, la operación del almacenamiento dinámico y las condiciones de falta de memoria.
  #formulario proyecto_II.java
    contiene un simulador de gestion de memoria.
    como se utiliza :
    -tenemos un jpanel que hace las particiones de la memoria.
    tamaño princimap de la memoria que es maximo de 2048 MB.
    
    el tamaño de la secuencia  es de 5000 KB.
    
    el tamño de la pagina la temomos como 1024 que es es la RAM.
    
    el boton Instalar particiones funciona para agragar las partiones y activa el texto de Area que nos da las estaditicas.
   
   en el jpanel de estaditica nos ayuda a ver cuanta memoria temos en uso o o que tenemos disponibles 
    
    -tenemos un jpanel que tiene agrupado crear procesos  estos van en secuencia para poder ingresar a la jpanel tenemos que      hacer las particiones.
    
    ahi podemos crear los proceso con la memoria que vamos a ocupar pero si ya no tenemos espacio suficiente en la memoria no     podemos crear mas procesos.
    
  
