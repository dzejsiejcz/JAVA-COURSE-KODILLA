package com.kodilla.patterns2.observer.homework;

public interface ObservableTasks {
    void registerObserver(ObserverTask observer);
    void notifyObservers();
    void removeObserver(ObserverTask observer);
}
