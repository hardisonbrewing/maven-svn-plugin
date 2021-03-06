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

import java.io.File;
import java.util.Properties;

import org.hardisonbrewing.maven.core.TargetDirectoryService;

public class PropertiesService extends org.hardisonbrewing.maven.core.PropertiesService {

    public static final String SCM_URL = "scm.url";

    public static final String getExternalsPropertiesPath() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append( TargetDirectoryService.getTargetDirectoryPath() );
        stringBuffer.append( File.separator );
        stringBuffer.append( "svn.externals.properties" );
        return stringBuffer.toString();
    }

    public static final Properties getExternalsProperties() {

        return loadProperties( getExternalsPropertiesPath() );
    }
}
