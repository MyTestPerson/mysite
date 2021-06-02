package com.mysite.security.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
public class AuthenticationSuccessEventListener implements ApplicationListener<AuthenticationSuccessEvent> {


//    This option doesn't work.
//
//    @Autowired
//    HttpServletRequest httpServletRequest;

//    And this option doesn't work.
//
//    HttpServletRequest curRequest = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
//                .getRequest();

    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent a) {


//        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+: " + httpServletRequest.getRemoteAddr());

    }


}
