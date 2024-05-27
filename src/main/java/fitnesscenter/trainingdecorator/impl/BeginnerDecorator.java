package fitnesscenter.trainingdecorator.impl;

import fitnesscenter.model.Exercise;
import fitnesscenter.trainingdecorator.TrainingProgramDecorator;
import fitnesscenter.trainingprogram.TrainingProgram;
import java.util.List;

public class BeginnerDecorator extends TrainingProgramDecorator {

  public BeginnerDecorator() {
  }

  public BeginnerDecorator(TrainingProgram decoratedProgram) {
    super(decoratedProgram);
  }

  @Override
  public String getDescription() {
    return decoratedProgram.getDescription() + " with Basic Modifications";
  }

  @Override
  public List<Exercise> getExercises() {
    return decoratedProgram.getExercises().stream()
        .map(w ->
            new Exercise(
                w.getDescription(),
                (int) Math.round(w.getSets() * 0.9),
                (int) Math.round(w.getReps() * 0.9)
            )
        ).toList();
  }
}