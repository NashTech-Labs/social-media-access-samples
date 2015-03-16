function FacebookCtrl($scope, $http) {
	$scope.getFBInfo = function() {
		$scope.userNotFound = false;
		$scope.loaded = false;

		$http.get("http://graph.facebook.com/" + $scope.username).success(
				function(data) {
					if (data.name == "")
						data.name = data.login;
					$scope.user = data;
					$scope.loaded = true;
				}).error(function() {
			$scope.userNotFound = true;
		});
		$http.get("http://graph.facebook.com/" + $scope.username).success(
				function(data) {
					$scope.repos = data;
					$scope.reposFound = data.length > 0;
				});
	}
}
