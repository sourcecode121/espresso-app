package com.example.espresso2;

import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.assertion.LayoutAssertions;
import android.support.test.espresso.assertion.PositionAssertions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.hasSibling;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Anand on 16/09/2016.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public final ActivityTestRule<MainActivity> mTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkTest1(){
        onView(withText("Test 1")).check(ViewAssertions.matches(isDisplayed()));
    }

    @Test
    public void checkTest2(){
        onView(withText("Test 2")).check(PositionAssertions.isBelow(withText("Test 1")));
    }

    @Test
    public void checkTest3(){
        onView(withText("Test 3")).check(LayoutAssertions.noOverlaps());
    }

    @Test
    public void checkTest4(){
        onView(withId(R.id.test4Button)).perform(click());
        onView(withText("Click event")).check(ViewAssertions.matches(isDisplayed()));
    }

}
