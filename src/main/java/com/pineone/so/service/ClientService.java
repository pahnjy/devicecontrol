package com.pineone.so.service;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;

/**
 * Created by use on 2015-09-23.
 */
@Service
public class ClientService {

    public static final String REQUEST_GET = "get";
    public static final String REQUEST_POST = "post";
    public static final String SIDOMAIN ="http://localhost:8090/";
    public static final String SICOMMAND = "si/command";
    public static final String SIDEVICECONTROL = "http://localhost:8090/si/controlmessage";

    public HttpResponse requestPostData(String type, String uri, Object object){
        HttpResponse response = null;

        try {
            HttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost(SIDOMAIN + uri);
            post.setHeader("Accept-Encoding", "identity");
            post.setHeader("Content-Type", "application/json");

            HttpEntity entity = new ByteArrayEntity(object.toString().getBytes("UTF-8"));
            post.setEntity(entity);
            response = client.execute(post);

            String result = EntityUtils.toString(response.getEntity());
            System.out.println("Output from Server SDA result data .... \n");
            System.out.println(result);

        } catch (ClientProtocolException e){
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

    public HttpResponse requestPostData(String uri,Object object){
        HttpResponse response = null;

        try {
            HttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost(uri);
            post.setHeader("Accept-Encoding", "identity");
            post.setHeader("Content-Type", "application/json");

            HttpEntity entity = new ByteArrayEntity(object.toString().getBytes("UTF-8"));
            post.setEntity(entity);
            response = client.execute(post);

            String result = EntityUtils.toString(response.getEntity());
            System.out.println("Output from Server result data .... \n");
            System.out.println(result);

        } catch (ClientProtocolException e){
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

}
