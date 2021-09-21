
import java.util.*

fun main()
{
    printing()
    println("-------------------------------------------------")
    country()
    println("-------------------------------------------------")
    countryposs()
    println("-------------------------------------------------")
    reverseString()
    println("-------------------------------------------------")
    leapYear()
    println("-------------------------------------------------")
    printPattern()
    println("-------------------------------------------------")
    Decreasing()
    println("-------------------------------------------------")
    averageArray()
    println("-------------------------------------------------")
    uniqueElement()
    println("-------------------------------------------------")
    repeated()
    println("-------------------------------------------------")
    charOccurance()
    println("-------------------------------------------------")
    couponDiscount()
    println("-------------------------------------------------")
    printVersion()
    println("-------------------------------------------------")
    reverseArr()
    println("-------------------------------------------------")
}

fun reverseArr() {
    println("Reverse of array")
    val arr= arrayOf(-12, -39, 12, 41, 22, 44)
    var sum=0
    for (i in arr.size-1 downTo 0)
        println(arr[i])
}

fun printVersion() {
    println("Print Versionr")
    for(i in 1..9)
    {
        for (j in 1..9)
        {
            for (k in 1..9)
            {
                println(""+i+"."+j+"."+k)
            }
        }
    }
}

fun couponDiscount() {
    println("Coupon Discount")
    println("Enter price")
    val read = Scanner(System.`in`)
    var a=read.nextInt()
    var disc=a/10
    if(disc>300) println(a-300)else if (a<100)
        println(a)else println(a-disc)
}

fun charOccurance() {
    println("Character Occurence")
    var s="Masai School"
    println(s)
    var al= arrayListOf<Char>()
    for (i in 0..s.length-1 )
    {
        var c=s.get(i)
        var count=0
        if (!al.contains(c))
        {
            for (j in i..s.length-1) {
                if (c ==s.get(j))
                    count++;
            }
        }
        if (!al.contains(c)&&c!=' ')
        {
            al.add(c)
            println(c+"-"+count)
        }
    }
}

fun repeated() {
    println("Repeated element")
    val arr= arrayOf(10, 10, 20,20,-20)
    for (i in 0..arr.size-1 )
    {
        var a=arr[i]
        var bool=0
        for (j in 0..arr.size-1 )
        {
            if(a==arr[j])
            {
                bool++
            }
        }
        if (bool>1)
            println(a)
    }
}

fun uniqueElement() {
    println("Unique element")
    val arr= arrayOf(10 ,20 ,30 ,10 ,40, -2 ,30)
    for (i in 0..arr.size-1 )
    {
        var a=arr[i]
        var bool=0
        for (j in 0..arr.size-1 )
        {
            if(a==arr[j])
            {
                bool++
            }
        }
        if (bool==1)
            println(a)
    }
}

fun averageArray() {
    println("Average of array")
    val arr= arrayOf(-12, -39, 12, 41, 22, 44)
    var sum=0
    for (i in 0..arr.size-1 )
        sum+=arr[i]
    println("average="+(sum/arr.size))
}

fun Decreasing() {
    println("Decreasing number")
    println("Starting number")
    val read =Scanner(System.`in`)
    var a=read.nextInt()
    println("Enter step number")
    val b=read.nextInt()
    for (i in a downTo 0 step b)
        println(i)
}

fun leapYear() {
    println("Leap Year")
    println("Enter a year")
    val read=Scanner(System.`in`)
    var a=read.nextInt()
    if (a%4==0&&a%100!=0) println("Leap Year")else if (a%400==0) println("Leap Year") else println("Not aLeap Year")
}

fun reverseString() {
    println("String Reversing")
    var s="abcdef"
    for (i in s.length-1 downTo 0)
    {
        print(s.get(i))
    }
    println()
}

fun countryposs() {
    println("Country Possition")
    var cont= arrayListOf("India","Nepal","Bhutan","China","Pakistan")
    println("Enter country")
    var s= readLine()
    if (cont.contains(s)) println("$s found at "+cont.indexOf(s))else println("No")
}

fun country() {
    println("Country Present or Not")
    var cont= arrayListOf("India","Nepal","Bhutan","China","Pakistan")
    println("Enter country")
    var s= readLine()
    if (cont.contains(s)) println("Yes")else println("No")
}
fun printPattern() {
    println("Version Pattern")
    for (i in 1..4 step 1)
    {
        for (j in 1..3 step 1)
            println(""+i+"."+j)
    }
}

fun printing()
{
    println("Masai School")
}