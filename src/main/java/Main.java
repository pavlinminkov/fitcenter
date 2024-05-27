import fitnesscenter.model.FitnessCenter;
import fitnesscenter.model.Trainee;
import fitnesscenter.trainingdecorator.impl.BeginnerDecorator;
import fitnesscenter.trainingdecorator.impl.StrengthDecorator;
import fitnesscenter.trainingprogram.TrainingProgram;
import fitnesscenter.trainingprogram.impl.FirstTrainingProgram;
import fitnesscenter.trainingprogram.impl.SecondTrainingProgram;


public class Main {

  public static void main(String[] args) {
    FitnessCenter fitnessCenter = FitnessCenter.getInstance();

    Trainee trainee1 = new Trainee("Ivan");
    Trainee trainee2 = new Trainee("Cveti");

    fitnessCenter.addObserver(trainee1);
    fitnessCenter.addObserver(trainee2);

    TrainingProgram firstTrainingProgram = new FirstTrainingProgram();
    fitnessCenter.setTrainingProgram(firstTrainingProgram);

    trainee2.update(new StrengthDecorator(new BeginnerDecorator(trainee2.getTrainingProgram())));

    TrainingProgram secondTrainingProgram = new SecondTrainingProgram();
    fitnessCenter.setTrainingProgram(secondTrainingProgram);

    firstTrainingProgram = new FirstTrainingProgram();
    FitnessCenter.getInstance().setTrainingProgram(firstTrainingProgram);
  }
}
