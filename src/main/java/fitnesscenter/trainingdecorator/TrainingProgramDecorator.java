package fitnesscenter.trainingdecorator;

import fitnesscenter.model.Exercise;
import fitnesscenter.trainingprogram.TrainingProgram;
import java.util.List;

public abstract class TrainingProgramDecorator implements TrainingProgram {

  protected TrainingProgram decoratedProgram;

  public TrainingProgramDecorator() {
  }

  public TrainingProgramDecorator(TrainingProgram decoratedProgram) {
    this.decoratedProgram = decoratedProgram;
  }

  @Override
  public String getDescription() {
    return decoratedProgram.getDescription();
  }

  @Override
  public List<Exercise> getExercises() {
    return decoratedProgram.getExercises();
  }
}
