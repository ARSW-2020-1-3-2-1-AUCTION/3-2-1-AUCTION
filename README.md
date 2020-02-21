# 3-2-1-AUCTION
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
- QUIERO cargar dinero a mi cuenta PARA PODER ofertar por los articulos de mi interes.
- **QUIERO** publicar los posibles articulos que deseo PARA PODER dar a conocer a las personas que existe una necesidad que pueden suplir.
- **QUIERO** pujar automaticamente por un articulo de mi interes PARA PODER competir por él cuando no pueda estar presente en el tiempo de subasta.
- **QUIERO** ver un evento con la fecha y hora en un calendario de los artículos de mi interés PARA PODER organizar mi participaón en su subasta.
- **QUIERO** tener tiempo adicional según la cantidad de pujas PARA PODER tener ventaja sobre cierta cantidad de clientes.


### Vendedor:

![](/img/CasosVendedor.jpg)

- QUIERO ofrecer los productos de mi pertenencia PARA PODER lograr un beneficio económico
- QUIERO Conocer información sobre los precios de productos similares al que voy a publicar PARA PODER establecer un precio base competente y coherente, además de estimar el precio de venta final

Se ha planteado un **digrama de clases** inicial el cual está orientado a resolver los conflictos ya descritos como sigue:

![](/img/DiagramaDeClases.jpg)

Se definieron **diagramas de secuencia** de alto nivel con las funcionalidades más importantes:



Para satisfacer el requisito de una **interfaz gráfica** agradable y sencilla, se usó la herramienta Mockflow para diseñar su apariencia:

- Interfaz del login de usuario:

![](/img/InterfazUsuario2.PNG)

- Interfaz para crear una cuenta:

![](/img/InterfazUsuario3.PNG)

- Interfaz de la página principal:

![](/img/InterfazUsuario1.PNG)

- Interfaz de la búsqueda de un artículo usando algunos filtros

![](/img/InterfazUsuario4.PNG)

- Interfaz para realizar una oferta sobre un artículo:

![](/img/InterfazUsuario5.PNG)







