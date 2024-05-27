package fitnesscenter.trainingdecorator.impl;

import fitnesscenter.model.Exercise;
import fitnesscenter.trainingdecorator.TrainingProgramDecorator;
import fitnesscenter.trainingprogram.TrainingProgram;
import java.util.List;


public class CardioDecorator extends TrainingProgramDecorator {

  public CardioDecorator() {
  }

  public CardioDecorator(TrainingProgram decoratedProgram) {
    super(decoratedProgram);
  }

  @Override
  public String getDescription() {
    return decoratedProgram.getDescription() + " with Cardio Modifications";
  }

  @Override
  public List<Exercise> getExercises() {
    return decoratedProgram.getExercises().stream()
        .map(w ->
            new Exercise(
                w.getDescription(),
                (int) Math.round(w.getSets() * 0.8),
                (int) Math.round(w.getReps() * 1.2)
            )
        ).toList();
  }
}