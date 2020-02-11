# 3-2-1-AUCTION
**Desarrollado por:**
- David Eduardo Caycedo Moyano
- David Mateo Gonzalez Grimaldos
- Diego Alejandro Puerto Gómez

#### **Resumen:**


    
#### **Descripción**

La idea surge cuando se percibe que algunos objetos que poseemos ya no son usados, tienen un valor considerable y pueden ser útiles para otras personas. De allí, se desarrolla la idea de que una subasta de artículos usados a nivel de universidades sería un sistema ideal para vender dichos productos al mejor precio posible, y por su forma de operación, generar satisfacción tanto al vendedor como al comprador. Pero esta idea fue escalando más y más en alcance y objetivos, hasta llegar al punto que no tenía por qué sesgarse a universidades, y podía ser desarrollada pensando en el público más amplio. También se amplió la visión de que no tenía que ser únicamente de artículos usados, sino que se podrían publicar productos nuevos  respondiendo a necesidades netamente de negocios.

Aunque existen varias páginas que realizan esta operación, no se tiene una que sea un claro referente para las personas que no están sumergidas en este mundo, por lo que se establece que existe una motivación suficiente para desarrollar puntos diferenciales y nuevos comportamientos que innoven en este sistema de ventas.

Observando páginas que operan con este sistema de ventas, notamos puntos débiles como que la variedad de productos es muy amplia, lo cual deriva en dos problemas puntuales: El primero es que varias de las categorias están vacias, no poseen productos para subastar. El segundo es que no se puede estudiar concretamente un público objetivo; al acotar dicho público, se puede personalizar y brindar un funcionamiento más agradable para los usuarios, lo cual, al mismo tiempo impulsaría que no se tengan categorías vacías. Se observa también que muchas páginas tinen una interfaz muy sobrecargada de información, lo cual la hace menos llamativa para el usuario:

![](/img/sobrecarga.jpg)

Debido a esto, queremos desarrollar una página web la cual modifique la forma de ver e interactuar las subastas en línea que se tiene actualmente, ofreciendo una interfaz sencilla y agradable para los usuarios, que posea características únicas en su funcionamiento y de este modo ser la predilecta para realizar este tipo de negocios.

Se realizó un **diagrama de casos de uso** con las funcionalidades más destacadas del funcionamiento previsto:

![](/img/CasosDeUso.jpg)

Se ha planteado un **digrama de clases** inicial el cual está orientado a resolver los conflictos ya descritos como sigue:

![](/img/DiagramaDeClases.jpg)

Se definieron **diagramas de secuencia** de alto nivel con las funcionalidades más importantes:



Para satisfacer el requisito de una **interfaz gráfica** agradable y sencilla, se usó la herramienta Mockflow para diseñar su apariencia:

Interfaz de la página principal:

![](/img/InterfazUsuario1.PNG)

Interfaz del login de usuario:

![](/img/InterfazUsuario2.PNG)

Interfaz para crear una cuenta:

![](/img/InterfazUsuario3.PNG)

Interfaz de la búsqueda de un artículo usando algunos filtros

![](/img/InterfazUsuario4.PNG)

Interfaz para realizar una oferta sobre un artículo:

![](/img/InterfazUsuario5.PNG)

#### **Historias de usuario**

- Como Comprador:

- Ofertar por articulos de interes: COMO comprador QUIERO ofertar por los articulos de interes PARA PODER adquirir un bien.
- Cargar dinero a mi cuenta: COMO comprador QUIERO cargar dinero a mi cuenta PARA PODER ofertar por los articulos de mi interes.
- Publicar posibles articulos de interes: COMO comprador QUIERO publicar los posibles articulos que deseo PARA PODER dar a conocer a las personas que existe una necesidad que pueden suplir.
- Tener recomendaciones sobre cuando subir la oferta: COMO comprador QUIERO tener un sistema personalizado que me recomiende cuando pujar PARA PODER tener una orientación correcta que me lleve a la adquisición de un bien

- Como vendedor:

- Ofrecer productos: COMO vendedor QUIERO ofrecer productos que no requiero PARA PODER obetener un beneficio monetario sobre ellos.
- Conocer precios similares de lo que voy a publicar: COMO vendedor QUIERO conocer los precios de articulos similares al que estoy ofreciendo PARA PODER tener una idea acertada sobre el precio que debo brindar par maximizar mis ganancias.
- Extender el tiempo de la subasta: COMO vendedor QUIERO extender el tiempo de la subasta si mucha gente esta ofertando PARA PODER obtener la mayor oferta posible


