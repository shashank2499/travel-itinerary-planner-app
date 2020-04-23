<?php
{
	$receiver_data = isset($_POST['array']) ? $_POST['array'] : '';
	$new_array=json_decode($receiver_data,true);
    print_r($receiver_data);
foreach($new_array as $row)
{
	$row['name'];
	echo $row['id'];
	echo $row['address'];
	echo $row['number'];
}
}

?>
UPDATE testtable SET SELECTED=1 WHERE NAME='$firstname'