/**
 * 
 */
package br.com.template.servicewebapp.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * @author Rudson Kiyoshi S. Carvalho - IBM
 * @data 2017-06-22
 */
@Repository
public class HomeDaoImpl implements HomeDao {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	public String loadHomeMessage() {
		
		log.info("init loadHomeMessage");
		
		return " chegou no dao";
	}

}
