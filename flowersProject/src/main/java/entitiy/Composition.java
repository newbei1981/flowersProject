package entitiy;

import java.util.ArrayList;
import java.util.List;

public class Composition {
    private List<Flower> flowerList;
    private int id;
    private int idUser;

    public Composition() { flowerList = new ArrayList<Flower>();          }

    public List<Flower> getFlowerList() {        return flowerList;    }

    public void setFlowerList(List<Flower> flowerList) {        this.flowerList = flowerList;    }

    public int getId() {        return id;    }

    public void setId(int id) {        this.id = id;    }

    public int getIdUser() {        return idUser;    }

    public void setIdUser(int idUser) {        this.idUser = idUser;    }
}
