package fitnesscenter.trainingprogram.impl;

import fitnesscenter.model.Exercise;
import fitnesscenter.trainingprogram.TrainingProgram;
import java.util.Arrays;
import java.util.List;

public class SecondTrainingProgram implements TrainingProgram {

  private List<Exercise> exercises;

  public SecondTrainingProgram() {
    this.exercises = Arrays.asList(
        new Exercise("Deadlift", 3, 8),
        new Exercise("Bench Press", 3, 10)
    );
  }

  @Override
  public String getDescription() {
    return "Second Training Program";
  }

  @Override
  public List<Exercise> getExercises() {
    return exercises;
  }
}
