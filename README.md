The Gas Leak Monitoring System is a simple Java-based simulation of a real-world IoT gas detection system.
It continuously monitors gas levels and alerts the user if the reading crosses a predefined safety threshold.

This project helps demonstrate how embedded systems logic (like in Arduino) can be modeled using Java programming concepts such as:

    Conditional statements
    Loops
    User input handling
    Real-time simulation using delays

🧠 Algorithm

Start the program.
Set a constant threshold value for gas levels (e.g., 600).
Ask the user how many readings they want to input.
For each reading:
Read the gas level from user input.
If gas level < threshold → print “Safe ✅”.
Else → print “DANGER ⚠️ Gas Leak Detected!”.
Wait for 1 second before reading the next value.
End the program after all readings are processed.