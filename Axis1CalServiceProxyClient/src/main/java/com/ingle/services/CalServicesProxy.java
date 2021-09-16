package com.ingle.services;

public class CalServicesProxy implements com.ingle.services.CalServices {
  private String _endpoint = null;
  private com.ingle.services.CalServices calServices = null;
  
  public CalServicesProxy() {
    _initCalServicesProxy();
  }
  
  public CalServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalServicesProxy();
  }
  
  private void _initCalServicesProxy() {
    try {
      calServices = (new com.ingle.services.CalServicesServiceLocator()).getCalServices();
      if (calServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calServices != null)
      ((javax.xml.rpc.Stub)calServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ingle.services.CalServices getCalServices() {
    if (calServices == null)
      _initCalServicesProxy();
    return calServices;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (calServices == null)
      _initCalServicesProxy();
    return calServices.add(i, j);
  }
  
  
}