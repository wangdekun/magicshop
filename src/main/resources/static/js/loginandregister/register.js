var  app = angular.module("RegisterApp",[]);
app.controller("RegisterController", function ($scope, $http) {
    //var  username=$scope.user_name;
    //console.log(username);
    console.log($scope.filter)
    $scope.submitForm = function () {
        $http({
            method:'post', //get请求方式
            url:'/itour/register' ,  //请求地址
            data: $.param($scope.user)
        }).then(function(response){
                console.log($scope.user)
            }
        )
    }




})