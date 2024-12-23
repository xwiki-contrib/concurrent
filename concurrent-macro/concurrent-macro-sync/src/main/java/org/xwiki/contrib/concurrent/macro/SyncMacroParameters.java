/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.concurrent.macro;

import org.xwiki.properties.annotation.PropertyDescription;

/**
 * Parameters for the {@link org.xwiki.contrib.concurrent.macro.internal.SyncMacro} Macro.
 *
 * @version $Id: b8ceafc227ad3bc9f86c060d2096d9e74284d831 $
 */
public class SyncMacroParameters
{
    /**
     * The identifier string.
     */
    private String id;

    /**
     * @param id the identifier string.
     */
    @PropertyDescription("The identifier string."
        + " Any other macro associated with the same identifier will be synchronized with this one.")
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @return the identifier string.
     */
    public String getId()
    {
        return this.id;
    }
}
