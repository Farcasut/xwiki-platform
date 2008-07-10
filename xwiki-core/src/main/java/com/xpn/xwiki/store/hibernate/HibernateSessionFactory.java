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
package com.xpn.xwiki.store.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Class used by hibernate stores for obtain sessions.
 * Simple holder for real sessionFactory and configuration for now.
 * 
 * @version $Id$
 * @since 1.6M1
 */
public class HibernateSessionFactory
{
    /**
     * This component's role, used when code needs to look it up.
     */
    public static final String ROLE = HibernateSessionFactory.class.getName();

    /**
     * Hibernate configuration object.
     */
    private Configuration configuration;

    /**
     * Real hibernate session factory.
     */
    private SessionFactory sessionFactory;

    /**
     * @return Hibernate Configuration object
     */
    public Configuration getConfiguration()
    {
        return configuration;
    }

    /**
     * @return Real hibernate session factory
     */
    public SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    // NOTE: this methods will be removed in 3rd step of XWIKI-2332
    public void setConfiguration(Configuration configuration)
    {
        this.configuration = configuration;
    }

    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
}
