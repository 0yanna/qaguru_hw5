package rambler.xx45x.tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Homework#5")
public class TextBoxTestWithJavaFaker {

    Faker faker = new Faker();
    RegistrationPages registrationPages = new RegistrationPages();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().safeEmailAddress();
    String userPhone = faker.phoneNumber().subscriberNumber(10);
    String currentAddress = faker.address().fullAddress();


    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1152";
    }

    @Test
    void automationPracticeForm () {
        registrationPages.openPage();

        registrationPages.typeFirstName(firstName)
                .typeLastName(lastName)
                .typeEmail(userEmail)
                .typeGenterWrapper()
                .typeuserNumber(userPhone)
                .setDate("31", "January", "1990")
                .subjectsContainer("Maths")
                .hobbiesWrapper("#hobbies-checkbox-1")
                .addFile()
                .currentAddress(currentAddress)
                .state("Haryana")
                .stateCity("Karnal")
                .typeSubmitButton()
                .checkResultRegistrationForm()
                .checkResultsValue("Student Name", firstName+" "+lastName)
                .checkResultsValue("Student Email", userEmail)
                .checkResultsValue("Gender", "Male")
                .checkResultsValue("Mobile", userPhone)
                .checkResultsValue("Date of Birth", "31 January,1990")
                .checkResultsValue("Subjects", "Maths")
                .checkResultsValue("Hobbies", "Sports")
                .checkResultsValue("Picture", "pic.png")
                .checkResultsValue("Address", currentAddress)
                .checkResultsValue("State and City", "Haryana Karnal");
    }
}
