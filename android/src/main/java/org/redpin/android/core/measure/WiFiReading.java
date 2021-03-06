/**
 * Filename: WiFiReading.java (in org.repin.android.core.measure)
 * This file is part of the Redpin project.
 * <p/>
 * Redpin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * <p/>
 * Redpin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Lesser General Public License
 * along with Redpin. If not, see <http://www.gnu.org/licenses/>.
 * <p/>
 * (c) Copyright ETH Zurich, Pascal Brogle, Philipp Bolliger, 2010, ALL RIGHTS RESERVED.
 * <p/>
 * www.redpin.org
 */
package org.redpin.android.core.measure;

import org.redpin.android.db.RemoteEntity;

/**
 * @see org.redpin.base.core.measure.WiFiReading
 * @author Pascal Brogle (broglep@student.ethz.ch)
 *
 */
public class WiFiReading extends org.redpin.base.core.measure.WiFiReading
        implements RemoteEntity<Integer> {

    protected Integer id;

    public Integer getRemoteId() {
        return id;
    }

    public void setRemoteId(Integer id) {
        this.id = id;
    }
}
