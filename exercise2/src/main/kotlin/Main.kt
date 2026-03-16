// ================================================
//   Exercise 2: Network Request State with Sealed Class
//   Demonstrates: Sealed classes, exhaustive when expressions,
//   and safe state handling
// ================================================

// Sealed class representing different network states
sealed class NetworkState {
    object Loading : NetworkState()
    data class Success(val data: String) : NetworkState()
    data class Error(val message: String) : NetworkState()
}

// Function to handle different network states with exhaustive when
fun handleState(state: NetworkState) {
    when (state) {
        is NetworkState.Loading -> {
            println("⏳ Loading in progress...")
        }
        is NetworkState.Success -> {
            println("✅ Success: ${state.data}")
        }
        is NetworkState.Error -> {
            println("❌ Error: ${state.message}")
        }
    }
}

// ================================================
//   Main entry point
// ================================================
fun main() {
    println("================================================")
    println("     NETWORK STATE HANDLING - SEALED CLASS      ")
    println("================================================\n")

    // Create different network states
    val states = listOf(
        NetworkState.Loading,
        NetworkState.Success("User data loaded"),
        NetworkState.Error("Network timeout"),
        NetworkState.Loading,
        NetworkState.Success("Profile information retrieved"),
        NetworkState.Error("Connection refused")
    )

    // Process each state
    println("--- Processing Network States ---")
    states.forEach { state ->
        handleState(state)
    }

    println()
    println("================================================")
    println("  Why Sealed Classes Are Great:")
    println("  ✓ Type-safe: Only defined subtypes can exist")
    println("  ✓ Exhaustive: Compiler warns if 'when' misses cases")
    println("  ✓ Clear: State transitions are explicit and visible")
    println("  ✓ Safe: No invalid states can be created")
    println("================================================")

    // Example: Demonstrating the sealed class benefit
    println("\n--- Advanced Example: Chaining State Handling ---")
    
    fun processNetworkResult(state: NetworkState): String {
        return when (state) {
            is NetworkState.Loading -> "Processing request..."
            is NetworkState.Success -> "Data: ${state.data} | Status: Complete"
            is NetworkState.Error -> "Failed with: ${state.message} | Status: Retry"
        }
    }

    states.forEach { state ->
        println(processNetworkResult(state))
    }

    println()
    println("✨ Sealed classes make state handling exhaustive and safe!")
}
