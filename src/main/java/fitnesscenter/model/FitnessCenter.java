package fitnesscenter.model;

import fitnesscenter.trainingprogram.TrainingProgram;
import fitnesscenter.trainingprogram.impl.FirstTrainingProgram;
import java.util.ArrayList;
import java.util.List;

public class FitnessCenter {

  private static FitnessCenter instance;
  private TrainingProgram trainingProgram;
  private List<Observer> observers = new ArrayList<>();

  private FitnessCenter() {
    this.trainingProgram = new FirstTrainingProgram();
  }

  public static FitnessCenter getInstance() {
    if (instance == null) {
      instance = new FitnessCenter();
    }
    return instance;
  }

  public void setTrainingProgram(TrainingProgram trainingProgram) {
    this.trainingProgram = trainingProgram;
    notifyTrainees();
  }

  public TrainingProgram getTrainingProgram() {
    return trainingProgram;
  }

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  private void notifyTrainees() {
    for (Observer observer : observers) {
      observer.update(trainingProgram);
    }
  }
}