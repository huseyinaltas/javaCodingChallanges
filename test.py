from collections import Counter
import re 

def longest_substring(s: str) -> str:
    # Initialize variables
    curr_st=""
    max_str=""
    for right in range(len(s)):
        while s[right] in curr_st:
            curr_st = curr_st[1:]
        curr_st = curr_st+s[right]
        if len(curr_st)> len(max_str):
            max_str = curr_st
            
    return max_str
            
        

    # Loop through the string with the right pointer
    # for right in range(len(s)):
    #     # If the character is already in the set, shrink the window by moving the left pointer
    #     while s[right] in char_set:
    #         # Remove the first character from the set
    #         char_set = char_set[1:]
        
    #     # Add the current character to the set
    #     char_set += s[right]
        
    #     # Update the max substring if the current one is longer
    #     if len(char_set) > len(max_substr):
    #         max_substr = char_set

    # return max_substr
print(longest_substring("abccabcde"))
  # Output should be 4
     # Output should be None
               # Output should be None