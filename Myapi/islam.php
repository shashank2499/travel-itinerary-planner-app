<?php
  define ('DB_HOST','localhost');
  define('DB_USER','root');
  define('DB_PASS','');
  define('DB_NAME','xyz');
  $conn=new mysqli(DB_HOST,DB_USER,DB_PASS,DB_NAME);
  if(mysqli_connect_errno())
  {
	  die('UNABLE TO COONECT TO DATABASE'.mysqli_connect_errno());
  }
  $stmt=$conn->prepare("SELECT Images,NAME,DESCRIPTION,DURATION FROM final WHERE BELIEFS='ISLAM';");
  $stmt->execute();
  $stmt->bind_result($image,$name,$des,$duration);
  $product=array();
  while($stmt->fetch())
  {
	  $temp=array();
	  $temp['image']=$image;
	  $temp['name']=$name;
	  $temp['description']=$des;
	  $temp['duration']=$duration;
	  array_push($product,$temp);
  }
	  echo json_encode($product);
	  ?>
  