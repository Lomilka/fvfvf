import java.util.*
import kotlin.math.*

fun zad3_13() {
    println("Задание 3.13")

    var x: Float? = null
    val y: Float
    val sc = Scanner(System.`in`)
    println("Введите x")
    x = sc.nextFloat()

    if (x <= 0.0) {
        y = 0.00f

    } else if (0 < x && x <= 1) {
        y = x

    } else {
        y = x * x
    }

    println("y = " + y)
}

fun zad3_15() {
    println("Задание 3.15")

    val sc = Scanner(System.`in`)
    val otwet: Double
    val x: Int
    val y: Int
    val r: Int

    System.out.println("Введите x")
    x = sc.nextInt();
    System.out.println("Введите y")
    y = sc.nextInt();
    System.out.println("Введите r")
    r = sc.nextInt()

    otwet = Math.sqrt((x * x + y * y).toDouble())

    if (otwet <= r) {
        System.out.println("[x ; y] принадлежит кругу")
    } else {
        System.out.println("[x ; y] не принадлежит кругу")
    }
}

fun zad3_18() {
    println("Задание 3.18")

    val sc = Scanner(System.`in`)
    val otwet: Double
    val a1: Double
    val b1: Double
    val c1: Double
    val a2: Double
    val b2: Double
    val c2: Double
    val a3: Double
    val b3: Double
    val c3: Double

    System.out.println("Введите a1")
    a1 = sc.nextDouble()
    System.out.println("Введите b1,")
    b1 = sc.nextDouble()
    System.out.println("Введите c1")
    c1 = sc.nextDouble()
    System.out.println("Введите a2")
    a2 = sc.nextDouble()
    System.out.println("Введите b2")
    b2 = sc.nextDouble()
    System.out.println("Введите c2")
    c2 = sc.nextDouble()
    System.out.println("Введите a3")
    a3 = sc.nextDouble()
    System.out.println("Введите b3")
    b3 = sc.nextDouble()
    System.out.println("Введите c3")
    c3 = sc.nextDouble()
    otwet = 0.0

    if (otwet == a1 * b2 * c3 + a2 * b3 * c1 + a3 * b1 * c2 - a3 * b2 * c1 - a2 * b1 * c3 - a1 * b3 * c2) {
        System.out.println("Прямые пересекаются")
    } else {
        System.out.println("Прямые не пересекаются")
    }
}

fun zad4_2() {
    println("Задание 4.2")

    val sc = Scanner(System.`in`)
    var i: Double = 2.0
    var a: Double
    System.out.println("b = ");
    val b: Double = sc.nextDouble();
    a = b;
    while (a < 0) {
        a = (a + Math.abs(Math.sin(i))) / (i - Math.pow(Math.sin(i), 2.0));
        System.out.printf("%d %.6f %b\n", i, a, a < 0);
        i = i + 1;

    }
    System.out.println("\n a = " + a);
}

fun zad4_4() {
    println("Задание 4.4")

    val sc = Scanner(System.`in`)
    var fx: Double = 0.0
    var x: Double = 0.0
    var i: Int = 0

    System.out.println("xn ( которое <= 0 ) и h");
    var xn: Double = sc.nextDouble()
    var h: Double = sc.nextDouble()

    x = xn;
    while (Math.exp(0.2 * x) < 5 * Math.abs(xn)) {
        fx = Math.exp(0.2 * x) + Math.pow(Math.exp(0.2 * x), 1.0 / 3.0) + Math.pow(Math.exp(0.2 * x), 1.0 / 5.0)
        System.out.printf("%.2f \n", fx)
        x = x + h
    }
}

fun zad4_7() {
    println("Задание 4.7")

    val sc = Scanner(System.`in`)
    var n: Double = 0.0
    var i: Double = 1.0

    System.out.println("а = ")
    val a: Double = sc.nextDouble()

    while (a >= n) {
        n = n + 1.0 / i
        i = i + 1.0
    }
    System.out.println("№ 1-го числа (которое больше a) = " + i)
}

