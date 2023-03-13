enum class Days
{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
    open fun Infoday( number:Int)
    {
        when
        {
            (number==1)->println(Days.Monday)
            (number==2)->println(Days.Tuesday)
            (number==3)->println(Days.Wednesday)
            (number==4)->println(Days.Thursday)
            (number==5)->println(Days.Friday)
            (number==6)->println(Days.Saturday)
            (number==7)->println(Days.Sunday)
            else ->println("Такого дня нету")
        }
    }
    open fun Weekdays(number: Int)
    {
        when
        {
            (number==1)->println("${Days.Monday}:рабочий день")
            (number==2)->println("${Days.Tuesday}:рабочий день")
            (number==3)->println("${Days.Wednesday}:рабочий день")
            (number==4)->println("${Days.Thursday}:рабочий день")
            (number==5)->println("${Days.Friday}:рабочий день")
            (number==6)->println("${Days.Saturday}:выходной день")
            (number==7)->println("${Days.Sunday}:выходной  день")
            else ->println("Такого дня нету")
        }
    }
    open fun Random():Days{
        println("рандомныйдень день недели")
        return values().random()
    }
    open fun PastDay()
    {
        println("введите день недели")
        var day:String
       while(true){
           try{
               day=Days.valueOf(readln()!!).toString()
               break
           }
           catch (e:Exception)
           {
               println("невернный ввод,введите еще раз")
           }
       }
        val days=Days.values().toList()
        for(i in 0..6){
            if(day=="Понедельник")println("предыдущий день  Воскресенье")
            else if (day==days[i].toString()){
                println("предыдущий день ${days[i-1]}")
                break
            }
        }
    }

}