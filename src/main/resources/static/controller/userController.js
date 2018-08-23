var app=angular.module("myApp",[]);
app.controller("myCon",function ($scope) {
    // $http.get("/test").then(function (response) {
    //     $scope.hello=response.data.userName;
    //     console.log(response.data.userName,"++++++++++++++++++++++++");
    // })
    $scope.hello="000";
})