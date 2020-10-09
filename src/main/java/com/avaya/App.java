package com.avaya;

import com.avaya.myjgroup.SimpleChat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //System.out.println( "Hello World!" );
        SimpleChat simpleChat = new SimpleChat();
        try {
            simpleChat.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
