package karate.request.login;

import com.intuit.karate.junit5.Karate;

public class CreateUser {
    @Karate.Test
    Karate testSample(){
        return Karate.run("classpath:karate/request/Login/1. CreateUser/createUser.feature").relativeTo(getClass());
    }
}
