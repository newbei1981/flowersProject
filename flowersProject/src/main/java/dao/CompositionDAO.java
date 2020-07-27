package dao;

import entitiy.Flower;
import entitiy.Users;

public class CompositionDAO extends AbstractDAO {
    private static CompositionDAO instance;

    private CompositionDAO() { }

    public static CompositionDAO getInstance() {
        if (instance == null) {
            instance = new CompositionDAO();
        }
        return instance;
    }

    public void addComposition(Users users, Flower flower) {

    }

}
