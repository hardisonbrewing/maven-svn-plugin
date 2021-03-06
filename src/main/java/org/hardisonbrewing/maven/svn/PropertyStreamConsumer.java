/**
 * Copyright (c) 2013 Martin M Reed
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.hardisonbrewing.maven.svn;

import java.util.List;

import org.codehaus.plexus.util.cli.StreamConsumer;

public class PropertyStreamConsumer implements StreamConsumer {

    private final List<Entry> properties;

    public PropertyStreamConsumer(List<Entry> properties) {

        this.properties = properties;
    }

    @Override
    public void consumeLine( String line ) {

        line = line.trim();

        int indexOf = line.indexOf( ' ' );

        if ( indexOf == -1 ) {
            return;
        }

        Entry entry = new Entry();
        entry.first = line.substring( 0, indexOf ).trim();
        entry.second = line.substring( indexOf + 1 ).trim();
        properties.add( entry );
    }
}
