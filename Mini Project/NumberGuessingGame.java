package mini_projects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Enum to represent discrete difficulty levels with associated game parameters
enum DifficultyLevel {
	EASY(1, 50, 10, 3),      // range: 1-50, attempts: 10, hint frequency: every 3 guesses
	MEDIUM(1, 100, 7, 5),    // range: 1-100, attempts: 7, hint frequency: every 5 guesses
	HARD(1, 200, 5, 7);      // range: 1-200, attempts: 5, hint frequency: every 7 guesses
	
	private final int minRange;
	private final int maxRange;
	private final int maxAttempts;
	private final int hintFrequency;
	
	DifficultyLevel(int minRange, int maxRange, int maxAttempts, int hintFrequency) {
		this.minRange = minRange;
		this.maxRange = maxRange;
		this.maxAttempts = maxAttempts;
		this.hintFrequency = hintFrequency;
	}
	
	public int getMinRange() { return minRange; }
	public int getMaxRange() { return maxRange; }
	public int getMaxAttempts() { return maxAttempts; }
	public int getHintFrequency() { return hintFrequency; }
}

// DifficultyManager class to track performance metrics and adjust difficulty
class DifficultyManager {
	private DifficultyLevel currentDifficulty;
	private List<Long> responseTimes;  // Response times in milliseconds for each guess
	private int successCount;          // Number of successful rounds
	private int totalRounds;           // Total rounds played
	
	// Thresholds for difficulty adjustment
	private static final double SUCCESS_RATE_INCREASE_THRESHOLD = 0.70;  // 70%
	private static final double SUCCESS_RATE_DECREASE_THRESHOLD = 0.30;  // 30%
	private static final long RESPONSE_TIME_FAST_THRESHOLD = 5000;       // 5 seconds
	private static final long RESPONSE_TIME_SLOW_THRESHOLD = 15000;      // 15 seconds
	
	public DifficultyManager() {
		this.currentDifficulty = DifficultyLevel.MEDIUM;  // Start with MEDIUM difficulty
		this.responseTimes = new ArrayList<>();
		this.successCount = 0;
		this.totalRounds = 0;
	}
	
	/**
	 * Record the result of a round (success/failure) and response times for each guess
	 * @param isSuccess whether the player successfully guessed the number
	 * @param roundResponseTimes list of response times for each guess in the round
	 */
	public void recordRoundResult(boolean isSuccess, List<Long> roundResponseTimes) {
		if (isSuccess) {
			successCount++;
		}
		totalRounds++;
		responseTimes.addAll(roundResponseTimes);
		
		// Adjust difficulty based on performance metrics
		adjustDifficulty();
	}
	
	/**
	 * Calculate success rate from recorded rounds
	 * @return success rate as a decimal (0.0 to 1.0)
	 */
	private double calculateSuccessRate() {
		if (totalRounds == 0) {
			return 0.0;
		}
		return (double) successCount / totalRounds;
	}
	
	/**
	 * Calculate average response time across all recorded guesses
	 * @return average response time in milliseconds
	 */
	private long calculateAverageResponseTime() {
		if (responseTimes.isEmpty()) {
			return 0;
		}
		long totalTime = 0;
		for (long time : responseTimes) {
			totalTime += time;
		}
		return totalTime / responseTimes.size();
	}
	
	/**
	 * Apply rule-based logic to adjust difficulty based on performance metrics
	 */
	private void adjustDifficulty() {
		double successRate = calculateSuccessRate();
		long avgResponseTime = calculateAverageResponseTime();
		
		// Increase difficulty if player is performing too well
		if (successRate >= SUCCESS_RATE_INCREASE_THRESHOLD || avgResponseTime < RESPONSE_TIME_FAST_THRESHOLD) {
			if (currentDifficulty != DifficultyLevel.HARD) {
				currentDifficulty = DifficultyLevel.HARD;
				System.out.println("📈 Difficulty increased to HARD!");
			}
		}
		// Decrease difficulty if player is struggling
		else if (successRate <= SUCCESS_RATE_DECREASE_THRESHOLD || avgResponseTime > RESPONSE_TIME_SLOW_THRESHOLD) {
			if (currentDifficulty != DifficultyLevel.EASY) {
				currentDifficulty = DifficultyLevel.EASY;
				System.out.println("📉 Difficulty decreased to EASY!");
			}
		}
		// Keep MEDIUM difficulty for balanced performance
		else {
			if (currentDifficulty != DifficultyLevel.MEDIUM) {
				currentDifficulty = DifficultyLevel.MEDIUM;
				System.out.println("⚖️ Difficulty set to MEDIUM!");
			}
		}
	}
	
