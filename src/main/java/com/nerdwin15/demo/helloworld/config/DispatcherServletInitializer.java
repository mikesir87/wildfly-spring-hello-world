/*
 * File created on Oct 21, 2013 
 *
 * Copyright 2008-2013 Virginia Polytechnic Institute and State University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.nerdwin15.demo.helloworld.config;

import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * DESCRIBE THE TYPE HERE.
 *
 * @author Michael Irwin
 */
public class DispatcherServletInitializer 
    extends AbstractAnnotationConfigDispatcherServletInitializer {

  /**
   * {@inheritDoc}
   */
  @Override
  protected Class<?>[] getRootConfigClasses() {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] { WebConfig.class };
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }
  
  protected void customizeRegistration(Dynamic registration) {
    registration.setInitParameter("dispatchOptionsRequest", "true");
  }
  
}
