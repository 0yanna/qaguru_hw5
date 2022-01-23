package rambler.xx45x;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rambler.xx45x.pages.RegistrationPages;


@DisplayName("Homework#5")
public class TextBoxTestWithPageObjects {

    RegistrationPages RegistrationPages = new RegistrationPages();

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1152";
    }

    @Test
    void automationPracticeForm () {
        RegistrationPages.openPage();

        RegistrationPages.typeFirstName("Alex")
                         .typeLastName("Smith")
                         .typeEmail("xx@mail.ru")
                         .typeGenterWrapper()
                         .typeuserNumber("9110000000")
                         .setDate("31", "January", "1990" )
                         .subjectsContainer("Maths")
                         .hobbiesWrapper("#hobbies-checkbox-1")
                         .addFile()
                         .currentAddress("Some address")
                         .state("Haryana")
                         .stateCity("Karnal")
                         .typeSubmitButton()
                         .checkResultRegistrationForm()
                         .checkResultsValue("Student Name", "Alex Smith")
                .checkResultsValue("Student Email", "xx@mail.ru")
                .checkResultsValue("Gender", "Male")
                .checkResultsValue("Mobile", "9110000000")
                .checkResultsValue("Date of Birth","31 January,1990")
                .checkResultsValue("Subjects", "Maths")
                .checkResultsValue("Hobbies", "Sports")
                .checkResultsValue("Picture", "pic.png")
                .checkResultsValue("Address", "Some address")
                .checkResultsValue("State and City", "Haryana Karnal");


        //$( "#genterWrapper").$(byText("Male")).click();
        //$("#gender-radio-1").doubleClick(); working, but why?
        //$( "#userNumber").setValue("9110000000");
        //RegistrationPages.CalendarComponent.setDate();
        // $$(".react-datepicker__day--030")
        // .filter(not(cssClass(".react-datepicker__day--outside-month")))
        /// .first() // or .get(0)
        /// .click();
        //  $("[aria-label=Choose Wednesday, July 30th, 2008]").click(); // NOT WORKING
        //  $("[aria-label=\"Choose Wednesday, July 30th, 2008\"]").click();
        //  $("[aria-label='Choose Wednesday, July 30th, 2008']").click();
        //  $("[aria-label$='July 30th, 2008']").click();
        //  $x("//*[contains(@aria-label, \"July 30th, 2008\")]").click();
        //  $("#subjectsContainer").setValue("Maths");
        //  $("#subjectsContainer").setValue("Maths");
        //  $("#hobbiesWrapper").setValue("id=\"hobbies-checkbox-1\"");
        //$("#subjectsInput").setValue("Math").pressEnter();
        //  $("#subjectsWrapper").$(byText("Math")).click();
        //$("#hobbiesWrapper").$(byText("Sports")).click();
        //$("#uploadPicture").uploadFile(new File("src/test/resources/img/pic.png"));
        //    File someFile = new File("src/test/resources/img/1.png"); // alternative option
        //    $("#uploadPicture").uploadFile(someFile);                 // alternative option
        //    $("#uploadPicture").uploadFromClasspath("img/1.png»);     // second option
        //$("#currentAddress").setValue("Some address");
        //$("#state").scrollTo().click();
        //$("#stateCity-wrapper").scrollTo().$(byText("Haryana")).click();
        //     $("#state").scrollTo().$(byText("Haryana")).click();     // alternative option
       // $("#city").click();
        //$("#city").$(byText("Karnal")).click();
        //     $("#city").scrollTo().$(byText("Karnal")).click();     // alternative option
        //$("#submit").click();

        // Asserts
        //$(".table-responsive").shouldBe(visible);
        //$(".table-responsive").shouldHave(text("Alex Smith"), text("xx@mail.ru"), text("Male"),
              //  text("9110000000"), text("31 January,1990"), text("Math"), text("Sports"), text("pic.jpg"),
              //  text("Some address"), text("Haryana Karnal"));
    }
}