# Selenium-Webdriver

En este repositorio guardaré el primer curso de Selenium que estoy realizando en la empresa Mayoral. 

**1. Acceder a URL** 

Una vez hemos creado el proyecto e instalado Selenium en Eclipse (al igual que todos los JAR y complementos que necesitamos para su correcto uso), empezamos con la parte práctica. La Programación Orientada a Objetos es muy importante para trabajar con Selenium. 
Con este extracto de código entramos a la URL que insertemos en el .get("").

![image](https://user-images.githubusercontent.com/91873618/158797017-4f88e999-7529-4559-a7e7-f5b9dcb1d52e.png)

![image](https://user-images.githubusercontent.com/91873618/158797076-f07bb3a6-d505-4fbb-9e19-8e5a0ad3abda.png)

**2. Maximizar navegador**

La página a la que nos redirecciona, podemos maximizarla automáticamente, al igual que obtener su título, siendo éste pintado en la consola de Eclipse
![image](https://user-images.githubusercontent.com/91873618/158798134-37dce832-7b83-401b-9099-7b5625ce497b.png)

![image](https://user-images.githubusercontent.com/91873618/158798329-61ee9d35-1e65-4b8c-8c9f-ead4182ee8a7.png)

**3. Obtener título** 

Declaramos el objeto chromeOptions. Con .setHeadless(true) se puede llevar a cabo el código java sin necesidad de que se abra la URL. Tendremos también que meter el objeto como argumento en el objeto driver.

![image](https://user-images.githubusercontent.com/91873618/158801688-6eb0d907-0219-492f-8f2f-16f417bcf907.png)

**4. Cerrar navegador**

Con .close() podemos cerrar el navegador.
![image](https://user-images.githubusercontent.com/91873618/158802117-210e8fb5-1d36-48cb-827a-4501745e410b.png)

**5.Encontrar elementos de la página e interactuar con ellos con Id y Class**

Con el método findElement() podemos encontrar buscar elementos de la página e interactuar con ellos. Por ejemplo, intentemos iniciar sesión en GitHub.
Primeramente, tendremos que buscar el elemento que corresponde a la casilla de usuario.
![image](https://user-images.githubusercontent.com/91873618/158810254-a697df15-3650-4d56-bf7d-b8da6b1eefb4.png)
Reflejaremos en el código la id de la casilla de usuario. Con sendKeys("") podemos enviar el valor que deseamos.

![image](https://user-images.githubusercontent.com/91873618/158810482-5e8e5f24-7a16-4f0f-9f41-b70f246b3e90.png)

Haremos igual con la casilla contraseña.

![image](https://user-images.githubusercontent.com/91873618/158810794-f12b1525-f8c4-42bf-9edb-e697a9fb58fe.png)
![image](https://user-images.githubusercontent.com/91873618/158811108-ccc74183-d2de-4fb8-8642-20371b449a77.png)

Finalmente, sólo queda buscar la id de botón de logeo. 
![image](https://user-images.githubusercontent.com/91873618/158810988-f076f12f-6671-4bc1-938d-ae30f0742ce7.png)

No tiene una id para el botón, así que utilizaremos el nombre de su clase. También utilizaremos el método .click para hacer click.
![image](https://user-images.githubusercontent.com/91873618/158811365-fe65c6be-db62-4432-8da9-f098800dfbed.png)

Se realizará la sesión de logeo en el momento que se haga Run.
![image](https://user-images.githubusercontent.com/91873618/158811783-ad7957be-c655-43c6-b3be-0f79a9f8e716.png)

**6. Encontrar elementos de la página e interactuar con ellos con XPath**

Al igual que hemos hecho con los Id y los XPath, podemos también encontrar elementos a través de XPath con la siguiente fórmula.


![image](https://user-images.githubusercontent.com/91873618/158822440-88211bac-27a1-41fa-9cf8-f7ad2e4edd64.png)

Buscaremos con la herramienta Inspeccionar de la web el tagname, los atributos y los value de los diferentes elementos.

![image](https://user-images.githubusercontent.com/91873618/158822975-72f5c9f0-a258-4848-adbc-2c5261e41794.png)


El resultado es el mismo que el del punto 5.
