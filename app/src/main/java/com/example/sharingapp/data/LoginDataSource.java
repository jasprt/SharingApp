package com.example.sharingapp.data;

import android.content.Context;

import com.example.sharingapp.R;
import com.example.sharingapp.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password, Context context) {

        try {
            // get authentication from strings.xml using context
            LoggedInUser inUser = new LoggedInUser(java.util.UUID.randomUUID().toString(), username);
            if (context.getString(R.string.login_user).equalsIgnoreCase(username) &&
                    context.getString(R.string.login_password).equals(password)) {
                return new Result.Success<>(inUser);
            } else {
                return new Result.Error(new IOException("Invalid Login"));
            }

        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}