
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v12  Built on : Mar 19, 2015 (08:32:46 UTC)
 */

        
            package org.wso2.carbon.identity.workflow.impl.stub.bean;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://exception.mgt.workflow.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "WorkflowException".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.workflow.mgt.exception.xsd.WorkflowException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bean.mgt.workflow.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Workflow".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.workflow.mgt.bean.xsd.Workflow.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bean.impl.workflow.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "BPSProfile".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.workflow.impl.stub.bean.BPSProfile.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://impl.workflow.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "WorkflowImplException".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.workflow.impl.xsd.WorkflowImplException.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    