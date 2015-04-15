package cs5200.jwsjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cs5200.jwsjpa.models.Site;

@Path("/site")
public class SiteDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("CS5200_JWS_JPA");
	EntityManager em = factory.createEntityManager();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Site findSite(@PathParam("id") int siteId) {
		return em.find(Site.class, siteId);
	}
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Site> findAllSites() {
		Query query = em.createQuery("select site from Site site");
		return (List<Site>)query.getResultList();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Site> updateSite(int siteId, Site site) {
		em.getTransaction().begin();
		site.setId(siteId);
		em.merge(site);
		em.getTransaction().commit();
		return findAllSites();
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Site> removeSite(@PathParam("id") int siteId) {
		em.getTransaction().begin();
		Site site = em.find(Site.class, siteId);
		em.remove(site);
		em.getTransaction().commit();
		return findAllSites();
	}
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Site> createSite(Site site) {
		em.getTransaction().begin();
		em.merge(site);
		em.getTransaction().commit();
		return findAllSites();
	}
	
	public static void main(String args[]) {
		
		SiteDao siteDao = new SiteDao();
		
		/*List<Site> allSites = siteDao.findAllSites();
		for (Site site : allSites) {
			System.out.println(site.getId() + "," + site.getName() + "," + site.getLatitude() + "," + site.getLongitude());
		}*/
		
		/*Site site = siteDao.findSite(1);
		System.out.println(site.getId() + "," + site.getName() + "," + site.getLatitude() + "," + site.getLongitude());
		
		site.setName("Site 1 Updated");
		List<Site> allSites = siteDao.updateSite(1, site);
		for (Site siteIterator : allSites) {
			System.out.println(siteIterator.getId() + "," + siteIterator.getName() + "," + siteIterator.getLatitude() + "," + siteIterator.getLongitude());
		}*/
		
		/*Site site = new Site();
		site.setName("Site 3");
		site.setLatitude(67.78);
		site.setLongitude(78.89);
		List<Site> allSites = siteDao.createSite(site);
		for (Site siteIterator : allSites) {
			System.out.println(siteIterator.getId() + "," + siteIterator.getName() + "," + siteIterator.getLatitude() + "," + siteIterator.getLongitude());
		}*/
		
		/*List<Site> allSites = siteDao.removeSite(3);
		for (Site siteIterator : allSites) {
			System.out.println(siteIterator.getId() + "," + siteIterator.getName() + "," + siteIterator.getLatitude() + "," + siteIterator.getLongitude());
		}*/
	}
}
