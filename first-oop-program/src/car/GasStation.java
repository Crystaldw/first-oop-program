package car;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GasStation {

    private List<Cabriollet> cabriollets;
    private Set<EngineType> avaliableEngineTypes;

    public void refuel(Refuelable a) {
        System.out.println("К заправке подьехал " + a.toString());
        a.refuel();
    }

    public void printInfoAboutQueue() {
        if (cabriollets == null) {
            System.out.println("Очередь не существует");
            return;
        }
        System.out.println("Сейчас очередь из автомобилей " + cabriollets.size());
        System.out.println("Вот эти машины " + cabriollets);
    }

    public void refuelAll() {
        if (cabriollets == null || cabriollets.size() == 0) {
            return;
        }

        for (Cabriollet cabriollet : cabriollets) {
            if (cabriollet.getEngineType() != null
                    && avaliableEngineTypes != null
                    && avaliableEngineTypes.contains(cabriollet.getEngineType())) {
                cabriollet.refuel();
            }
        }

        cabriollets.clear();
    }

    public List<Cabriollet> getCabriollets() {
        return cabriollets;
    }

    public void setCabriollets(List<Cabriollet> cabriollets) {
        this.cabriollets = cabriollets;
    }

    public Set<EngineType> getAvaliableEngineTypes() {
        return avaliableEngineTypes;
    }

    public void setAvaliableEngineTypes(Set<EngineType> avaliableEngineTypes) {
        this.avaliableEngineTypes = avaliableEngineTypes;
    }
}
