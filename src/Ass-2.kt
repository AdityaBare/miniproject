fun grade(mark:Int):Char
{
    if(mark>=90)
    {
        return 'A'
    }
    else if(mark>=85)
    {
        return 'B'
    }
    else
    {
        return 'C'
    }
}

fun main(args: Array<String>)
{
    var mark=88
    var result = grade(mark)
    println("Your getting $result")
}