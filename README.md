Secrets Keeper

This project is an exercise for me to learn how to implement accounts (sign in, sign out, sign up).

In this application, there are 2 types of users:
- User = has a Username, Password and a Secret (some data that has to be saved)
  - the user has to sign in to see his Secret (or saved data)

- Admin = has a Username and a Password
  - the admin can not save a secret
  - the admin can see all the users (only their usernames)
  - the admin can delete users (including other admins or self)
  - the admin can not see a user's password or secret

The application does not save any data localy when it is closed, so all secrets will be erased.
