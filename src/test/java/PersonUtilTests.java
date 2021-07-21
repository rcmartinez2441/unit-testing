import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
public class PersonUtilTests {
    //Testing this method, here is the input, here is what I expect in returns
    @Test
    public void getFullName_GivenValidNames_ReturnsFullName() {

    //Arrange - get your objects and whatnot together

    //Act - run the method(s) which you want to test and assign any outputs to variables
    String output = PersonUtils.getFullName("Raul", "Martinez");
    //Assert - test whether the outputs meet your expectations
    assertEquals("raul martinez", output );

    }

}
