package Observer;

public interface Subject {
    public void addObserver(Observer observer);
    public void RemoveObserver(Observer observer);
    public void NotifyObservers();
}
