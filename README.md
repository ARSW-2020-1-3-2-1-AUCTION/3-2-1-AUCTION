 <p align="center"> <img src="https://user-images.githubusercontent.com/48091593/75041796-48653100-548b-11ea-8450-0f920ea54f67.jpg"> </p>

## **Desarrollado por:**
- [David Eduardo Caycedo Moyano](https://github.com/Drakocedo)
- [David Mateo González Grimaldos](https://github.com/mateu20)
- [Diego Alejandro Puerto Gómez](https://github.com/Diego23p)

## **Heroku:**

[![Heroku](https://camo.githubusercontent.com/be46aee4f8d55e322c3e7db60ea23a4deb5427c9/68747470733a2f2f6865726f6b752d62616467652e6865726f6b756170702e636f6d2f3f6170703d6865726f6b752d6261646765)](https://auctionsaplication.herokuapp.com/)

## **CircleCi**

[![CircleCI](https://circleci.com/gh/ARSW-Project-2020-think/modeler.svg?style=svg)](https://circleci.com/gh/ARSW-2020-1-3-2-1-AUCTION/3-2-1-AUCTION)

## **Codacy**

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/b0345040f09d4a62b18c1560633bdee3)](https://app.codacy.com/gh/ARSW-2020-1-3-2-1-AUCTION/3-2-1-AUCTION/dashboard)

## **Resumen:**

Es una aplicación de subastas en tiempo real que permite a los usuarios ofertar por los diferentes artículos de su interes. Así mismo este sistema implementará un sistema de inteligencia artificial que permitirá a los usuarios tener una experiencia mas dinámica que se ajuste a sus intereses y a su tiempo.
    
## **Descripción**

La idea surge cuando se percibe que algunos objetos que poseemos ya no son usados, tienen un valor considerable y pueden ser útiles para otras personas. De allí, se desarrolla la idea de que una subasta de artículos usados a nivel de universidades sería un sistema ideal para vender dichos productos al mejor precio posible, y por su forma de operación, generar satisfacción tanto al vendedor como al comprador. Pero esta idea fue escalando más y más en alcance y objetivos, hasta llegar al punto que no tenía por qué sesgarse a universidades, y podía ser desarrollada pensando en el público más amplio. También se amplió la visión de que no tenía que ser únicamente de artículos usados, sino que se podrían publicar productos nuevos  respondiendo a necesidades netamente de negocios.

Aunque existen varias páginas que realizan esta operación, no se tiene una que sea un claro referente para las personas que no están sumergidas en este mundo, por lo que se establece que existe una motivación suficiente para desarrollar puntos diferenciales y nuevos comportamientos que innoven en este sistema de ventas.

Observando páginas que operan con este sistema de ventas, notamos puntos débiles como que la variedad de productos es muy amplia, lo cual deriva en dos problemas puntuales: El primero es que varias de las categorias están vacias, no poseen productos para subastar. El segundo es que no se puede estudiar concretamente un público objetivo; al acotar dicho público, se puede personalizar y brindar un funcionamiento más agradable para los usuarios, lo cual, al mismo tiempo impulsaría que no se tengan categorías vacías. Se observa también que muchas páginas tinen una interfaz muy sobrecargada de información, lo cual la hace menos llamativa para el usuario.
   
Debido a esto, queremos desarrollar una página web la cual modifique la forma de ver e interactuar las subastas en línea que se tiene actualmente, ofreciendo una interfaz sencilla y agradable para los usuarios, que posea características únicas en su funcionamiento y de este modo ser la predilecta para realizar este tipo de negocios.

Se realizó un **Diagrama de Casos de Uso** con las funcionalidades más destacadas del funcionamiento previsto:

### Comprador:

![](/img/CasosComprador.jpg)

COMO Comprador

- QUIERO ofertar por los articulos de interes PARA PODER adquirir un bien.
- QUIERO recargar el saldo de mi cuenta PARA PODER ofertar por los artículos que quiero comprar.
- QUIERO pujar automaticamente por un articulo de mi interes PARA PODER competir por él eficientemente.
- QUIERO ver la fecha y hora de los artículos de mi interés PARA PODER organizar mi participaón en su subasta.
- QUIERO tener tiempo adicional según la cantidad de pujas PARA PODER tener ventaja sobre cierta cantidad de clientes.
- QUIERO Ver los diferentes productos por los que estoy ofertando en una sola pantalla PARA PODER llevar un control claro de mis pujas
- QUIERO Recibir notificaciones cuando me quiten un producto PARA PODER aumentar inmediatamente el monto y recuperarlo


### Vendedor:

![](/img/CasosVendedor.jpg)

- QUIERO ofrecer los productos de mi pertenencia PARA PODER lograr un beneficio económico
- QUIERO publicar otro producto similar al que estoy subastando el cual está siendo muy apetecido PARA PODER maximizar los beneficios obtenidos

Se ha planteado un **digrama de clases** el cual está orientado a resolver los conflictos ya descritos como sigue:

![](/img/Clases.jpg)

Diagrama **Entidad-Relación** generado por PostgresQL:

![](/img/entidadRelacion.jpg)

**Diagrama de Despliegue**

![](/img/despliegue.jpg)

**Diagrama de componentes**

![](/img/componentes.jpg)

Para ver los Mockups completos: https://ninjamock.com/s/DMX1QGx

## **Atributos no funcionales**

Estos atributos son los que delimitarán las características generales, restricciones y limitaciones de nuestra aplicación.

### Disponibilidad

Escenario 1:

- Source: Usuario final.
- Stimulus: Ingresar a la aplicación de subastas.
- Artifact:Frontend, Backend, Base de datos.
- Enviroment: Aplicación bajo condiciones normales.
- Response: Se visualizan las categorias normalmente.
- Response Measure: Las categorias y demas funcionalidades se cargan en un promedio de 1 segundo.

[Vista escenario ](https://drive.google.com/file/d/175j93QfVCg-DuxfDRKVK78QPesZoIpsV/view)

Escenario 2:

- Source: Usuario final.
- Stimulus: .
- Artifact: Frontend, Backend, Base de datos.
- Enviroment: Aplicación bajo condiciones normales.
- Response: Las contraseñas deben estar encriptadas.
- Response Measure: Las contraseñas del usuario deben aparecer en un lenguaje indistinguible para el usuario en la base de datos y en usuario.html.

[Vista escenario ]()

### Seguridad:

Escenario 1:

- Source: Usuario final.
- Stimulus: Crear un usuario en la aplicación cuya contraseña no pueda ser visualizada por los demas.
- Artifact:Frontend, Backend, Base de datos.
- Enviroment: Aplicación bajo condiciones normales.
- Response: Las contraseñas deben estar encriptadas.
- Response Measure: Las contraseñas del usuario deben aparecer en un lenguaje indistinguible para el usuario en la base de datos y en usuario.html.

[Vista escenario ](https://drive.google.com/file/d/1C09_vet5v_hho4koX7ch1eauRwT1YKmG/view)

Escenario 2:

- Source: Usuario final.
- Stimulus: .
- Artifact: Frontend, Backend, Base de datos.
- Enviroment: Aplicación bajo condiciones normales.
- Response: Las contraseñas deben estar encriptadas.
- Response Measure: Las contraseñas del usuario deben aparecer en un lenguaje indistinguible para el usuario en la base de datos y en usuario.html.

[Vista escenario ]()

### Usabilidad:

Escenario 1:

- Source: Usuario final.
- Stimulus: Usuario que desea publicar un articulo en la aplicación.
- Artifact:Frontend, Backend, Base de datos
- Enviroment: Aplicación bajo condiciones normales
- Response: La publicación se realiza y se puede visualizar  de manera exitosa.
- Response Measure: El cliente es capaz de publiar un artículo desde la pagina principal con tan solo 12 clicks.

[Vista escenario ](https://drive.google.com/file/d/1FJPpD62CW7S_7JEQNey18xL7w0t_dXVm/view)

Escenario 2:

- Source: Usuario final.
- Stimulus: Ofertar por un artículo de forma rápida y automática.
- Artifact: Frontend, Backend, Base de datos.
- Enviroment: Aplicación bajo condiciones normales.
- Response: Aparece una notificación en pantalla del artículo, el usuario y el valor por el que pujó, junto con un botón para pujar por este artículo y su valor automático asociado.
- Response Measure: El usuario puede hacer una oferta con el valor mínimo a pujar dentro de los 10 segundos posteriores a la puja de otro usuario.

[Vista escenario ](https://drive.google.com/file/d/19g02OHWkvh9Rp6udgEPVu8lNsPvCoYOh/view?usp=sharing)

### Escalabilidad:

Escenario 1:

- Source: Usuario final.
- Stimulus: .
- Artifact:Frontend, Backend, Base de datos
- Enviroment: Aplicación bajo condiciones normales
- Response: La publicación se realiza y se puede visualizar  de manera exitosa.
- Response Measure: El cliente es capaz de publiar un artículo desde la pagina principal con tan solo 12 clicks.

[Vista escenario ]()

Escenario 2:

- Source: Usuario final.
- Stimulus: .
- Artifact:Frontend, Backend, Base de datos
- Enviroment: Aplicación bajo condiciones normales
- Response: La publicación se realiza y se puede visualizar  de manera exitosa.
- Response Measure: .

[Vista escenario ]()

### Rendimiento:

Escenario 1:

- Source: Usuario final.
- Stimulus: Soportar la concurrencia de varios usuarios al querer ofertar por un artículo al mismo timpo.
- Artifact: Frontend, Backend, caché, Base de datos.
- Enviroment: Aplicación bajo condiciones normales.
- Response: Solo una persona se queda con la puja y todas las demás son notificadas de quién se quedó con ella.
- Response Measure: Se informa al usuario ganador el éxito de su oferta, y a todos los demás, la oferta ganadora sin clicks adicionales en menos de un segundo.

[Vista escenario ](https://drive.google.com/file/d/1-TM3XnqXd5-N12fRK57U_uI7_clbs5P3/view)

Escenario 2:

- Source: Usuario final.
- Stimulus: .
- Artifact:Frontend, Backend, Base de datos
- Enviroment: Aplicación bajo condiciones normales
- Response: La publicación se realiza y se puede visualizar  de manera exitosa.
- Response Measure: El cliente es capaz de publiar un artículo desde la pagina principal con tan solo 2 clicks.

[Vista escenario ]()
