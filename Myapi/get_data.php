<?php

include 'DatabaseConfig.php' ;
 
 $con = mysqli_connect($HostName,$HostUser,$HostPass,$DatabaseName);
 
 $name = isset($_POST['name']) ? $_POST['name'] : '';
$email = isset($_POST['email']) ? $_POST['email'] : '';

 $Sql_Query = "insert into getdatatable (name,email) values ('$name','$email')";
 
 if(mysqli_query($con,$Sql_Query)){
 
 echo 'Data Submit Successfully';
 echo $name;
 echo $email;
 
 }
 else{
 
 echo 'Try Again';
 
 }
 mysqli_close($con);
?>