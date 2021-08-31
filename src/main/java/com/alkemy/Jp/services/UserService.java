package com.alkemy.Jp.services;

//@Service
//public class UserService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository urepository;
//
//    private BCryptPasswordEncoder encoder;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        //User user = urepository.findByUsername(username);
//        if(username==null){
//            throw new UsernameNotFoundException("No existe el usuario");
//
//        }
//        SimpleGrantedAuthority role = new SimpleGrantedAuthority("ROLE_ADMIN");
//        return new org.springframework.security.core.userdetails.User(username.getUsername(username),user.getPassword(), Collections.singletonList(role));
//    }
//
//
//    public User createUser(User user){
//        User us = new User();
//        us.setUsername(user.getUsername());
//        us.setPassword(encoder.encode(user.getPassword()));
//        us.setRole();
//        try{
//          return urepository.save(us);
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//            return null;
//        }
//
//
//
//    }
//}
