package karate.request.login;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit5.Karate;

@KarateOptions(features = "classpath:karate/request/create.feature", tags = {"@ignoreScenario", "@ignoreScenarioOutline"})
public class LoginUser {

    @Karate.Test
    Karate testSample(){
        return Karate.run("classpath:karate/request/Login/2. LoginUser/loginUser.feature").relativeTo(getClass());
    }
}
