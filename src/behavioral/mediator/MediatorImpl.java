package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{
    private List<Colleague> colleagueList;

    public MediatorImpl() {
        this.colleagueList = new ArrayList<Colleague>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagueList.add(colleague);
    }

    @Override
    public void mediate(Colleague colleague) {
        for(Colleague receiverColleague : colleagueList) {
            System.out.println("Mediating " + colleague.getName()
                    + " to " + receiverColleague.getName());

            receiverColleague.receive(colleague);
        }
    }
}