	/**
	 * Get the current difficulty level
	 * @return current DifficultyLevel
	 */
	public DifficultyLevel getCurrentDifficulty() {
		return currentDifficulty;
	}
	
	/**
	 * Get performance statistics
	 * @return formatted string with success rate and average response time
	 */
	public String getPerformanceStats() {
		double successRate = calculateSuccessRate();
		long avgResponseTime = calculateAverageResponseTime();
		return String.format("Success Rate: %.1f%% | Avg Response Time: %d ms", 
			successRate * 100, avgResponseTime);
	}
}

public class NumberGuessingGame {
	
	private static DifficultyManager difficultyManager;
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		difficultyManager = new DifficultyManager();
		
		System.out.println("=== Welcome to Number Guessing Game ===");
		System.out.println("Instructions:");
		System.out.println("1. Guess the number within the given range");
		System.out.println("2. Enter -1 to exit the game");
		System.out.println("3. Difficulty will adjust based on your performance");
		System.out.println();
		
		boolean playAgain = true;
		while (playAgain) {
			playRound();
			
			System.out.println("
Do you want to play another round? (yes/no): ");
			String response = sc.next().toLowerCase();
			playAgain = response.equals("yes") || response.equals("y");
		}
		
		System.out.println("
=== Game Statistics ===");
		System.out.println(difficultyManager.getPerformanceStats());
		System.out.println("Thanks for playing!");
		sc.close();
	}
	
	/**
	 * Play a single round of the game with current difficulty settings
	 */
	private static void playRound() {
		DifficultyLevel difficulty = difficultyManager.getCurrentDifficulty();
		int minRange = difficulty.getMinRange();
		int maxRange = difficulty.getMaxRange();
		int maxAttempts = difficulty.getMaxAttempts();
		int hintFrequency = difficulty.getHintFrequency();
		
		System.out.println("
--- New Round (Difficulty: " + difficulty + ") ---");
		System.out.println("Range: " + minRange + " to " + maxRange);
		System.out.println("Maximum attempts: " + maxAttempts);
		
		int randomNumber = minRange + (int)(Math.random() * (maxRange - minRange + 1));
		int userNumber = 0;
		int attemptCount = 0;
		List<Long> roundResponseTimes = new ArrayList<>();
		boolean success = false;
		
		do {
			long startTime = System.currentTimeMillis();
			
			System.out.println("
Attempt " + (attemptCount + 1) + "/" + maxAttempts + ": Enter your number: ");
			userNumber = sc.nextInt();
			
			long endTime = System.currentTimeMillis();
			long responseTime = endTime - startTime;
			roundResponseTimes.add(responseTime);
			
			attemptCount++;
			
			// Exit condition
			if (userNumber == -1) {
				System.out.println("You exited the game. The number was: " + randomNumber);
				break;
			}
			
			// Check if guess is correct
			if (userNumber == randomNumber) {
				System.out.println("🎉 Correct! You guessed the number in " + attemptCount + " attempts!");
				success = true;
				break;
			}
			// Provide hints
			else if (attemptCount % hintFrequency == 0) {
				if (userNumber > randomNumber) {
					System.out.println("💡 Hint: Your number is larger than the actual number");
				} else {
					System.out.println("💡 Hint: Your number is smaller than the actual number");
				}
			}
			// Regular feedback
			else {
				if (userNumber > randomNumber) {
					System.out.println("Your number is larger than the actual number");
				} else {
					System.out.println("Your number is smaller than the actual number");
				}
			}
			
			// Check if attempts exceeded
			if (attemptCount >= maxAttempts) {
				System.out.println("❌ Game Over! You exceeded the maximum attempts. The number was: " + randomNumber);
				break;
			}
			
		} while (userNumber != -1);
		
		// Record round result and update difficulty
		if (userNumber != -1) {  // Only record if player didn't exit
			difficultyManager.recordRoundResult(success, roundResponseTimes);
		}
	}

}
