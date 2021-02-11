# CVDS_Lab03

## CREAR UN PROYECTO CON MAVEN

En el directorio de trabajo ejecutar el comando necesario para crear un proyecto Maven, basado en un arquetipo:
- Grupo: edu.eci.cvds
- Artefacto: ClasesEquivalencia
- Paquete: edu.eci.cvds.tdd
- archetypeArtifactId: maven-archetype-quickstart

Las siguientes imágenes hacen referencia a la creación del proyecto:

![Captura1](https://github.com/luis-amaya/CVDS_Lab03/blob/master/Images/Captura1.PNG)
![Captura2](https://github.com/luis-amaya/CVDS_Lab03/blob/master/Images/Captura2.PNG)
![Captura3](https://github.com/luis-amaya/CVDS_Lab03/blob/master/Images/Captura3.PNG)

## Actualizar y crear dependencias en el proyecto

- Busque en internet el repositorio central de Maven.
- Busque el artefacto JUnit y entre a la versión más nueva
- Ingrese a la pestaña de Maven y haga click en el texto de la dependencia para copiarlo al portapapeles.
- Edite el archivo pom.xml y realice las siguientes actualizaciones:
  - Agregue la dependencia copiada a la sección de dependencias.
  - Hay que cambiar la versión del compilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:

    <properties>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
    </properties>

## COMPILAR Y EJECUTAR

Ejecute los comandos necesarios de Maven, para compilar el proyecto y verificar que el proyecto se creó correctamente y los cambios realizados al archivo pom no generan inconvenientes.

Busque el comando requerido para ejecutar las pruebas unitarias de un proyecto desde Maven y ejecútelo sobre el proyecto. Se debe ejecutar la clase AppTest con resultado exitoso.

![Captura4](https://github.com/luis-amaya/CVDS_Lab03/blob/master/Images/Captura4.PNG)
![Captura5](https://github.com/luis-amaya/CVDS_Lab03/blob/master/Images/Captura5.PNG)
![Captura6](https://github.com/luis-amaya/CVDS_Lab03/blob/master/Images/Captura6.PNG)

## EJERCICIO “REGISTRADURÍA”

Estas imágenes hacen referencia a el ejercicio de registraduría:

![Captura7](https://github.com/luis-amaya/CVDS_Lab03/blob/master/Images/Captura7.PNG)
![Captura8](https://github.com/luis-amaya/CVDS_Lab03/blob/master/Images/Captura8.PNG)

## EJECUTAR LAS PRUEBAS

![Captura9](https://github.com/luis-amaya/CVDS_Lab03/blob/master/Images/Captura9.PNG)

## FINALIZAR EL EJERCICIO

![Captura10](https://github.com/luis-amaya/CVDS_Lab03/blob/master/Images/Captura10.PNG)

## EJERCICIO "DESCUENTO DE TARIFAS"

![Captura11](https://github.com/luis-amaya/CVDS_Lab03/blob/master/Images/Captura11.PNG)

