**REFLECTION**

**1. How did you implement event handling for user actions? **

  I used an onClickListener on the Submit button. When the user clicks it, the code inside the listener grabs the 
text from both fields, checks it, and then decides whether to show the output or an error message.

**2. What techniques ensured smooth and stable interaction**? 

  To keep the app from crashing, I first checked if the fields were empty and showed a Toast message to remind the user.
I also wrapped the age input logic in a try-catch block.

**3. What improvements would you add in future versions?**
  
   I'd definitely improve the error messages by showing them right on the input field instead of a Toast that disappears. 
It would also be cool to save all the submissions and display them in a list on the screen.
