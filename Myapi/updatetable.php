<?php

$host='localhost:3306';
$username='root';
$pwd='';
$db="xyz";

$con=mysqli_connect($host,$username,$pwd,$db) or die('Unable to connect');

if(mysqli_connect_error($con))
{
    echo "Failed to Connect to Database ".mysqli_connect_error();
}

$name = isset($_POST['Name']) ? $_POST['Name'] : '';

$sql="UPDATE final SET SELECTED=1 WHERE NAME='$name'";

$result=mysqli_query($con,$sql);

if($result)
{
    echo ('Successfully Saved');
}else
{
    echo('Not saved Successfully');
}
mysqli_close($con);

?>