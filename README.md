# CS.11.04-Lab.4.1

All of the methods should be implemented within the Main class. 

Declare all methods as static.


1. Write a method called parenthesesCheck that takes a string of parentheses, and determines if the order of the parentheses is valid. The function should return true if the string is valid, and false if it's invalid.

**Examples**

"()"              =>  true

")(()))"          =>  false

"("               =>  false

"(())((()())())"  =>  true




2. Write a method called reverseInteger that reverses the digits in an integer. Return the digits as a string.

**Examples**

1234 => “4321”

2468 => “8642”



3. You are given a message you need to encrypt. Here are the things you need to know to encrypt it:

For each word:

the second and the last letter is switched (e.g. Hello becomes Holle)

the first letter is replaced by its character code (e.g. H becomes 72)

Note: there are no special characters used, only letters and spaces

**Examples**

encryptThis('Hello good day'); // '72olle 103doo 100ya'

encryptThis('Ready set go'); // '82yade 115te 103o'




4. You are given a secret message you need to decipher. Here are the things you need to know to decipher it:

For each word:

the second and the last letter is switched (e.g. Hello becomes Holle)

the first letter is replaced by its character code (e.g. H becomes 72)

Note: there are no special characters used, only letters and spaces

**Examples**

decipherThis('72olle 103doo 100ya'); // 'Hello good day'

decipherThis('82yade 115te 103o'); // 'Ready set go'
