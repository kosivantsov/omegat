/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2016 Aaron Madlon-Kay
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

package org.omegat.gui.preferences.view;

import javax.swing.JPanel;
import org.omegat.util.OStrings;

/**
 * @author Aaron Madlon-Kay
 * @author Briac Pilpre
 */
@SuppressWarnings("serial")
public class PluginsPreferencesPanel extends JPanel {

    /** Creates new form PluginsPanel */
    public PluginsPreferencesPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelInfo = new javax.swing.JPanel();
        messageLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        browsePluginsButton = new javax.swing.JButton();
        installFromDiskButton = new javax.swing.JButton();
        panelPluginsInfo = new javax.swing.JPanel();
        labelTableTitle = new javax.swing.JLabel();
        scrollTable = new javax.swing.JScrollPane();
        tablePluginsInfo = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setMinimumSize(new java.awt.Dimension(250, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(messageLabel, OStrings.getString("PREFS_PLUGINS_AVAILABLE_ONLINE")); // NOI18N
        messageLabel.setAlignmentY(0.0F);
        panelInfo.add(messageLabel);
        panelInfo.add(filler1);

        org.openide.awt.Mnemonics.setLocalizedText(browsePluginsButton, OStrings.getString("PREFS_PLUGINS_BROWSE_ONLINE")); // NOI18N
        browsePluginsButton.setAlignmentY(0.0F);
        panelInfo.add(browsePluginsButton);

        org.openide.awt.Mnemonics.setLocalizedText(installFromDiskButton, OStrings.getString("PREFS_PLUGINS_INSTALL_FROM_DISK")); // NOI18N
        panelInfo.add(installFromDiskButton);

        add(panelInfo);

        panelPluginsInfo.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(labelTableTitle, OStrings.getString("PREFS_PLUGINS_LIST")); // NOI18N
        labelTableTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        panelPluginsInfo.add(labelTableTitle, gridBagConstraints);

        tablePluginsInfo.setAutoCreateRowSorter(true);
        tablePluginsInfo.setModel(new PluginInfoTableModel());
        tablePluginsInfo.getColumnModel().getColumn(PluginInfoTableModel.COLUMN_CLASS).setPreferredWidth(100);
        tablePluginsInfo.getColumnModel().getColumn(PluginInfoTableModel.COLUMN_VERSION).setPreferredWidth(50);
        scrollTable.setViewportView(tablePluginsInfo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        panelPluginsInfo.add(scrollTable, gridBagConstraints);

        add(panelPluginsInfo);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton browsePluginsButton;
    private javax.swing.Box.Filler filler1;
    javax.swing.JButton installFromDiskButton;
    private javax.swing.JLabel labelTableTitle;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelPluginsInfo;
    private javax.swing.JScrollPane scrollTable;
    javax.swing.JTable tablePluginsInfo;
    // End of variables declaration//GEN-END:variables
}
