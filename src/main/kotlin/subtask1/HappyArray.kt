package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArray: MutableList<Int> = sadArray.toMutableList()
        var isChecked = false

        if (happyArray.size != 0) {

            while (!isChecked) {
                isChecked = true

                for (i in 1 until happyArray.size - 1) {
                    if (isBadElement(happyArray, i)) {
                        happyArray.removeAt(i)
                        isChecked = false
                        break
                    }
                }
            }

            return happyArray.toIntArray()
        } else if (happyArray.size == 0) {
            return sadArray
        } else {
            throw NotImplementedError("Not implemented")
        }
    }

    private fun isBadElement(list: MutableList<Int>, index: Int) = when {
        list[index] > list[index - 1] + list[index + 1] -> true
        else -> false
    }
}
