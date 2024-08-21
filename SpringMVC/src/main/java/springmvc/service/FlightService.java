package springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import springmvc.entity.Flight;


@Transactional
public class FlightService {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public int insert(Flight flight) {
		return (int) hibernateTemplate.save(flight);
	}

	public List<Flight> getAllFlights() {

		return hibernateTemplate.loadAll(Flight.class);
	}

	public Flight getFlightById(Integer id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Flight.class, id);
	}

	public void saveFlight(Flight flight) {
		// TODO Auto-generated method stub
		hibernateTemplate.saveOrUpdate(flight);
	}

	public void deleteFlight(Integer id) {
		// TODO Auto-generated method stub
		Flight flight = hibernateTemplate.get(Flight.class, id);
		if (flight != null) {
			hibernateTemplate.delete(flight);
		}
	}

}
