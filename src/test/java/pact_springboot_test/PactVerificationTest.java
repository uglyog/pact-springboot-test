package pact_springboot_test;

import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.loader.PactBrokerAuth;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import au.com.dius.pact.provider.spring.SpringRestPactRunner;
import au.com.dius.pact.provider.spring.target.SpringBootHttpTarget;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRestPactRunner.class)
@Provider("Activity Service")
@PactBroker(
  authentication =  @PactBrokerAuth(username = "${pactbroker.auth.username}", password = "${pactbroker.auth.password}")
)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PactVerificationTest {

  @TestTarget
  public final Target target = new SpringBootHttpTarget();

  @Before
  public void beforeTests() {

  }

  @State("many activities exist")
  public void activitiesExist() {

  }
}
