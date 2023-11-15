// Función INTEGRACION que recibe como parámetro una función
def integracion(f: Double => Double, a: Int, b: Int): Double =
  val x = (a + b)/2
  (b - a)*((f(a) + (4 * f(x)) + f(b))/6)

// Definición de las funciones con las que va a trabajar la función integracion()
def funcion1(x: Double): Double =
  -Math.pow(x, 2) + (8 * x) - 12

def funcion2(x: Double): Double =
  3 * Math.pow(x, 2)

def funcion3(x: Double): Double =
  x + (2 * Math.pow(x, 2)) - Math.pow(x, 3) + (5 * Math.pow(x, 4))

def funcion4(x: Double): Double =
  ((2 * x) + 1)/(Math.pow(x, 2) + x)

def funcion5(x: Double): Double =
  Math.pow(Math.E, x)

def funcion6(x: Double): Double =
  1/Math.sqrt(x - 1)

def funcion7(x: Double): Double =
  1/(1 + Math.pow(x, 2))

// Aprocimación de los valores de las integrales definidas
val aprox1 = integracion(funcion1, 3, 5)

val aprox2 = integracion(funcion2, 0, 2)

val aprox3 = integracion(funcion3, -1, 1)

val aprox4 = integracion(funcion4, 1, 2)

val aprox5 = integracion(funcion5, 0, 1)

val aprox6 = integracion(funcion6, 2, 3)

val aprox7 = integracion(funcion7, 0, 1)

// Función para calcular el error de la aproximaciones
def calculoError(vE: Double, vO: Double) = Math.abs(vE - vO)

// Calculo del error para cada aproximación:
calculoError(7.33, aprox1)

calculoError(8, aprox2)

calculoError(3.333, aprox3)

calculoError(1.09861, aprox4)

calculoError(1.71828, aprox5)

calculoError(0.828427, aprox6)

calculoError(0.785378, aprox7)