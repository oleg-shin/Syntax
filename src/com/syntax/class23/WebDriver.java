package com.syntax.class23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openIrl(String url){
        System.out.println("opening " + url);
    }
    public void testLogicPage(){
        System.out.println("checking if login page is visible");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Google chrome");
    }

    @Override
    public void openIrl(String url) {
        System.out.println("opening " + url + " on Google chrome");
    }

    @Override
    public void testLogicPage() {
        System.out.println("testing login page on google chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the google chrome");
    }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the FireFox");
    }

    @Override
    public void openIrl(String url) {
        System.out.println("opening " + url + " on FireFox");
    }

    @Override
    public void testLogicPage() {
        System.out.println("testing login page on FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the FireFox");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Safari");
    }

    @Override
    public void openIrl(String url) {
        System.out.println("opening " + url + " on Safari");
    }

    @Override
    public void testLogicPage() {
        System.out.println("testing login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the Safari");
    }
}
class Edge extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Edge");
    }

    @Override
    public void openIrl(String url) {
        System.out.println("opening " + url + " on Edge");
    }

    @Override
    public void testLogicPage() {
        System.out.println("testing login page on Edge");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the Edge");
    }
}
