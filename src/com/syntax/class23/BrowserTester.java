package com.syntax.class23;

public class BrowserTester {
    public static void main(String[] args) {
        WebDriver chrome = new Chrome();
        chrome.closeBrowser();
        chrome.openIrl("www.google.com");
        chrome.testLogicPage();
        chrome.closeBrowser();
       WebDriver [] browsers = {new Chrome(), new Safari(), new FireFox(), new Edge()};
//       for(WebDriver browser:browsers){
//           browser.closeBrowser();
//           browser.openIrl("www.google.com");
//           browser.testLogicPage();
//           browser.closeBrowser();
//       }
        for(int i =0; i<browsers.length; i++){
            browsers[i].startBrowser();
            browsers[i].openIrl("www.google.com");
            browsers[i].testLogicPage();
            browsers[i].closeBrowser();
        }
    }
}
