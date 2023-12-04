# Solution for komoot application test

I created a simple function and wrote some unit test too. 
This is the whole project I created the GISTs from (see below).

**DISCLAIMER:**
Of course, If it were a real world project I would put everything in their packege to promote clean code. 

E.g.:
- `Sport` and `Summary` would have their own place in the `model`
- `findTopSportByDistance` would be a function of a `usecase`
- all of these would be in `domain` package to support Android app architecture
- I would use MVVM or MVI with UDF depending on the scope and nature of the project

### GIST

###### Main solution

[Link](https://gist.github.com/annamatolay/1f5061a0752106aeae65215e6d8a1c99)

Explanation:
- I used the `filter` function to exclude eBikes from the list. 
- Then, I used `maxByOrNull` to find the element with the maximum distance. 
- Finally, I printed the result, taking into account the possibility that the list might be empty.

This approach ensures that the code is concise, readable, and efficiently finds the top sport by distance, excluding eBikes. If you have any questions or if there's anything else you'd like to add, feel free to let me know!

###### Unit test

[Link](https://gist.github.com/annamatolay/c0ea2ce779bf284c92faabd68f15978a)

I've included three tests:
- The first one checks if the function correctly identifies the top sport when excluding eBikes.
- The second one tests if the function handles an empty list correctly.
- The third one verifies that if the list contains only eBikes, the result is null.

This should help ensure the correctness of your code. Feel free to adjust the tests or let me know if you have any specific requirements!
