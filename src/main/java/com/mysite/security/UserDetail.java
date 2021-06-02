package com.mysite.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserDetail implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        return new User("user",
                "{noop}1111",
                true,
                true,
                true,
                true,
                getAuthorities());
    }


    private Collection<? extends GrantedAuthority> getAuthorities(){

        List<SimpleGrantedAuthority> authList = new ArrayList<>();
        authList.add(new SimpleGrantedAuthority("ROLE_USER"));

        return authList;

    }

}
