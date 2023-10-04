<?php
$ch=$_POST['op'];
$a=array(1,2,3,4,5,6);
switch($ch)
{
	case 1:
	     print_r($a);
	     array_push($a,10);
	     echo"<br> After Insertion :";
	     print_r($a);
	     break;
	case 2:
	     print_r($a);
	     array_pop($a);
	     echo"<br> After Deletation :";
	     print_r($a);
	     break;
	case 3:
	     echo"<br> Content of stack :";
	     print_r($a);
	     break;
	case 4:
	     print_r($a);
	     array_unshift($a,3);
	     echo"<br> After insertion :";
	     print_r($a);
	     break;
	case 5:
	     print_r($a);
	     array_shift($a);
	     echo"<br> After Deletation :";
	     print_r($a);
	     break;
	case 6:
	     echo"<br> After Deletation :";
	     print_r($a);
	     break;	     
}
?>
