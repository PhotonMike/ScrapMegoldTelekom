package megoldo

class solve {
    companion object
    {
        fun solve(input:String):String
        {
            var i = 0
            var inside = false
            var deg = 0.00
            var mass = arrayOfNulls<Float>(9)
            var masscurr = 0
            var curr = ""
            while (i<=input.length)
            {
                if (i>input.length-1)
                {
                    i=input.length+1
                }
                else
                {
                    if (inside)
                    {
                        if (input.substring(i,i+3)=="); ")
                        {
                            inside = false
                            mass[masscurr]=curr.toFloat()
                            masscurr++
                            curr = ""
                            i+=2
                        }
                        else if (input.substring(i,i+2)==", ")
                        {
                            deg += curr.toDouble()
                            curr = ""
                            i++
                        }
                        else
                        {
                            curr += input.substring(i, i+1)
                        }
                    }
                    else if (input.substring(i,i+1)=="(")
                    {
                        inside = true
                    }
                }
                i++
            }
            var degfin = Math.floor(Math.sin(Math.toRadians(deg))*100).toInt()
            var massfin = 0.00
            i = 0
            while (i<masscurr)
            {
                massfin += 1.00 / mass[i]!!
                i++
            }
            massfin = Math.ceil(masscurr/massfin)
            return (degfin.toString()+","+massfin.toInt().toString())
        }
    }
}