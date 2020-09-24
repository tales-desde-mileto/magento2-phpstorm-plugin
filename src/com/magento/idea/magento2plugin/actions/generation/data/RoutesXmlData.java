/*
 * Copyright © Magento, Inc. All rights reserved.
 * See COPYING.txt for license details.
 */

package com.magento.idea.magento2plugin.actions.generation.data;

import com.jetbrains.php.lang.psi.elements.PhpClass;

public class RoutesXmlData {
    private String area;
    private String route;
    private String moduleName;

    /**
     * Routes XML Data.
     *
     * @param area String
     * @param route String
     */
    public RoutesXmlData(
            String area,
            String route,
            String moduleName
    ) {
        this.area = area;
        this.route = route;
        this.moduleName = moduleName;
    }

    public String getArea() {
        return area;
    }

    public String getRoute() {
        return route;
    }

    public String getModuleName() {
        return moduleName;
    }
}
