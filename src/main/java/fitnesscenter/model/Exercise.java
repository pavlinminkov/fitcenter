package fitnesscenter.model;

public class Exercise {

  private String description;
  private int sets;
  private int reps;

  public Exercise(String description, int sets, int reps) {
    this.description = description;
    this.sets = sets;
    this.reps = reps;
  }

  public String getDescription() {
    return description;
  }

  public int getSets() {
    return sets;
  }

  public int getReps() {
    return reps;
  }

  public void setSets(int sets) {
    this.sets = sets;
  }

  public void setReps(int reps) {
    this.reps = reps;
  }

  @Override
  public String toString() {
    return description + " - " + sets + " sets of " + reps + " reps";
  }
}
