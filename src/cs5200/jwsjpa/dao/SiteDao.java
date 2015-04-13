package cs5200.jwsjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cs5200.jwsjpa.models.Site;

public class SiteDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("CS5200_JWS_JPA");
	EntityManager em = factory.createEntityManager();
	
	public Site findSite(int siteId) {
		return em.find(Site.class, siteId);
	}
	
	public List<Site> findAllSites() {
		Query query = em.createQuery("select site from Site site");
		return (List<Site>)query.getResultList();
	}
	
	public List<Site> updateSite(int siteId, Site site) {
		em.getTransaction().begin();
		site.setId(siteId);
		em.merge(site);
		em.getTransaction().commit();
		return findAllSites();
	}
	
	public List<Site> removeSite(int siteId) {
		em.getTransaction().begin();
		Site site = em.find(Site.class, siteId);
		em.remove(site);
		em.getTransaction().commit();
		return findAllSites();
	}
	
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