fun zad4_9() {
    println("Задание 4.9")

    val sc = Scanner(System.`in`)
    var nod: Int = 0
    var nok: Int = 0
    var m: Int = 0
    var n: Int = 0

    System.out.println("n = ")
    var nnachalo: Int = sc.nextInt()
    System.out.println("m = ")
    var mnachalo: Int = sc.nextInt()

    m = mnachalo
    n = nnachalo

    if (m == 0 && n == 0) {
        System.out.printf("Задайте другое значение, невозможно найти НОК")
    }
    while (m > 0 && n > 0) {
        if (n % m == 0) {
            nod = m
            break
        } else if (m % n == 0) {
            nod = n
            break
        } else if (n > m) {
            n = n % m
        } else {
            m = m % n
        }
        if (m % n == 0) {
            nod = n
            break
        } else if (n % m == 0) {
            nod = m
            break
        } else if (m > n) {
            m = m % n
        } else {
            n = n % m
        }
    }
    nok = mnachalo * nnachalo / nod
    System.out.println("НОК = " + nok)
}

fun zad4_13() {
    println("Задание 4.13")

    val sc = Scanner(System.`in`)
    var i: Int = 0
    var otvet: Boolean = true

    System.out.println("n = ")
    var n: Int = sc.nextInt()


    i = 2
    while (i <= Math.sqrt(Math.abs(n).toDouble())) {
        if (n % i == 0) {
            otvet = false
            break
        }
        i++
    }

    if (otvet == true) {
        System.out.println("Число простое")
    } else {
        System.out.println("Число не простое")
    }
}

fun zad4_15() {
    println("Задание 4.15")

    val sc = Scanner(System.`in`)
    var otvet: Boolean = false

    System.out.println("Ваше число = ")
    var n: Int = sc.nextInt()

    while (n > 0) {
        if (n % 10 == 5) {
            otvet = true
            break
        } else {
            n = n / 10
        }
    }
    if (otvet == true) {
        System.out.println("Здесь есть цифра 5!")
    } else {
        System.out.println("Здесь нет цифры 5!")
    }
}

fun zad4_18() {
    println("Задание 4.18")

    val sc = Scanner(System.`in`)
    var n: Int
    var pr: Int
    var otvet: Boolean = true

    System.out.println("Ваше число = ")
    n = sc.nextInt()

    pr = n % 10
    n = n / 10

    while (n > 0) {
        if (pr >= n % 10) {
            otvet = false
            break
        } else {
            pr = n % 10
            n = n / 10
        }

    }
    if (otvet == true) {
        System.out.println("Цифры в этом числе расположены по убыванию")
    } else {
        System.out.println("Цифры в этом числе расположены НЕ по убыванию")
    }
}

fun zad4_41_1() {
    println("Задание 4.41(1)")

    val sc = Scanner(System.`in`)
    val i: Int = 1
    var summa: Double = 0.0
    var factorial: Double = 1.0

    System.out.println("n = ")
    var n: Int = sc.nextInt()

    for (i in 1..n) {
        factorial = factorial * i
        summa = summa + Math.pow(-1.0, i.toDouble()) * (i + 1) / factorial
    }

    System.out.println("Ответ = " + summa)
}

fun zad4_41_2() {
    println("Задание 4.41(2)")

    val sc = Scanner(System.`in`)
    var i: Int = 1
    var j: Int = 1
    var sumj: Double = 0.0
    var sumi: Double = 0.0
    var factorial: Double = 1.0

    System.out.println("n = ")
    val n: Int = sc.nextInt()

    while (i <= n) {
        j = 1
        while (j <= i) {
            sumj = sumj + 1.0 / j
            j++
        }
        factorial = factorial * i
        sumi = sumi + factorial / sumj
        i++
    }
    System.out.println("Ответ = " + sumi)
}

fun zad5_9() {
    println("Задание 5.9")

    fun func9(x: Int, n: Int): Double {
        var s = 0.0
        s = when (n) {
            2 -> (1 + Math.cos((2 * x).toDouble())) / 2
            3 -> (3 * Math.cos(x.toDouble()) + Math.cos((3 * x).toDouble())) / 4
            4 -> (3 + 4 * Math.cos((2 * x).toDouble()) + Math.cos((4 * x).toDouble())) / 8
            5 -> 10 * Math.cos(x.toDouble()) + 5 * Math.cos((3 * x).toDouble()) + Math.cos((5 * x).toDouble()) / 16
            else -> 0.0
        }
        return s
    }

    val sc = Scanner(System.`in`)
    System.out.println("n = "); //n >= 2; n <=5
    var n: Int = sc.nextInt();
    System.out.println("x = ");
    var x: Int = sc.nextInt();

    var otwet: Double = func9(x, n);
    System.out.println("Ответ = " + otwet);

}

