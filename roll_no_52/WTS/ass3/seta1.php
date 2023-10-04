<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Doc</title>
</head>
<body>
    <?php
        if($_SERVER["REUQEST_METHOD"]=="POST")
        {
            $num1=$_POST["num1"];
            $num2=$_POST["num2"];
          function mod($a,$b)
          {
            $c=$a%$b;
            echo $c;
          }
       /*   function power($a,$b)
          {
            $p=pow($a,$b);
            echo "Power =$p<br>";
          }
          function sum($n)
          {
            $s=0;
             for($i=1;$i<=$n;$i++)
             {
                $s=$s+$i;
                
             }
             echo "Sum of first $n Natural no : $s<br>";
          }
          function factorial($n)
          {
            $s=0;
            for($i=1;$i<=$n;$i++)
            {
               $s=$s+$i;
               
            }
            echo "factorial of $n is: $s<br>";
          }
          */
          mod($num1,$num2);
         // power($num1,$num2);
         // sum($num1);
          //factorial($num2);
          
        }
    ?>
</body>
</html>
