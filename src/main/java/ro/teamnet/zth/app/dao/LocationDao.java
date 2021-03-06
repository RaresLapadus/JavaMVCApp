package ro.teamnet.zth.app.dao;

import ro.teamnet.zth.api.em.EntityManager;
import ro.teamnet.zth.api.em.EntityManagerImpl;
import ro.teamnet.zth.app.domain.Location;

import java.util.List;

/**
 * Created by Diana.Diaconu on 4/22/2015.
 */
public class LocationDao {

    EntityManager entityManager = new EntityManagerImpl();

    /**
     *
     * @param location
     * @return location object
     */
    public Location insertLocation(Location location) {
        return (Location) entityManager.insert(location);
    }

    /**
     *
     * @param location
     * @return location object
     */
    public Location updateLocation(Location location) {
        return entityManager.update(location);
    }

    /**
     *
     * @param location
     */
    public void deleteLocation(Location location) {
        entityManager.delete(location);
    }

    /**
     *
     * @return a list of locations
     */
    public List<Location> getAllLocations() {
        EntityManager entityManager = new EntityManagerImpl();
        return entityManager.findAll(Location.class);
    }

    /**
     *
     * @param id
     * @return location object
     */
    public Location getLocationById(Integer id) {
        return entityManager.findById(Location.class, id);
    }

}
