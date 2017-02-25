/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.test.pattern.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.commons.collections.FunctorException;

/**
 * Factory implementation that creates a new object instance by reflection.
 * <p>
 * <b>WARNING:</b> from v4.1 onwards this class will <b>not</b> be serializable anymore
 * in order to prevent potential remote code execution exploits. Please refer to
 * <a href="https://issues.apache.org/jira/browse/COLLECTIONS-580">COLLECTIONS-580</a>
 * for more details.
 *
 * @since 3.0
 * @version $Id: InstantiateFactory.java 1714262 2015-11-13 20:08:45Z tn $
 */
public class InstantiateFactory<T> implements Factory<T> {

    /** The class to create */
    private final Class<T> iClassToInstantiate;
    /** The constructor parameter types */
    private final String iParamTypes;
    /** The constructor arguments */
    private final String[] iArgs;
    /** The constructor */
    private transient Constructor<T> iConstructor = null;

    /**
     * Factory method that performs validation.
     *
     * @param <T>  the type the factory creates
     * @param classToInstantiate  the class to instantiate, not null
     * @param paramTypes  the constructor parameter types, cloned
     * @param args  the constructor arguments, cloned
     * @return a new instantiate factory
     * @throws NullPointerException if classToInstantiate is null
     * @throws IllegalArgumentException if paramTypes does not match args
     */
    public static <T> Factory<T> instantiateFactory(final Class<T> classToInstantiate,
                                                    final String paramTypes,
                                                    final String... args) {
       

        if (paramTypes == null || paramTypes.length() == 0) {
            return new InstantiateFactory<T>(classToInstantiate);
        }
        return new InstantiateFactory<T>(classToInstantiate, paramTypes, args);
    }

    /**
     * Constructor that performs no validation.
     * Use <code>instantiateFactory</code> if you want that.
     *
     * @param classToInstantiate  the class to instantiate
     */
    public InstantiateFactory(final Class<T> classToInstantiate) {
        super();
        iClassToInstantiate = classToInstantiate;
        iParamTypes = null;
        iArgs = null;
        findConstructor();
    }

    /**
     * Constructor that performs no validation.
     * Use <code>instantiateFactory</code> if you want that.
     *
     * @param classToInstantiate  the class to instantiate
     * @param paramTypes  the constructor parameter types, cloned
     * @param args  the constructor arguments, cloned
     */
    public InstantiateFactory(final Class<T> classToInstantiate, final String paramTypes, final String... args) {
        super();
        iClassToInstantiate = classToInstantiate;
        iParamTypes = paramTypes;
        iArgs = args.clone();
        findConstructor();
    }

    /**
     * Find the Constructor for the class specified.
     */
    private void findConstructor() {
        try {
           // iConstructor = iClassToInstantiate.getMethod(name, parameterTypes)
            		
           	 Method m = iClassToInstantiate.getMethod("run", new Class[] {});
            try {
				Object ret = m.invoke(iArgs, new Object[] {});
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } catch (final NoSuchMethodException ex) {
            throw new IllegalArgumentException("InstantiateFactory: The constructor must exist and be public ");
        }
    }

    /**
     * Creates an object using the stored constructor.
     *
     * @return the new object
     */
    @Override
    public T create() {
        // needed for post-serialization
        if (iConstructor == null) {
            findConstructor();
        }

        try {
            return iConstructor.newInstance(iArgs);
        } catch (final Exception ex) {
            throw new FunctorException("InstantiateFactory: InstantiationException", ex);
        } 
    }

}
