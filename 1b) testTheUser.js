// Create a new GET request:
// https://gorest.co.in/public/v2/users/7806878
// In the Tests tab, add assertions 
pm.test("User exists", function () {
    pm.response.to.have.status(200);
    var jsonData = pm.response.json();
    pm.expect(jsonData).to.have.property("id");
    pm.expect(jsonData).to.have.property("name", "Usha");
    pm.expect(jsonData).to.have.property("gender", "female");
    pm.expect(jsonData).to.have.property("email");
});
