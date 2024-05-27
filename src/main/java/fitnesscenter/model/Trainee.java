package fitnesscenter.model;

import fitnesscenter.trainingprogram.TrainingProgram;

public class Trainee implements Observer {

  private String name;

  private TrainingProgram trainingProgram;

  public Trainee(String name) {
    this.name = name;
  }

  public TrainingProgram getTrainingProgram() {
    return trainingProgram;
  }

  @Override
  public void update(TrainingProgram trainingProgram) {
    this.trainingProgram = trainingProgram;

    System.out.println("Trainee " + name + " has been updated with a new training program: "
        + trainingProgram.getDescription());

    for (Exercise exercise : trainingProgram.getExercises()) {
      System.out.println(exercise);
    }
  }
}