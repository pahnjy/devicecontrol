package com.pineone.icbms.so.service;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;

/**
 * Created by use on 2015-09-23.
 */
public interface ClientService
{

    HttpResponse requestData(String uri, String data);
	HttpResponse requestData(String uri);

}
