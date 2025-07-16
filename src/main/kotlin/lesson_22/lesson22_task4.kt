package org.example.lesson_22

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false,
)

class MainScreenViewModel {
    val mainScreenState: MainScreenState = MainScreenState()

    fun loadData() {
        println(mainScreenState.toString())
        val newState = mainScreenState.copy(data = "Загрузка данных", isLoading = true)
        println(newState.toString())
        val lastState = mainScreenState.copy(data = "Данные загружены", isLoading = false)
        println(lastState.toString())
    }
}

fun main() {
    val mainScreenViewModel = MainScreenViewModel()

    mainScreenViewModel.loadData()
}