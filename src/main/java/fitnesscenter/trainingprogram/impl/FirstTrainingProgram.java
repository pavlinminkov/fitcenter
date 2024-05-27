package fitnesscenter.trainingprogram.impl;

import fitnesscenter.model.Exercise;
import fitnesscenter.trainingprogram.TrainingProgram;
import java.util.Arrays;
import java.util.List;

public class FirstTrainingProgram implements TrainingProgram {

  private List<Exercise> exercises;

  public FirstTrainingProgram() {
    this.exercises = Arrays.asList(
        new Exercise("Push-ups", 3, 12),
        new Exercise("Squats", 3, 15)
    );
  }

  @Override
  public String getDescription() {
    return "First Training Program";
  }

  @Override
  public List<Exercise> getExercises() {
    return exercises;
  }
}
