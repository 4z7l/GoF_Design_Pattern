package observer;

import subject.Observable;

public interface Observer {
    public void update(Observable observable);
}
