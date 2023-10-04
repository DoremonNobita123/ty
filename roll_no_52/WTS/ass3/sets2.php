<?php
    if(isset($_POST['submit'])){
        $largeString = $_POST['largeString'];
        $smallString = $_POST['smallString'];

        // a. Check if small string appears at the start of the large string
        $startsWith = stripos($largeString, $smallString) === 0 ? "Yes" : "No";

        // b. Find the position of the small string in the big string
        $position = stripos($largeString, $smallString);

        // c. Compare the first n characters (let's say n = 5)
        $n = 5;
        $comparison = strncasecmp(substr($largeString, 0, $n), substr($smallString, 0, $n), $n);

        echo "<br>a. Does the small string appear at the start of the large string? $startsWith";
        echo "<br>b. Position of the small string in the large string: $position";
        echo "<br>c. Comparison of first $n characters (case-insensitive): ";
        
        if ($comparison == 0) {
            echo "Both strings are the same.";
        } elseif ($comparison < 0) {
            echo "The large string comes before the small string.";
        } else {
            echo "The small string comes before the large string.";
        }
    }
?>
