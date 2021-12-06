<?php
	$data_file = fopen("example.txt", "w");
	
	$Username = $_POST["Username"];
	$Password = $_POST["Password"];
	$Email = $_POST["Email"];
	$text_to_write = $Username . " " . $Password . "" . $;

	fwrite($data_file, $text_to_write);
	
	fclose($data_file);
?>