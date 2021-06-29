typealias SingleTypeMap<T> = Map<T, T>
typealias DoubleTypeMap<K, V> = Map<K, V>

fun <K, V> Map<K, V>.swapMap() {}
fun <T> SingleTypeMap<T>.swapSingleTypeMap() {}
fun <K, V> DoubleTypeMap<K, V>.swapDoubleTypeMap() {}


fun foo(map: Map<*, *>, singleTypeMap: SingleTypeMap<*>, doubleTypeMap: DoubleTypeMap<*, *>) {
    map.swapMap()
    singleTypeMap.swapSingleTypeMap()
    doubleTypeMap.swapDoubleTypeMap()
}

fun main() {
    val map = mapOf(Pair("hello", "world"))
    foo(map, map, map)
}
