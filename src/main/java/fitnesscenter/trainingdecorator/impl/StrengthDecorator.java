package fitnesscenter.trainingdecorator.impl;

import fitnesscenter.model.Exercise;
import fitnesscenter.trainingdecorator.TrainingProgramDecorator;
import fitnesscenter.trainingprogram.TrainingProgram;
import java.util.List;

public class StrengthDecorator extends TrainingProgramDecorator {

  public StrengthDecorator() {
  }

  public StrengthDecorator(TrainingProgram decoratedProgram) {
    super(decoratedProgram);
  }

  @Override
  public String getDescription() {
    return decoratedProgram.getDescription() + " with Strength Modifications";
  }

  @Override
  public List<Exercise> getExercises() {
    return decoratedProgram.getExercises().stream()
        .map(w ->
            new Exercise(
                w.getDescription(),
                (int) Math.round(w.getSets() * 1.2),
                (int) Math.round(w.getReps() * 0.8)
            )
        ).toList();
  }
}