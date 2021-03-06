package com.kasparpeterson.example;

/**
 * Created by kaspar on 02/12/2016.
 */

public class MainPresenter extends MainMVP.PresenterViewOperations {

    @Override
    void onContinue(final String firstName, final String lastName) {
        onView(new ViewAction<MainMVP.ViewOperations>() {
            @Override
            public void onAction(MainMVP.ViewOperations view) {
                boolean isValid = true;

                if (Utils.isStringEmpty(firstName) || firstName.length() < 2) {
                    view.showFirstNameError();
                    isValid = false;
                }

                if (Utils.isStringEmpty(lastName) || lastName.length() < 2) {
                    view.showLastNameError();
                    isValid = false;
                }

                if (isValid) {
                    saveDetails(firstName, lastName);
                }
            }
        });
    }

    private void saveDetails(final String firstName, final String lastName) {
        // saving to somewhere
    }
}
