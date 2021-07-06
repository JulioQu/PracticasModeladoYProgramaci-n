public interface Subject{
    public void registerObserver(Observer client);
    public void removeObserver(Observer client);
    public void notifyObservers();
}