fun zad5_12() {
    println("Задание 5.12")

    fun func12(m: Int): Int {
        var n = 0
        var s = 0
        while (n < m) {
            if (n % 2 != 0) {
                s = s + n
            }
            n++
        }
        return s
    }

    val sc = Scanner(System.`in`)
    System.out.println("m = "); //n >= 2; n <=5
    var m: Int = sc.nextInt();

    var otwet: Int = func12(m);
    System.out.println("Ответ = " + otwet);

}

fun zad5_13() {
    println("Задание 5.13")

    fun func13(m: Int, a: Int, b: Int): Int {
        var n = a
        var s = 0
        while (n <= b) {
            if (n % m == 0) {
                s = s + n
            }
            n++
        }
        return s
    }

    val sc = Scanner(System.`in`)
    System.out.println("a = ")
    var a: Int = sc.nextInt()
    System.out.println("b = ")
    var b: Int = sc.nextInt()
    System.out.println("m = ")
    var m: Int = sc.nextInt()

    var otwet: Int = func13(m, a, b)
    System.out.println("Ответ = " + otwet)

}

fun zad3_8() {
    println("Задание 3.8")

    val sc = Scanner(System.`in`)
    System.out.println("Ваше число = ")
    var chislo: Int = sc.nextInt()
    var des: Int = chislo % 100
    var eden: Int = des % 10
    des = des / 10


    System.out.println("Решение через if/else:")
    if (chislo >= 100 && chislo <= 999 || chislo <= -100 && chislo >= -999) {
        System.out.println("Ваше число трёхзначное")
        System.out.println("Два последних числа: $des и " + eden)
    } else {
        System.out.println("Ваше число не трёхзначное")
    }


    System.out.println("Решение через if:")
    if (chislo >= 100 && chislo <= 999 || chislo <= -100 && chislo >= -999) {
        System.out.println("Ваше число трёхзначное")
        System.out.println("Два последних числа: $des и " + eden)
    }
    if (chislo < -999 || chislo > -100 && chislo < 100 || chislo > 999) {
        System.out.println("Ваше число не трёхзначное")
    }


    System.out.println("Решение через тернарный оператор when:")
    when (chislo) {
        in 100..999 -> print("Ваше число трёхзначное. \nДва последних числа: $des и " + eden)
        in -999..-100 -> print("Ваше число трёхзначное")
        else -> {
            print("Ваше число не трёхзначное")
        }
    }
}

fun zad3_9() {
    println("Задание 3.9")

    val sc = Scanner(System.`in`)
    System.out.println("Ваше число = ")
    var chislo: Int = sc.nextInt()
    var dvuchznak: Boolean = false
    var trechznak: Boolean = false
    var eden: Int = chislo % 10
    var des: Int = chislo % 100 / 10
    var sotni: Int = chislo % 1000 / 100
    var otwet: Int = 0
    val massiv = arrayOf(abs(eden), abs(des), abs(sotni))

    System.out.println("Решение через if/else:")
    if (chislo >= 100 && chislo <= 999 || chislo <= -100 && chislo >= -999) {
        System.out.println("Ваше число трёхзначное")
        trechznak = true
    } else if (chislo >= 10 && chislo <= 99 || chislo <= -10 && chislo >= -99) {
        System.out.println("Ваше число двухзначное")
        dvuchznak = true
    } else {
        System.out.println("Ваше число не трёхзначное и не двухзначное")
    }

    if (dvuchznak) {
        for (number in massiv) {
            if (number != 0) {
                otwet += number
            }
        }
        System.out.println("сумма цифр числа = $otwet")
    }

    if (trechznak) {
        otwet = 1
        for (number in massiv) {
            if (number != 0) {
                otwet *= number
            }
        }
        println("произведение цифр числа = $otwet")
    }
}
fun main() {
    val sc = Scanner(System.`in`)
    zad3_13()
    zad3_15()
    zad3_18()
    zad4_2()
    zad4_4()
    zad4_7()
    zad4_9()
    zad4_13()
    zad4_15()
    zad4_18()
    zad4_41_1()
    zad4_41_2()
    zad5_9()
    zad5_12()
    zad5_13()
    zad3_8()
    zad3_9()
}