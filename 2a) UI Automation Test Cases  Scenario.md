## Test Case 1: Successful Login

**Test Case ID:** TC_001  
**Title:** Verify successful login with valid credentials  
**Preconditions:** The user has valid login credentials (Admin/Admin123)  

### Steps:
1. Open the browser and navigate to [OrangeHRM Login Page](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login).
2. Enter **Admin** in the username field.
3. Enter **admin123** in the password field.
4. Click the **Login** button.

**Expected Result:**  
User should be successfully logged in and redirected to the **Dashboard** page.

---

## Test Case 2: Login with Invalid Credentials

**Test Case ID:** TC_002  
**Title:** Verify login with invalid credentials  
**Preconditions:** User does not have valid credentials  

### Steps:
1. Open the browser and navigate to [OrangeHRM Login Page](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login).
2. Enter **InvalidUser** in the username field.
3. Enter **wrongpassword** in the password field.
4. Click the **Login** button.

**Expected Result:**  
An error message should be displayed: **"Invalid credentials"**, and the user should remain on the login page.

---

## Test Case 3: Login with Empty Fields

**Test Case ID:** TC_003  
**Title:** Verify login attempt with empty username and password fields  
**Preconditions:** None  

### Steps:
1. Open the browser and navigate to [OrangeHRM Login Page](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login).
2. Keep the **username** and **password** fields empty.
3. Click the **Login** button.

**Expected Result:**  
An error message should be displayed asking the user to enter both username and password.
