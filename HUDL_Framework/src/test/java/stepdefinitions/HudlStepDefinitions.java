package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.VideoPage;

public class HudlStepDefinitions {
    LoginPage loginPage = new LoginPage();
    VideoPage videoPage = new VideoPage();



    @Given("user is on the login page")
    public void user_is_on_the_login_page()  {
            loginPage.navigateToLoginPage();

        }


    @When("^User enter '(.+)' and '(.+)'$")
    public void user_enter_email_and_password(String email, String password) {
        loginPage.enterLoginDetails(email, password);
    }
    @Then("^User landed home page and assert it user able to logged in$")
        public void user_landed_home_page_and_assert_it_user_able_to_logged_in(){
        loginPage.assertHomePage();

    }

    @When("^User click video user navigate to vides page$")
    public void user_click_video_user_navigate_to_vides_page(){
        videoPage.clickVideoButton();
    }

    @Then("^User click first video and three videos play back to back$")
    public void user_click_firs_video_and_three_videos_play_back_to_back(){
        videoPage.clickFirstVideo();
    }

    @Then("^User click replay button user able to watch three videos back to back again$")
    public void user_click_replay_button_user_able_to_watch_three_videos_back_to_back_again(){
        videoPage.replayVideo();
    }

    @And("^User able to make a comment and delete$")
    public void user_able_to_make_a_comment(){
        videoPage.addCommentAndDelete();

    }

    @And("^Close browser$")
    public void close_browser()  {
        loginPage.closeBrowser();

    }

    @And("^Close browser video page$")
    public void close_browser_video_page()  {
        videoPage.closeBrowser();

    }
}

