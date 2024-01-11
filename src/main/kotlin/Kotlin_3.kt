fun main(args:Array<String>){

    val a = "Apple"
    val b = "Banana"
    print(a.getLonggerLength(b)) //a b 중에서 더 긴길이를 갖는 문자열을 출력
}

fun String.getLonggerLength(x:String):String {

    return if (this.length > x.length){
        this
    }else {
        x
    }
}