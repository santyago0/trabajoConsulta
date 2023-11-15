# PROGRAMACIÓN FUNCIONAL Y REACTIVA
### Trabajo de consulta
## Higher Order Fuctions

### Objetivos:
- Aplicar los conocimietos sobre funciones de orden superior.
- Enviar una función como parámetro.
### Descripción:
Uno de los métodos de integración numérica se denomina **Simpson 1/3**. Ese método 
establece lo siguiente: 
$$\int_a^b f(x) \ dx \cong (b - a) \frac{f(a) + 4 f(\bar{x}) + f(b)}{6}$$

En dónde:

$\bar{x}$ corresponde a: $\bar{x} = \frac {a + b}{2}$

Un ejemplo de aproximación es el siguiente:
$$I = \int_3^5 (-x^2 + 8x - 12) \ dx \cong 7.33$$

Utilizando los conceptos expuestos anteriormente debe:
1. Crear una función con nombre (*integración*) que use el método **Simpson** para
calcular el valor aproximado de cualquir función $f(x)$. Se recomienda analizar lo 
siguiente:
    - El tipo de dato que devolverá la función *integracion*.
    - ¿Cuáles son los *parámetros* que recibe la función?
2. Aproxima el valor de las siguientes integrales definidas usando la función
   *integracion* creada en el paso 1.
   1. $I = \int_3^5 (-x^2 + 8x - 12) \ dx \cong 7.33$

   2. $I = \int_0^2 3x^2 \ dx \cong 8$

   3. $I = \int_{-1}^{1} (x + 2x^2 - x^3 + 5x^4) \ dx \cong 3.333$

   4. $I = \int_1^2 \frac {2x + 1}{x^2 + x} \ dx \cong 1.09861$

   5. $I = \int_0^1 e^x \ dx \cong 1.71828$

   6. $I = \int_2^3 \frac {1}{\sqrt{x-1}} \ dx \cong 0.828427$

   7. $I = \int_0^1 \frac {1}{1 + x^2} \ dx \cong 0.785398$

4. Calcula el error que se presenta en cada aproximación. El error es igual al valor
   absoluto de la resta entre el valor esperado y el valor obtenido, así: 
$$|valorEsperado - valorObtenido|$$
Para calcular el error, debes elaborar una función que haga el cálculo respectivo.
