/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2009 Alex Buloichik
               Home page: http://www.omegat.org/
               Support center: https://omegat.org/support

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/

package org.omegat.filters2;

/**
 * Callback for align files in filter.
 *
 * @author Alex Buloichik (alex73mail@gmail.com)
 */
public interface IAlignCallback {
    /**
     * New found aligned data.
     *
     * @param id
     *            entry id
     * @param source
     *            source text
     * @param translation
     *            translated text
     * @param isFuzzy
     *            true if translation is fuzzy
     * @param sourcePath
     *            source file name
     * @param filter
     *            filter which produces entry
     */
    void addTranslation(String id, String source, String translation, boolean isFuzzy, String sourcePath,
            IFilter filter);
}
