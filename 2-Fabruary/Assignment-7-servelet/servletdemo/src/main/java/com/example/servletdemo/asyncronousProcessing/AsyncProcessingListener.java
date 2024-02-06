package com.example.servletdemo.asyncronousProcessing;

import jakarta.servlet.AsyncEvent;
import jakarta.servlet.AsyncListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AsyncProcessingListener implements AsyncListener {

    @Override
    public void onComplete(AsyncEvent event) throws java.io.IOException {
        
        System.out.println("Async processing completed for request with ID: " + event.getAsyncContext().getRequest().getLocalName());
    }

    @Override
    public void onError(AsyncEvent event) throws java.io.IOException {
        
        System.err.println("Error during async processing for request with ID: " + event.getAsyncContext().getRequest().getLocalName());
    }

    @Override
    public void onStartAsync(AsyncEvent event) throws java.io.IOException {
        
        System.out.println("Async processing started for request with ID: " + event.getAsyncContext().getRequest().getLocalName());
    }

    @Override
    public void onTimeout(AsyncEvent event) throws java.io.IOException {
        
        System.err.println("Async processing timeout for request with ID: " + event.getAsyncContext().getRequest().getLocalName());
    }
}