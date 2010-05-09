/**
 *  Filename: LocatorHome.java (in org.redpin.server.standalone.locator)
 *  This file is part of the Redpin project.
 * 
 *  Redpin is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published
 *  by the Free Software Foundation, either version 3 of the License, or
 *  any later version.
 *
 *  Redpin is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with Redpin. If not, see <http://www.gnu.org/licenses/>.
 *
 *  (c) Copyright ETH Zurich, Pascal Brogle, Philipp Bolliger, 2010, ALL RIGHTS RESERVED.
 * 
 *  www.redpin.org
 */
package org.redpin.server.standalone.locator;

//import org.redpin.server.standalone.db.HomeFactory;

public class LocatorHome {
	
	private static ILocator locator = null;
	//private static int INITIAL_SAMPLES_REQUIRED = 100;
	
	public synchronized static ILocator getLocator() {
		if(locator == null) {
			//locator = new RedpinLocator();
			locator = new SVMLocator();
		}
		/*
		if (locator instanceof RedpinLocator) {
			int numberofsamples = HomeFactory.getFingerprintHome().getCount();
			if (numberofsamples >= INITIAL_SAMPLES_REQUIRED) {
				locator = new SVMLocator();		//locator is changed only once 
			}
		}
		*/
		return locator;
	}
	
	
	
}
