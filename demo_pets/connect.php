<?php 
define('host', 'localhost');
define('user', 'root');
define('pass', '');
define('db', 'pets_db');

$conn = mysqli_connect(host, user, pass, db) or die('Unable to Connect');

//Checking the connection
if($conn){
    echo 'Connection Successful';
}

?>