package repo;
import javax.persistence.EntityManager;
import javax.persistance.EntityManagerFactory;
import javax.persistence.Persistence;
import entity.Artist;
public class ArtistRepository {
	void create() {
		
	}
	Artist findById(int i) {
		javax.persistence.EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager= emfactory.createEntityManager();
		Artist artist = entitymanager.find(Artist.class, i);
		return artist;
	}
}
