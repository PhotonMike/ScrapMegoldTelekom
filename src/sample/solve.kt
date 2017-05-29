package sample

class solve {
    companion object
    {
        fun solve(input:String)
        {
            var i = 0
            var inside = false
            var deg = 0.00
            var mass = arrayOfNulls<Float>(9)
            var masscurr = 0
            var curr = ""
            while (i<=input.length)
            {
                if (inside)
                {
                    if (input.substring(i,i+3).equals("); "))
                    {
                        inside = false
                        mass[masscurr]=curr.toFloat()
                        masscurr++
                        curr = ""
                        i+=2
                    }
                    else if (input.substring(i,i+2).equals(", "))
                    {
                        deg += curr.toFloat()
                        curr = ""
                        i++
                    }
                    else
                    {
                        curr += input.substring(i, i+1)
                    }
                }
                else if (input.substring(i,i+1).equals("("))
                {
                    inside = true
                }
                i++
            }
            var degfin = Math.floor(Math.sin(deg)*100)
            var masstemp = 0.00
            var egy = 1.00
            for (i in mass.indices){}
        }
    }
}