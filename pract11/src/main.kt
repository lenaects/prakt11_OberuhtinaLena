fun main(){
    println("С какикм классщм хотите работать: день/цвет")
    var otv=readLine()!!.toString()
    while(true){
        if(otv=="день"||otv=="цвет")break
        else{
            println("некоректно вееден тексе,введите еще раз")
            otv=readLine()!!.toString()
        }
    }
    when(otv)
    {
        "день"->
        {
            var Day:Days=Days.Monday
            println("введите  номер дня недели")
            var num=readLine()!!.toInt()
            Day.Infoday(num)
            println("введите  номер дня недели")
            num=readLine()!!.toInt()
            Day.Weekdays(num)
            println(Day.Random())
            println(Day.PastDay())
        }
        "цвет"->{
            var Colors:Color=Color.RED
            println("введите  номер цвета")
            var num1=readLine()!!.toInt()
            Colors.Infocolor(num1)
            println("введите  номер цвета")
            num1=readLine()!!.toInt()
            Colors.Poem(num1)
            println(Colors.Randomcolor())
            println(Colors.raindow())

        }
    }

}