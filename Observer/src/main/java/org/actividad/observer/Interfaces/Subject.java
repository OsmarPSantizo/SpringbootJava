package org.actividad.observer.Interfaces;

public interface Subject {
    void addObserver (Observer observer);
    void removeObserver(Observer observer);

    void notifyObservers();

}
