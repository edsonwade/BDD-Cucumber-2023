import com.example.demo.airport.EconomyFlight;
import com.example.demo.airport.Flight;
import com.example.demo.airport.Passenger;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerPolicyEdu {

    private Flight economyFlight;
    private Passenger vanilson;


    @Given("there a economic flight")
    public void givenThereAEconomicFlight() {
        economyFlight = new EconomyFlight("1");

    }

    @When("we have a usual passenger")
    public void whenWeHaveAUsualPassenger() {
        vanilson = new Passenger("Vanilson", false);


    }

    @Then("you can add and remove him from an economy flight")
    public void thenYouCanAddAndRemoveHimFromAnEconomyFlight() {
        assertAll("Verify all conditions for a usual passenger and an economy flight",
                () -> assertEquals("1", economyFlight.getId()),
                () -> assertTrue(economyFlight.addPassenger(vanilson)),
                () -> assertEquals(1, economyFlight.getPassengersList().size()),
                () -> assertFalse(economyFlight.removePassenger(vanilson)),
                () -> assertEquals(1, economyFlight.getPassengersList().size())
        );
    }
}
