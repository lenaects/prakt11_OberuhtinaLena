enum class Color
{
    RED,ORANGE,YELLOW,GREEN,BABYBLUE,BLUE,VIOLET;
    open fun Infocolor(number:Int)
    {
        when
        {
            (number==1)->println(Color.RED)
            (number==2)->println(Color.ORANGE)
            (number==3)->println(Color.YELLOW)
            (number==4)->println(Color.GREEN)
            (number==5)->println(Color.BABYBLUE)
            (number==6)->println(Color.BLUE)
            (number==7)->println(Color.VIOLET)
            else ->println("Такого цвета нету")
        }
    }
    open fun Poem(number:Int)
    {

        println("Каждый Охотник Желает Знать Где Сидит Фазан")
        when
        {
            (number==1)->println("${Color.RED}:Каждый")
            (number==2)->println("${Color.ORANGE}:Охотник")
            (number==3)->println("${Color.YELLOW}:Желает")
            (number==4)->println("${Color.GREEN}:Знать")
            (number==5)->println("${Color.BABYBLUE}:Где")
            (number==6)->println("${Color.BLUE}:Сидит")
            (number==7)->println("${Color.VIOLET}:Фазан")
            else ->println("Такого цвета нету")
        }
    }
    open fun Randomcolor():Color{
        println("рандомныйдень цвет радуги")
        return values().random()
    }
open fun raindow():List<Color>{
    println("цвета радуги")
    return values().toList()
}
}