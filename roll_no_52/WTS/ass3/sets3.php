  <?php
    function generateGreeting($studentName = "", $collegeName = "", $greetingMessage = "") {
        if (empty($studentName) && empty($collegeName) && empty($greetingMessage)) {
            return "Hello there!";
        } elseif (empty($studentName)) {
            return "Hello from $collegeName!";
        } elseif (empty($collegeName)) {
            return "Hello, $studentName!";
        } else {
            return "$greetingMessage, $studentName, from $collegeName!";
        }
    }

    if(isset($_POST['generateGreeting'])) {
        $studentName = $_POST['studentName'];
        $collegeName = $_POST['collegeName'];
        $greetingMessage = $_POST['greetingMessage'];

        $greeting = generateGreeting($studentName, $collegeName, $greetingMessage);
        echo "<p>$greeting</p>";
    }
    ?>
