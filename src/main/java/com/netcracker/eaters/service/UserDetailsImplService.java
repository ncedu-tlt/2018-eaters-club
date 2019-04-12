package com.netcracker.eaters.service;

import com.netcracker.eaters.model.Role;
import com.netcracker.eaters.model.User;
import com.netcracker.eaters.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsImplService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String userEmail) {
/*        User user = userRepository.findByEmail(userEmail);
        if(user == null) throw new UsernameNotFoundException(userEmail);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        for(Role role : user.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }

        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), grantedAuthorities);
*/

        User user = userRepository.findByEmail(userEmail);

        if(user == null) {
            System.out.println("User not found! " + userEmail);
            throw new UsernameNotFoundException(userEmail);
        }

        System.out.println("Found User: " + user);

        Set<GrantedAuthority> grantList = new HashSet<>();
        GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_USER");
        grantList.add(authority);

//        for(Role role : user.getRoles()){
//            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRoleName()));
//        }

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), grantList);

        return userDetails;
    }
}
