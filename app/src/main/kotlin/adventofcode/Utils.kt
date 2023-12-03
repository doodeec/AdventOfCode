package adventofcode

fun getResourceAsStringCollection(resourceName: String) =
    object {}::class.java.classLoader.getResourceAsStream(resourceName)
            ?.bufferedReader()
            ?.readLines()
            ?: emptyList()