package Module10.Middle1.Tasks;

public abstract class AbstractTask implements Task {
    private boolean finished;

    public abstract void showTask();

    @Override
    public void executed() {
        finished = true;
    }

    @Override
    public boolean isFinished() {
        return finished;
    }
}
